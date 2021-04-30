// V8DetailedMemoryReporter.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/performance_manager/v8_detailed_memory_reporter.mojom
//

package org.chromium.blink.mojom;


public interface V8DetailedMemoryReporter extends org.chromium.mojo.bindings.Interface {



    public static final class Mode {
        private static final boolean IS_EXTENSIBLE = false;

        public static final int DEFAULT = 0;
        public static final int EAGER = 1;
        public static final int LAZY = 2;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 2;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 2;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        public static int toKnownValue(int value) {
          return value;
        }

        private Mode() {}
    }


    public interface Proxy extends V8DetailedMemoryReporter, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<V8DetailedMemoryReporter, V8DetailedMemoryReporter.Proxy> MANAGER = V8DetailedMemoryReporter_Internal.MANAGER;


    void getV8MemoryUsage(
int mode, 
GetV8MemoryUsageResponse callback);

    interface GetV8MemoryUsageResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<PerProcessV8MemoryUsage> { }


}
