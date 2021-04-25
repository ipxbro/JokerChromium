// CspSourceList.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/content_security_policy.mojom
//

package org.chromium.network.mojom;


public final class CspSourceList extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public CspSource[] sources;
    public String[] nonces;
    public CspHashSource[] hashes;
    public boolean allowSelf;
    public boolean allowStar;
    public boolean allowResponseRedirects;
    public boolean allowInline;
    public boolean allowEval;
    public boolean allowWasmEval;
    public boolean allowDynamic;
    public boolean allowUnsafeHashes;
    public boolean reportSample;

    private CspSourceList(int version) {
        super(STRUCT_SIZE, version);
        this.allowSelf = (boolean) false;
        this.allowStar = (boolean) false;
        this.allowResponseRedirects = (boolean) false;
        this.allowInline = (boolean) false;
        this.allowEval = (boolean) false;
        this.allowWasmEval = (boolean) false;
        this.allowDynamic = (boolean) false;
        this.allowUnsafeHashes = (boolean) false;
        this.reportSample = (boolean) false;
    }

    public CspSourceList() {
        this(0);
    }

    public static CspSourceList deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static CspSourceList deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static CspSourceList decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        CspSourceList result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new CspSourceList(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.sources = new CspSource[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.sources[i1] = CspSource.decode(decoder2);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.nonces = new String[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        result.nonces[i1] = decoder1.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.hashes = new CspHashSource[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.hashes[i1] = CspHashSource.decode(decoder2);
                    }
                }
                }
                {
                    
                result.allowSelf = decoder0.readBoolean(32, 0);
                }
                {
                    
                result.allowStar = decoder0.readBoolean(32, 1);
                }
                {
                    
                result.allowResponseRedirects = decoder0.readBoolean(32, 2);
                }
                {
                    
                result.allowInline = decoder0.readBoolean(32, 3);
                }
                {
                    
                result.allowEval = decoder0.readBoolean(32, 4);
                }
                {
                    
                result.allowWasmEval = decoder0.readBoolean(32, 5);
                }
                {
                    
                result.allowDynamic = decoder0.readBoolean(32, 6);
                }
                {
                    
                result.allowUnsafeHashes = decoder0.readBoolean(32, 7);
                }
                {
                    
                result.reportSample = decoder0.readBoolean(33, 0);
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
        
        if (this.sources == null) {
            encoder0.encodeNullPointer(8, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.sources.length, 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.sources.length; ++i0) {
                
                encoder1.encode(this.sources[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        if (this.nonces == null) {
            encoder0.encodeNullPointer(16, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.nonces.length, 16, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.nonces.length; ++i0) {
                
                encoder1.encode(this.nonces[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        if (this.hashes == null) {
            encoder0.encodeNullPointer(24, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.hashes.length, 24, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.hashes.length; ++i0) {
                
                encoder1.encode(this.hashes[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.allowSelf, 32, 0);
        
        encoder0.encode(this.allowStar, 32, 1);
        
        encoder0.encode(this.allowResponseRedirects, 32, 2);
        
        encoder0.encode(this.allowInline, 32, 3);
        
        encoder0.encode(this.allowEval, 32, 4);
        
        encoder0.encode(this.allowWasmEval, 32, 5);
        
        encoder0.encode(this.allowDynamic, 32, 6);
        
        encoder0.encode(this.allowUnsafeHashes, 32, 7);
        
        encoder0.encode(this.reportSample, 33, 0);
    }
}