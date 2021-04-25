// PushUnregistrationStatus.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/push_messaging/push_messaging_status.mojom
//

package org.chromium.blink.mojom;

public final class PushUnregistrationStatus {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int SUCCESS_UNREGISTERED = 0;
    public static final int SUCCESS_WAS_NOT_REGISTERED = 1;
    public static final int PENDING_NETWORK_ERROR = 2;
    public static final int NO_SERVICE_WORKER = 3;
    public static final int SERVICE_NOT_AVAILABLE = 4;
    public static final int PENDING_SERVICE_ERROR = 5;
    public static final int STORAGE_ERROR = 6;
    public static final int NETWORK_ERROR = 7;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 7;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 7;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private PushUnregistrationStatus() {}
}