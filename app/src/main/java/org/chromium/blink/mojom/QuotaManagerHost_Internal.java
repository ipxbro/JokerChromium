// QuotaManagerHost_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/quota/quota_manager_host.mojom
//

package org.chromium.blink.mojom;


class QuotaManagerHost_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<QuotaManagerHost, QuotaManagerHost.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<QuotaManagerHost, QuotaManagerHost.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.QuotaManagerHost";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, QuotaManagerHost impl) {
            return new Stub(core, impl);
        }

        @Override
        public QuotaManagerHost[] buildArray(int size) {
          return new QuotaManagerHost[size];
        }
    };


    private static final int ADD_CHANGE_LISTENER_ORDINAL = 0;

    private static final int QUERY_STORAGE_USAGE_AND_QUOTA_ORDINAL = 1;

    private static final int REQUEST_STORAGE_QUOTA_ORDINAL = 2;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements QuotaManagerHost.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void addChangeListener(
QuotaChangeListener listener, 
AddChangeListenerResponse callback) {

            QuotaManagerHostAddChangeListenerParams _message = new QuotaManagerHostAddChangeListenerParams();

            _message.listener = listener;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    ADD_CHANGE_LISTENER_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new QuotaManagerHostAddChangeListenerResponseParamsForwardToCallback(callback));

        }


        @Override
        public void queryStorageUsageAndQuota(
int storageType, 
QueryStorageUsageAndQuotaResponse callback) {

            QuotaManagerHostQueryStorageUsageAndQuotaParams _message = new QuotaManagerHostQueryStorageUsageAndQuotaParams();

            _message.storageType = storageType;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    QUERY_STORAGE_USAGE_AND_QUOTA_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new QuotaManagerHostQueryStorageUsageAndQuotaResponseParamsForwardToCallback(callback));

        }


        @Override
        public void requestStorageQuota(
int storageType, long requestedSize, 
RequestStorageQuotaResponse callback) {

            QuotaManagerHostRequestStorageQuotaParams _message = new QuotaManagerHostRequestStorageQuotaParams();

            _message.storageType = storageType;

            _message.requestedSize = requestedSize;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    REQUEST_STORAGE_QUOTA_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new QuotaManagerHostRequestStorageQuotaResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<QuotaManagerHost> {

        Stub(org.chromium.mojo.system.Core core, QuotaManagerHost impl) {
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
                                QuotaManagerHost_Internal.MANAGER, messageWithHeader);








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
                                getCore(), QuotaManagerHost_Internal.MANAGER, messageWithHeader, receiver);







                    case ADD_CHANGE_LISTENER_ORDINAL: {

                        QuotaManagerHostAddChangeListenerParams data =
                                QuotaManagerHostAddChangeListenerParams.deserialize(messageWithHeader.getPayload());

                        getImpl().addChangeListener(data.listener, new QuotaManagerHostAddChangeListenerResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }







                    case QUERY_STORAGE_USAGE_AND_QUOTA_ORDINAL: {

                        QuotaManagerHostQueryStorageUsageAndQuotaParams data =
                                QuotaManagerHostQueryStorageUsageAndQuotaParams.deserialize(messageWithHeader.getPayload());

                        getImpl().queryStorageUsageAndQuota(data.storageType, new QuotaManagerHostQueryStorageUsageAndQuotaResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }







                    case REQUEST_STORAGE_QUOTA_ORDINAL: {

                        QuotaManagerHostRequestStorageQuotaParams data =
                                QuotaManagerHostRequestStorageQuotaParams.deserialize(messageWithHeader.getPayload());

                        getImpl().requestStorageQuota(data.storageType, data.requestedSize, new QuotaManagerHostRequestStorageQuotaResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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


    
    static final class QuotaManagerHostAddChangeListenerParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public QuotaChangeListener listener;

        private QuotaManagerHostAddChangeListenerParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public QuotaManagerHostAddChangeListenerParams() {
            this(0);
        }

        public static QuotaManagerHostAddChangeListenerParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static QuotaManagerHostAddChangeListenerParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static QuotaManagerHostAddChangeListenerParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            QuotaManagerHostAddChangeListenerParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new QuotaManagerHostAddChangeListenerParams(elementsOrVersion);
                    {
                        
                    result.listener = decoder0.readServiceInterface(8, false, QuotaChangeListener.MANAGER);
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
            
            encoder0.encode(this.listener, 8, false, QuotaChangeListener.MANAGER);
        }
    }



    
    static final class QuotaManagerHostAddChangeListenerResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private QuotaManagerHostAddChangeListenerResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public QuotaManagerHostAddChangeListenerResponseParams() {
            this(0);
        }

        public static QuotaManagerHostAddChangeListenerResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static QuotaManagerHostAddChangeListenerResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static QuotaManagerHostAddChangeListenerResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            QuotaManagerHostAddChangeListenerResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new QuotaManagerHostAddChangeListenerResponseParams(elementsOrVersion);

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

    static class QuotaManagerHostAddChangeListenerResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final QuotaManagerHost.AddChangeListenerResponse mCallback;

        QuotaManagerHostAddChangeListenerResponseParamsForwardToCallback(QuotaManagerHost.AddChangeListenerResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(ADD_CHANGE_LISTENER_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                mCallback.call();
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class QuotaManagerHostAddChangeListenerResponseParamsProxyToResponder implements QuotaManagerHost.AddChangeListenerResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        QuotaManagerHostAddChangeListenerResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call() {
            QuotaManagerHostAddChangeListenerResponseParams _response = new QuotaManagerHostAddChangeListenerResponseParams();

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    ADD_CHANGE_LISTENER_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



    
    static final class QuotaManagerHostQueryStorageUsageAndQuotaParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int storageType;

        private QuotaManagerHostQueryStorageUsageAndQuotaParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public QuotaManagerHostQueryStorageUsageAndQuotaParams() {
            this(0);
        }

        public static QuotaManagerHostQueryStorageUsageAndQuotaParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static QuotaManagerHostQueryStorageUsageAndQuotaParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static QuotaManagerHostQueryStorageUsageAndQuotaParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            QuotaManagerHostQueryStorageUsageAndQuotaParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new QuotaManagerHostQueryStorageUsageAndQuotaParams(elementsOrVersion);
                    {
                        
                    result.storageType = decoder0.readInt(8);
                        StorageType.validate(result.storageType);
                        result.storageType = StorageType.toKnownValue(result.storageType);
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
            
            encoder0.encode(this.storageType, 8);
        }
    }



    
    static final class QuotaManagerHostQueryStorageUsageAndQuotaResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 40;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int error;
        public long currentUsage;
        public long currentQuota;
        public UsageBreakdown usageBreakdown;

        private QuotaManagerHostQueryStorageUsageAndQuotaResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public QuotaManagerHostQueryStorageUsageAndQuotaResponseParams() {
            this(0);
        }

        public static QuotaManagerHostQueryStorageUsageAndQuotaResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static QuotaManagerHostQueryStorageUsageAndQuotaResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static QuotaManagerHostQueryStorageUsageAndQuotaResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            QuotaManagerHostQueryStorageUsageAndQuotaResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new QuotaManagerHostQueryStorageUsageAndQuotaResponseParams(elementsOrVersion);
                    {
                        
                    result.error = decoder0.readInt(8);
                        QuotaStatusCode.validate(result.error);
                        result.error = QuotaStatusCode.toKnownValue(result.error);
                    }
                    {
                        
                    result.currentUsage = decoder0.readLong(16);
                    }
                    {
                        
                    result.currentQuota = decoder0.readLong(24);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                    result.usageBreakdown = UsageBreakdown.decode(decoder1);
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
            
            encoder0.encode(this.error, 8);
            
            encoder0.encode(this.currentUsage, 16);
            
            encoder0.encode(this.currentQuota, 24);
            
            encoder0.encode(this.usageBreakdown, 32, false);
        }
    }

    static class QuotaManagerHostQueryStorageUsageAndQuotaResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final QuotaManagerHost.QueryStorageUsageAndQuotaResponse mCallback;

        QuotaManagerHostQueryStorageUsageAndQuotaResponseParamsForwardToCallback(QuotaManagerHost.QueryStorageUsageAndQuotaResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(QUERY_STORAGE_USAGE_AND_QUOTA_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                QuotaManagerHostQueryStorageUsageAndQuotaResponseParams response = QuotaManagerHostQueryStorageUsageAndQuotaResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.error, response.currentUsage, response.currentQuota, response.usageBreakdown);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class QuotaManagerHostQueryStorageUsageAndQuotaResponseParamsProxyToResponder implements QuotaManagerHost.QueryStorageUsageAndQuotaResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        QuotaManagerHostQueryStorageUsageAndQuotaResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Integer error, Long currentUsage, Long currentQuota, UsageBreakdown usageBreakdown) {
            QuotaManagerHostQueryStorageUsageAndQuotaResponseParams _response = new QuotaManagerHostQueryStorageUsageAndQuotaResponseParams();

            _response.error = error;

            _response.currentUsage = currentUsage;

            _response.currentQuota = currentQuota;

            _response.usageBreakdown = usageBreakdown;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    QUERY_STORAGE_USAGE_AND_QUOTA_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



    
    static final class QuotaManagerHostRequestStorageQuotaParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int storageType;
        public long requestedSize;

        private QuotaManagerHostRequestStorageQuotaParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public QuotaManagerHostRequestStorageQuotaParams() {
            this(0);
        }

        public static QuotaManagerHostRequestStorageQuotaParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static QuotaManagerHostRequestStorageQuotaParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static QuotaManagerHostRequestStorageQuotaParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            QuotaManagerHostRequestStorageQuotaParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new QuotaManagerHostRequestStorageQuotaParams(elementsOrVersion);
                    {
                        
                    result.storageType = decoder0.readInt(8);
                        StorageType.validate(result.storageType);
                        result.storageType = StorageType.toKnownValue(result.storageType);
                    }
                    {
                        
                    result.requestedSize = decoder0.readLong(16);
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
            
            encoder0.encode(this.storageType, 8);
            
            encoder0.encode(this.requestedSize, 16);
        }
    }



    
    static final class QuotaManagerHostRequestStorageQuotaResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int error;
        public long currentUsage;
        public long grantedQuota;

        private QuotaManagerHostRequestStorageQuotaResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public QuotaManagerHostRequestStorageQuotaResponseParams() {
            this(0);
        }

        public static QuotaManagerHostRequestStorageQuotaResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static QuotaManagerHostRequestStorageQuotaResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static QuotaManagerHostRequestStorageQuotaResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            QuotaManagerHostRequestStorageQuotaResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new QuotaManagerHostRequestStorageQuotaResponseParams(elementsOrVersion);
                    {
                        
                    result.error = decoder0.readInt(8);
                        QuotaStatusCode.validate(result.error);
                        result.error = QuotaStatusCode.toKnownValue(result.error);
                    }
                    {
                        
                    result.currentUsage = decoder0.readLong(16);
                    }
                    {
                        
                    result.grantedQuota = decoder0.readLong(24);
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
            
            encoder0.encode(this.error, 8);
            
            encoder0.encode(this.currentUsage, 16);
            
            encoder0.encode(this.grantedQuota, 24);
        }
    }

    static class QuotaManagerHostRequestStorageQuotaResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final QuotaManagerHost.RequestStorageQuotaResponse mCallback;

        QuotaManagerHostRequestStorageQuotaResponseParamsForwardToCallback(QuotaManagerHost.RequestStorageQuotaResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(REQUEST_STORAGE_QUOTA_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                QuotaManagerHostRequestStorageQuotaResponseParams response = QuotaManagerHostRequestStorageQuotaResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.error, response.currentUsage, response.grantedQuota);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class QuotaManagerHostRequestStorageQuotaResponseParamsProxyToResponder implements QuotaManagerHost.RequestStorageQuotaResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        QuotaManagerHostRequestStorageQuotaResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Integer error, Long currentUsage, Long grantedQuota) {
            QuotaManagerHostRequestStorageQuotaResponseParams _response = new QuotaManagerHostRequestStorageQuotaResponseParams();

            _response.error = error;

            _response.currentUsage = currentUsage;

            _response.grantedQuota = grantedQuota;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    REQUEST_STORAGE_QUOTA_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



}
