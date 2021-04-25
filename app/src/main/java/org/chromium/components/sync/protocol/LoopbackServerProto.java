// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/loopback_server.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Contains the loopback server state.
 * </pre>
 *
 * Protobuf type {@code sync_pb.LoopbackServerProto}
 */
public  final class LoopbackServerProto extends
    com.google.protobuf.GeneratedMessageLite<
        LoopbackServerProto, LoopbackServerProto.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.LoopbackServerProto)
    LoopbackServerProtoOrBuilder {
  private LoopbackServerProto() {
    entities_ = emptyProtobufList();
    keystoreKeys_ = emptyProtobufList();
  }
  private int bitField0_;
  public static final int VERSION_FIELD_NUMBER = 1;
  private long version_;
  /**
   * <pre>
   * The protocol buffer format version.
   * </pre>
   *
   * <code>optional int64 version = 1;</code>
   * @return Whether the version field is set.
   */
  @java.lang.Override
  public boolean hasVersion() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The protocol buffer format version.
   * </pre>
   *
   * <code>optional int64 version = 1;</code>
   * @return The version.
   */
  @java.lang.Override
  public long getVersion() {
    return version_;
  }
  /**
   * <pre>
   * The protocol buffer format version.
   * </pre>
   *
   * <code>optional int64 version = 1;</code>
   * @param value The version to set.
   */
  private void setVersion(long value) {
    bitField0_ |= 0x00000001;
    version_ = value;
  }
  /**
   * <pre>
   * The protocol buffer format version.
   * </pre>
   *
   * <code>optional int64 version = 1;</code>
   */
  private void clearVersion() {
    bitField0_ = (bitField0_ & ~0x00000001);
    version_ = 0L;
  }

  public static final int STORE_BIRTHDAY_FIELD_NUMBER = 2;
  private long storeBirthday_;
  /**
   * <code>optional int64 store_birthday = 2;</code>
   * @return Whether the storeBirthday field is set.
   */
  @java.lang.Override
  public boolean hasStoreBirthday() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int64 store_birthday = 2;</code>
   * @return The storeBirthday.
   */
  @java.lang.Override
  public long getStoreBirthday() {
    return storeBirthday_;
  }
  /**
   * <code>optional int64 store_birthday = 2;</code>
   * @param value The storeBirthday to set.
   */
  private void setStoreBirthday(long value) {
    bitField0_ |= 0x00000002;
    storeBirthday_ = value;
  }
  /**
   * <code>optional int64 store_birthday = 2;</code>
   */
  private void clearStoreBirthday() {
    bitField0_ = (bitField0_ & ~0x00000002);
    storeBirthday_ = 0L;
  }

  public static final int ENTITIES_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.ProtobufList<org.chromium.components.sync.protocol.LoopbackServerEntity> entities_;
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  @java.lang.Override
  public java.util.List<org.chromium.components.sync.protocol.LoopbackServerEntity> getEntitiesList() {
    return entities_;
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  public java.util.List<? extends org.chromium.components.sync.protocol.LoopbackServerEntityOrBuilder> 
      getEntitiesOrBuilderList() {
    return entities_;
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  @java.lang.Override
  public int getEntitiesCount() {
    return entities_.size();
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.LoopbackServerEntity getEntities(int index) {
    return entities_.get(index);
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  public org.chromium.components.sync.protocol.LoopbackServerEntityOrBuilder getEntitiesOrBuilder(
      int index) {
    return entities_.get(index);
  }
  private void ensureEntitiesIsMutable() {
    com.google.protobuf.Internal.ProtobufList<org.chromium.components.sync.protocol.LoopbackServerEntity> tmp = entities_;
    if (!tmp.isModifiable()) {
      entities_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  private void setEntities(
      int index, org.chromium.components.sync.protocol.LoopbackServerEntity value) {
    value.getClass();
  ensureEntitiesIsMutable();
    entities_.set(index, value);
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  private void addEntities(org.chromium.components.sync.protocol.LoopbackServerEntity value) {
    value.getClass();
  ensureEntitiesIsMutable();
    entities_.add(value);
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  private void addEntities(
      int index, org.chromium.components.sync.protocol.LoopbackServerEntity value) {
    value.getClass();
  ensureEntitiesIsMutable();
    entities_.add(index, value);
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  private void addAllEntities(
      java.lang.Iterable<? extends org.chromium.components.sync.protocol.LoopbackServerEntity> values) {
    ensureEntitiesIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, entities_);
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  private void clearEntities() {
    entities_ = emptyProtobufList();
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  private void removeEntities(int index) {
    ensureEntitiesIsMutable();
    entities_.remove(index);
  }

  public static final int KEYSTORE_KEYS_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.ByteString> keystoreKeys_;
  /**
   * <pre>
   * All Keystore keys known to the server.
   * </pre>
   *
   * <code>repeated bytes keystore_keys = 4;</code>
   * @return A list containing the keystoreKeys.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString>
      getKeystoreKeysList() {
    return keystoreKeys_;
  }
  /**
   * <pre>
   * All Keystore keys known to the server.
   * </pre>
   *
   * <code>repeated bytes keystore_keys = 4;</code>
   * @return The count of keystoreKeys.
   */
  @java.lang.Override
  public int getKeystoreKeysCount() {
    return keystoreKeys_.size();
  }
  /**
   * <pre>
   * All Keystore keys known to the server.
   * </pre>
   *
   * <code>repeated bytes keystore_keys = 4;</code>
   * @param index The index of the element to return.
   * @return The keystoreKeys at the given index.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeystoreKeys(int index) {
    return keystoreKeys_.get(index);
  }
  private void ensureKeystoreKeysIsMutable() {
    com.google.protobuf.Internal.ProtobufList<com.google.protobuf.ByteString> tmp = keystoreKeys_;
    if (!tmp.isModifiable()) {
      keystoreKeys_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }
  /**
   * <pre>
   * All Keystore keys known to the server.
   * </pre>
   *
   * <code>repeated bytes keystore_keys = 4;</code>
   * @param index The index to set the value at.
   * @param value The keystoreKeys to set.
   */
  private void setKeystoreKeys(
      int index, com.google.protobuf.ByteString value) {
    value.getClass();
  ensureKeystoreKeysIsMutable();
    keystoreKeys_.set(index, value);
  }
  /**
   * <pre>
   * All Keystore keys known to the server.
   * </pre>
   *
   * <code>repeated bytes keystore_keys = 4;</code>
   * @param value The keystoreKeys to add.
   */
  private void addKeystoreKeys(com.google.protobuf.ByteString value) {
    value.getClass();
  ensureKeystoreKeysIsMutable();
    keystoreKeys_.add(value);
  }
  /**
   * <pre>
   * All Keystore keys known to the server.
   * </pre>
   *
   * <code>repeated bytes keystore_keys = 4;</code>
   * @param values The keystoreKeys to add.
   */
  private void addAllKeystoreKeys(
      java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
    ensureKeystoreKeysIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, keystoreKeys_);
  }
  /**
   * <pre>
   * All Keystore keys known to the server.
   * </pre>
   *
   * <code>repeated bytes keystore_keys = 4;</code>
   */
  private void clearKeystoreKeys() {
    keystoreKeys_ = emptyProtobufList();
  }

  public static final int LAST_VERSION_ASSIGNED_FIELD_NUMBER = 5;
  private long lastVersionAssigned_;
  /**
   * <pre>
   * The last entity ID that was assigned to an entity.
   * </pre>
   *
   * <code>optional int64 last_version_assigned = 5;</code>
   * @return Whether the lastVersionAssigned field is set.
   */
  @java.lang.Override
  public boolean hasLastVersionAssigned() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * The last entity ID that was assigned to an entity.
   * </pre>
   *
   * <code>optional int64 last_version_assigned = 5;</code>
   * @return The lastVersionAssigned.
   */
  @java.lang.Override
  public long getLastVersionAssigned() {
    return lastVersionAssigned_;
  }
  /**
   * <pre>
   * The last entity ID that was assigned to an entity.
   * </pre>
   *
   * <code>optional int64 last_version_assigned = 5;</code>
   * @param value The lastVersionAssigned to set.
   */
  private void setLastVersionAssigned(long value) {
    bitField0_ |= 0x00000004;
    lastVersionAssigned_ = value;
  }
  /**
   * <pre>
   * The last entity ID that was assigned to an entity.
   * </pre>
   *
   * <code>optional int64 last_version_assigned = 5;</code>
   */
  private void clearLastVersionAssigned() {
    bitField0_ = (bitField0_ & ~0x00000004);
    lastVersionAssigned_ = 0L;
  }

  public static org.chromium.components.sync.protocol.LoopbackServerProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.LoopbackServerProto prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Contains the loopback server state.
   * </pre>
   *
   * Protobuf type {@code sync_pb.LoopbackServerProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.LoopbackServerProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.LoopbackServerProto)
      org.chromium.components.sync.protocol.LoopbackServerProtoOrBuilder {
    // Construct using org.chromium.components.sync.protocol.LoopbackServerProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The protocol buffer format version.
     * </pre>
     *
     * <code>optional int64 version = 1;</code>
     * @return Whether the version field is set.
     */
    @java.lang.Override
    public boolean hasVersion() {
      return instance.hasVersion();
    }
    /**
     * <pre>
     * The protocol buffer format version.
     * </pre>
     *
     * <code>optional int64 version = 1;</code>
     * @return The version.
     */
    @java.lang.Override
    public long getVersion() {
      return instance.getVersion();
    }
    /**
     * <pre>
     * The protocol buffer format version.
     * </pre>
     *
     * <code>optional int64 version = 1;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(long value) {
      copyOnWrite();
      instance.setVersion(value);
      return this;
    }
    /**
     * <pre>
     * The protocol buffer format version.
     * </pre>
     *
     * <code>optional int64 version = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      copyOnWrite();
      instance.clearVersion();
      return this;
    }

    /**
     * <code>optional int64 store_birthday = 2;</code>
     * @return Whether the storeBirthday field is set.
     */
    @java.lang.Override
    public boolean hasStoreBirthday() {
      return instance.hasStoreBirthday();
    }
    /**
     * <code>optional int64 store_birthday = 2;</code>
     * @return The storeBirthday.
     */
    @java.lang.Override
    public long getStoreBirthday() {
      return instance.getStoreBirthday();
    }
    /**
     * <code>optional int64 store_birthday = 2;</code>
     * @param value The storeBirthday to set.
     * @return This builder for chaining.
     */
    public Builder setStoreBirthday(long value) {
      copyOnWrite();
      instance.setStoreBirthday(value);
      return this;
    }
    /**
     * <code>optional int64 store_birthday = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStoreBirthday() {
      copyOnWrite();
      instance.clearStoreBirthday();
      return this;
    }

    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    @java.lang.Override
    public java.util.List<org.chromium.components.sync.protocol.LoopbackServerEntity> getEntitiesList() {
      return java.util.Collections.unmodifiableList(
          instance.getEntitiesList());
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    @java.lang.Override
    public int getEntitiesCount() {
      return instance.getEntitiesCount();
    }/**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.LoopbackServerEntity getEntities(int index) {
      return instance.getEntities(index);
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public Builder setEntities(
        int index, org.chromium.components.sync.protocol.LoopbackServerEntity value) {
      copyOnWrite();
      instance.setEntities(index, value);
      return this;
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public Builder setEntities(
        int index, org.chromium.components.sync.protocol.LoopbackServerEntity.Builder builderForValue) {
      copyOnWrite();
      instance.setEntities(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public Builder addEntities(org.chromium.components.sync.protocol.LoopbackServerEntity value) {
      copyOnWrite();
      instance.addEntities(value);
      return this;
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public Builder addEntities(
        int index, org.chromium.components.sync.protocol.LoopbackServerEntity value) {
      copyOnWrite();
      instance.addEntities(index, value);
      return this;
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public Builder addEntities(
        org.chromium.components.sync.protocol.LoopbackServerEntity.Builder builderForValue) {
      copyOnWrite();
      instance.addEntities(builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public Builder addEntities(
        int index, org.chromium.components.sync.protocol.LoopbackServerEntity.Builder builderForValue) {
      copyOnWrite();
      instance.addEntities(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public Builder addAllEntities(
        java.lang.Iterable<? extends org.chromium.components.sync.protocol.LoopbackServerEntity> values) {
      copyOnWrite();
      instance.addAllEntities(values);
      return this;
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public Builder clearEntities() {
      copyOnWrite();
      instance.clearEntities();
      return this;
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public Builder removeEntities(int index) {
      copyOnWrite();
      instance.removeEntities(index);
      return this;
    }

    /**
     * <pre>
     * All Keystore keys known to the server.
     * </pre>
     *
     * <code>repeated bytes keystore_keys = 4;</code>
     * @return A list containing the keystoreKeys.
     */
    @java.lang.Override
    public java.util.List<com.google.protobuf.ByteString>
        getKeystoreKeysList() {
      return java.util.Collections.unmodifiableList(
          instance.getKeystoreKeysList());
    }
    /**
     * <pre>
     * All Keystore keys known to the server.
     * </pre>
     *
     * <code>repeated bytes keystore_keys = 4;</code>
     * @return The count of keystoreKeys.
     */
    @java.lang.Override
    public int getKeystoreKeysCount() {
      return instance.getKeystoreKeysCount();
    }
    /**
     * <pre>
     * All Keystore keys known to the server.
     * </pre>
     *
     * <code>repeated bytes keystore_keys = 4;</code>
     * @param index The index of the element to return.
     * @return The keystoreKeys at the given index.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKeystoreKeys(int index) {
      return instance.getKeystoreKeys(index);
    }
    /**
     * <pre>
     * All Keystore keys known to the server.
     * </pre>
     *
     * <code>repeated bytes keystore_keys = 4;</code>
     * @param value The keystoreKeys to set.
     * @return This builder for chaining.
     */
    public Builder setKeystoreKeys(
        int index, com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setKeystoreKeys(index, value);
      return this;
    }
    /**
     * <pre>
     * All Keystore keys known to the server.
     * </pre>
     *
     * <code>repeated bytes keystore_keys = 4;</code>
     * @param value The keystoreKeys to add.
     * @return This builder for chaining.
     */
    public Builder addKeystoreKeys(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addKeystoreKeys(value);
      return this;
    }
    /**
     * <pre>
     * All Keystore keys known to the server.
     * </pre>
     *
     * <code>repeated bytes keystore_keys = 4;</code>
     * @param values The keystoreKeys to add.
     * @return This builder for chaining.
     */
    public Builder addAllKeystoreKeys(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      copyOnWrite();
      instance.addAllKeystoreKeys(values);
      return this;
    }
    /**
     * <pre>
     * All Keystore keys known to the server.
     * </pre>
     *
     * <code>repeated bytes keystore_keys = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeystoreKeys() {
      copyOnWrite();
      instance.clearKeystoreKeys();
      return this;
    }

    /**
     * <pre>
     * The last entity ID that was assigned to an entity.
     * </pre>
     *
     * <code>optional int64 last_version_assigned = 5;</code>
     * @return Whether the lastVersionAssigned field is set.
     */
    @java.lang.Override
    public boolean hasLastVersionAssigned() {
      return instance.hasLastVersionAssigned();
    }
    /**
     * <pre>
     * The last entity ID that was assigned to an entity.
     * </pre>
     *
     * <code>optional int64 last_version_assigned = 5;</code>
     * @return The lastVersionAssigned.
     */
    @java.lang.Override
    public long getLastVersionAssigned() {
      return instance.getLastVersionAssigned();
    }
    /**
     * <pre>
     * The last entity ID that was assigned to an entity.
     * </pre>
     *
     * <code>optional int64 last_version_assigned = 5;</code>
     * @param value The lastVersionAssigned to set.
     * @return This builder for chaining.
     */
    public Builder setLastVersionAssigned(long value) {
      copyOnWrite();
      instance.setLastVersionAssigned(value);
      return this;
    }
    /**
     * <pre>
     * The last entity ID that was assigned to an entity.
     * </pre>
     *
     * <code>optional int64 last_version_assigned = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastVersionAssigned() {
      copyOnWrite();
      instance.clearLastVersionAssigned();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.LoopbackServerProto)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.LoopbackServerProto();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "version_",
            "storeBirthday_",
            "entities_",
            org.chromium.components.sync.protocol.LoopbackServerEntity.class,
            "keystoreKeys_",
            "lastVersionAssigned_",
          };
          java.lang.String info =
              "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u1002\u0000\u0002" +
              "\u1002\u0001\u0003\u001b\u0004\u001c\u0005\u1002\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.components.sync.protocol.LoopbackServerProto> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.components.sync.protocol.LoopbackServerProto.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.components.sync.protocol.LoopbackServerProto>(
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


  // @@protoc_insertion_point(class_scope:sync_pb.LoopbackServerProto)
  private static final org.chromium.components.sync.protocol.LoopbackServerProto DEFAULT_INSTANCE;
  static {
    LoopbackServerProto defaultInstance = new LoopbackServerProto();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      LoopbackServerProto.class, defaultInstance);
  }

  public static org.chromium.components.sync.protocol.LoopbackServerProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<LoopbackServerProto> PARSER;

  public static com.google.protobuf.Parser<LoopbackServerProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

