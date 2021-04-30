// ImageInfo.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     skia/public/mojom/image_info.mojom
//

package org.chromium.skia.mojom;


public final class ImageInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int colorType;
    public int alphaType;
    public int width;
    public int height;
    public float[] colorTransferFunction;
    public float[] colorToXyzMatrix;

    private ImageInfo(int version) {
        super(STRUCT_SIZE, version);
    }

    public ImageInfo() {
        this(0);
    }

    public static ImageInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static ImageInfo deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static ImageInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        ImageInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new ImageInfo(elementsOrVersion);
                {
                    
                result.colorType = decoder0.readInt(8);
                    ColorType.validate(result.colorType);
                    result.colorType = ColorType.toKnownValue(result.colorType);
                }
                {
                    
                result.alphaType = decoder0.readInt(12);
                    AlphaType.validate(result.alphaType);
                    result.alphaType = AlphaType.toKnownValue(result.alphaType);
                }
                {
                    
                result.width = decoder0.readInt(16);
                }
                {
                    
                result.height = decoder0.readInt(20);
                }
                {
                    
                result.colorTransferFunction = decoder0.readFloats(24, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, 7);
                }
                {
                    
                result.colorToXyzMatrix = decoder0.readFloats(32, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, 9);
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
        
        encoder0.encode(this.colorType, 8);
        
        encoder0.encode(this.alphaType, 12);
        
        encoder0.encode(this.width, 16);
        
        encoder0.encode(this.height, 20);
        
        encoder0.encode(this.colorTransferFunction, 24, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, 7);
        
        encoder0.encode(this.colorToXyzMatrix, 32, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, 9);
    }
}