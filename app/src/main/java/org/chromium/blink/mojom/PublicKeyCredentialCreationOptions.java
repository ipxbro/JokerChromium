// PublicKeyCredentialCreationOptions.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/webauthn/authenticator.mojom
//

package org.chromium.blink.mojom;


public final class PublicKeyCredentialCreationOptions extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 96;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(96, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public PublicKeyCredentialRpEntity relyingParty;
    public PublicKeyCredentialUserEntity user;
    public byte[] challenge;
    public PublicKeyCredentialParameters[] publicKeyParameters;
    public org.chromium.mojo_base.mojom.TimeDelta timeout;
    public PublicKeyCredentialDescriptor[] excludeCredentials;
    public AuthenticatorSelectionCriteria authenticatorSelection;
    public int attestation;
    public CableRegistration cableRegistrationData;
    public boolean hmacCreateSecret;
    public boolean prfEnable;
    public boolean userVerificationMethods;
    public int protectionPolicy;
    public boolean enforceProtectionPolicy;
    public String appidExclude;
    public boolean credProps;
    public int largeBlobEnable;
    public boolean isPaymentCredentialCreation;

    private PublicKeyCredentialCreationOptions(int version) {
        super(STRUCT_SIZE, version);
    }

    public PublicKeyCredentialCreationOptions() {
        this(0);
    }

    public static PublicKeyCredentialCreationOptions deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static PublicKeyCredentialCreationOptions deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static PublicKeyCredentialCreationOptions decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        PublicKeyCredentialCreationOptions result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new PublicKeyCredentialCreationOptions(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.relyingParty = PublicKeyCredentialRpEntity.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.user = PublicKeyCredentialUserEntity.decode(decoder1);
                }
                {
                    
                result.challenge = decoder0.readBytes(24, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.publicKeyParameters = new PublicKeyCredentialParameters[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.publicKeyParameters[i1] = PublicKeyCredentialParameters.decode(decoder2);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, true);
                result.timeout = org.chromium.mojo_base.mojom.TimeDelta.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.excludeCredentials = new PublicKeyCredentialDescriptor[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.excludeCredentials[i1] = PublicKeyCredentialDescriptor.decode(decoder2);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, true);
                result.authenticatorSelection = AuthenticatorSelectionCriteria.decode(decoder1);
                }
                {
                    
                result.attestation = decoder0.readInt(64);
                    AttestationConveyancePreference.validate(result.attestation);
                    result.attestation = AttestationConveyancePreference.toKnownValue(result.attestation);
                }
                {
                    
                result.hmacCreateSecret = decoder0.readBoolean(68, 0);
                }
                {
                    
                result.prfEnable = decoder0.readBoolean(68, 1);
                }
                {
                    
                result.userVerificationMethods = decoder0.readBoolean(68, 2);
                }
                {
                    
                result.enforceProtectionPolicy = decoder0.readBoolean(68, 3);
                }
                {
                    
                result.credProps = decoder0.readBoolean(68, 4);
                }
                {
                    
                result.isPaymentCredentialCreation = decoder0.readBoolean(68, 5);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(72, true);
                result.cableRegistrationData = CableRegistration.decode(decoder1);
                }
                {
                    
                result.protectionPolicy = decoder0.readInt(80);
                    ProtectionPolicy.validate(result.protectionPolicy);
                    result.protectionPolicy = ProtectionPolicy.toKnownValue(result.protectionPolicy);
                }
                {
                    
                result.largeBlobEnable = decoder0.readInt(84);
                    LargeBlobSupport.validate(result.largeBlobEnable);
                    result.largeBlobEnable = LargeBlobSupport.toKnownValue(result.largeBlobEnable);
                }
                {
                    
                result.appidExclude = decoder0.readString(88, true);
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
        
        encoder0.encode(this.relyingParty, 8, false);
        
        encoder0.encode(this.user, 16, false);
        
        encoder0.encode(this.challenge, 24, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
        
        if (this.publicKeyParameters == null) {
            encoder0.encodeNullPointer(32, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.publicKeyParameters.length, 32, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.publicKeyParameters.length; ++i0) {
                
                encoder1.encode(this.publicKeyParameters[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.timeout, 40, true);
        
        if (this.excludeCredentials == null) {
            encoder0.encodeNullPointer(48, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.excludeCredentials.length, 48, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.excludeCredentials.length; ++i0) {
                
                encoder1.encode(this.excludeCredentials[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.authenticatorSelection, 56, true);
        
        encoder0.encode(this.attestation, 64);
        
        encoder0.encode(this.hmacCreateSecret, 68, 0);
        
        encoder0.encode(this.prfEnable, 68, 1);
        
        encoder0.encode(this.userVerificationMethods, 68, 2);
        
        encoder0.encode(this.enforceProtectionPolicy, 68, 3);
        
        encoder0.encode(this.credProps, 68, 4);
        
        encoder0.encode(this.isPaymentCredentialCreation, 68, 5);
        
        encoder0.encode(this.cableRegistrationData, 72, true);
        
        encoder0.encode(this.protectionPolicy, 80);
        
        encoder0.encode(this.largeBlobEnable, 84);
        
        encoder0.encode(this.appidExclude, 88, true);
    }
}