// GpuMemoryBufferPlatformHandle.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/gfx/mojom/native_handle_types.mojom
//

package org.chromium.gfx.mojom;


public final class GpuMemoryBufferPlatformHandle extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int SharedMemoryHandle = 0;
        public static final int AndroidHardwareBufferHandle = 1;
    };
    private org.chromium.mojo_base.mojom.UnsafeSharedMemoryRegion mSharedMemoryHandle;
    private AHardwareBufferHandle mAndroidHardwareBufferHandle;

    public void setSharedMemoryHandle(org.chromium.mojo_base.mojom.UnsafeSharedMemoryRegion sharedMemoryHandle) {
        this.mTag = Tag.SharedMemoryHandle;
        this.mSharedMemoryHandle = sharedMemoryHandle;
    }

    public org.chromium.mojo_base.mojom.UnsafeSharedMemoryRegion getSharedMemoryHandle() {
        assert this.mTag == Tag.SharedMemoryHandle;
        return this.mSharedMemoryHandle;
    }

    public void setAndroidHardwareBufferHandle(AHardwareBufferHandle androidHardwareBufferHandle) {
        this.mTag = Tag.AndroidHardwareBufferHandle;
        this.mAndroidHardwareBufferHandle = androidHardwareBufferHandle;
    }

    public AHardwareBufferHandle getAndroidHardwareBufferHandle() {
        assert this.mTag == Tag.AndroidHardwareBufferHandle;
        return this.mAndroidHardwareBufferHandle;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.SharedMemoryHandle: {
                
                encoder0.encode(this.mSharedMemoryHandle, offset + 8, false);
                break;
            }
            case Tag.AndroidHardwareBufferHandle: {
                
                encoder0.encode(this.mAndroidHardwareBufferHandle, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static GpuMemoryBufferPlatformHandle deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final GpuMemoryBufferPlatformHandle decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        GpuMemoryBufferPlatformHandle result = new GpuMemoryBufferPlatformHandle();
        switch (dataHeader.elementsOrVersion) {
            case Tag.SharedMemoryHandle: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mSharedMemoryHandle = org.chromium.mojo_base.mojom.UnsafeSharedMemoryRegion.decode(decoder1);
                result.mTag = Tag.SharedMemoryHandle;
                break;
            }
            case Tag.AndroidHardwareBufferHandle: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mAndroidHardwareBufferHandle = AHardwareBufferHandle.decode(decoder1);
                result.mTag = Tag.AndroidHardwareBufferHandle;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}