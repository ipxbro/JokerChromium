// PushUnregistrationReason.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/push_messaging/push_messaging_status.mojom
//

package org.chromium.blink.mojom;

public final class PushUnregistrationReason {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int UNKNOWN = 0;
    public static final int JAVASCRIPT_API = 1;
    public static final int PERMISSION_REVOKED = 2;
    public static final int DELIVERY_UNKNOWN_APP_ID = 3;
    public static final int DELIVERY_PERMISSION_DENIED = 4;
    public static final int DELIVERY_NO_SERVICE_WORKER = 5;
    public static final int GCM_STORE_RESET = 6;
    public static final int SERVICE_WORKER_UNREGISTERED = 7;
    public static final int SUBSCRIBE_STORAGE_CORRUPT = 8;
    public static final int GET_SUBSCRIPTION_STORAGE_CORRUPT = 9;
    public static final int SERVICE_WORKER_DATABASE_WIPED = 10;
    public static final int SUBSCRIPTION_EXPIRED = 11;
    public static final int REFRESH_FINISHED = 12;
    public static final int PERMISSION_REVOKED_ABUSIVE = 13;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 13;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 13;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private PushUnregistrationReason() {}
}