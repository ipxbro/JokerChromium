// FullscreenOptions.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/fullscreen.mojom
//

package org.chromium.blink.mojom;


public final class FullscreenOptions extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 24;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public boolean prefersNavigationBar;
    public long displayId;
    public boolean isPrefixed;
    public boolean isXrOverlay;

    private FullscreenOptions(int version) {
        super(STRUCT_SIZE, version);
        this.prefersNavigationBar = (boolean) false;
        this.displayId = (long) -1;
        this.isPrefixed = (boolean) false;
        this.isXrOverlay = (boolean) false;
    }

    public FullscreenOptions() {
        this(0);
    }

    public static FullscreenOptions deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static FullscreenOptions deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static FullscreenOptions decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        FullscreenOptions result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new FullscreenOptions(elementsOrVersion);
                {
                    
                result.prefersNavigationBar = decoder0.readBoolean(8, 0);
                }
                {
                    
                result.isPrefixed = decoder0.readBoolean(8, 1);
                }
                {
                    
                result.isXrOverlay = decoder0.readBoolean(8, 2);
                }
                {
                    
                result.displayId = decoder0.readLong(16);
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
        
        encoder0.encode(this.prefersNavigationBar, 8, 0);
        
        encoder0.encode(this.isPrefixed, 8, 1);
        
        encoder0.encode(this.isXrOverlay, 8, 2);
        
        encoder0.encode(this.displayId, 16);
    }
}