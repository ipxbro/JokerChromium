// LatencyInfo.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/latency/mojom/latency_info.mojom
//

package org.chromium.ui.mojom;


public final class LatencyInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 56;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(56, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public java.util.Map<Integer, org.chromium.mojo_base.mojom.TimeTicks> latencyComponents;
    public long traceId;
    public long ukmSourceId;
    public boolean coalesced;
    public boolean began;
    public boolean terminated;
    public int sourceEventType;
    public float scrollUpdateDelta;
    public float predictedScrollUpdateDelta;
    public long gestureScrollId;

    private LatencyInfo(int version) {
        super(STRUCT_SIZE, version);
    }

    public LatencyInfo() {
        this(0);
    }

    public static LatencyInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static LatencyInfo deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static LatencyInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        LatencyInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new LatencyInfo(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                {
                    decoder1.readDataHeaderForMap();
                    int[] keys0;
                    org.chromium.mojo_base.mojom.TimeTicks[] values0;
                    {
                        
                        keys0 = decoder1.readInts(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        {
                            for (int i1 = 0; i1 < keys0.length; ++i1) {
                                LatencyComponentType.validate(keys0[i1]);
                            }
                        }
                    }
                    {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, false);
                        {
                            org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(keys0.length);
                            values0 = new org.chromium.mojo_base.mojom.TimeTicks[si2.elementsOrVersion];
                            for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                
                                org.chromium.mojo.bindings.Decoder decoder3 = decoder2.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                                values0[i2] = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder3);
                            }
                        }
                    }
                    result.latencyComponents = new java.util.HashMap<Integer, org.chromium.mojo_base.mojom.TimeTicks>();
                    for (int index0 = 0; index0 < keys0.length; ++index0) {
                        result.latencyComponents.put(keys0[index0],  values0[index0]);
                    }
                }
                }
                {
                    
                result.traceId = decoder0.readLong(16);
                }
                {
                    
                result.ukmSourceId = decoder0.readLong(24);
                }
                {
                    
                result.coalesced = decoder0.readBoolean(32, 0);
                }
                {
                    
                result.began = decoder0.readBoolean(32, 1);
                }
                {
                    
                result.terminated = decoder0.readBoolean(32, 2);
                }
                {
                    
                result.sourceEventType = decoder0.readInt(36);
                    SourceEventType.validate(result.sourceEventType);
                }
                {
                    
                result.scrollUpdateDelta = decoder0.readFloat(40);
                }
                {
                    
                result.predictedScrollUpdateDelta = decoder0.readFloat(44);
                }
                {
                    
                result.gestureScrollId = decoder0.readLong(48);
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
        
        if (this.latencyComponents == null) {
            encoder0.encodeNullPointer(8, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encoderForMap(8);
            int size0 = this.latencyComponents.size();
            int[] keys0 = new int[size0];
            org.chromium.mojo_base.mojom.TimeTicks[] values0 = new org.chromium.mojo_base.mojom.TimeTicks[size0];
            int index0 = 0;
            for (java.util.Map.Entry<Integer, org.chromium.mojo_base.mojom.TimeTicks> entry0 : this.latencyComponents.entrySet()) {
                keys0[index0] = entry0.getKey();
                values0[index0] = entry0.getValue();
                ++index0;
            }
            
            encoder1.encode(keys0, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            
            {
                org.chromium.mojo.bindings.Encoder encoder2 = encoder1.encodePointerArray(values0.length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i1 = 0; i1 < values0.length; ++i1) {
                    
                    encoder2.encode(values0[i1], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                }
            }
        }
        
        encoder0.encode(this.traceId, 16);
        
        encoder0.encode(this.ukmSourceId, 24);
        
        encoder0.encode(this.coalesced, 32, 0);
        
        encoder0.encode(this.began, 32, 1);
        
        encoder0.encode(this.terminated, 32, 2);
        
        encoder0.encode(this.sourceEventType, 36);
        
        encoder0.encode(this.scrollUpdateDelta, 40);
        
        encoder0.encode(this.predictedScrollUpdateDelta, 44);
        
        encoder0.encode(this.gestureScrollId, 48);
    }
}