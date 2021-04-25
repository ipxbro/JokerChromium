// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: view_layout.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.ColorProto}
 */
public  final class ColorProto extends
    com.google.protobuf.GeneratedMessageLite<
        ColorProto, ColorProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ColorProto)
    ColorProtoOrBuilder {
  private ColorProto() {
  }
  private int bitField0_;
  private int colorCase_ = 0;
  private java.lang.Object color_;
  public enum ColorCase {
    RESOURCE_IDENTIFIER(1),
    PARSEABLE_COLOR(2),
    COLOR_NOT_SET(0);
    private final int value;
    private ColorCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ColorCase valueOf(int value) {
      return forNumber(value);
    }

    public static ColorCase forNumber(int value) {
      switch (value) {
        case 1: return RESOURCE_IDENTIFIER;
        case 2: return PARSEABLE_COLOR;
        case 0: return COLOR_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  @java.lang.Override
  public ColorCase
  getColorCase() {
    return ColorCase.forNumber(
        colorCase_);
  }

  private void clearColor() {
    colorCase_ = 0;
    color_ = null;
  }

  public static final int RESOURCE_IDENTIFIER_FIELD_NUMBER = 1;
  /**
   * <pre>
   * The resource identifier of a color.
   * </pre>
   *
   * <code>string resource_identifier = 1;</code>
   * @return Whether the resourceIdentifier field is set.
   */
  @java.lang.Override
  public boolean hasResourceIdentifier() {
    return colorCase_ == 1;
  }
  /**
   * <pre>
   * The resource identifier of a color.
   * </pre>
   *
   * <code>string resource_identifier = 1;</code>
   * @return The resourceIdentifier.
   */
  @java.lang.Override
  public java.lang.String getResourceIdentifier() {
    java.lang.String ref = "";
    if (colorCase_ == 1) {
      ref = (java.lang.String) color_;
    }
    return ref;
  }
  /**
   * <pre>
   * The resource identifier of a color.
   * </pre>
   *
   * <code>string resource_identifier = 1;</code>
   * @return The bytes for resourceIdentifier.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceIdentifierBytes() {
    java.lang.String ref = "";
    if (colorCase_ == 1) {
      ref = (java.lang.String) color_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <pre>
   * The resource identifier of a color.
   * </pre>
   *
   * <code>string resource_identifier = 1;</code>
   * @param value The resourceIdentifier to set.
   */
  private void setResourceIdentifier(
      java.lang.String value) {
    value.getClass();
  colorCase_ = 1;
    color_ = value;
  }
  /**
   * <pre>
   * The resource identifier of a color.
   * </pre>
   *
   * <code>string resource_identifier = 1;</code>
   */
  private void clearResourceIdentifier() {
    if (colorCase_ == 1) {
      colorCase_ = 0;
      color_ = null;
    }
  }
  /**
   * <pre>
   * The resource identifier of a color.
   * </pre>
   *
   * <code>string resource_identifier = 1;</code>
   * @param value The bytes for resourceIdentifier to set.
   */
  private void setResourceIdentifierBytes(
      com.google.protobuf.ByteString value) {
    color_ = value.toStringUtf8();
    colorCase_ = 1;
  }

  public static final int PARSEABLE_COLOR_FIELD_NUMBER = 2;
  /**
   * <pre>
   * A color in the #RRGGBB or #AARRGGBB format.
   * </pre>
   *
   * <code>string parseable_color = 2;</code>
   * @return Whether the parseableColor field is set.
   */
  @java.lang.Override
  public boolean hasParseableColor() {
    return colorCase_ == 2;
  }
  /**
   * <pre>
   * A color in the #RRGGBB or #AARRGGBB format.
   * </pre>
   *
   * <code>string parseable_color = 2;</code>
   * @return The parseableColor.
   */
  @java.lang.Override
  public java.lang.String getParseableColor() {
    java.lang.String ref = "";
    if (colorCase_ == 2) {
      ref = (java.lang.String) color_;
    }
    return ref;
  }
  /**
   * <pre>
   * A color in the #RRGGBB or #AARRGGBB format.
   * </pre>
   *
   * <code>string parseable_color = 2;</code>
   * @return The bytes for parseableColor.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParseableColorBytes() {
    java.lang.String ref = "";
    if (colorCase_ == 2) {
      ref = (java.lang.String) color_;
    }
    return com.google.protobuf.ByteString.copyFromUtf8(ref);
  }
  /**
   * <pre>
   * A color in the #RRGGBB or #AARRGGBB format.
   * </pre>
   *
   * <code>string parseable_color = 2;</code>
   * @param value The parseableColor to set.
   */
  private void setParseableColor(
      java.lang.String value) {
    value.getClass();
  colorCase_ = 2;
    color_ = value;
  }
  /**
   * <pre>
   * A color in the #RRGGBB or #AARRGGBB format.
   * </pre>
   *
   * <code>string parseable_color = 2;</code>
   */
  private void clearParseableColor() {
    if (colorCase_ == 2) {
      colorCase_ = 0;
      color_ = null;
    }
  }
  /**
   * <pre>
   * A color in the #RRGGBB or #AARRGGBB format.
   * </pre>
   *
   * <code>string parseable_color = 2;</code>
   * @param value The bytes for parseableColor to set.
   */
  private void setParseableColorBytes(
      com.google.protobuf.ByteString value) {
    color_ = value.toStringUtf8();
    colorCase_ = 2;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ColorProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ColorProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ColorProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ColorProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ColorProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ColorProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ColorProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ColorProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ColorProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ColorProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ColorProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ColorProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ColorProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.ColorProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ColorProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ColorProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ColorProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ColorProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    @java.lang.Override
    public ColorCase
        getColorCase() {
      return instance.getColorCase();
    }

    public Builder clearColor() {
      copyOnWrite();
      instance.clearColor();
      return this;
    }


    /**
     * <pre>
     * The resource identifier of a color.
     * </pre>
     *
     * <code>string resource_identifier = 1;</code>
     * @return Whether the resourceIdentifier field is set.
     */
    @java.lang.Override
    public boolean hasResourceIdentifier() {
      return instance.hasResourceIdentifier();
    }
    /**
     * <pre>
     * The resource identifier of a color.
     * </pre>
     *
     * <code>string resource_identifier = 1;</code>
     * @return The resourceIdentifier.
     */
    @java.lang.Override
    public java.lang.String getResourceIdentifier() {
      return instance.getResourceIdentifier();
    }
    /**
     * <pre>
     * The resource identifier of a color.
     * </pre>
     *
     * <code>string resource_identifier = 1;</code>
     * @return The bytes for resourceIdentifier.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getResourceIdentifierBytes() {
      return instance.getResourceIdentifierBytes();
    }
    /**
     * <pre>
     * The resource identifier of a color.
     * </pre>
     *
     * <code>string resource_identifier = 1;</code>
     * @param value The resourceIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setResourceIdentifier(
        java.lang.String value) {
      copyOnWrite();
      instance.setResourceIdentifier(value);
      return this;
    }
    /**
     * <pre>
     * The resource identifier of a color.
     * </pre>
     *
     * <code>string resource_identifier = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceIdentifier() {
      copyOnWrite();
      instance.clearResourceIdentifier();
      return this;
    }
    /**
     * <pre>
     * The resource identifier of a color.
     * </pre>
     *
     * <code>string resource_identifier = 1;</code>
     * @param value The bytes for resourceIdentifier to set.
     * @return This builder for chaining.
     */
    public Builder setResourceIdentifierBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setResourceIdentifierBytes(value);
      return this;
    }

    /**
     * <pre>
     * A color in the #RRGGBB or #AARRGGBB format.
     * </pre>
     *
     * <code>string parseable_color = 2;</code>
     * @return Whether the parseableColor field is set.
     */
    @java.lang.Override
    public boolean hasParseableColor() {
      return instance.hasParseableColor();
    }
    /**
     * <pre>
     * A color in the #RRGGBB or #AARRGGBB format.
     * </pre>
     *
     * <code>string parseable_color = 2;</code>
     * @return The parseableColor.
     */
    @java.lang.Override
    public java.lang.String getParseableColor() {
      return instance.getParseableColor();
    }
    /**
     * <pre>
     * A color in the #RRGGBB or #AARRGGBB format.
     * </pre>
     *
     * <code>string parseable_color = 2;</code>
     * @return The bytes for parseableColor.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getParseableColorBytes() {
      return instance.getParseableColorBytes();
    }
    /**
     * <pre>
     * A color in the #RRGGBB or #AARRGGBB format.
     * </pre>
     *
     * <code>string parseable_color = 2;</code>
     * @param value The parseableColor to set.
     * @return This builder for chaining.
     */
    public Builder setParseableColor(
        java.lang.String value) {
      copyOnWrite();
      instance.setParseableColor(value);
      return this;
    }
    /**
     * <pre>
     * A color in the #RRGGBB or #AARRGGBB format.
     * </pre>
     *
     * <code>string parseable_color = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearParseableColor() {
      copyOnWrite();
      instance.clearParseableColor();
      return this;
    }
    /**
     * <pre>
     * A color in the #RRGGBB or #AARRGGBB format.
     * </pre>
     *
     * <code>string parseable_color = 2;</code>
     * @param value The bytes for parseableColor to set.
     * @return This builder for chaining.
     */
    public Builder setParseableColorBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setParseableColorBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ColorProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ColorProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "color_",
            "colorCase_",
            "bitField0_",
          };
          java.lang.String info =
              "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103b\u0000\u0002" +
              "\u103b\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.ColorProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ColorProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.ColorProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.ColorProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ColorProto DEFAULT_INSTANCE;
  static {
    ColorProto defaultInstance = new ColorProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ColorProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ColorProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ColorProto> PARSER;

  public static com.google.protobuf.Parser<ColorProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

