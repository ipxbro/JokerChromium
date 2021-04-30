// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.signin.identitymanager;

import android.accounts.Account;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

import org.chromium.base.ObserverList;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.NativeMethods;
import org.chromium.components.signin.base.AccountInfo;
import org.chromium.components.signin.base.CoreAccountId;
import org.chromium.components.signin.base.CoreAccountInfo;

/**
 * IdentityManager provides access to native IdentityManager's public API to java components.
 */
public class IdentityManager {
    private static final String TAG = "IdentityManager";

    /**
     * IdentityManager.Observer is notified when the available account information are updated. This
     * is a subset of native's IdentityManager::Observer.
     */
    public interface Observer {
        /**
         * Called for all types of changes to the primary account such as - primary account
         * set/cleared or sync consent granted/revoked in C++.
         * @param eventDetails Details about the primary account change event.
         */
        default void onPrimaryAccountChanged(PrimaryAccountChangeEvent eventDetails) {}

        /**
         * Called when the Gaia cookie has been deleted explicitly by a user action, e.g. from
         * the settings.
         */
        default void onAccountsCookieDeletedByUserAction() {}

        /**
         * Called after an account is updated.
         */
        default void onExtendedAccountInfoUpdated(AccountInfo accountInfo) {}
    }
    /**
     * A simple callback for getAccessToken.
     */
    public interface GetAccessTokenCallback
            extends ProfileOAuth2TokenServiceDelegate.GetAccessTokenCallback {}

    private long mNativeIdentityManager;
    private ProfileOAuth2TokenServiceDelegate mProfileOAuth2TokenServiceDelegate;

    private final ObserverList<Observer> mObservers = new ObserverList<>();

    /**
     * Called by native to create an instance of IdentityManager.
     */
    @CalledByNative
    private static IdentityManager create(long nativeIdentityManager,
            ProfileOAuth2TokenServiceDelegate profileOAuth2TokenServiceDelegate) {
        assert nativeIdentityManager != 0;
        return new IdentityManager(nativeIdentityManager, profileOAuth2TokenServiceDelegate);
    }

    @VisibleForTesting
    public IdentityManager(long nativeIdentityManager,
            ProfileOAuth2TokenServiceDelegate profileOAuth2TokenServiceDelegate) {
        mNativeIdentityManager = nativeIdentityManager;
        mProfileOAuth2TokenServiceDelegate = profileOAuth2TokenServiceDelegate;
    }

    /**
     * Called by native upon KeyedService's shutdown
     */
    @CalledByNative
    private void destroy() {
        mNativeIdentityManager = 0;
    }

    /**
     * Registers a IdentityManager.Observer
     */
    public void addObserver(Observer observer) {
        mObservers.addObserver(observer);
    }

    /**
     * Unregisters a IdentityManager.Observer
     */
    public void removeObserver(Observer observer) {
        mObservers.removeObserver(observer);
    }

    /**
     * Called for all types of changes to the primary account such as - primary account set/cleared
     * or sync consent granted/revoked in C++.
     */
    @CalledByNative
    @VisibleForTesting
    public void onPrimaryAccountChanged(PrimaryAccountChangeEvent eventDetails) {
        for (Observer observer : mObservers) {
            observer.onPrimaryAccountChanged(eventDetails);
        }
    }

    @CalledByNative
    @VisibleForTesting
    public void onAccountsCookieDeletedByUserAction() {
        for (Observer observer : mObservers) {
            observer.onAccountsCookieDeletedByUserAction();
        }
    }

    /**
     * Called after an account is updated.
     */
    @CalledByNative
    @VisibleForTesting
    public void onExtendedAccountInfoUpdated(AccountInfo accountInfo) {
        for (Observer observer : mObservers) {
            observer.onExtendedAccountInfoUpdated(accountInfo);
        }
    }

    /**
     * Returns whether the user's primary account is available.
     */
    public boolean hasPrimaryAccount() {
        return getPrimaryAccountInfo(ConsentLevel.SYNC) != null;
    }

    /**
     * Provides the information of all accounts that have refresh tokens.
     */
    @VisibleForTesting
    public CoreAccountInfo[] getAccountsWithRefreshTokens() {
        return IdentityManagerJni.get().getAccountsWithRefreshTokens(mNativeIdentityManager);
    }

    /**
     * Provides access to the core information of the user's primary account.
     * Returns non-null if the primary account was set AND the required consent level was granted,
     * null otherwise.
     *
     * @param consentLevel {@link ConsentLevel} necessary for the caller. Most features should use
     *         {@link ConsentLevel.SYNC}.
     */
    public @Nullable CoreAccountInfo getPrimaryAccountInfo(@ConsentLevel int consentLevel) {
        return IdentityManagerJni.get().getPrimaryAccountInfo(mNativeIdentityManager, consentLevel);
    }

    /**
     * Looks up and returns information for account with given |email|. If the account
     * cannot be found, return a null value.
     */
    public @Nullable AccountInfo findExtendedAccountInfoForAccountWithRefreshTokenByEmailAddress(
            String email) {
        return IdentityManagerJni.get()
                .findExtendedAccountInfoForAccountWithRefreshTokenByEmailAddress(
                        mNativeIdentityManager, email);
    }

    /**
     * Forces refreshing extended {@link AccountInfo} with image for the given
     * {@link CoreAccountId}.
     *
     * This method should only be invoked by {@link ProfileDownloader} to fetch account information
     * while users are signed out.
     */
    public void forceRefreshOfExtendedAccountInfo(CoreAccountId coreAccountId) {
        assert coreAccountId != null : "coreAccountId shouldn't be null!";
        IdentityManagerJni.get().forceRefreshOfExtendedAccountInfo(
                mNativeIdentityManager, coreAccountId);
    }

    /**
     * Call this method to retrieve an OAuth2 access token for the given account and scope. Please
     * note that this method expects a scope with 'oauth2:' prefix.
     * @param account the account to get the access token for.
     * @param scope The scope to get an auth token for (with Android-style 'oauth2:' prefix).
     * @param callback called on successful and unsuccessful fetching of auth token.
     */
    @MainThread
    public void getAccessToken(Account account, String scope, GetAccessTokenCallback callback) {
        assert mProfileOAuth2TokenServiceDelegate != null;
        // TODO(crbug.com/934688) The following should call a JNI method instead.
        mProfileOAuth2TokenServiceDelegate.getAccessToken(account, scope, callback);
    }

    /**
     * Called by native to invalidate an OAuth2 token. Please note that the token is invalidated
     * asynchronously.
     */
    @MainThread
    public void invalidateAccessToken(String accessToken) {
        assert mProfileOAuth2TokenServiceDelegate != null;

        // TODO(crbug.com/934688) The following should call a JNI method instead.
        mProfileOAuth2TokenServiceDelegate.invalidateAccessToken(accessToken);
    }

    @NativeMethods
    public interface Natives {
        @Nullable
        CoreAccountInfo getPrimaryAccountInfo(long nativeIdentityManager, int consentLevel);
        @Nullable
        AccountInfo findExtendedAccountInfoForAccountWithRefreshTokenByEmailAddress(
                long nativeIdentityManager, String email);
        CoreAccountInfo[] getAccountsWithRefreshTokens(long nativeIdentityManager);
        void forceRefreshOfExtendedAccountInfo(
                long nativeIdentityManager, CoreAccountId coreAccountId);
    }
}
