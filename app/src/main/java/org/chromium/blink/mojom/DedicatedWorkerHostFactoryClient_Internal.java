// DedicatedWorkerHostFactoryClient_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/worker/dedicated_worker_host_factory.mojom
//

package org.chromium.blink.mojom;


class DedicatedWorkerHostFactoryClient_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<DedicatedWorkerHostFactoryClient, DedicatedWorkerHostFactoryClient.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<DedicatedWorkerHostFactoryClient, DedicatedWorkerHostFactoryClient.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.DedicatedWorkerHostFactoryClient";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, DedicatedWorkerHostFactoryClient impl) {
            return new Stub(core, impl);
        }

        @Override
        public DedicatedWorkerHostFactoryClient[] buildArray(int size) {
          return new DedicatedWorkerHostFactoryClient[size];
        }
    };


    private static final int ON_WORKER_HOST_CREATED_ORDINAL = 0;

    private static final int ON_SCRIPT_LOAD_STARTED_ORDINAL = 1;

    private static final int ON_SCRIPT_LOAD_START_FAILED_ORDINAL = 2;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements DedicatedWorkerHostFactoryClient.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onWorkerHostCreated(
BrowserInterfaceBroker browserInterfaceBroker, DedicatedWorkerHost host) {

            DedicatedWorkerHostFactoryClientOnWorkerHostCreatedParams _message = new DedicatedWorkerHostFactoryClientOnWorkerHostCreatedParams();

            _message.browserInterfaceBroker = browserInterfaceBroker;

            _message.host = host;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_WORKER_HOST_CREATED_ORDINAL)));

        }


        @Override
        public void onScriptLoadStarted(
ServiceWorkerContainerInfoForClient serviceWorkerContainerInfo, WorkerMainScriptLoadParams mainScriptLoadParams, UrlLoaderFactoryBundle subresourceLoaderFactories, org.chromium.mojo.bindings.InterfaceRequest<SubresourceLoaderUpdater> subresourceLoaderUpdater, ControllerServiceWorkerInfo controllerInfo) {

            DedicatedWorkerHostFactoryClientOnScriptLoadStartedParams _message = new DedicatedWorkerHostFactoryClientOnScriptLoadStartedParams();

            _message.serviceWorkerContainerInfo = serviceWorkerContainerInfo;

            _message.mainScriptLoadParams = mainScriptLoadParams;

            _message.subresourceLoaderFactories = subresourceLoaderFactories;

            _message.subresourceLoaderUpdater = subresourceLoaderUpdater;

            _message.controllerInfo = controllerInfo;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_SCRIPT_LOAD_STARTED_ORDINAL)));

        }


        @Override
        public void onScriptLoadStartFailed(
) {

            DedicatedWorkerHostFactoryClientOnScriptLoadStartFailedParams _message = new DedicatedWorkerHostFactoryClientOnScriptLoadStartFailedParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_SCRIPT_LOAD_START_FAILED_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<DedicatedWorkerHostFactoryClient> {

        Stub(org.chromium.mojo.system.Core core, DedicatedWorkerHostFactoryClient impl) {
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
                                DedicatedWorkerHostFactoryClient_Internal.MANAGER, messageWithHeader);





                    case ON_WORKER_HOST_CREATED_ORDINAL: {

                        DedicatedWorkerHostFactoryClientOnWorkerHostCreatedParams data =
                                DedicatedWorkerHostFactoryClientOnWorkerHostCreatedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onWorkerHostCreated(data.browserInterfaceBroker, data.host);
                        return true;
                    }





                    case ON_SCRIPT_LOAD_STARTED_ORDINAL: {

                        DedicatedWorkerHostFactoryClientOnScriptLoadStartedParams data =
                                DedicatedWorkerHostFactoryClientOnScriptLoadStartedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onScriptLoadStarted(data.serviceWorkerContainerInfo, data.mainScriptLoadParams, data.subresourceLoaderFactories, data.subresourceLoaderUpdater, data.controllerInfo);
                        return true;
                    }





                    case ON_SCRIPT_LOAD_START_FAILED_ORDINAL: {

                        DedicatedWorkerHostFactoryClientOnScriptLoadStartFailedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onScriptLoadStartFailed();
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
                                getCore(), DedicatedWorkerHostFactoryClient_Internal.MANAGER, messageWithHeader, receiver);








                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class DedicatedWorkerHostFactoryClientOnWorkerHostCreatedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public BrowserInterfaceBroker browserInterfaceBroker;
        public DedicatedWorkerHost host;

        private DedicatedWorkerHostFactoryClientOnWorkerHostCreatedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public DedicatedWorkerHostFactoryClientOnWorkerHostCreatedParams() {
            this(0);
        }

        public static DedicatedWorkerHostFactoryClientOnWorkerHostCreatedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static DedicatedWorkerHostFactoryClientOnWorkerHostCreatedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static DedicatedWorkerHostFactoryClientOnWorkerHostCreatedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            DedicatedWorkerHostFactoryClientOnWorkerHostCreatedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new DedicatedWorkerHostFactoryClientOnWorkerHostCreatedParams(elementsOrVersion);
                    {
                        
                    result.browserInterfaceBroker = decoder0.readServiceInterface(8, false, BrowserInterfaceBroker.MANAGER);
                    }
                    {
                        
                    result.host = decoder0.readServiceInterface(16, false, DedicatedWorkerHost.MANAGER);
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
            
            encoder0.encode(this.browserInterfaceBroker, 8, false, BrowserInterfaceBroker.MANAGER);
            
            encoder0.encode(this.host, 16, false, DedicatedWorkerHost.MANAGER);
        }
    }



    
    static final class DedicatedWorkerHostFactoryClientOnScriptLoadStartedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 48;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(48, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public ServiceWorkerContainerInfoForClient serviceWorkerContainerInfo;
        public WorkerMainScriptLoadParams mainScriptLoadParams;
        public UrlLoaderFactoryBundle subresourceLoaderFactories;
        public org.chromium.mojo.bindings.InterfaceRequest<SubresourceLoaderUpdater> subresourceLoaderUpdater;
        public ControllerServiceWorkerInfo controllerInfo;

        private DedicatedWorkerHostFactoryClientOnScriptLoadStartedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public DedicatedWorkerHostFactoryClientOnScriptLoadStartedParams() {
            this(0);
        }

        public static DedicatedWorkerHostFactoryClientOnScriptLoadStartedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static DedicatedWorkerHostFactoryClientOnScriptLoadStartedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static DedicatedWorkerHostFactoryClientOnScriptLoadStartedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            DedicatedWorkerHostFactoryClientOnScriptLoadStartedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new DedicatedWorkerHostFactoryClientOnScriptLoadStartedParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, true);
                    result.serviceWorkerContainerInfo = ServiceWorkerContainerInfoForClient.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.mainScriptLoadParams = WorkerMainScriptLoadParams.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                    result.subresourceLoaderFactories = UrlLoaderFactoryBundle.decode(decoder1);
                    }
                    {
                        
                    result.subresourceLoaderUpdater = decoder0.readInterfaceRequest(32, false);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, true);
                    result.controllerInfo = ControllerServiceWorkerInfo.decode(decoder1);
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
            
            encoder0.encode(this.serviceWorkerContainerInfo, 8, true);
            
            encoder0.encode(this.mainScriptLoadParams, 16, false);
            
            encoder0.encode(this.subresourceLoaderFactories, 24, false);
            
            encoder0.encode(this.subresourceLoaderUpdater, 32, false);
            
            encoder0.encode(this.controllerInfo, 40, true);
        }
    }



    
    static final class DedicatedWorkerHostFactoryClientOnScriptLoadStartFailedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private DedicatedWorkerHostFactoryClientOnScriptLoadStartFailedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public DedicatedWorkerHostFactoryClientOnScriptLoadStartFailedParams() {
            this(0);
        }

        public static DedicatedWorkerHostFactoryClientOnScriptLoadStartFailedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static DedicatedWorkerHostFactoryClientOnScriptLoadStartFailedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static DedicatedWorkerHostFactoryClientOnScriptLoadStartFailedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            DedicatedWorkerHostFactoryClientOnScriptLoadStartFailedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new DedicatedWorkerHostFactoryClientOnScriptLoadStartFailedParams(elementsOrVersion);

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



}
