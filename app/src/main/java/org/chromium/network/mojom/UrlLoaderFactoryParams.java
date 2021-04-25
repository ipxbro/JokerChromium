// UrlLoaderFactoryParams.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_context.mojom
//

package org.chromium.network.mojom;


public final class UrlLoaderFactoryParams extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 96;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(96, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int processId;
    public org.chromium.url.internal.mojom.Origin requestInitiatorOriginLock;
    public boolean isCorbEnabled;
    public boolean ignoreIsolatedWorldOrigin;
    public boolean unsafeNonWebbyInitiator;
    public boolean disableWebSecurity;
    public TrustedUrlLoaderHeaderClient headerClient;
    public CorsOriginAccessPatterns factoryBoundAccessPatterns;
    public IsolationInfo isolationInfo;
    public boolean disableSecureDns;
    public boolean isTrusted;
    public boolean automaticallyAssignIsolationInfo;
    public org.chromium.mojo_base.mojom.UnguessableToken topFrameId;
    public UrlLoaderFactoryOverride factoryOverride;
    public ClientSecurityState clientSecurityState;
    public CrossOriginEmbedderPolicyReporter coepReporter;
    public CookieAccessObserver cookieObserver;
    public int trustTokenRedemptionPolicy;

    private UrlLoaderFactoryParams(int version) {
        super(STRUCT_SIZE, version);
        this.processId = (int) NetworkContextConstants.INVALID_PROCESS_ID;
        this.isCorbEnabled = (boolean) true;
        this.ignoreIsolatedWorldOrigin = (boolean) true;
        this.unsafeNonWebbyInitiator = (boolean) false;
        this.disableWebSecurity = (boolean) false;
        this.disableSecureDns = (boolean) false;
        this.isTrusted = (boolean) false;
        this.automaticallyAssignIsolationInfo = (boolean) false;
        this.trustTokenRedemptionPolicy = (int) TrustTokenRedemptionPolicy.POTENTIALLY_PERMIT;
    }

    public UrlLoaderFactoryParams() {
        this(0);
    }

    public static UrlLoaderFactoryParams deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static UrlLoaderFactoryParams deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static UrlLoaderFactoryParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        UrlLoaderFactoryParams result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new UrlLoaderFactoryParams(elementsOrVersion);
                {
                    
                result.processId = decoder0.readInt(8);
                }
                {
                    
                result.isCorbEnabled = decoder0.readBoolean(12, 0);
                }
                {
                    
                result.ignoreIsolatedWorldOrigin = decoder0.readBoolean(12, 1);
                }
                {
                    
                result.unsafeNonWebbyInitiator = decoder0.readBoolean(12, 2);
                }
                {
                    
                result.disableWebSecurity = decoder0.readBoolean(12, 3);
                }
                {
                    
                result.disableSecureDns = decoder0.readBoolean(12, 4);
                }
                {
                    
                result.isTrusted = decoder0.readBoolean(12, 5);
                }
                {
                    
                result.automaticallyAssignIsolationInfo = decoder0.readBoolean(12, 6);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, true);
                result.requestInitiatorOriginLock = org.chromium.url.internal.mojom.Origin.decode(decoder1);
                }
                {
                    
                result.headerClient = decoder0.readServiceInterface(24, true, TrustedUrlLoaderHeaderClient.MANAGER);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, true);
                result.factoryBoundAccessPatterns = CorsOriginAccessPatterns.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.isolationInfo = IsolationInfo.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, true);
                result.topFrameId = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, true);
                result.factoryOverride = UrlLoaderFactoryOverride.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(64, true);
                result.clientSecurityState = ClientSecurityState.decode(decoder1);
                }
                {
                    
                result.coepReporter = decoder0.readServiceInterface(72, true, CrossOriginEmbedderPolicyReporter.MANAGER);
                }
                {
                    
                result.cookieObserver = decoder0.readServiceInterface(80, true, CookieAccessObserver.MANAGER);
                }
                {
                    
                result.trustTokenRedemptionPolicy = decoder0.readInt(88);
                    TrustTokenRedemptionPolicy.validate(result.trustTokenRedemptionPolicy);
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
        
        encoder0.encode(this.processId, 8);
        
        encoder0.encode(this.isCorbEnabled, 12, 0);
        
        encoder0.encode(this.ignoreIsolatedWorldOrigin, 12, 1);
        
        encoder0.encode(this.unsafeNonWebbyInitiator, 12, 2);
        
        encoder0.encode(this.disableWebSecurity, 12, 3);
        
        encoder0.encode(this.disableSecureDns, 12, 4);
        
        encoder0.encode(this.isTrusted, 12, 5);
        
        encoder0.encode(this.automaticallyAssignIsolationInfo, 12, 6);
        
        encoder0.encode(this.requestInitiatorOriginLock, 16, true);
        
        encoder0.encode(this.headerClient, 24, true, TrustedUrlLoaderHeaderClient.MANAGER);
        
        encoder0.encode(this.factoryBoundAccessPatterns, 32, true);
        
        encoder0.encode(this.isolationInfo, 40, false);
        
        encoder0.encode(this.topFrameId, 48, true);
        
        encoder0.encode(this.factoryOverride, 56, true);
        
        encoder0.encode(this.clientSecurityState, 64, true);
        
        encoder0.encode(this.coepReporter, 72, true, CrossOriginEmbedderPolicyReporter.MANAGER);
        
        encoder0.encode(this.cookieObserver, 80, true, CookieAccessObserver.MANAGER);
        
        encoder0.encode(this.trustTokenRedemptionPolicy, 88);
    }
}