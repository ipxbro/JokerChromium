// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.feed;

import org.chromium.chrome.browser.flags.ChromeFeatureList;
import org.chromium.chrome.browser.ntp.ScrollListener;
import org.chromium.chrome.browser.ntp.ScrollListener.ScrollState;
import org.chromium.chrome.browser.ntp.ScrollableContainerDelegate;
import org.chromium.components.feature_engagement.FeatureConstants;
import org.chromium.components.feature_engagement.Tracker;
import org.chromium.components.feature_engagement.TriggerState;

/**
 * Creates a ScrollListener that triggers the menu IPH. The listener removes itself from the
 * list of observers when the IPH is determined to be already triggered.
 *
 * Triggering the IPH is based on (1) the fraction of scroll done on the stream proportionally
 * to its height, (2) the transition fraction of the top search bar, and (3) the position of the
 * menu button in the stream.
 *
 * We want the IPH to be triggered when the section header is properly positioned in the stream
 * which has to meet the following conditions: (1) the IPH popup won't interfere with the search
 * bar at the top of the NTP, (2) the user has scrolled down a bit because they want to look at
 * the feed, and (3) the feed header with its menu button is high enough in the stream to have
 * the feed visible. The goal of conditions (2) and (3) is to show the IPH when the signals are
 * that the user wants to interact with the feed are strong.
 */
public class HeaderIphScrollListener implements ScrollListener {
    static final String TOOLBAR_TRANSITION_FRACTION_PARAM_NAME = "toolbar-transition-fraction";
    static final String MIN_SCROLL_FRACTION_PARAM_NAME = "min-scroll-fraction";
    static final String HEADER_MAX_POSITION_FRACTION_NAME = "header-max-pos-fraction";

    /**
     * Delegate to handle actions that are out of the scope of the listener.
     */
    public static interface Delegate {
        /**
         * Gets the feature engagement tracker.
         */
        Tracker getFeatureEngagementTracker();

        /**
         * Shows the menu IPH.
         */
        void showMenuIph();

        /**
         * Determines whether the feed is expanded (turned on).
         */
        boolean isFeedExpanded();

        /**
         * Determines whether the user is signed in.
         */
        boolean isSignedIn();

        /**
         * Determines whether the position of the feed header in the NTP container is suitable for
         * showing the IPH.
         */
        boolean isFeedHeaderPositionInContainerSuitableForIPH(float headerMaxPosFraction);
    }

    private Delegate mDelegate;
    private ScrollableContainerDelegate mScrollableContainerDelegate;

    private float mMinScrollFraction;
    private float mHeaderMaxPosFraction;

    HeaderIphScrollListener(
            Delegate delegate, ScrollableContainerDelegate scrollableContainerDelegate) {
        mDelegate = delegate;
        mScrollableContainerDelegate = scrollableContainerDelegate;

        mMinScrollFraction = (float) ChromeFeatureList.getFieldTrialParamByFeatureAsDouble(
                ChromeFeatureList.REPORT_FEED_USER_ACTIONS, MIN_SCROLL_FRACTION_PARAM_NAME, 0.10);
        mHeaderMaxPosFraction = (float) ChromeFeatureList.getFieldTrialParamByFeatureAsDouble(
                ChromeFeatureList.REPORT_FEED_USER_ACTIONS, HEADER_MAX_POSITION_FRACTION_NAME,
                0.35);
    }

    @Override
    public void onScrollStateChanged(@ScrollState int state) {
        if (state != ScrollState.IDLE) return;

        maybeTriggerIPH(mScrollableContainerDelegate.getVerticalScrollOffset());
    }

    @Override
    public void onScrolled(int dx, int dy) {}

    @Override
    public void onHeaderOffsetChanged(int verticalOffset) {
        if (verticalOffset == 0) return;

        // Negate the vertical offset because it is inversely proportional to the scroll offset.
        // For example, a header verical offset of -50px corresponds to a scroll offset of 50px.
        maybeTriggerIPH(-verticalOffset);
    }

    private void maybeTriggerIPH(int verticalScrollOffset) {
        // Get the feature tracker for the IPH and determine whether to show the IPH.
        final String featureForIph = FeatureConstants.FEED_HEADER_MENU_FEATURE;
        final Tracker tracker = mDelegate.getFeatureEngagementTracker();
        // Stop listening to scroll if the IPH was already displayed in the past.
        if (tracker.getTriggerState(featureForIph) == TriggerState.HAS_BEEN_DISPLAYED) {
            mScrollableContainerDelegate.removeScrollListener(this);
            return;
        }

        // Don't do any calculation if the IPH cannot be triggered to avoid wasting efforts.
        if (!tracker.wouldTriggerHelpUI(featureForIph)) {
            return;
        }

        // Check whether the feed is expanded.
        if (!mDelegate.isFeedExpanded()) return;

        // Check whether the user is signed in.
        if (!mDelegate.isSignedIn()) return;

        // Check that enough scrolling was done proportionally to the stream height.
        if ((float) verticalScrollOffset
                < (float) mScrollableContainerDelegate.getRootViewHeight() * mMinScrollFraction) {
            return;
        }

        // Check that the feed header is well positioned in the recycler view to show the IPH.
        if (!mDelegate.isFeedHeaderPositionInContainerSuitableForIPH(mHeaderMaxPosFraction)) {
            return;
        }

        mDelegate.showMenuIph();
    }
}
