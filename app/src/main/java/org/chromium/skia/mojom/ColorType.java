// ColorType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     skia/public/mojom/image_info.mojom
//

package org.chromium.skia.mojom;

public final class ColorType {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int UNKNOWN = 0;
    public static final int ALPHA_8 = 1;
    public static final int RGB_565 = 2;
    public static final int ARGB_4444 = 3;
    public static final int RGBA_8888 = 4;
    public static final int BGRA_8888 = 5;
    public static final int DEPRECATED_INDEX_8 = 6;
    public static final int GRAY_8 = 7;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 7;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 7;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private ColorType() {}
}