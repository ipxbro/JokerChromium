// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.firstrun;

import android.os.SystemClock;

import androidx.annotation.VisibleForTesting;

import org.chromium.base.Log;
import org.chromium.base.ThreadUtils;
import org.chromium.base.supplier.OneshotSupplierImpl;
import org.chromium.chrome.browser.policy.EnterpriseInfo;
import org.chromium.chrome.browser.policy.PolicyServiceFactory;
import org.chromium.components.policy.PolicyService;

/**
 * Class that used to refresh "If the ToS was and should be skipped by policy TosDialogBehavior".
 *
 * Once FRE is skipped because of the enterprise policy TosDialogBehavior, this information is
 * stored in {@link ChromePreferenceKeys#FIRST_RUN_SKIPPED_BY_POLICY}. The FRE will be completely
 * avoided when this pref is true. This class checks if the enterprise policy is ever reset such
 * that the FRE should be run, and will clear the shared pref.
 */
public class TosDialogBehaviorSharedPrefInvalidator {
    private static final String TAG = "TosPolicyStatus";

    private final SkipTosDialogPolicyListener mPolicyListener;
    private final FirstRunAppRestrictionInfo mAppRestrictionInfo;
    private final long mTimeObjectCreated;

    /**
     * Refresh boolean value "If the ToS was and should be skipped by policy TosDialogBehavior"
     * that is stored in the shared preference. If the ToS was not skipped, do nothing.
     */
    public static void refreshSharedPreferenceIfTosSkipped() {
        ThreadUtils.assertOnUiThread();
        if (!FirstRunStatus.isFirstRunSkippedByPolicy()) return;

        FirstRunAppRestrictionInfo appRestrictionInfo =
                FirstRunAppRestrictionInfo.takeMaybeInitialized();
        OneshotSupplierImpl<PolicyService> policyServiceSupplier = new OneshotSupplierImpl<>();
        policyServiceSupplier.set(PolicyServiceFactory.getGlobalPolicyService());
        SkipTosDialogPolicyListener policyListener = new SkipTosDialogPolicyListener(
                appRestrictionInfo, policyServiceSupplier, EnterpriseInfo.getInstance(), null);

        new TosDialogBehaviorSharedPrefInvalidator(policyListener, appRestrictionInfo);
    }

    @VisibleForTesting
    TosDialogBehaviorSharedPrefInvalidator(
            SkipTosDialogPolicyListener listener, FirstRunAppRestrictionInfo appRestrictionInfo) {
        mTimeObjectCreated = SystemClock.elapsedRealtime();

        mAppRestrictionInfo = appRestrictionInfo;
        mPolicyListener = listener;
        mPolicyListener.onAvailable(this::onPolicyAvailable);
    }

    private void onPolicyAvailable(boolean shouldSkipTosDialog) {
        long duration = SystemClock.elapsedRealtime() - mTimeObjectCreated;
        Log.d(TAG, "Task finished. Duration: [%d], result: [%s]", duration, shouldSkipTosDialog);
        if (!shouldSkipTosDialog) FirstRunStatus.setFirstRunSkippedByPolicy(false);

        mAppRestrictionInfo.destroy();
        mPolicyListener.destroy();
    }
}
