// BufferUsage.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/gfx/mojom/buffer_types.mojom
//

package org.chromium.gfx.mojom;

public final class BufferUsage {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int GPU_READ = 0;
    public static final int SCANOUT = 1;
    public static final int SCANOUT_CAMERA_READ_WRITE = 2;
    public static final int CAMERA_AND_CPU_READ_WRITE = 3;
    public static final int SCANOUT_CPU_READ_WRITE = 4;
    public static final int SCANOUT_VDA_WRITE = 5;
    public static final int PROTECTED_SCANOUT_VDA_WRITE = 6;
    public static final int GPU_READ_CPU_READ_WRITE = 7;
    public static final int SCANOUT_VEA_CPU_READ = 8;
    public static final int SCANOUT_VEA_READ_CAMERA_AND_CPU_READ_WRITE = 9;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 9;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 9;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private BufferUsage() {}
}