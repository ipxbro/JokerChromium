// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.BooleanList}
 */
public  final class BooleanList extends
    com.google.protobuf.GeneratedMessageLite<
        BooleanList, BooleanList.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.BooleanList)
    BooleanListOrBuilder {
  private BooleanList() {
    values_ = emptyBooleanList();
  }
  public static final int VALUES_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.BooleanList values_;
  /**
   * <code>repeated bool values = 1;</code>
   * @return A list containing the values.
   */
  @java.lang.Override
  public java.util.List<java.lang.Boolean>
      getValuesList() {
    return values_;
  }
  /**
   * <code>repeated bool values = 1;</code>
   * @return The count of values.
   */
  @java.lang.Override
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <code>repeated bool values = 1;</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  @java.lang.Override
  public boolean getValues(int index) {
    return values_.getBoolean(index);
  }
  private void ensureValuesIsMutable() {
    com.google.protobuf.Internal.BooleanList tmp = values_;
    if (!tmp.isModifiable()) {
      values_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }
  /**
   * <code>repeated bool values = 1;</code>
   * @param index The index to set the value at.
   * @param value The values to set.
   */
  private void setValues(
      int index, boolean value) {
    ensureValuesIsMutable();
    values_.setBoolean(index, value);
  }
  /**
   * <code>repeated bool values = 1;</code>
   * @param value The values to add.
   */
  private void addValues(boolean value) {
    ensureValuesIsMutable();
    values_.addBoolean(value);
  }
  /**
   * <code>repeated bool values = 1;</code>
   * @param values The values to add.
   */
  private void addAllValues(
      java.lang.Iterable<? extends java.lang.Boolean> values) {
    ensureValuesIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, values_);
  }
  /**
   * <code>repeated bool values = 1;</code>
   */
  private void clearValues() {
    values_ = emptyBooleanList();
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.BooleanList prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.BooleanList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.BooleanList, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.BooleanList)
      org.chromium.chrome.browser.autofill_assistant.proto.BooleanListOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.BooleanList.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated bool values = 1;</code>
     * @return A list containing the values.
     */
    @java.lang.Override
    public java.util.List<java.lang.Boolean>
        getValuesList() {
      return java.util.Collections.unmodifiableList(
          instance.getValuesList());
    }
    /**
     * <code>repeated bool values = 1;</code>
     * @return The count of values.
     */
    @java.lang.Override
    public int getValuesCount() {
      return instance.getValuesCount();
    }
    /**
     * <code>repeated bool values = 1;</code>
     * @param index The index of the element to return.
     * @return The values at the given index.
     */
    @java.lang.Override
    public boolean getValues(int index) {
      return instance.getValues(index);
    }
    /**
     * <code>repeated bool values = 1;</code>
     * @param value The values to set.
     * @return This builder for chaining.
     */
    public Builder setValues(
        int index, boolean value) {
      copyOnWrite();
      instance.setValues(index, value);
      return this;
    }
    /**
     * <code>repeated bool values = 1;</code>
     * @param value The values to add.
     * @return This builder for chaining.
     */
    public Builder addValues(boolean value) {
      copyOnWrite();
      instance.addValues(value);
      return this;
    }
    /**
     * <code>repeated bool values = 1;</code>
     * @param values The values to add.
     * @return This builder for chaining.
     */
    public Builder addAllValues(
        java.lang.Iterable<? extends java.lang.Boolean> values) {
      copyOnWrite();
      instance.addAllValues(values);
      return this;
    }
    /**
     * <code>repeated bool values = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearValues() {
      copyOnWrite();
      instance.clearValues();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.BooleanList)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.BooleanList();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "values_",
          };
          java.lang.String info =
              "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0019";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.BooleanList> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.BooleanList.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.BooleanList>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.BooleanList)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.BooleanList DEFAULT_INSTANCE;
  static {
    BooleanList defaultInstance = new BooleanList();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      BooleanList.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.BooleanList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<BooleanList> PARSER;

  public static com.google.protobuf.Parser<BooleanList> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

