// GetAssertionAuthenticatorResponse.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/webauthn/authenticator.mojom
//

package org.chromium.blink.mojom;


public final class GetAssertionAuthenticatorResponse extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 64;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(64, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public CommonCredentialInfo info;
    public byte[] signature;
    public byte[] userHandle;
    public boolean echoAppidExtension;
    public boolean appidExtension;
    public boolean echoUserVerificationMethods;
    public UvmEntry[] userVerificationMethods;
    public boolean echoPrf;
    public PrfValues prfResults;
    public boolean prfNotEvaluated;
    public boolean echoLargeBlob;
    public byte[] largeBlob;
    public boolean echoLargeBlobWritten;
    public boolean largeBlobWritten;

    private GetAssertionAuthenticatorResponse(int version) {
        super(STRUCT_SIZE, version);
    }

    public GetAssertionAuthenticatorResponse() {
        this(0);
    }

    public static GetAssertionAuthenticatorResponse deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static GetAssertionAuthenticatorResponse deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static GetAssertionAuthenticatorResponse decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        GetAssertionAuthenticatorResponse result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new GetAssertionAuthenticatorResponse(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.info = CommonCredentialInfo.decode(decoder1);
                }
                {
                    
                result.signature = decoder0.readBytes(16, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                }
                {
                    
                result.userHandle = decoder0.readBytes(24, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                }
                {
                    
                result.echoAppidExtension = decoder0.readBoolean(32, 0);
                }
                {
                    
                result.appidExtension = decoder0.readBoolean(32, 1);
                }
                {
                    
                result.echoUserVerificationMethods = decoder0.readBoolean(32, 2);
                }
                {
                    
                result.echoPrf = decoder0.readBoolean(32, 3);
                }
                {
                    
                result.prfNotEvaluated = decoder0.readBoolean(32, 4);
                }
                {
                    
                result.echoLargeBlob = decoder0.readBoolean(32, 5);
                }
                {
                    
                result.echoLargeBlobWritten = decoder0.readBoolean(32, 6);
                }
                {
                    
                result.largeBlobWritten = decoder0.readBoolean(32, 7);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, true);
                if (decoder1 == null) {
                    result.userVerificationMethods = null;
                } else {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.userVerificationMethods = new UvmEntry[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.userVerificationMethods[i1] = UvmEntry.decode(decoder2);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, true);
                result.prfResults = PrfValues.decode(decoder1);
                }
                {
                    
                result.largeBlob = decoder0.readBytes(56, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
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
        
        encoder0.encode(this.info, 8, false);
        
        encoder0.encode(this.signature, 16, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
        
        encoder0.encode(this.userHandle, 24, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
        
        encoder0.encode(this.echoAppidExtension, 32, 0);
        
        encoder0.encode(this.appidExtension, 32, 1);
        
        encoder0.encode(this.echoUserVerificationMethods, 32, 2);
        
        encoder0.encode(this.echoPrf, 32, 3);
        
        encoder0.encode(this.prfNotEvaluated, 32, 4);
        
        encoder0.encode(this.echoLargeBlob, 32, 5);
        
        encoder0.encode(this.echoLargeBlobWritten, 32, 6);
        
        encoder0.encode(this.largeBlobWritten, 32, 7);
        
        if (this.userVerificationMethods == null) {
            encoder0.encodeNullPointer(40, true);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.userVerificationMethods.length, 40, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.userVerificationMethods.length; ++i0) {
                
                encoder1.encode(this.userVerificationMethods[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.prfResults, 48, true);
        
        encoder0.encode(this.largeBlob, 56, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
    }
}