// CorsError.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/cors.mojom
//

package org.chromium.network.mojom;

public final class CorsError {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int DISALLOWED_BY_MODE = 0;
    public static final int INVALID_RESPONSE = 1;
    public static final int WILDCARD_ORIGIN_NOT_ALLOWED = 2;
    public static final int MISSING_ALLOW_ORIGIN_HEADER = 3;
    public static final int MULTIPLE_ALLOW_ORIGIN_VALUES = 4;
    public static final int INVALID_ALLOW_ORIGIN_VALUE = 5;
    public static final int ALLOW_ORIGIN_MISMATCH = 6;
    public static final int INVALID_ALLOW_CREDENTIALS = 7;
    public static final int CORS_DISABLED_SCHEME = 8;
    public static final int PREFLIGHT_INVALID_STATUS = 9;
    public static final int PREFLIGHT_DISALLOWED_REDIRECT = 10;
    public static final int PREFLIGHT_WILDCARD_ORIGIN_NOT_ALLOWED = 11;
    public static final int PREFLIGHT_MISSING_ALLOW_ORIGIN_HEADER = 12;
    public static final int PREFLIGHT_MULTIPLE_ALLOW_ORIGIN_VALUES = 13;
    public static final int PREFLIGHT_INVALID_ALLOW_ORIGIN_VALUE = 14;
    public static final int PREFLIGHT_ALLOW_ORIGIN_MISMATCH = 15;
    public static final int PREFLIGHT_INVALID_ALLOW_CREDENTIALS = 16;
    public static final int PREFLIGHT_MISSING_ALLOW_EXTERNAL = 17;
    public static final int PREFLIGHT_INVALID_ALLOW_EXTERNAL = 18;
    public static final int INVALID_ALLOW_METHODS_PREFLIGHT_RESPONSE = 19;
    public static final int INVALID_ALLOW_HEADERS_PREFLIGHT_RESPONSE = 20;
    public static final int METHOD_DISALLOWED_BY_PREFLIGHT_RESPONSE = 21;
    public static final int HEADER_DISALLOWED_BY_PREFLIGHT_RESPONSE = 22;
    public static final int REDIRECT_CONTAINS_CREDENTIALS = 23;
    public static final int INSECURE_PRIVATE_NETWORK = 24;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 24;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 24;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private CorsError() {}
}