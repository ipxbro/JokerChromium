// CanonicalCookie.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/cookie_manager.mojom
//

package org.chromium.network.mojom;


public final class CanonicalCookie extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 80;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(80, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String name;
    public String value;
    public String domain;
    public String path;
    public org.chromium.mojo_base.mojom.Time creation;
    public org.chromium.mojo_base.mojom.Time expiry;
    public org.chromium.mojo_base.mojom.Time lastAccess;
    public boolean secure;
    public boolean httponly;
    public int siteRestrictions;
    public int priority;
    public int sourceScheme;
    public boolean sameParty;

    private CanonicalCookie(int version) {
        super(STRUCT_SIZE, version);
        this.secure = (boolean) false;
        this.httponly = (boolean) false;
        this.siteRestrictions = (int) CookieSameSite.NO_RESTRICTION;
        this.priority = (int) CookiePriority.MEDIUM;
        this.sourceScheme = (int) CookieSourceScheme.UNSET;
        this.sameParty = (boolean) false;
    }

    public CanonicalCookie() {
        this(0);
    }

    public static CanonicalCookie deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static CanonicalCookie deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static CanonicalCookie decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        CanonicalCookie result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new CanonicalCookie(elementsOrVersion);
                {
                    
                result.name = decoder0.readString(8, false);
                }
                {
                    
                result.value = decoder0.readString(16, false);
                }
                {
                    
                result.domain = decoder0.readString(24, false);
                }
                {
                    
                result.path = decoder0.readString(32, false);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.creation = org.chromium.mojo_base.mojom.Time.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                result.expiry = org.chromium.mojo_base.mojom.Time.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, false);
                result.lastAccess = org.chromium.mojo_base.mojom.Time.decode(decoder1);
                }
                {
                    
                result.secure = decoder0.readBoolean(64, 0);
                }
                {
                    
                result.httponly = decoder0.readBoolean(64, 1);
                }
                {
                    
                result.sameParty = decoder0.readBoolean(64, 2);
                }
                {
                    
                result.siteRestrictions = decoder0.readInt(68);
                    CookieSameSite.validate(result.siteRestrictions);
                }
                {
                    
                result.priority = decoder0.readInt(72);
                    CookiePriority.validate(result.priority);
                }
                {
                    
                result.sourceScheme = decoder0.readInt(76);
                    CookieSourceScheme.validate(result.sourceScheme);
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
        
        encoder0.encode(this.name, 8, false);
        
        encoder0.encode(this.value, 16, false);
        
        encoder0.encode(this.domain, 24, false);
        
        encoder0.encode(this.path, 32, false);
        
        encoder0.encode(this.creation, 40, false);
        
        encoder0.encode(this.expiry, 48, false);
        
        encoder0.encode(this.lastAccess, 56, false);
        
        encoder0.encode(this.secure, 64, 0);
        
        encoder0.encode(this.httponly, 64, 1);
        
        encoder0.encode(this.sameParty, 64, 2);
        
        encoder0.encode(this.siteRestrictions, 68);
        
        encoder0.encode(this.priority, 72);
        
        encoder0.encode(this.sourceScheme, 76);
    }
}