// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.tab;

import org.chromium.chrome.browser.tab.state.CriticalPersistedTabData;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.common.Referrer;

import java.nio.ByteBuffer;

/**
 * Extracts a {@link TabState} from a {@link Tab}.
 */
public class TabStateExtractor {
    /**
     * Returns an opaque "state" object that can be persisted to storage.
     * @param tab The {@link Tab} from which to extract the state.
     **/
    public static TabState from(Tab tab) {
        TabImpl tabImpl = (TabImpl) tab;
        if (!tabImpl.isInitialized()) return null;
        TabState tabState = new TabState();
        tabState.contentsState = getWebContentsState(tabImpl);
        tabState.openerAppId = TabAssociatedApp.getAppId(tab);
        tabState.parentId = CriticalPersistedTabData.from(tab).getParentId();
        tabState.timestampMillis = CriticalPersistedTabData.from(tab).getTimestampMillis();
        tabState.tabLaunchTypeAtCreation =
                CriticalPersistedTabData.from(tab).getTabLaunchTypeAtCreation();
        // Don't save the actual default theme color because it could change on night mode state
        // changed.
        tabState.themeColor = tab.isThemingAllowed() && !tab.isNativePage()
                ? tab.getThemeColor()
                : TabState.UNSPECIFIED_THEME_COLOR;
        tabState.rootId = CriticalPersistedTabData.from(tabImpl).getRootId();
        return tabState;
    }

    /**
     * Returns an object representing the state of the Tab's WebContents.
     * @param tab The {@link TabImpl} from which to extract the WebContents state.
     **/
    public static WebContentsState getWebContentsState(TabImpl tab) {
        if (CriticalPersistedTabData.from(tab).getWebContentsState() != null) {
            return CriticalPersistedTabData.from(tab).getWebContentsState();
        }

        // Native call returns null when buffer allocation needed to serialize the state failed.
        ByteBuffer buffer = getWebContentsStateAsByteBuffer(tab);
        if (buffer == null) return null;

        WebContentsState state = new WebContentsState(buffer);
        state.setVersion(WebContentsState.CONTENTS_STATE_CURRENT_VERSION);
        return state;
    }

    /** Returns an ByteBuffer representing the state of the Tab's WebContents. */
    private static ByteBuffer getWebContentsStateAsByteBuffer(TabImpl tab) {
        LoadUrlParams pendingLoadParams = tab.getPendingLoadParams();
        if (pendingLoadParams == null) {
            return WebContentsStateBridge.getContentsStateAsByteBuffer(tab.getWebContents());
        } else {
            Referrer referrer = pendingLoadParams.getReferrer();
            return WebContentsStateBridge.createSingleNavigationStateAsByteBuffer(
                    pendingLoadParams.getUrl(), referrer != null ? referrer.getUrl() : null,
                    // Policy will be ignored for null referrer url, 0 is just a placeholder.
                    referrer != null ? referrer.getPolicy() : 0,
                    pendingLoadParams.getInitiatorOrigin(), tab.isIncognito());
        }
    }
}
