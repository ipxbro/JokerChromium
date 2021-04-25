// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * A message to describe a chip.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.ChipProto}
 */
public  final class ChipProto extends
    com.google.protobuf.GeneratedMessageLite<
        ChipProto, ChipProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ChipProto)
    ChipProtoOrBuilder {
  private ChipProto() {
    text_ = "";
  }
  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * The type of the chip.
   * </pre>
   *
   * <code>optional .autofill_assistant.ChipType type = 1;</code>
   * @return Whether the type field is set.
   */
  @java.lang.Override
  public boolean hasType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The type of the chip.
   * </pre>
   *
   * <code>optional .autofill_assistant.ChipType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ChipType getType() {
    org.chromium.chrome.browser.autofill_assistant.proto.ChipType result = org.chromium.chrome.browser.autofill_assistant.proto.ChipType.forNumber(type_);
    return result == null ? org.chromium.chrome.browser.autofill_assistant.proto.ChipType.UNKNOWN_CHIP_TYPE : result;
  }
  /**
   * <pre>
   * The type of the chip.
   * </pre>
   *
   * <code>optional .autofill_assistant.ChipType type = 1;</code>
   * @param value The type to set.
   */
  private void setType(org.chromium.chrome.browser.autofill_assistant.proto.ChipType value) {
    type_ = value.getNumber();
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The type of the chip.
   * </pre>
   *
   * <code>optional .autofill_assistant.ChipType type = 1;</code>
   */
  private void clearType() {
    bitField0_ = (bitField0_ & ~0x00000001);
    type_ = 0;
  }

  public static final int ICON_FIELD_NUMBER = 2;
  private int icon_;
  /**
   * <pre>
   * The icon shown on the chip. Not required if text is set.
   * </pre>
   *
   * <code>optional .autofill_assistant.ChipIcon icon = 2;</code>
   * @return Whether the icon field is set.
   */
  @java.lang.Override
  public boolean hasIcon() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The icon shown on the chip. Not required if text is set.
   * </pre>
   *
   * <code>optional .autofill_assistant.ChipIcon icon = 2;</code>
   * @return The icon.
   */
  @java.lang.Override
  public org.chromium.chrome.browser.autofill_assistant.proto.ChipIcon getIcon() {
    org.chromium.chrome.browser.autofill_assistant.proto.ChipIcon result = org.chromium.chrome.browser.autofill_assistant.proto.ChipIcon.forNumber(icon_);
    return result == null ? org.chromium.chrome.browser.autofill_assistant.proto.ChipIcon.NO_ICON : result;
  }
  /**
   * <pre>
   * The icon shown on the chip. Not required if text is set.
   * </pre>
   *
   * <code>optional .autofill_assistant.ChipIcon icon = 2;</code>
   * @param value The icon to set.
   */
  private void setIcon(org.chromium.chrome.browser.autofill_assistant.proto.ChipIcon value) {
    icon_ = value.getNumber();
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * The icon shown on the chip. Not required if text is set.
   * </pre>
   *
   * <code>optional .autofill_assistant.ChipIcon icon = 2;</code>
   */
  private void clearIcon() {
    bitField0_ = (bitField0_ & ~0x00000002);
    icon_ = 0;
  }

  public static final int TEXT_FIELD_NUMBER = 3;
  private java.lang.String text_;
  /**
   * <pre>
   * The text shown on the chip. Not required if icon is set.
   * </pre>
   *
   * <code>optional string text = 3;</code>
   * @return Whether the text field is set.
   */
  @java.lang.Override
  public boolean hasText() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The text shown on the chip. Not required if icon is set.
   * </pre>
   *
   * <code>optional string text = 3;</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    return text_;
  }
  /**
   * <pre>
   * The text shown on the chip. Not required if icon is set.
   * </pre>
   *
   * <code>optional string text = 3;</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(text_);
  }
  /**
   * <pre>
   * The text shown on the chip. Not required if icon is set.
   * </pre>
   *
   * <code>optional string text = 3;</code>
   * @param value The text to set.
   */
  private void setText(
      java.lang.String value) {
    value.getClass();
  bitField0_ |= 0x00000004;
    text_ = value;
  }
  /**
   * <pre>
   * The text shown on the chip. Not required if icon is set.
   * </pre>
   *
   * <code>optional string text = 3;</code>
   */
  private void clearText() {
    bitField0_ = (bitField0_ & ~0x00000004);
    text_ = getDefaultInstance().getText();
  }
  /**
   * <pre>
   * The text shown on the chip. Not required if icon is set.
   * </pre>
   *
   * <code>optional string text = 3;</code>
   * @param value The bytes for text to set.
   */
  private void setTextBytes(
      com.google.protobuf.ByteString value) {
    text_ = value.toStringUtf8();
    bitField0_ |= 0x00000004;
  }

  public static final int STICKY_FIELD_NUMBER = 4;
  private boolean sticky_;
  /**
   * <pre>
   * Whether the chip is sticky. When the bottom sheet is configured with the
   * ConfigureBottomSheetProto::PeekMode::HANDLE_HEADER peek mode and the
   * sheet is minimized, the first sticky action will be displayed instead of
   * the profile icon.
   * </pre>
   *
   * <code>optional bool sticky = 4;</code>
   * @return Whether the sticky field is set.
   */
  @java.lang.Override
  public boolean hasSticky() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * Whether the chip is sticky. When the bottom sheet is configured with the
   * ConfigureBottomSheetProto::PeekMode::HANDLE_HEADER peek mode and the
   * sheet is minimized, the first sticky action will be displayed instead of
   * the profile icon.
   * </pre>
   *
   * <code>optional bool sticky = 4;</code>
   * @return The sticky.
   */
  @java.lang.Override
  public boolean getSticky() {
    return sticky_;
  }
  /**
   * <pre>
   * Whether the chip is sticky. When the bottom sheet is configured with the
   * ConfigureBottomSheetProto::PeekMode::HANDLE_HEADER peek mode and the
   * sheet is minimized, the first sticky action will be displayed instead of
   * the profile icon.
   * </pre>
   *
   * <code>optional bool sticky = 4;</code>
   * @param value The sticky to set.
   */
  private void setSticky(boolean value) {
    bitField0_ |= 0x00000008;
    sticky_ = value;
  }
  /**
   * <pre>
   * Whether the chip is sticky. When the bottom sheet is configured with the
   * ConfigureBottomSheetProto::PeekMode::HANDLE_HEADER peek mode and the
   * sheet is minimized, the first sticky action will be displayed instead of
   * the profile icon.
   * </pre>
   *
   * <code>optional bool sticky = 4;</code>
   */
  private void clearSticky() {
    bitField0_ = (bitField0_ & ~0x00000008);
    sticky_ = false;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ChipProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ChipProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ChipProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ChipProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ChipProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ChipProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ChipProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ChipProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ChipProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ChipProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ChipProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ChipProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ChipProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * A message to describe a chip.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.ChipProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ChipProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ChipProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ChipProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ChipProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The type of the chip.
     * </pre>
     *
     * <code>optional .autofill_assistant.ChipType type = 1;</code>
     * @return Whether the type field is set.
     */
    @java.lang.Override
    public boolean hasType() {
      return instance.hasType();
    }
    /**
     * <pre>
     * The type of the chip.
     * </pre>
     *
     * <code>optional .autofill_assistant.ChipType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ChipType getType() {
      return instance.getType();
    }
    /**
     * <pre>
     * The type of the chip.
     * </pre>
     *
     * <code>optional .autofill_assistant.ChipType type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setType(org.chromium.chrome.browser.autofill_assistant.proto.ChipType value) {
      copyOnWrite();
      instance.setType(value);
      return this;
    }
    /**
     * <pre>
     * The type of the chip.
     * </pre>
     *
     * <code>optional .autofill_assistant.ChipType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      copyOnWrite();
      instance.clearType();
      return this;
    }

    /**
     * <pre>
     * The icon shown on the chip. Not required if text is set.
     * </pre>
     *
     * <code>optional .autofill_assistant.ChipIcon icon = 2;</code>
     * @return Whether the icon field is set.
     */
    @java.lang.Override
    public boolean hasIcon() {
      return instance.hasIcon();
    }
    /**
     * <pre>
     * The icon shown on the chip. Not required if text is set.
     * </pre>
     *
     * <code>optional .autofill_assistant.ChipIcon icon = 2;</code>
     * @return The icon.
     */
    @java.lang.Override
    public org.chromium.chrome.browser.autofill_assistant.proto.ChipIcon getIcon() {
      return instance.getIcon();
    }
    /**
     * <pre>
     * The icon shown on the chip. Not required if text is set.
     * </pre>
     *
     * <code>optional .autofill_assistant.ChipIcon icon = 2;</code>
     * @param value The enum numeric value on the wire for icon to set.
     * @return This builder for chaining.
     */
    public Builder setIcon(org.chromium.chrome.browser.autofill_assistant.proto.ChipIcon value) {
      copyOnWrite();
      instance.setIcon(value);
      return this;
    }
    /**
     * <pre>
     * The icon shown on the chip. Not required if text is set.
     * </pre>
     *
     * <code>optional .autofill_assistant.ChipIcon icon = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIcon() {
      copyOnWrite();
      instance.clearIcon();
      return this;
    }

    /**
     * <pre>
     * The text shown on the chip. Not required if icon is set.
     * </pre>
     *
     * <code>optional string text = 3;</code>
     * @return Whether the text field is set.
     */
    @java.lang.Override
    public boolean hasText() {
      return instance.hasText();
    }
    /**
     * <pre>
     * The text shown on the chip. Not required if icon is set.
     * </pre>
     *
     * <code>optional string text = 3;</code>
     * @return The text.
     */
    @java.lang.Override
    public java.lang.String getText() {
      return instance.getText();
    }
    /**
     * <pre>
     * The text shown on the chip. Not required if icon is set.
     * </pre>
     *
     * <code>optional string text = 3;</code>
     * @return The bytes for text.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTextBytes() {
      return instance.getTextBytes();
    }
    /**
     * <pre>
     * The text shown on the chip. Not required if icon is set.
     * </pre>
     *
     * <code>optional string text = 3;</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      copyOnWrite();
      instance.setText(value);
      return this;
    }
    /**
     * <pre>
     * The text shown on the chip. Not required if icon is set.
     * </pre>
     *
     * <code>optional string text = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      copyOnWrite();
      instance.clearText();
      return this;
    }
    /**
     * <pre>
     * The text shown on the chip. Not required if icon is set.
     * </pre>
     *
     * <code>optional string text = 3;</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTextBytes(value);
      return this;
    }

    /**
     * <pre>
     * Whether the chip is sticky. When the bottom sheet is configured with the
     * ConfigureBottomSheetProto::PeekMode::HANDLE_HEADER peek mode and the
     * sheet is minimized, the first sticky action will be displayed instead of
     * the profile icon.
     * </pre>
     *
     * <code>optional bool sticky = 4;</code>
     * @return Whether the sticky field is set.
     */
    @java.lang.Override
    public boolean hasSticky() {
      return instance.hasSticky();
    }
    /**
     * <pre>
     * Whether the chip is sticky. When the bottom sheet is configured with the
     * ConfigureBottomSheetProto::PeekMode::HANDLE_HEADER peek mode and the
     * sheet is minimized, the first sticky action will be displayed instead of
     * the profile icon.
     * </pre>
     *
     * <code>optional bool sticky = 4;</code>
     * @return The sticky.
     */
    @java.lang.Override
    public boolean getSticky() {
      return instance.getSticky();
    }
    /**
     * <pre>
     * Whether the chip is sticky. When the bottom sheet is configured with the
     * ConfigureBottomSheetProto::PeekMode::HANDLE_HEADER peek mode and the
     * sheet is minimized, the first sticky action will be displayed instead of
     * the profile icon.
     * </pre>
     *
     * <code>optional bool sticky = 4;</code>
     * @param value The sticky to set.
     * @return This builder for chaining.
     */
    public Builder setSticky(boolean value) {
      copyOnWrite();
      instance.setSticky(value);
      return this;
    }
    /**
     * <pre>
     * Whether the chip is sticky. When the bottom sheet is configured with the
     * ConfigureBottomSheetProto::PeekMode::HANDLE_HEADER peek mode and the
     * sheet is minimized, the first sticky action will be displayed instead of
     * the profile icon.
     * </pre>
     *
     * <code>optional bool sticky = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSticky() {
      copyOnWrite();
      instance.clearSticky();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ChipProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ChipProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "type_",
            org.chromium.chrome.browser.autofill_assistant.proto.ChipType.internalGetVerifier(),
            "icon_",
            org.chromium.chrome.browser.autofill_assistant.proto.ChipIcon.internalGetVerifier(),
            "text_",
            "sticky_",
          };
          java.lang.String info =
              "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002" +
              "\u100c\u0001\u0003\u1008\u0002\u0004\u1007\u0003";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.chrome.browser.autofill_assistant.proto.ChipProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ChipProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.chrome.browser.autofill_assistant.proto.ChipProto>(
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


  // @@protoc_insertion_point(class_scope:autofill_assistant.ChipProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ChipProto DEFAULT_INSTANCE;
  static {
    ChipProto defaultInstance = new ChipProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ChipProto.class, defaultInstance);
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ChipProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ChipProto> PARSER;

  public static com.google.protobuf.Parser<ChipProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

