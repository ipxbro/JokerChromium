// AppCacheInfo.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/appcache/appcache_info.mojom
//

package org.chromium.blink.mojom;


public final class AppCacheInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 104;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(104, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.url.mojom.Url manifestUrl;
    public org.chromium.mojo_base.mojom.Time creationTime;
    public org.chromium.mojo_base.mojom.Time lastUpdateTime;
    public org.chromium.mojo_base.mojom.Time lastAccessTime;
    public org.chromium.mojo_base.mojom.Time tokenExpires;
    public long cacheId;
    public long groupId;
    public int status;
    public long responseSizes;
    public long paddingSizes;
    public boolean isComplete;
    public long manifestParserVersion;
    public String manifestScope;

    private AppCacheInfo(int version) {
        super(STRUCT_SIZE, version);
    }

    public AppCacheInfo() {
        this(0);
    }

    public static AppCacheInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static AppCacheInfo deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static AppCacheInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        AppCacheInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new AppCacheInfo(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.manifestUrl = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.creationTime = org.chromium.mojo_base.mojom.Time.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.lastUpdateTime = org.chromium.mojo_base.mojom.Time.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.lastAccessTime = org.chromium.mojo_base.mojom.Time.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.tokenExpires = org.chromium.mojo_base.mojom.Time.decode(decoder1);
                }
                {
                    
                result.cacheId = decoder0.readLong(48);
                }
                {
                    
                result.groupId = decoder0.readLong(56);
                }
                {
                    
                result.status = decoder0.readInt(64);
                    AppCacheStatus.validate(result.status);
                    result.status = AppCacheStatus.toKnownValue(result.status);
                }
                {
                    
                result.isComplete = decoder0.readBoolean(68, 0);
                }
                {
                    
                result.responseSizes = decoder0.readLong(72);
                }
                {
                    
                result.paddingSizes = decoder0.readLong(80);
                }
                {
                    
                result.manifestParserVersion = decoder0.readLong(88);
                }
                {
                    
                result.manifestScope = decoder0.readString(96, false);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.manifestUrl, 8, false);
        
        encoder0.encode(this.creationTime, 16, false);
        
        encoder0.encode(this.lastUpdateTime, 24, false);
        
        encoder0.encode(this.lastAccessTime, 32, false);
        
        encoder0.encode(this.tokenExpires, 40, false);
        
        encoder0.encode(this.cacheId, 48);
        
        encoder0.encode(this.groupId, 56);
        
        encoder0.encode(this.status, 64);
        
        encoder0.encode(this.isComplete, 68, 0);
        
        encoder0.encode(this.responseSizes, 72);
        
        encoder0.encode(this.paddingSizes, 80);
        
        encoder0.encode(this.manifestParserVersion, 88);
        
        encoder0.encode(this.manifestScope, 96, false);
    }
}