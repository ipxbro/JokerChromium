// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.messages;

import org.chromium.base.UnownedUserData;
import org.chromium.base.UnownedUserDataKey;
import org.chromium.ui.base.WindowAndroid;

/**
 * The class that handles association of MessageDispatcher with WindowAndroid and retrieval of the
 * associated MessageDispatcher.
 */
public class MessageDispatcherProvider {
    /** An interface that allows a MessageDispatcher to be associated with an unowned data host. */
    interface Unowned extends MessageDispatcher, UnownedUserData {}

    /** The key used to bind the MessageDispatcher to the unowned data host. */
    private static final UnownedUserDataKey<Unowned> KEY = new UnownedUserDataKey<>(Unowned.class);

    /**
     * Retrieves the shared MessageDispatcher from the provided WindowAndroid.
     * @param windowAndroid The window to retrieve MessageDispatcher from.
     * @return An instance of MessageDispatcher associated with the window.
     */
    public static MessageDispatcher from(WindowAndroid windowAndroid) {
        return KEY.retrieveDataFromHost(windowAndroid.getUnownedUserDataHost());
    }

    static void attach(WindowAndroid windowAndroid, Unowned controller) {
        KEY.attachToHost(windowAndroid.getUnownedUserDataHost(), controller);
    }

    static void detach(Unowned controller) {
        KEY.detachFromAllHosts(controller);
    }
}
