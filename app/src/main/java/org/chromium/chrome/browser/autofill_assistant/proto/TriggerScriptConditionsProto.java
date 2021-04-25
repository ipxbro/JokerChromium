// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.TriggerScriptConditionsProto}
 */
public  final class TriggerScriptConditionsProto extends
    com.google.protobuf.GeneratedMessageLite<
        TriggerScriptConditionsProto, TriggerScriptConditionsProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.TriggerScriptConditionsProto)
    TriggerScriptConditionsProtoOrBuilder {
  private TriggerScriptConditionsProto() {
    conditions_ = emptyProtobufList();
  }
  public static final int CONDITIONS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProto> conditions_;
  /**
   * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProto> getConditionsList() {
    return conditions_;
  }
  /**
   * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
   */
  public java.util.List<? extends org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProtoOrBuilder> 
      getConditionsOrBuilderList() {
    return conditions_;
  }
  /**
   * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
   */
  @java.lang.Override
  public int getConditionsCount() {
    return conditions_.size();
  }
  /**
   * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProto getConditions(int index) {
    return conditions_.get(index);
  }
  /**
   * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProtoOrBuilder getConditionsOrBuilder(
      int index) {
    return conditions_.get(index);
  }
  private void ensureConditionsIsMutable() {
    com.google.protobuf.Internal.ProtobufList<org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProto> tmp = conditions_;
    if (!tmp.isModifiable()) {
      conditions_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
   */
  private void setConditions(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProto value) {
    value.getClass();
  ensureConditionsIsMutable();
    conditions_.set(index, value);
  }
  /**
   * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
   */
  private void addConditions(org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProto value) {
    value.getClass();
  ensureConditionsIsMutable();
    conditions_.add(value);
  }
  /**
   * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
   */
  private void addConditions(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProto value) {
    value.getClass();
  ensureConditionsIsMutable();
    conditions_.add(index, value);
  }
  /**
   * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
   */
  private void addAllConditions(
      java.lang.Iterable<? extends org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProto> values) {
    ensureConditionsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, conditions_);
  }
  /**
   * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
   */
  private void clearConditions() {
    conditions_ = emptyProtobufList();
  }
  /**
   * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
   */
  private void removeConditions(int index) {
    ensureConditionsIsMutable();
    conditions_.remove(index);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.TriggerScriptConditionsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.TriggerScriptConditionsProto)
      org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
     */
    @java.lang.Override
    public java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProto> getConditionsList() {
      return java.util.Collections.unmodifiableList(
          instance.getConditionsList());
    }
    /**
     * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
     */
    @java.lang.Override
    public int getConditionsCount() {
      return instance.getConditionsCount();
    }/**
     * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProto getConditions(int index) {
      return instance.getConditions(index);
    }
    /**
     * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
     */
    public Builder setConditions(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProto value) {
      copyOnWrite();
      instance.setConditions(index, value);
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
     */
    public Builder setConditions(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProto.Builder builderForValue) {
      copyOnWrite();
      instance.setConditions(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
     */
    public Builder addConditions(org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProto value) {
      copyOnWrite();
      instance.addConditions(value);
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
     */
    public Builder addConditions(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProto value) {
      copyOnWrite();
      instance.addConditions(index, value);
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
     */
    public Builder addConditions(
        org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProto.Builder builderForValue) {
      copyOnWrite();
      instance.addConditions(builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
     */
    public Builder addConditions(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProto.Builder builderForValue) {
      copyOnWrite();
      instance.addConditions(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
     */
    public Builder addAllConditions(
        java.lang.Iterable<? extends org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProto> values) {
      copyOnWrite();
      instance.addAllConditions(values);
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
     */
    public Builder clearConditions() {
      copyOnWrite();
      instance.clearConditions();
      return this;
    }
    /**
     * <code>repeated .autofill_assistant.TriggerScriptConditionProto conditions = 1;</code>
     */
    public Builder removeConditions(int index) {
      copyOnWrite();
      instance.removeConditions(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.TriggerScriptConditionsProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "conditions_",
            org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionProto.class,
          };
          java.lang.String info =
              "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.TriggerScriptConditionsProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto DEFAULT_INSTANCE;
  static {
    TriggerScriptConditionsProto defaultInstance = new TriggerScriptConditionsProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      TriggerScriptConditionsProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.TriggerScriptConditionsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TriggerScriptConditionsProto> PARSER;

  public static com.google.protobuf.Parser<TriggerScriptConditionsProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

