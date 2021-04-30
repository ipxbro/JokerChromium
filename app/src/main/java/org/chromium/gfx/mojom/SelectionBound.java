// SelectionBound.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/gfx/mojom/selection_bound.mojom
//

package org.chromium.gfx.mojom;


public final class SelectionBound extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 48;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(48, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int type;
    public PointF edgeStart;
    public PointF edgeEnd;
    public PointF visibleEdgeStart;
    public PointF visibleEdgeEnd;
    public boolean visible;

    private SelectionBound(int version) {
        super(STRUCT_SIZE, version);
    }

    public SelectionBound() {
        this(0);
    }

    public static SelectionBound deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static SelectionBound deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static SelectionBound decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        SelectionBound result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new SelectionBound(elementsOrVersion);
                {
                    
                result.type = decoder0.readInt(8);
                    SelectionBoundType.validate(result.type);
                    result.type = SelectionBoundType.toKnownValue(result.type);
                }
                {
                    
                result.visible = decoder0.readBoolean(12, 0);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.edgeStart = PointF.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.edgeEnd = PointF.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.visibleEdgeStart = PointF.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.visibleEdgeEnd = PointF.decode(decoder1);
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
        
        encoder0.encode(this.type, 8);
        
        encoder0.encode(this.visible, 12, 0);
        
        encoder0.encode(this.edgeStart, 16, false);
        
        encoder0.encode(this.edgeEnd, 24, false);
        
        encoder0.encode(this.visibleEdgeStart, 32, false);
        
        encoder0.encode(this.visibleEdgeEnd, 40, false);
    }
}