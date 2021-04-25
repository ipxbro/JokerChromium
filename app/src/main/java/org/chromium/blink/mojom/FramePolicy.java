// FramePolicy.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/frame_policy.mojom
//

package org.chromium.blink.mojom;


public final class FramePolicy extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int sandboxFlags;
    public ParsedFeaturePolicyDeclaration[] containerPolicy;
    public java.util.Map<Integer, PolicyValue> requiredDocumentPolicy;
    public boolean allowedToDownload;
    public boolean disallowDocumentAccess;

    private FramePolicy(int version) {
        super(STRUCT_SIZE, version);
        this.allowedToDownload = (boolean) true;
        this.disallowDocumentAccess = (boolean) false;
    }

    public FramePolicy() {
        this(0);
    }

    public static FramePolicy deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static FramePolicy deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static FramePolicy decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        FramePolicy result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new FramePolicy(elementsOrVersion);
                {
                    
                result.sandboxFlags = decoder0.readInt(8);
                    org.chromium.network.mojom.WebSandboxFlags.validate(result.sandboxFlags);
                }
                {
                    
                result.allowedToDownload = decoder0.readBoolean(12, 0);
                }
                {
                    
                result.disallowDocumentAccess = decoder0.readBoolean(12, 1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.containerPolicy = new ParsedFeaturePolicyDeclaration[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.containerPolicy[i1] = ParsedFeaturePolicyDeclaration.decode(decoder2);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                {
                    decoder1.readDataHeaderForMap();
                    int[] keys0;
                    PolicyValue[] values0;
                    {
                        
                        keys0 = decoder1.readInts(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        {
                            for (int i1 = 0; i1 < keys0.length; ++i1) {
                                DocumentPolicyFeature.validate(keys0[i1]);
                            }
                        }
                    }
                    {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, false);
                        {
                            org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(keys0.length);
                            values0 = new PolicyValue[si2.elementsOrVersion];
                            for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                
                                values0[i2] = PolicyValue.decode(decoder2, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + 
                                org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE * i2);
                            }
                        }
                    }
                    result.requiredDocumentPolicy = new java.util.HashMap<Integer, PolicyValue>();
                    for (int index0 = 0; index0 < keys0.length; ++index0) {
                        result.requiredDocumentPolicy.put(keys0[index0],  values0[index0]);
                    }
                }
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
        
        encoder0.encode(this.sandboxFlags, 8);
        
        encoder0.encode(this.allowedToDownload, 12, 0);
        
        encoder0.encode(this.disallowDocumentAccess, 12, 1);
        
        if (this.containerPolicy == null) {
            encoder0.encodeNullPointer(16, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.containerPolicy.length, 16, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.containerPolicy.length; ++i0) {
                
                encoder1.encode(this.containerPolicy[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        if (this.requiredDocumentPolicy == null) {
            encoder0.encodeNullPointer(24, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encoderForMap(24);
            int size0 = this.requiredDocumentPolicy.size();
            int[] keys0 = new int[size0];
            PolicyValue[] values0 = new PolicyValue[size0];
            int index0 = 0;
            for (java.util.Map.Entry<Integer, PolicyValue> entry0 : this.requiredDocumentPolicy.entrySet()) {
                keys0[index0] = entry0.getKey();
                values0[index0] = entry0.getValue();
                ++index0;
            }
            
            encoder1.encode(keys0, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            
            {
                org.chromium.mojo.bindings.Encoder encoder2 = encoder1.encodeUnionArray(values0.length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i1 = 0; i1 < values0.length; ++i1) {
                    
                    encoder2.encode(values0[i1], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + 
                    org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE * i1, false);
                }
            }
        }
    }
}