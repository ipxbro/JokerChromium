// ReportingServiceProxy_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/reporting/reporting.mojom
//

package org.chromium.blink.mojom;


class ReportingServiceProxy_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<ReportingServiceProxy, ReportingServiceProxy.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<ReportingServiceProxy, ReportingServiceProxy.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.ReportingServiceProxy";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, ReportingServiceProxy impl) {
            return new Stub(core, impl);
        }

        @Override
        public ReportingServiceProxy[] buildArray(int size) {
          return new ReportingServiceProxy[size];
        }
    };


    private static final int QUEUE_INTERVENTION_REPORT_ORDINAL = 0;

    private static final int QUEUE_DEPRECATION_REPORT_ORDINAL = 1;

    private static final int QUEUE_CSP_VIOLATION_REPORT_ORDINAL = 2;

    private static final int QUEUE_FEATURE_POLICY_VIOLATION_REPORT_ORDINAL = 3;

    private static final int QUEUE_DOCUMENT_POLICY_VIOLATION_REPORT_ORDINAL = 4;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements ReportingServiceProxy.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void queueInterventionReport(
org.chromium.url.mojom.Url url, String id, String message, String sourceFile, int lineNumber, int columnNumber) {

            ReportingServiceProxyQueueInterventionReportParams _message = new ReportingServiceProxyQueueInterventionReportParams();

            _message.url = url;

            _message.id = id;

            _message.message = message;

            _message.sourceFile = sourceFile;

            _message.lineNumber = lineNumber;

            _message.columnNumber = columnNumber;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(QUEUE_INTERVENTION_REPORT_ORDINAL)));

        }


        @Override
        public void queueDeprecationReport(
org.chromium.url.mojom.Url url, String id, org.chromium.mojo_base.mojom.Time anticipatedRemoval, String message, String sourceFile, int lineNumber, int columnNumber) {

            ReportingServiceProxyQueueDeprecationReportParams _message = new ReportingServiceProxyQueueDeprecationReportParams();

            _message.url = url;

            _message.id = id;

            _message.anticipatedRemoval = anticipatedRemoval;

            _message.message = message;

            _message.sourceFile = sourceFile;

            _message.lineNumber = lineNumber;

            _message.columnNumber = columnNumber;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(QUEUE_DEPRECATION_REPORT_ORDINAL)));

        }


        @Override
        public void queueCspViolationReport(
org.chromium.url.mojom.Url url, String group, String documentUrl, String referrer, String blockedUrl, String effectiveDirective, String originalPolicy, String sourceFile, String scriptSample, String disposition, short statusCode, int lineNumber, int columnNumber) {

            ReportingServiceProxyQueueCspViolationReportParams _message = new ReportingServiceProxyQueueCspViolationReportParams();

            _message.url = url;

            _message.group = group;

            _message.documentUrl = documentUrl;

            _message.referrer = referrer;

            _message.blockedUrl = blockedUrl;

            _message.effectiveDirective = effectiveDirective;

            _message.originalPolicy = originalPolicy;

            _message.sourceFile = sourceFile;

            _message.scriptSample = scriptSample;

            _message.disposition = disposition;

            _message.statusCode = statusCode;

            _message.lineNumber = lineNumber;

            _message.columnNumber = columnNumber;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(QUEUE_CSP_VIOLATION_REPORT_ORDINAL)));

        }


        @Override
        public void queueFeaturePolicyViolationReport(
org.chromium.url.mojom.Url url, String policyId, String disposition, String message, String sourceFile, int lineNumber, int columnNumber) {

            ReportingServiceProxyQueueFeaturePolicyViolationReportParams _message = new ReportingServiceProxyQueueFeaturePolicyViolationReportParams();

            _message.url = url;

            _message.policyId = policyId;

            _message.disposition = disposition;

            _message.message = message;

            _message.sourceFile = sourceFile;

            _message.lineNumber = lineNumber;

            _message.columnNumber = columnNumber;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(QUEUE_FEATURE_POLICY_VIOLATION_REPORT_ORDINAL)));

        }


        @Override
        public void queueDocumentPolicyViolationReport(
org.chromium.url.mojom.Url url, String group, String policyId, String disposition, String message, String sourceFile, int lineNumber, int columnNumber) {

            ReportingServiceProxyQueueDocumentPolicyViolationReportParams _message = new ReportingServiceProxyQueueDocumentPolicyViolationReportParams();

            _message.url = url;

            _message.group = group;

            _message.policyId = policyId;

            _message.disposition = disposition;

            _message.message = message;

            _message.sourceFile = sourceFile;

            _message.lineNumber = lineNumber;

            _message.columnNumber = columnNumber;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(QUEUE_DOCUMENT_POLICY_VIOLATION_REPORT_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<ReportingServiceProxy> {

        Stub(org.chromium.mojo.system.Core core, ReportingServiceProxy impl) {
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
                                ReportingServiceProxy_Internal.MANAGER, messageWithHeader);





                    case QUEUE_INTERVENTION_REPORT_ORDINAL: {

                        ReportingServiceProxyQueueInterventionReportParams data =
                                ReportingServiceProxyQueueInterventionReportParams.deserialize(messageWithHeader.getPayload());

                        getImpl().queueInterventionReport(data.url, data.id, data.message, data.sourceFile, data.lineNumber, data.columnNumber);
                        return true;
                    }





                    case QUEUE_DEPRECATION_REPORT_ORDINAL: {

                        ReportingServiceProxyQueueDeprecationReportParams data =
                                ReportingServiceProxyQueueDeprecationReportParams.deserialize(messageWithHeader.getPayload());

                        getImpl().queueDeprecationReport(data.url, data.id, data.anticipatedRemoval, data.message, data.sourceFile, data.lineNumber, data.columnNumber);
                        return true;
                    }





                    case QUEUE_CSP_VIOLATION_REPORT_ORDINAL: {

                        ReportingServiceProxyQueueCspViolationReportParams data =
                                ReportingServiceProxyQueueCspViolationReportParams.deserialize(messageWithHeader.getPayload());

                        getImpl().queueCspViolationReport(data.url, data.group, data.documentUrl, data.referrer, data.blockedUrl, data.effectiveDirective, data.originalPolicy, data.sourceFile, data.scriptSample, data.disposition, data.statusCode, data.lineNumber, data.columnNumber);
                        return true;
                    }





                    case QUEUE_FEATURE_POLICY_VIOLATION_REPORT_ORDINAL: {

                        ReportingServiceProxyQueueFeaturePolicyViolationReportParams data =
                                ReportingServiceProxyQueueFeaturePolicyViolationReportParams.deserialize(messageWithHeader.getPayload());

                        getImpl().queueFeaturePolicyViolationReport(data.url, data.policyId, data.disposition, data.message, data.sourceFile, data.lineNumber, data.columnNumber);
                        return true;
                    }





                    case QUEUE_DOCUMENT_POLICY_VIOLATION_REPORT_ORDINAL: {

                        ReportingServiceProxyQueueDocumentPolicyViolationReportParams data =
                                ReportingServiceProxyQueueDocumentPolicyViolationReportParams.deserialize(messageWithHeader.getPayload());

                        getImpl().queueDocumentPolicyViolationReport(data.url, data.group, data.policyId, data.disposition, data.message, data.sourceFile, data.lineNumber, data.columnNumber);
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
                                getCore(), ReportingServiceProxy_Internal.MANAGER, messageWithHeader, receiver);












                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class ReportingServiceProxyQueueInterventionReportParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 48;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(48, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.url.mojom.Url url;
        public String id;
        public String message;
        public String sourceFile;
        public int lineNumber;
        public int columnNumber;

        private ReportingServiceProxyQueueInterventionReportParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ReportingServiceProxyQueueInterventionReportParams() {
            this(0);
        }

        public static ReportingServiceProxyQueueInterventionReportParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ReportingServiceProxyQueueInterventionReportParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ReportingServiceProxyQueueInterventionReportParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ReportingServiceProxyQueueInterventionReportParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ReportingServiceProxyQueueInterventionReportParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.url = org.chromium.url.mojom.Url.decode(decoder1);
                    }
                    {
                        
                    result.id = decoder0.readString(16, false);
                    }
                    {
                        
                    result.message = decoder0.readString(24, false);
                    }
                    {
                        
                    result.sourceFile = decoder0.readString(32, true);
                    }
                    {
                        
                    result.lineNumber = decoder0.readInt(40);
                    }
                    {
                        
                    result.columnNumber = decoder0.readInt(44);
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
            
            encoder0.encode(this.url, 8, false);
            
            encoder0.encode(this.id, 16, false);
            
            encoder0.encode(this.message, 24, false);
            
            encoder0.encode(this.sourceFile, 32, true);
            
            encoder0.encode(this.lineNumber, 40);
            
            encoder0.encode(this.columnNumber, 44);
        }
    }



    
    static final class ReportingServiceProxyQueueDeprecationReportParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 56;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(56, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.url.mojom.Url url;
        public String id;
        public org.chromium.mojo_base.mojom.Time anticipatedRemoval;
        public String message;
        public String sourceFile;
        public int lineNumber;
        public int columnNumber;

        private ReportingServiceProxyQueueDeprecationReportParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ReportingServiceProxyQueueDeprecationReportParams() {
            this(0);
        }

        public static ReportingServiceProxyQueueDeprecationReportParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ReportingServiceProxyQueueDeprecationReportParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ReportingServiceProxyQueueDeprecationReportParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ReportingServiceProxyQueueDeprecationReportParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ReportingServiceProxyQueueDeprecationReportParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.url = org.chromium.url.mojom.Url.decode(decoder1);
                    }
                    {
                        
                    result.id = decoder0.readString(16, false);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, true);
                    result.anticipatedRemoval = org.chromium.mojo_base.mojom.Time.decode(decoder1);
                    }
                    {
                        
                    result.message = decoder0.readString(32, false);
                    }
                    {
                        
                    result.sourceFile = decoder0.readString(40, true);
                    }
                    {
                        
                    result.lineNumber = decoder0.readInt(48);
                    }
                    {
                        
                    result.columnNumber = decoder0.readInt(52);
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
            
            encoder0.encode(this.url, 8, false);
            
            encoder0.encode(this.id, 16, false);
            
            encoder0.encode(this.anticipatedRemoval, 24, true);
            
            encoder0.encode(this.message, 32, false);
            
            encoder0.encode(this.sourceFile, 40, true);
            
            encoder0.encode(this.lineNumber, 48);
            
            encoder0.encode(this.columnNumber, 52);
        }
    }



    
    static final class ReportingServiceProxyQueueCspViolationReportParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 104;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(104, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.url.mojom.Url url;
        public String group;
        public String documentUrl;
        public String referrer;
        public String blockedUrl;
        public String effectiveDirective;
        public String originalPolicy;
        public String sourceFile;
        public String scriptSample;
        public String disposition;
        public short statusCode;
        public int lineNumber;
        public int columnNumber;

        private ReportingServiceProxyQueueCspViolationReportParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ReportingServiceProxyQueueCspViolationReportParams() {
            this(0);
        }

        public static ReportingServiceProxyQueueCspViolationReportParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ReportingServiceProxyQueueCspViolationReportParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ReportingServiceProxyQueueCspViolationReportParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ReportingServiceProxyQueueCspViolationReportParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ReportingServiceProxyQueueCspViolationReportParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.url = org.chromium.url.mojom.Url.decode(decoder1);
                    }
                    {
                        
                    result.group = decoder0.readString(16, false);
                    }
                    {
                        
                    result.documentUrl = decoder0.readString(24, false);
                    }
                    {
                        
                    result.referrer = decoder0.readString(32, true);
                    }
                    {
                        
                    result.blockedUrl = decoder0.readString(40, true);
                    }
                    {
                        
                    result.effectiveDirective = decoder0.readString(48, false);
                    }
                    {
                        
                    result.originalPolicy = decoder0.readString(56, false);
                    }
                    {
                        
                    result.sourceFile = decoder0.readString(64, true);
                    }
                    {
                        
                    result.scriptSample = decoder0.readString(72, true);
                    }
                    {
                        
                    result.disposition = decoder0.readString(80, false);
                    }
                    {
                        
                    result.statusCode = decoder0.readShort(88);
                    }
                    {
                        
                    result.lineNumber = decoder0.readInt(92);
                    }
                    {
                        
                    result.columnNumber = decoder0.readInt(96);
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
            
            encoder0.encode(this.url, 8, false);
            
            encoder0.encode(this.group, 16, false);
            
            encoder0.encode(this.documentUrl, 24, false);
            
            encoder0.encode(this.referrer, 32, true);
            
            encoder0.encode(this.blockedUrl, 40, true);
            
            encoder0.encode(this.effectiveDirective, 48, false);
            
            encoder0.encode(this.originalPolicy, 56, false);
            
            encoder0.encode(this.sourceFile, 64, true);
            
            encoder0.encode(this.scriptSample, 72, true);
            
            encoder0.encode(this.disposition, 80, false);
            
            encoder0.encode(this.statusCode, 88);
            
            encoder0.encode(this.lineNumber, 92);
            
            encoder0.encode(this.columnNumber, 96);
        }
    }



    
    static final class ReportingServiceProxyQueueFeaturePolicyViolationReportParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 56;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(56, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.url.mojom.Url url;
        public String policyId;
        public String disposition;
        public String message;
        public String sourceFile;
        public int lineNumber;
        public int columnNumber;

        private ReportingServiceProxyQueueFeaturePolicyViolationReportParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ReportingServiceProxyQueueFeaturePolicyViolationReportParams() {
            this(0);
        }

        public static ReportingServiceProxyQueueFeaturePolicyViolationReportParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ReportingServiceProxyQueueFeaturePolicyViolationReportParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ReportingServiceProxyQueueFeaturePolicyViolationReportParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ReportingServiceProxyQueueFeaturePolicyViolationReportParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ReportingServiceProxyQueueFeaturePolicyViolationReportParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.url = org.chromium.url.mojom.Url.decode(decoder1);
                    }
                    {
                        
                    result.policyId = decoder0.readString(16, false);
                    }
                    {
                        
                    result.disposition = decoder0.readString(24, false);
                    }
                    {
                        
                    result.message = decoder0.readString(32, true);
                    }
                    {
                        
                    result.sourceFile = decoder0.readString(40, true);
                    }
                    {
                        
                    result.lineNumber = decoder0.readInt(48);
                    }
                    {
                        
                    result.columnNumber = decoder0.readInt(52);
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
            
            encoder0.encode(this.url, 8, false);
            
            encoder0.encode(this.policyId, 16, false);
            
            encoder0.encode(this.disposition, 24, false);
            
            encoder0.encode(this.message, 32, true);
            
            encoder0.encode(this.sourceFile, 40, true);
            
            encoder0.encode(this.lineNumber, 48);
            
            encoder0.encode(this.columnNumber, 52);
        }
    }



    
    static final class ReportingServiceProxyQueueDocumentPolicyViolationReportParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 64;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(64, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.url.mojom.Url url;
        public String group;
        public String policyId;
        public String disposition;
        public String message;
        public String sourceFile;
        public int lineNumber;
        public int columnNumber;

        private ReportingServiceProxyQueueDocumentPolicyViolationReportParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ReportingServiceProxyQueueDocumentPolicyViolationReportParams() {
            this(0);
        }

        public static ReportingServiceProxyQueueDocumentPolicyViolationReportParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ReportingServiceProxyQueueDocumentPolicyViolationReportParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ReportingServiceProxyQueueDocumentPolicyViolationReportParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ReportingServiceProxyQueueDocumentPolicyViolationReportParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ReportingServiceProxyQueueDocumentPolicyViolationReportParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.url = org.chromium.url.mojom.Url.decode(decoder1);
                    }
                    {
                        
                    result.group = decoder0.readString(16, false);
                    }
                    {
                        
                    result.policyId = decoder0.readString(24, false);
                    }
                    {
                        
                    result.disposition = decoder0.readString(32, false);
                    }
                    {
                        
                    result.message = decoder0.readString(40, true);
                    }
                    {
                        
                    result.sourceFile = decoder0.readString(48, true);
                    }
                    {
                        
                    result.lineNumber = decoder0.readInt(56);
                    }
                    {
                        
                    result.columnNumber = decoder0.readInt(60);
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
            
            encoder0.encode(this.url, 8, false);
            
            encoder0.encode(this.group, 16, false);
            
            encoder0.encode(this.policyId, 24, false);
            
            encoder0.encode(this.disposition, 32, false);
            
            encoder0.encode(this.message, 40, true);
            
            encoder0.encode(this.sourceFile, 48, true);
            
            encoder0.encode(this.lineNumber, 56);
            
            encoder0.encode(this.columnNumber, 60);
        }
    }



}
