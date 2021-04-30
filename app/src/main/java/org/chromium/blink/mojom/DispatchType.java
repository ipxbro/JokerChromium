// DispatchType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/input/input_event.mojom
//

package org.chromium.blink.mojom;

public final class DispatchType {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int BLOCKING = 0;
    public static final int EVENT_NON_BLOCKING = 1;
    public static final int LISTENERS_NON_BLOCKING_PASSIVE = 2;
    public static final int LISTENERS_FORCED_NON_BLOCKING_DUE_TO_FLING = 3;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 3;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 3;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private DispatchType() {}
}