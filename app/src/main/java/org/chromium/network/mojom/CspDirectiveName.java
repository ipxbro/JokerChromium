// CspDirectiveName.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/content_security_policy.mojom
//

package org.chromium.network.mojom;

public final class CspDirectiveName {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int UNKNOWN = 0;
    public static final int BASE_URI = 1;
    public static final int BLOCK_ALL_MIXED_CONTENT = 2;
    public static final int CHILD_SRC = 3;
    public static final int CONNECT_SRC = 4;
    public static final int DEFAULT_SRC = 5;
    public static final int FONT_SRC = 6;
    public static final int FORM_ACTION = 7;
    public static final int FRAME_ANCESTORS = 8;
    public static final int FRAME_SRC = 9;
    public static final int IMG_SRC = 10;
    public static final int MANIFEST_SRC = 11;
    public static final int MEDIA_SRC = 12;
    public static final int NAVIGATE_TO = 13;
    public static final int OBJECT_SRC = 14;
    public static final int PREFETCH_SRC = 15;
    public static final int REPORT_TO = 16;
    public static final int REPORT_URI = 17;
    public static final int REQUIRE_TRUSTED_TYPES_FOR = 18;
    public static final int SANDBOX = 19;
    public static final int SCRIPT_SRC = 20;
    public static final int SCRIPT_SRC_ATTR = 21;
    public static final int SCRIPT_SRC_ELEM = 22;
    public static final int STYLE_SRC = 23;
    public static final int STYLE_SRC_ATTR = 24;
    public static final int STYLE_SRC_ELEM = 25;
    public static final int TREAT_AS_PUBLIC_ADDRESS = 26;
    public static final int TRUSTED_TYPES = 27;
    public static final int UPGRADE_INSECURE_REQUESTS = 28;
    public static final int WORKER_SRC = 29;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 29;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 29;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private CspDirectiveName() {}
}