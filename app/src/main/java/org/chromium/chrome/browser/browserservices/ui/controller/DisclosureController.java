// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.browserservices.ui.controller;

import static org.chromium.chrome.browser.browserservices.ui.TrustedWebActivityModel.DISCLOSURE_EVENTS_CALLBACK;
import static org.chromium.chrome.browser.browserservices.ui.TrustedWebActivityModel.DISCLOSURE_FIRST_TIME;
import static org.chromium.chrome.browser.browserservices.ui.TrustedWebActivityModel.DISCLOSURE_SCOPE;
import static org.chromium.chrome.browser.browserservices.ui.TrustedWebActivityModel.DISCLOSURE_STATE;
import static org.chromium.chrome.browser.browserservices.ui.TrustedWebActivityModel.DISCLOSURE_STATE_DISMISSED_BY_USER;
import static org.chromium.chrome.browser.browserservices.ui.TrustedWebActivityModel.DISCLOSURE_STATE_NOT_SHOWN;
import static org.chromium.chrome.browser.browserservices.ui.TrustedWebActivityModel.DISCLOSURE_STATE_SHOWN;
import static org.chromium.chrome.browser.browserservices.ui.TrustedWebActivityModel.PACKAGE_NAME;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;

import org.chromium.chrome.browser.browserservices.ui.TrustedWebActivityModel;
import org.chromium.chrome.browser.browserservices.ui.controller.CurrentPageVerifier.VerificationState;
import org.chromium.chrome.browser.browserservices.ui.controller.CurrentPageVerifier.VerificationStatus;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;
import org.chromium.chrome.browser.lifecycle.NativeInitObserver;

/**
 * Contains common implementation between WebappDisclosureController and
 * TrustedWebActivityDisclosureController.
 */
public abstract class DisclosureController
        implements NativeInitObserver, TrustedWebActivityModel.DisclosureEventsCallback {
    private final TrustedWebActivityModel mModel;
    private final CurrentPageVerifier mCurrentPageVerifier;

    public DisclosureController(TrustedWebActivityModel model,
            ActivityLifecycleDispatcher lifecycleDispatcher,
            CurrentPageVerifier currentPageVerifier, String packageName) {
        mModel = model;
        mCurrentPageVerifier = currentPageVerifier;

        model.set(DISCLOSURE_EVENTS_CALLBACK, this);
        model.set(PACKAGE_NAME, packageName);

        currentPageVerifier.addVerificationObserver(this::onVerificationStatusChanged);
        lifecycleDispatcher.register(this);
    }

    private void onVerificationStatusChanged() {
        if (shouldShowInCurrentState()) {
            setDisclosureScope(mCurrentPageVerifier.getState().scope);
            showIfNeeded();
        } else {
            setDisclosureScope(null);
            dismiss();
        }
    }

    @Override
    public void onFinishNativeInitialization() {
        // We want to show disclosure ASAP, which is limited by SnackbarManager requiring
        // native.
        if (shouldShowInCurrentState()) {
            showIfNeeded();
        }
    }

    @Override
    @CallSuper
    public void onDisclosureAccepted() {
        mModel.set(DISCLOSURE_STATE, DISCLOSURE_STATE_DISMISSED_BY_USER);
    }

    @Override
    @CallSuper
    public void onDisclosureShown() {
        mModel.set(DISCLOSURE_FIRST_TIME, false);
    }

    protected boolean shouldShowInCurrentState() {
        VerificationState state = mCurrentPageVerifier.getState();
        return state != null && state.status != VerificationStatus.FAILURE;
    }

    /** Shows the disclosure if it is not already showing and hasn't been accepted. */
    protected void showIfNeeded() {
        if (!isShowing() && shouldShowDisclosure()) {
            showDisclosure();
        }
    }

    protected abstract boolean shouldShowDisclosure();

    /** Is this the first time the user has seen the disclosure? */
    protected abstract boolean isFirstTime();

    private void showDisclosure() {
        mModel.set(DISCLOSURE_FIRST_TIME, isFirstTime());
        mModel.set(DISCLOSURE_STATE, DISCLOSURE_STATE_SHOWN);
    }

    /** Dismisses the disclosure if it is showing. */
    private void dismiss() {
        if (isShowing()) {
            mModel.set(DISCLOSURE_STATE, DISCLOSURE_STATE_NOT_SHOWN);
        }
    }
    protected boolean isShowing() {
        return mModel.get(DISCLOSURE_STATE) == DISCLOSURE_STATE_SHOWN;
    }

    private void setDisclosureScope(@Nullable String scope) {
        mModel.set(DISCLOSURE_SCOPE, scope);
    }
}
