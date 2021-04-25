// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.paint_preview;

import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.tab.EmptyTabObserver;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.paintpreview.player.PlayerManager;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.UiThreadTaskTraits;
import org.chromium.ui.widget.Toast;
import org.chromium.url.GURL;

/**
 * Responsible for displaying the Paint Preview demo. When displaying, the Paint Preview will
 * overlay the associated {@link Tab}'s content view.
 */
public class DemoPaintPreview implements PlayerManager.Listener {
    private Tab mTab;
    private TabbedPaintPreview mTabbedPaintPreview;
    private DemoPaintPreviewTabObserver mTabObserver;

    public static void showForTab(Tab tab) {
        if (tab == null) return;

        new DemoPaintPreview(tab).show();
    }

    private DemoPaintPreview(Tab tab) {
        mTab = tab;
        mTabbedPaintPreview = TabbedPaintPreview.get(mTab);
        mTabObserver = new DemoPaintPreviewTabObserver();
        mTab.addObserver(mTabObserver);
    }

    private void show() {
        PaintPreviewCompositorUtils.warmupCompositor();
        mTabbedPaintPreview.capture(success
                -> PostTask.runOrPostTask(
                        UiThreadTaskTraits.USER_VISIBLE, () -> onCapturedPaintPreview(success)));
    }

    private void onCapturedPaintPreview(boolean captureSuccess) {
        boolean shown = false;
        if (captureSuccess) shown = mTabbedPaintPreview.maybeShow(this);
        int toastStringRes = shown ? R.string.paint_preview_demo_capture_success
                                   : R.string.paint_preview_demo_capture_failure;
        Toast.makeText(mTab.getContext(), toastStringRes, Toast.LENGTH_LONG).show();
        if (!captureSuccess || !shown) {
            PaintPreviewCompositorUtils.stopWarmCompositor();
            destroy();
        }
    }

    private void removePaintPreviewDemo() {
        if (mTab == null) return;

        mTabbedPaintPreview.remove(false);
        destroy();
    }

    private void destroy() {
        mTab.removeObserver(mTabObserver);
        mTab = null;
        mTabbedPaintPreview = null;
    }

    @Override
    public void onCompositorError(int status) {
        Toast.makeText(mTab.getContext(), R.string.paint_preview_demo_playback_failure,
                     Toast.LENGTH_LONG)
                .show();
        removePaintPreviewDemo();
    }

    @Override
    public void onViewReady() {
        Toast.makeText(mTab.getContext(), R.string.paint_preview_demo_playback_start,
                     Toast.LENGTH_LONG)
                .show();
    }

    @Override
    public void onFirstPaint() {}

    @Override
    public void onUserInteraction() {}

    @Override
    public void onUserFrustration() {}

    @Override
    public void onPullToRefresh() {
        removePaintPreviewDemo();
    }

    @Override
    public void onLinkClick(GURL url) {
        if (mTab == null || !url.isValid() || url.isEmpty()) return;

        mTab.loadUrl(new LoadUrlParams(url.getSpec()));
        removePaintPreviewDemo();
    }

    private class DemoPaintPreviewTabObserver extends EmptyTabObserver {
        @Override
        public void onDidStartNavigation(Tab tab, NavigationHandle navigationHandle) {
            if (!mTabbedPaintPreview.isAttached()) return;

            // Ignore navigations from subframes. We should only remove the paint preview
            // player when the user navigates to a new page.
            if (!navigationHandle.isInMainFrame()) return;

            removePaintPreviewDemo();
        }
    }
}
