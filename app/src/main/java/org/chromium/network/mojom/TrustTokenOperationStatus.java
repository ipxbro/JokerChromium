// TrustTokenOperationStatus.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/trust_tokens.mojom
//

package org.chromium.network.mojom;

public final class TrustTokenOperationStatus {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int OK = 0;
    public static final int INVALID_ARGUMENT = 1;
    public static final int FAILED_PRECONDITION = 2;
    public static final int RESOURCE_EXHAUSTED = 3;
    public static final int ALREADY_EXISTS = 4;
    public static final int UNAVAILABLE = 5;
    public static final int BAD_RESPONSE = 6;
    public static final int INTERNAL_ERROR = 7;
    public static final int UNKNOWN_ERROR = 8;
    public static final int OPERATION_SUCCESSFULLY_FULFILLED_LOCALLY = 9;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 9;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 9;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private TrustTokenOperationStatus() {}
}