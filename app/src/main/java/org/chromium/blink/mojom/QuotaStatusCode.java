// QuotaStatusCode.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/quota/quota_types.mojom
//

package org.chromium.blink.mojom;

public final class QuotaStatusCode {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int OK = 0;
    public static final int ERROR_NOT_SUPPORTED = 9;
    public static final int ERROR_INVALID_MODIFICATION = 13;
    public static final int ERROR_INVALID_ACCESS = 15;
    public static final int ERROR_ABORT = 20;
    public static final int UNKNOWN = -1;
    public static final int MIN_VALUE = -1;
    public static final int MAX_VALUE = 20;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case -1:
            case 0:
            case 9:
            case 13:
            case 15:
            case 20:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private QuotaStatusCode() {}
}