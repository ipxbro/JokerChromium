// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.paint_preview.services;

import androidx.annotation.VisibleForTesting;

import org.chromium.base.ApplicationState;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.Callback;
import org.chromium.base.StrictModeContext;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.annotations.NativeMethods;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.chrome.browser.tabmodel.TabModelSelector;
import org.chromium.chrome.browser.tabmodel.TabModelSelectorTabObserver;
import org.chromium.components.paintpreview.browser.NativePaintPreviewServiceProvider;
import org.chromium.content_public.browser.UiThreadTaskTraits;
import org.chromium.content_public.browser.WebContents;

import java.io.File;
import java.util.HashSet;

/**
 * The Java-side implementations of paint_preview_tab_service.cc. The C++ side owns and controls
 * the lifecycle of the Java implementation.
 * This class provides the required functionalities for capturing the Paint Preview representation
 * of a tab.
 */
@JNINamespace("paint_preview")
public class PaintPreviewTabService implements NativePaintPreviewServiceProvider {
    private static final long AUDIT_START_DELAY_MS = 2 * 60 * 1000; // Two minutes;

    private Runnable mAuditRunnable;
    private long mNativePaintPreviewBaseService;
    private long mNativePaintPreviewTabService;
    @VisibleForTesting
    HashSet<Integer> mPreNativeCache;

    private class CaptureTriggerListener extends TabModelSelectorTabObserver
            implements ApplicationStatus.ApplicationStateListener {
        private @ApplicationState int mCurrentApplicationState;

        private CaptureTriggerListener(TabModelSelector tabModelSelector) {
            super(tabModelSelector);
            ApplicationStatus.registerApplicationStateListener(this);
        }

        @Override
        public void onApplicationStateChange(int newState) {
            mCurrentApplicationState = newState;
            if (newState == ApplicationState.HAS_DESTROYED_ACTIVITIES) {
                ApplicationStatus.unregisterApplicationStateListener(this);
            }
        }

        @Override
        public void onHidden(Tab tab, int reason) {
            // Only attempt to capture when all activities are stopped.
            // We don't need to worry about race conditions between #onHidden and
            // #onApplicationStateChange when ChromeActivity is stopped.
            // Activity lifecycle callbacks (that run #onApplicationStateChange) are dispatched in
            // Activity#onStop, so they are executed before the call to #onHidden in
            // ChromeActivity#onStop.
            if (mCurrentApplicationState == ApplicationState.HAS_STOPPED_ACTIVITIES
                    && qualifiesForCapture(tab)) {
                captureTab(tab, success -> {
                    if (!success) {
                        // Treat the tab as if it was closed to cleanup any partial capture
                        // data.
                        tabClosed(tab);
                    }
                });
            }
        }

        @Override
        public void onTabUnregistered(Tab tab) {
            tabClosed(tab);
        }

        private boolean qualifiesForCapture(Tab tab) {
            String scheme = tab.getUrl().getScheme();
            boolean schemeAllowed = scheme.equals("http") || scheme.equals("https");
            return !tab.isIncognito() && !tab.isNativePage() && !tab.isShowingErrorPage()
                    && tab.getWebContents() != null && schemeAllowed;
        }
    }

    @CalledByNative
    private PaintPreviewTabService(
            long nativePaintPreviewTabService, long nativePaintPreviewBaseService) {
        mNativePaintPreviewTabService = nativePaintPreviewTabService;
        mNativePaintPreviewBaseService = nativePaintPreviewBaseService;
        if (!isNativeCacheInitialized()) {
            createPreNativeCache(getPath());
        }
    }

    @CalledByNative
    private void onNativeDestroyed() {
        mNativePaintPreviewTabService = 0;
        mNativePaintPreviewBaseService = 0;
    }

    @Override
    public long getNativeBaseService() {
        return mNativePaintPreviewBaseService;
    }

    /**
     * Returns whether there exists a capture for the tab ID.
     * @param tabId the id for the tab requested.
     * @return Will be true if there is a capture for the tab.
     */
    public boolean hasCaptureForTab(int tabId) {
        if (mNativePaintPreviewTabService == 0) return false;

        if (mPreNativeCache != null) {
            if (!isNativeCacheInitialized()) {
                return mPreNativeCache.contains(tabId);
            }
            mPreNativeCache = null;
        }

        return PaintPreviewTabServiceJni.get().hasCaptureForTabAndroid(
                mNativePaintPreviewTabService, tabId);
    }

    /**
     * Should be called when all tabs are restored. Registers a {@link TabModelSelectorTabObserver}
     * for the regular to capture and delete paint previews as needed. Audits restored tabs to
     * remove any failed deletions.
     * @param tabModelSelector the TabModelSelector for the activity.
     * @param runAudit whether to delete tabs not in the tabModelSelector.
     */
    public void onRestoreCompleted(TabModelSelector tabModelSelector, boolean runAudit) {
        new CaptureTriggerListener(tabModelSelector);

        if (!runAudit || mAuditRunnable != null) return;

        // Delay actually performing the audit by a bit to avoid contention with the native task
        // runner that handles IO when showing at startup.
        mAuditRunnable = () -> auditOnStart(tabModelSelector.getModel(/*incognito*/ false));
        PostTask.postDelayedTask(UiThreadTaskTraits.DEFAULT,
                () -> {
                    mAuditRunnable.run();
                    mAuditRunnable = null;
                },
                AUDIT_START_DELAY_MS);
    }

    @VisibleForTesting
    void auditOnStart(TabModel regularTabModel) {
        int tabCount = regularTabModel.getCount();
        int[] tabIds = new int[tabCount];
        for (int i = 0; i < tabCount; i++) {
            Tab tab = regularTabModel.getTabAt(i);
            tabIds[i] = tab.getId();
        }

        auditArtifacts(tabIds);
    }

    private boolean isNativeCacheInitialized() {
        if (mNativePaintPreviewTabService == 0) return false;

        return PaintPreviewTabServiceJni.get().isCacheInitializedAndroid(
                mNativePaintPreviewTabService);
    }

    private String getPath() {
        if (mNativePaintPreviewTabService == 0) return "";

        return PaintPreviewTabServiceJni.get().getPathAndroid(mNativePaintPreviewTabService);
    }

    @VisibleForTesting
    void createPreNativeCache(String rootPath) {
        mPreNativeCache = new HashSet<Integer>();

        assert rootPath != null;
        assert !rootPath.isEmpty();

        String[] childPaths;
        try (StrictModeContext ignored = StrictModeContext.allowDiskReads()) {
            File rootDir = new File(rootPath);
            childPaths = rootDir.list();
        }

        // It is possible there are no captures.
        if (childPaths == null) return;

        // All children will have the name format # or #.zip.
        for (String childName : childPaths) {
            // Strip extension if present.
            if (childName.indexOf(".") > 0) {
                childName = childName.substring(0, childName.lastIndexOf("."));
            }
            mPreNativeCache.add(Integer.parseInt(childName));
        }
    }

    public void captureTab(Tab tab, Callback<Boolean> successCallback) {
        if (mNativePaintPreviewTabService == 0) {
            successCallback.onResult(false);
            return;
        }

        PaintPreviewTabServiceJni.get().captureTabAndroid(
                mNativePaintPreviewTabService, tab.getId(), tab.getWebContents(), successCallback);
    }

    private void tabClosed(Tab tab) {
        if (mNativePaintPreviewTabService == 0) return;

        PaintPreviewTabServiceJni.get().tabClosedAndroid(
                mNativePaintPreviewTabService, tab.getId());
    }

    private void auditArtifacts(int[] activeTabIds) {
        if (mNativePaintPreviewTabService == 0) return;

        PaintPreviewTabServiceJni.get().auditArtifactsAndroid(
                mNativePaintPreviewTabService, activeTabIds);
    }

    @NativeMethods
    interface Natives {
        void captureTabAndroid(long nativePaintPreviewTabService, int tabId,
                WebContents webContents, Callback<Boolean> successCallback);
        void tabClosedAndroid(long nativePaintPreviewTabService, int tabId);
        boolean hasCaptureForTabAndroid(long nativePaintPreviewTabService, int tabId);
        void auditArtifactsAndroid(long nativePaintPreviewTabService, int[] activeTabIds);
        boolean isCacheInitializedAndroid(long nativePaintPreviewTabService);
        String getPathAndroid(long nativePaintPreviewTabService);
    }
}
