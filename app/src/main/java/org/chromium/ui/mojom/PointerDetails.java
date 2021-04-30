// PointerDetails.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/events/mojom/event.mojom
//

package org.chromium.ui.mojom;


public final class PointerDetails extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 56;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(56, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int pointerType;
    public float radiusX;
    public float radiusY;
    public float force;
    public float tiltX;
    public float tiltY;
    public float tangentialPressure;
    public float twist;
    public int id;
    public int offsetX;
    public int offsetY;

    private PointerDetails(int version) {
        super(STRUCT_SIZE, version);
    }

    public PointerDetails() {
        this(0);
    }

    public static PointerDetails deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static PointerDetails deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static PointerDetails decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        PointerDetails result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new PointerDetails(elementsOrVersion);
                {
                    
                result.pointerType = decoder0.readInt(8);
                    EventPointerType.validate(result.pointerType);
                    result.pointerType = EventPointerType.toKnownValue(result.pointerType);
                }
                {
                    
                result.radiusX = decoder0.readFloat(12);
                }
                {
                    
                result.radiusY = decoder0.readFloat(16);
                }
                {
                    
                result.force = decoder0.readFloat(20);
                }
                {
                    
                result.tiltX = decoder0.readFloat(24);
                }
                {
                    
                result.tiltY = decoder0.readFloat(28);
                }
                {
                    
                result.tangentialPressure = decoder0.readFloat(32);
                }
                {
                    
                result.twist = decoder0.readFloat(36);
                }
                {
                    
                result.id = decoder0.readInt(40);
                }
                {
                    
                result.offsetX = decoder0.readInt(44);
                }
                {
                    
                result.offsetY = decoder0.readInt(48);
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
        
        encoder0.encode(this.pointerType, 8);
        
        encoder0.encode(this.radiusX, 12);
        
        encoder0.encode(this.radiusY, 16);
        
        encoder0.encode(this.force, 20);
        
        encoder0.encode(this.tiltX, 24);
        
        encoder0.encode(this.tiltY, 28);
        
        encoder0.encode(this.tangentialPressure, 32);
        
        encoder0.encode(this.twist, 36);
        
        encoder0.encode(this.id, 40);
        
        encoder0.encode(this.offsetX, 44);
        
        encoder0.encode(this.offsetY, 48);
    }
}