// FileSystemOperationListener_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/filesystem/file_system.mojom
//

package org.chromium.blink.mojom;


class FileSystemOperationListener_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<FileSystemOperationListener, FileSystemOperationListener.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<FileSystemOperationListener, FileSystemOperationListener.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.FileSystemOperationListener";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, FileSystemOperationListener impl) {
            return new Stub(core, impl);
        }

        @Override
        public FileSystemOperationListener[] buildArray(int size) {
          return new FileSystemOperationListener[size];
        }
    };


    private static final int RESULTS_RETRIEVED_ORDINAL = 0;

    private static final int DID_WRITE_ORDINAL = 1;

    private static final int ERROR_OCCURRED_ORDINAL = 2;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements FileSystemOperationListener.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void resultsRetrieved(
org.chromium.filesystem.mojom.DirectoryEntry[] entries, boolean hasMore) {

            FileSystemOperationListenerResultsRetrievedParams _message = new FileSystemOperationListenerResultsRetrievedParams();

            _message.entries = entries;

            _message.hasMore = hasMore;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(RESULTS_RETRIEVED_ORDINAL)));

        }


        @Override
        public void didWrite(
long byteCount, boolean complete) {

            FileSystemOperationListenerDidWriteParams _message = new FileSystemOperationListenerDidWriteParams();

            _message.byteCount = byteCount;

            _message.complete = complete;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(DID_WRITE_ORDINAL)));

        }


        @Override
        public void errorOccurred(
int errorCode) {

            FileSystemOperationListenerErrorOccurredParams _message = new FileSystemOperationListenerErrorOccurredParams();

            _message.errorCode = errorCode;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ERROR_OCCURRED_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<FileSystemOperationListener> {

        Stub(org.chromium.mojo.system.Core core, FileSystemOperationListener impl) {
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
                                FileSystemOperationListener_Internal.MANAGER, messageWithHeader);





                    case RESULTS_RETRIEVED_ORDINAL: {

                        FileSystemOperationListenerResultsRetrievedParams data =
                                FileSystemOperationListenerResultsRetrievedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().resultsRetrieved(data.entries, data.hasMore);
                        return true;
                    }





                    case DID_WRITE_ORDINAL: {

                        FileSystemOperationListenerDidWriteParams data =
                                FileSystemOperationListenerDidWriteParams.deserialize(messageWithHeader.getPayload());

                        getImpl().didWrite(data.byteCount, data.complete);
                        return true;
                    }





                    case ERROR_OCCURRED_ORDINAL: {

                        FileSystemOperationListenerErrorOccurredParams data =
                                FileSystemOperationListenerErrorOccurredParams.deserialize(messageWithHeader.getPayload());

                        getImpl().errorOccurred(data.errorCode);
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
                                getCore(), FileSystemOperationListener_Internal.MANAGER, messageWithHeader, receiver);








                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class FileSystemOperationListenerResultsRetrievedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.filesystem.mojom.DirectoryEntry[] entries;
        public boolean hasMore;

        private FileSystemOperationListenerResultsRetrievedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FileSystemOperationListenerResultsRetrievedParams() {
            this(0);
        }

        public static FileSystemOperationListenerResultsRetrievedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FileSystemOperationListenerResultsRetrievedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FileSystemOperationListenerResultsRetrievedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FileSystemOperationListenerResultsRetrievedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FileSystemOperationListenerResultsRetrievedParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.entries = new org.chromium.filesystem.mojom.DirectoryEntry[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                            
                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                            result.entries[i1] = org.chromium.filesystem.mojom.DirectoryEntry.decode(decoder2);
                        }
                    }
                    }
                    {
                        
                    result.hasMore = decoder0.readBoolean(16, 0);
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
            
            if (this.entries == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.entries.length, 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < this.entries.length; ++i0) {
                    
                    encoder1.encode(this.entries[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
            
            encoder0.encode(this.hasMore, 16, 0);
        }
    }



    
    static final class FileSystemOperationListenerDidWriteParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public long byteCount;
        public boolean complete;

        private FileSystemOperationListenerDidWriteParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FileSystemOperationListenerDidWriteParams() {
            this(0);
        }

        public static FileSystemOperationListenerDidWriteParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FileSystemOperationListenerDidWriteParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FileSystemOperationListenerDidWriteParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FileSystemOperationListenerDidWriteParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FileSystemOperationListenerDidWriteParams(elementsOrVersion);
                    {
                        
                    result.byteCount = decoder0.readLong(8);
                    }
                    {
                        
                    result.complete = decoder0.readBoolean(16, 0);
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
            
            encoder0.encode(this.byteCount, 8);
            
            encoder0.encode(this.complete, 16, 0);
        }
    }



    
    static final class FileSystemOperationListenerErrorOccurredParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int errorCode;

        private FileSystemOperationListenerErrorOccurredParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FileSystemOperationListenerErrorOccurredParams() {
            this(0);
        }

        public static FileSystemOperationListenerErrorOccurredParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FileSystemOperationListenerErrorOccurredParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FileSystemOperationListenerErrorOccurredParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FileSystemOperationListenerErrorOccurredParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FileSystemOperationListenerErrorOccurredParams(elementsOrVersion);
                    {
                        
                    result.errorCode = decoder0.readInt(8);
                        org.chromium.mojo_base.mojom.FileError.validate(result.errorCode);
                        result.errorCode = org.chromium.mojo_base.mojom.FileError.toKnownValue(result.errorCode);
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
            
            encoder0.encode(this.errorCode, 8);
        }
    }



}
