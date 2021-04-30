// AppCacheErrorReason.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/appcache/appcache.mojom
//

package org.chromium.blink.mojom;

public final class AppCacheErrorReason {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int APPCACHE_MANIFEST_ERROR = 0;
    public static final int APPCACHE_SIGNATURE_ERROR = 1;
    public static final int APPCACHE_RESOURCE_ERROR = 2;
    public static final int APPCACHE_CHANGED_ERROR = 3;
    public static final int APPCACHE_ABORT_ERROR = 4;
    public static final int APPCACHE_QUOTA_ERROR = 5;
    public static final int APPCACHE_POLICY_ERROR = 6;
    public static final int APPCACHE_UNKNOWN_ERROR = 7;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 7;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 7;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private AppCacheErrorReason() {}
}