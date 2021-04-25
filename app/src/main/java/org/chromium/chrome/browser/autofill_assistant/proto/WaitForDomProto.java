// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Ask Chrome to wait for an element in the DOM. This can be used to only
 * proceed to the next action once the page is ready.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.WaitForDomProto}
 */
public  final class WaitForDomProto extends
    com.google.protobuf.GeneratedMessageLite<
        WaitForDomProto, WaitForDomProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.WaitForDomProto)
    WaitForDomProtoOrBuilder {
  private WaitForDomProto() {
  }
  public interface ResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:autofill_assistant.WaitForDomProto.Result)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * Payload of all matching conditions, if one is set.
     * </pre>
     *
     * <code>repeated bytes matching_condition_payloads = 1;</code>
     * @return A list containing the matchingConditionPayloads.
     */
    java.util.List<com.google.protobuf.ByteString> getMatchingConditionPayloadsList();
    /**
     * <pre>
     * Payload of all matching conditions, if one is set.
     * </pre>
     *
     * <code>repeated bytes matching_condition_payloads = 1;</code>
     * @return The count of matchingConditionPayloads.
     */
    int getMatchingConditionPayloadsCount();
    /**
     * <pre>
     * Payload of all matching conditions, if one is set.
     * </pre>
     *
     * <code>repeated bytes matching_condition_payloads = 1;</code>
     * @param index The index of the element to return.
     * @return The matchingConditionPayloads at the given index.
     */
    com.google.protobuf.ByteString getMatchingConditionPayloads(int index);
  }
  /**
   * <pre>
   * Result to include into ProcessedActionProto.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.WaitForDomProto.Result}
   */
  public  static final class Result extends
      com.google.protobuf.GeneratedMessageLite<
          Result, Result.Builder> implements
      // @@protoc_insertion_point(message_implements:autofill_assistant.WaitForDomProto.Result)
      ResultOrBuilder {
    private Result() {
      matchingConditionPayloads_ = emptyProtobufList();
    }
    public static final int MATCHING_CONDITION_PAYLOADS_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.ByteString> matchingConditionPayloads_;
    /**
     * <pre>
     * Payload of all matching conditions, if one is set.
     * </pre>
     *
     * <code>repeated bytes matching_condition_payloads = 1;</code>
     * @return A list containing the matchingConditionPayloads.
     */
    @java.lang.Override
    public java.util.List<com.google.protobuf.ByteString>
        getMatchingConditionPayloadsList() {
      return matchingConditionPayloads_;
    }
    /**
     * <pre>
     * Payload of all matching conditions, if one is set.
     * </pre>
     *
     * <code>repeated bytes matching_condition_payloads = 1;</code>
     * @return The count of matchingConditionPayloads.
     */
    @java.lang.Override
    public int getMatchingConditionPayloadsCount() {
      return matchingConditionPayloads_.size();
    }
    /**
     * <pre>
     * Payload of all matching conditions, if one is set.
     * </pre>
     *
     * <code>repeated bytes matching_condition_payloads = 1;</code>
     * @param index The index of the element to return.
     * @return The matchingConditionPayloads at the given index.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMatchingConditionPayloads(int index) {
      return matchingConditionPayloads_.get(index);
    }
    private void ensureMatchingConditionPayloadsIsMutable() {
      com.google.protobuf.Internal.ProtobufList<com.google.protobuf.ByteString> tmp = matchingConditionPayloads_;
      if (!tmp.isModifiable()) {
        matchingConditionPayloads_ =
            com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
       }
    }
    /**
     * <pre>
     * Payload of all matching conditions, if one is set.
     * </pre>
     *
     * <code>repeated bytes matching_condition_payloads = 1;</code>
     * @param index The index to set the value at.
     * @param value The matchingConditionPayloads to set.
     */
    private void setMatchingConditionPayloads(
        int index, com.google.protobuf.ByteString value) {
      value.getClass();
  ensureMatchingConditionPayloadsIsMutable();
      matchingConditionPayloads_.set(index, value);
    }
    /**
     * <pre>
     * Payload of all matching conditions, if one is set.
     * </pre>
     *
     * <code>repeated bytes matching_condition_payloads = 1;</code>
     * @param value The matchingConditionPayloads to add.
     */
    private void addMatchingConditionPayloads(com.google.protobuf.ByteString value) {
      value.getClass();
  ensureMatchingConditionPayloadsIsMutable();
      matchingConditionPayloads_.add(value);
    }
    /**
     * <pre>
     * Payload of all matching conditions, if one is set.
     * </pre>
     *
     * <code>repeated bytes matching_condition_payloads = 1;</code>
     * @param values The matchingConditionPayloads to add.
     */
    private void addAllMatchingConditionPayloads(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureMatchingConditionPayloadsIsMutable();
      com.google.protobuf.AbstractMessageLite.addAll(
          values, matchingConditionPayloads_);
    }
    /**
     * <pre>
     * Payload of all matching conditions, if one is set.
     * </pre>
     *
     * <code>repeated bytes matching_condition_payloads = 1;</code>
     */
    private void clearMatchingConditionPayloads() {
      matchingConditionPayloads_ = emptyProtobufList();
    }

    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * Result to include into ProcessedActionProto.
     * </pre>
     *
     * Protobuf type {@code autofill_assistant.WaitForDomProto.Result}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result, Builder> implements
        // @@protoc_insertion_point(builder_implements:autofill_assistant.WaitForDomProto.Result)
        org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.ResultOrBuilder {
      // Construct using org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * Payload of all matching conditions, if one is set.
       * </pre>
       *
       * <code>repeated bytes matching_condition_payloads = 1;</code>
       * @return A list containing the matchingConditionPayloads.
       */
      @java.lang.Override
      public java.util.List<com.google.protobuf.ByteString>
          getMatchingConditionPayloadsList() {
        return java.util.Collections.unmodifiableList(
            instance.getMatchingConditionPayloadsList());
      }
      /**
       * <pre>
       * Payload of all matching conditions, if one is set.
       * </pre>
       *
       * <code>repeated bytes matching_condition_payloads = 1;</code>
       * @return The count of matchingConditionPayloads.
       */
      @java.lang.Override
      public int getMatchingConditionPayloadsCount() {
        return instance.getMatchingConditionPayloadsCount();
      }
      /**
       * <pre>
       * Payload of all matching conditions, if one is set.
       * </pre>
       *
       * <code>repeated bytes matching_condition_payloads = 1;</code>
       * @param index The index of the element to return.
       * @return The matchingConditionPayloads at the given index.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getMatchingConditionPayloads(int index) {
        return instance.getMatchingConditionPayloads(index);
      }
      /**
       * <pre>
       * Payload of all matching conditions, if one is set.
       * </pre>
       *
       * <code>repeated bytes matching_condition_payloads = 1;</code>
       * @param value The matchingConditionPayloads to set.
       * @return This builder for chaining.
       */
      public Builder setMatchingConditionPayloads(
          int index, com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setMatchingConditionPayloads(index, value);
        return this;
      }
      /**
       * <pre>
       * Payload of all matching conditions, if one is set.
       * </pre>
       *
       * <code>repeated bytes matching_condition_payloads = 1;</code>
       * @param value The matchingConditionPayloads to add.
       * @return This builder for chaining.
       */
      public Builder addMatchingConditionPayloads(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.addMatchingConditionPayloads(value);
        return this;
      }
      /**
       * <pre>
       * Payload of all matching conditions, if one is set.
       * </pre>
       *
       * <code>repeated bytes matching_condition_payloads = 1;</code>
       * @param values The matchingConditionPayloads to add.
       * @return This builder for chaining.
       */
      public Builder addAllMatchingConditionPayloads(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        copyOnWrite();
        instance.addAllMatchingConditionPayloads(values);
        return this;
      }
      /**
       * <pre>
       * Payload of all matching conditions, if one is set.
       * </pre>
       *
       * <code>repeated bytes matching_condition_payloads = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchingConditionPayloads() {
        copyOnWrite();
        instance.clearMatchingConditionPayloads();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:autofill_assistant.WaitForDomProto.Result)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "matchingConditionPayloads_",
            };
            java.lang.String info =
                "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result> parser = PARSER;
          if (parser == null) {
            synchronized (org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result>(
                        DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:autofill_assistant.WaitForDomProto.Result)
    private static final org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result DEFAULT_INSTANCE;
    static {
      Result defaultInstance = new Result();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        Result.class, defaultInstance);
    }

    public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.Result getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Result> PARSER;

    public static com.google.protobuf.Parser<Result> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  private int bitField0_;
  public static final int TIMEOUT_MS_FIELD_NUMBER = 1;
  private int timeoutMs_;
  /**
   * <pre>
   * Fail after waiting this amount of time.
   * </pre>
   *
   * <code>optional int32 timeout_ms = 1;</code>
   * @return Whether the timeoutMs field is set.
   */
  @java.lang.Override
  public boolean hasTimeoutMs() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Fail after waiting this amount of time.
   * </pre>
   *
   * <code>optional int32 timeout_ms = 1;</code>
   * @return The timeoutMs.
   */
  @java.lang.Override
  public int getTimeoutMs() {
    return timeoutMs_;
  }
  /**
   * <pre>
   * Fail after waiting this amount of time.
   * </pre>
   *
   * <code>optional int32 timeout_ms = 1;</code>
   * @param value The timeoutMs to set.
   */
  private void setTimeoutMs(int value) {
    bitField0_ |= 0x00000001;
    timeoutMs_ = value;
  }
  /**
   * <pre>
   * Fail after waiting this amount of time.
   * </pre>
   *
   * <code>optional int32 timeout_ms = 1;</code>
   */
  private void clearTimeoutMs() {
    bitField0_ = (bitField0_ & ~0x00000001);
    timeoutMs_ = 0;
  }

  public static final int WAIT_CONDITION_FIELD_NUMBER = 9;
  private org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto waitCondition_;
  /**
   * <pre>
   * Wait until this condition becomes true. If, at the end of the timeout, the
   * condition is not true, returns ELEMENT_RESOLUTION_FAILED.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementConditionProto wait_condition = 9;</code>
   */
  @java.lang.Override
  public boolean hasWaitCondition() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Wait until this condition becomes true. If, at the end of the timeout, the
   * condition is not true, returns ELEMENT_RESOLUTION_FAILED.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementConditionProto wait_condition = 9;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto getWaitCondition() {
    return waitCondition_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto.getDefaultInstance() : waitCondition_;
  }
  /**
   * <pre>
   * Wait until this condition becomes true. If, at the end of the timeout, the
   * condition is not true, returns ELEMENT_RESOLUTION_FAILED.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementConditionProto wait_condition = 9;</code>
   */
  private void setWaitCondition(org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto value) {
    value.getClass();
  waitCondition_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <pre>
   * Wait until this condition becomes true. If, at the end of the timeout, the
   * condition is not true, returns ELEMENT_RESOLUTION_FAILED.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementConditionProto wait_condition = 9;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeWaitCondition(org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto value) {
    value.getClass();
  if (waitCondition_ != null &&
        waitCondition_ != org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto.getDefaultInstance()) {
      waitCondition_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto.newBuilder(waitCondition_).mergeFrom(value).buildPartial();
    } else {
      waitCondition_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * Wait until this condition becomes true. If, at the end of the timeout, the
   * condition is not true, returns ELEMENT_RESOLUTION_FAILED.
   * </pre>
   *
   * <code>optional .autofill_assistant.ElementConditionProto wait_condition = 9;</code>
   */
  private void clearWaitCondition() {  waitCondition_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int ALLOW_INTERRUPT_FIELD_NUMBER = 3;
  private boolean allowInterrupt_;
  /**
   * <pre>
   * If true, run scripts flagged with 'interrupt=true' as soon as their
   * preconditions match.
   * </pre>
   *
   * <code>optional bool allow_interrupt = 3;</code>
   * @return Whether the allowInterrupt field is set.
   */
  @java.lang.Override
  public boolean hasAllowInterrupt() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * If true, run scripts flagged with 'interrupt=true' as soon as their
   * preconditions match.
   * </pre>
   *
   * <code>optional bool allow_interrupt = 3;</code>
   * @return The allowInterrupt.
   */
  @java.lang.Override
  public boolean getAllowInterrupt() {
    return allowInterrupt_;
  }
  /**
   * <pre>
   * If true, run scripts flagged with 'interrupt=true' as soon as their
   * preconditions match.
   * </pre>
   *
   * <code>optional bool allow_interrupt = 3;</code>
   * @param value The allowInterrupt to set.
   */
  private void setAllowInterrupt(boolean value) {
    bitField0_ |= 0x00000004;
    allowInterrupt_ = value;
  }
  /**
   * <pre>
   * If true, run scripts flagged with 'interrupt=true' as soon as their
   * preconditions match.
   * </pre>
   *
   * <code>optional bool allow_interrupt = 3;</code>
   */
  private void clearAllowInterrupt() {
    bitField0_ = (bitField0_ & ~0x00000004);
    allowInterrupt_ = false;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Ask Chrome to wait for an element in the DOM. This can be used to only
   * proceed to the next action once the page is ready.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.WaitForDomProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.WaitForDomProto)
      org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Fail after waiting this amount of time.
     * </pre>
     *
     * <code>optional int32 timeout_ms = 1;</code>
     * @return Whether the timeoutMs field is set.
     */
    @java.lang.Override
    public boolean hasTimeoutMs() {
      return instance.hasTimeoutMs();
    }
    /**
     * <pre>
     * Fail after waiting this amount of time.
     * </pre>
     *
     * <code>optional int32 timeout_ms = 1;</code>
     * @return The timeoutMs.
     */
    @java.lang.Override
    public int getTimeoutMs() {
      return instance.getTimeoutMs();
    }
    /**
     * <pre>
     * Fail after waiting this amount of time.
     * </pre>
     *
     * <code>optional int32 timeout_ms = 1;</code>
     * @param value The timeoutMs to set.
     * @return This builder for chaining.
     */
    public Builder setTimeoutMs(int value) {
      copyOnWrite();
      instance.setTimeoutMs(value);
      return this;
    }
    /**
     * <pre>
     * Fail after waiting this amount of time.
     * </pre>
     *
     * <code>optional int32 timeout_ms = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeoutMs() {
      copyOnWrite();
      instance.clearTimeoutMs();
      return this;
    }

    /**
     * <pre>
     * Wait until this condition becomes true. If, at the end of the timeout, the
     * condition is not true, returns ELEMENT_RESOLUTION_FAILED.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementConditionProto wait_condition = 9;</code>
     */
    @java.lang.Override
    public boolean hasWaitCondition() {
      return instance.hasWaitCondition();
    }
    /**
     * <pre>
     * Wait until this condition becomes true. If, at the end of the timeout, the
     * condition is not true, returns ELEMENT_RESOLUTION_FAILED.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementConditionProto wait_condition = 9;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto getWaitCondition() {
      return instance.getWaitCondition();
    }
    /**
     * <pre>
     * Wait until this condition becomes true. If, at the end of the timeout, the
     * condition is not true, returns ELEMENT_RESOLUTION_FAILED.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementConditionProto wait_condition = 9;</code>
     */
    public Builder setWaitCondition(org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto value) {
      copyOnWrite();
      instance.setWaitCondition(value);
      return this;
      }
    /**
     * <pre>
     * Wait until this condition becomes true. If, at the end of the timeout, the
     * condition is not true, returns ELEMENT_RESOLUTION_FAILED.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementConditionProto wait_condition = 9;</code>
     */
    public Builder setWaitCondition(
        org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto.Builder builderForValue) {
      copyOnWrite();
      instance.setWaitCondition(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * Wait until this condition becomes true. If, at the end of the timeout, the
     * condition is not true, returns ELEMENT_RESOLUTION_FAILED.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementConditionProto wait_condition = 9;</code>
     */
    public Builder mergeWaitCondition(org.chromium.chrome.browser.autofill_assistant.proto.ElementConditionProto value) {
      copyOnWrite();
      instance.mergeWaitCondition(value);
      return this;
    }
    /**
     * <pre>
     * Wait until this condition becomes true. If, at the end of the timeout, the
     * condition is not true, returns ELEMENT_RESOLUTION_FAILED.
     * </pre>
     *
     * <code>optional .autofill_assistant.ElementConditionProto wait_condition = 9;</code>
     */
    public Builder clearWaitCondition() {  copyOnWrite();
      instance.clearWaitCondition();
      return this;
    }

    /**
     * <pre>
     * If true, run scripts flagged with 'interrupt=true' as soon as their
     * preconditions match.
     * </pre>
     *
     * <code>optional bool allow_interrupt = 3;</code>
     * @return Whether the allowInterrupt field is set.
     */
    @java.lang.Override
    public boolean hasAllowInterrupt() {
      return instance.hasAllowInterrupt();
    }
    /**
     * <pre>
     * If true, run scripts flagged with 'interrupt=true' as soon as their
     * preconditions match.
     * </pre>
     *
     * <code>optional bool allow_interrupt = 3;</code>
     * @return The allowInterrupt.
     */
    @java.lang.Override
    public boolean getAllowInterrupt() {
      return instance.getAllowInterrupt();
    }
    /**
     * <pre>
     * If true, run scripts flagged with 'interrupt=true' as soon as their
     * preconditions match.
     * </pre>
     *
     * <code>optional bool allow_interrupt = 3;</code>
     * @param value The allowInterrupt to set.
     * @return This builder for chaining.
     */
    public Builder setAllowInterrupt(boolean value) {
      copyOnWrite();
      instance.setAllowInterrupt(value);
      return this;
    }
    /**
     * <pre>
     * If true, run scripts flagged with 'interrupt=true' as soon as their
     * preconditions match.
     * </pre>
     *
     * <code>optional bool allow_interrupt = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowInterrupt() {
      copyOnWrite();
      instance.clearAllowInterrupt();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.WaitForDomProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "timeoutMs_",
            "allowInterrupt_",
            "waitCondition_",
          };
          java.lang.String info =
              "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0003" +
              "\u1007\u0002\t\u1009\u0001";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:autofill_assistant.WaitForDomProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto DEFAULT_INSTANCE;
  static {
    WaitForDomProto defaultInstance = new WaitForDomProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      WaitForDomProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.WaitForDomProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<WaitForDomProto> PARSER;

  public static com.google.protobuf.Parser<WaitForDomProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

