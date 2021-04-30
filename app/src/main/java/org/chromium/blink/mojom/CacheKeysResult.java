// CacheKeysResult.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/cache_storage/cache_storage.mojom
//

package org.chromium.blink.mojom;


public final class CacheKeysResult extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int Status = 0;
        public static final int Keys = 1;
    };
    private int mStatus;
    private FetchApiRequest[] mKeys;

    public void setStatus(int status) {
        this.mTag = Tag.Status;
        this.mStatus = status;
    }

    public int getStatus() {
        assert this.mTag == Tag.Status;
        return this.mStatus;
    }

    public void setKeys(FetchApiRequest[] keys) {
        this.mTag = Tag.Keys;
        this.mKeys = keys;
    }

    public FetchApiRequest[] getKeys() {
        assert this.mTag == Tag.Keys;
        return this.mKeys;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.Status: {
                
                encoder0.encode(this.mStatus, offset + 8);
                break;
            }
            case Tag.Keys: {
                
                if (this.mKeys == null) {
                    encoder0.encodeNullPointer(offset + 8, false);
                } else {
                    org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.mKeys.length, offset + 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    for (int i0 = 0; i0 < this.mKeys.length; ++i0) {
                        
                        encoder1.encode(this.mKeys[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                    }
                }
                break;
            }
            default: {
                break;
            }
        }
    }

    public static CacheKeysResult deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final CacheKeysResult decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        CacheKeysResult result = new CacheKeysResult();
        switch (dataHeader.elementsOrVersion) {
            case Tag.Status: {
                
                result.mStatus = decoder0.readInt(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE);
                    CacheStorageError.validate(result.mStatus);
                    result.mStatus = CacheStorageError.toKnownValue(result.mStatus);
                result.mTag = Tag.Status;
                break;
            }
            case Tag.Keys: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.mKeys = new FetchApiRequest[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.mKeys[i1] = FetchApiRequest.decode(decoder2);
                    }
                }
                result.mTag = Tag.Keys;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}