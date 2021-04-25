// MediaPlayerRendererClientExtension_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/renderer_extensions.mojom
//

package org.chromium.media.mojom;


class MediaPlayerRendererClientExtension_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<MediaPlayerRendererClientExtension, MediaPlayerRendererClientExtension.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<MediaPlayerRendererClientExtension, MediaPlayerRendererClientExtension.Proxy>() {

        @Override
        public String getName() {
            return "media.mojom.MediaPlayerRendererClientExtension";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, MediaPlayerRendererClientExtension impl) {
            return new Stub(core, impl);
        }

        @Override
        public MediaPlayerRendererClientExtension[] buildArray(int size) {
          return new MediaPlayerRendererClientExtension[size];
        }
    };


    private static final int ON_VIDEO_SIZE_CHANGE_ORDINAL = 0;

    private static final int ON_DURATION_CHANGE_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements MediaPlayerRendererClientExtension.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onVideoSizeChange(
org.chromium.gfx.mojom.Size size) {

            MediaPlayerRendererClientExtensionOnVideoSizeChangeParams _message = new MediaPlayerRendererClientExtensionOnVideoSizeChangeParams();

            _message.size = size;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_VIDEO_SIZE_CHANGE_ORDINAL)));

        }


        @Override
        public void onDurationChange(
org.chromium.mojo_base.mojom.TimeDelta duration) {

            MediaPlayerRendererClientExtensionOnDurationChangeParams _message = new MediaPlayerRendererClientExtensionOnDurationChangeParams();

            _message.duration = duration;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_DURATION_CHANGE_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<MediaPlayerRendererClientExtension> {

        Stub(org.chromium.mojo.system.Core core, MediaPlayerRendererClientExtension impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.NO_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                MediaPlayerRendererClientExtension_Internal.MANAGER, messageWithHeader);





                    case ON_VIDEO_SIZE_CHANGE_ORDINAL: {

                        MediaPlayerRendererClientExtensionOnVideoSizeChangeParams data =
                                MediaPlayerRendererClientExtensionOnVideoSizeChangeParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onVideoSizeChange(data.size);
                        return true;
                    }





                    case ON_DURATION_CHANGE_ORDINAL: {

                        MediaPlayerRendererClientExtensionOnDurationChangeParams data =
                                MediaPlayerRendererClientExtensionOnDurationChangeParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onDurationChange(data.duration);
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), MediaPlayerRendererClientExtension_Internal.MANAGER, messageWithHeader, receiver);






                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class MediaPlayerRendererClientExtensionOnVideoSizeChangeParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.gfx.mojom.Size size;

        private MediaPlayerRendererClientExtensionOnVideoSizeChangeParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public MediaPlayerRendererClientExtensionOnVideoSizeChangeParams() {
            this(0);
        }

        public static MediaPlayerRendererClientExtensionOnVideoSizeChangeParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static MediaPlayerRendererClientExtensionOnVideoSizeChangeParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static MediaPlayerRendererClientExtensionOnVideoSizeChangeParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            MediaPlayerRendererClientExtensionOnVideoSizeChangeParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new MediaPlayerRendererClientExtensionOnVideoSizeChangeParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.size = org.chromium.gfx.mojom.Size.decode(decoder1);
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
            
            encoder0.encode(this.size, 8, false);
        }
    }



    
    static final class MediaPlayerRendererClientExtensionOnDurationChangeParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo_base.mojom.TimeDelta duration;

        private MediaPlayerRendererClientExtensionOnDurationChangeParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public MediaPlayerRendererClientExtensionOnDurationChangeParams() {
            this(0);
        }

        public static MediaPlayerRendererClientExtensionOnDurationChangeParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static MediaPlayerRendererClientExtensionOnDurationChangeParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static MediaPlayerRendererClientExtensionOnDurationChangeParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            MediaPlayerRendererClientExtensionOnDurationChangeParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new MediaPlayerRendererClientExtensionOnDurationChangeParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.duration = org.chromium.mojo_base.mojom.TimeDelta.decode(decoder1);
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
            
            encoder0.encode(this.duration, 8, false);
        }
    }



}
