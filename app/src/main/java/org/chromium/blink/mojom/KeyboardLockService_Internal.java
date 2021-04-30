// KeyboardLockService_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/keyboard_lock/keyboard_lock.mojom
//

package org.chromium.blink.mojom;


class KeyboardLockService_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<KeyboardLockService, KeyboardLockService.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<KeyboardLockService, KeyboardLockService.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.KeyboardLockService";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, KeyboardLockService impl) {
            return new Stub(core, impl);
        }

        @Override
        public KeyboardLockService[] buildArray(int size) {
          return new KeyboardLockService[size];
        }
    };


    private static final int REQUEST_KEYBOARD_LOCK_ORDINAL = 0;

    private static final int CANCEL_KEYBOARD_LOCK_ORDINAL = 1;

    private static final int GET_KEYBOARD_LAYOUT_MAP_ORDINAL = 2;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements KeyboardLockService.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void requestKeyboardLock(
String[] keyCodes, 
RequestKeyboardLockResponse callback) {

            KeyboardLockServiceRequestKeyboardLockParams _message = new KeyboardLockServiceRequestKeyboardLockParams();

            _message.keyCodes = keyCodes;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    REQUEST_KEYBOARD_LOCK_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new KeyboardLockServiceRequestKeyboardLockResponseParamsForwardToCallback(callback));

        }


        @Override
        public void cancelKeyboardLock(
) {

            KeyboardLockServiceCancelKeyboardLockParams _message = new KeyboardLockServiceCancelKeyboardLockParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(CANCEL_KEYBOARD_LOCK_ORDINAL)));

        }


        @Override
        public void getKeyboardLayoutMap(

GetKeyboardLayoutMapResponse callback) {

            KeyboardLockServiceGetKeyboardLayoutMapParams _message = new KeyboardLockServiceGetKeyboardLayoutMapParams();


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_KEYBOARD_LAYOUT_MAP_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new KeyboardLockServiceGetKeyboardLayoutMapResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<KeyboardLockService> {

        Stub(org.chromium.mojo.system.Core core, KeyboardLockService impl) {
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
                                KeyboardLockService_Internal.MANAGER, messageWithHeader);







                    case CANCEL_KEYBOARD_LOCK_ORDINAL: {

                        KeyboardLockServiceCancelKeyboardLockParams.deserialize(messageWithHeader.getPayload());

                        getImpl().cancelKeyboardLock();
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
                                getCore(), KeyboardLockService_Internal.MANAGER, messageWithHeader, receiver);







                    case REQUEST_KEYBOARD_LOCK_ORDINAL: {

                        KeyboardLockServiceRequestKeyboardLockParams data =
                                KeyboardLockServiceRequestKeyboardLockParams.deserialize(messageWithHeader.getPayload());

                        getImpl().requestKeyboardLock(data.keyCodes, new KeyboardLockServiceRequestKeyboardLockResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }









                    case GET_KEYBOARD_LAYOUT_MAP_ORDINAL: {

                        KeyboardLockServiceGetKeyboardLayoutMapParams.deserialize(messageWithHeader.getPayload());

                        getImpl().getKeyboardLayoutMap(new KeyboardLockServiceGetKeyboardLayoutMapResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    }


    
    static final class KeyboardLockServiceRequestKeyboardLockParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public String[] keyCodes;

        private KeyboardLockServiceRequestKeyboardLockParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public KeyboardLockServiceRequestKeyboardLockParams() {
            this(0);
        }

        public static KeyboardLockServiceRequestKeyboardLockParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static KeyboardLockServiceRequestKeyboardLockParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static KeyboardLockServiceRequestKeyboardLockParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            KeyboardLockServiceRequestKeyboardLockParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new KeyboardLockServiceRequestKeyboardLockParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.keyCodes = new String[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                            
                            result.keyCodes[i1] = decoder1.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        }
                    }
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
            
            if (this.keyCodes == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.keyCodes.length, 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < this.keyCodes.length; ++i0) {
                    
                    encoder1.encode(this.keyCodes[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
        }
    }



    
    static final class KeyboardLockServiceRequestKeyboardLockResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int result;

        private KeyboardLockServiceRequestKeyboardLockResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public KeyboardLockServiceRequestKeyboardLockResponseParams() {
            this(0);
        }

        public static KeyboardLockServiceRequestKeyboardLockResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static KeyboardLockServiceRequestKeyboardLockResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static KeyboardLockServiceRequestKeyboardLockResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            KeyboardLockServiceRequestKeyboardLockResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new KeyboardLockServiceRequestKeyboardLockResponseParams(elementsOrVersion);
                    {
                        
                    result.result = decoder0.readInt(8);
                        KeyboardLockRequestResult.validate(result.result);
                        result.result = KeyboardLockRequestResult.toKnownValue(result.result);
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
            
            encoder0.encode(this.result, 8);
        }
    }

    static class KeyboardLockServiceRequestKeyboardLockResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final KeyboardLockService.RequestKeyboardLockResponse mCallback;

        KeyboardLockServiceRequestKeyboardLockResponseParamsForwardToCallback(KeyboardLockService.RequestKeyboardLockResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(REQUEST_KEYBOARD_LOCK_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                KeyboardLockServiceRequestKeyboardLockResponseParams response = KeyboardLockServiceRequestKeyboardLockResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.result);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class KeyboardLockServiceRequestKeyboardLockResponseParamsProxyToResponder implements KeyboardLockService.RequestKeyboardLockResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        KeyboardLockServiceRequestKeyboardLockResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Integer result) {
            KeyboardLockServiceRequestKeyboardLockResponseParams _response = new KeyboardLockServiceRequestKeyboardLockResponseParams();

            _response.result = result;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    REQUEST_KEYBOARD_LOCK_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



    
    static final class KeyboardLockServiceCancelKeyboardLockParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private KeyboardLockServiceCancelKeyboardLockParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public KeyboardLockServiceCancelKeyboardLockParams() {
            this(0);
        }

        public static KeyboardLockServiceCancelKeyboardLockParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static KeyboardLockServiceCancelKeyboardLockParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static KeyboardLockServiceCancelKeyboardLockParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            KeyboardLockServiceCancelKeyboardLockParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new KeyboardLockServiceCancelKeyboardLockParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class KeyboardLockServiceGetKeyboardLayoutMapParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private KeyboardLockServiceGetKeyboardLayoutMapParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public KeyboardLockServiceGetKeyboardLayoutMapParams() {
            this(0);
        }

        public static KeyboardLockServiceGetKeyboardLayoutMapParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static KeyboardLockServiceGetKeyboardLayoutMapParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static KeyboardLockServiceGetKeyboardLayoutMapParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            KeyboardLockServiceGetKeyboardLayoutMapParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new KeyboardLockServiceGetKeyboardLayoutMapParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class KeyboardLockServiceGetKeyboardLayoutMapResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public GetKeyboardLayoutMapResult result;

        private KeyboardLockServiceGetKeyboardLayoutMapResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public KeyboardLockServiceGetKeyboardLayoutMapResponseParams() {
            this(0);
        }

        public static KeyboardLockServiceGetKeyboardLayoutMapResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static KeyboardLockServiceGetKeyboardLayoutMapResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static KeyboardLockServiceGetKeyboardLayoutMapResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            KeyboardLockServiceGetKeyboardLayoutMapResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new KeyboardLockServiceGetKeyboardLayoutMapResponseParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.result = GetKeyboardLayoutMapResult.decode(decoder1);
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
            
            encoder0.encode(this.result, 8, false);
        }
    }

    static class KeyboardLockServiceGetKeyboardLayoutMapResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final KeyboardLockService.GetKeyboardLayoutMapResponse mCallback;

        KeyboardLockServiceGetKeyboardLayoutMapResponseParamsForwardToCallback(KeyboardLockService.GetKeyboardLayoutMapResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(GET_KEYBOARD_LAYOUT_MAP_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                KeyboardLockServiceGetKeyboardLayoutMapResponseParams response = KeyboardLockServiceGetKeyboardLayoutMapResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.result);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class KeyboardLockServiceGetKeyboardLayoutMapResponseParamsProxyToResponder implements KeyboardLockService.GetKeyboardLayoutMapResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        KeyboardLockServiceGetKeyboardLayoutMapResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(GetKeyboardLayoutMapResult result) {
            KeyboardLockServiceGetKeyboardLayoutMapResponseParams _response = new KeyboardLockServiceGetKeyboardLayoutMapResponseParams();

            _response.result = result;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_KEYBOARD_LAYOUT_MAP_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



}
