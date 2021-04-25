// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/sync/protocol/client_debug_info.proto

package org.chromium.components.sync.protocol;

/**
 * Protobuf type {@code sync_pb.DebugEventInfo}
 */
public  final class DebugEventInfo extends
    com.google.protobuf.GeneratedMessageLite<
        DebugEventInfo, DebugEventInfo.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.DebugEventInfo)
    DebugEventInfoOrBuilder {
  private DebugEventInfo() {
    singletonEvent_ = 1;
    datatypesNotifiedFromServer_ = emptyIntList();
  }
  private int bitField0_;
  public static final int SINGLETON_EVENT_FIELD_NUMBER = 1;
  private int singletonEvent_;
  /**
   * <pre>
   * Each of the following fields correspond to different kinds of events. as
   * a result, only one is set during any single DebugEventInfo.
   * A singleton event. See enum definition.
   * </pre>
   *
   * <code>optional .sync_pb.SyncEnums.SingletonDebugEventType singleton_event = 1;</code>
   * @return Whether the singletonEvent field is set.
   */
  @java.lang.Override
  public boolean hasSingletonEvent() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Each of the following fields correspond to different kinds of events. as
   * a result, only one is set during any single DebugEventInfo.
   * A singleton event. See enum definition.
   * </pre>
   *
   * <code>optional .sync_pb.SyncEnums.SingletonDebugEventType singleton_event = 1;</code>
   * @return The singletonEvent.
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.SyncEnums.SingletonDebugEventType getSingletonEvent() {
    org.chromium.components.sync.protocol.SyncEnums.SingletonDebugEventType result = org.chromium.components.sync.protocol.SyncEnums.SingletonDebugEventType.forNumber(singletonEvent_);
    return result == null ? org.chromium.components.sync.protocol.SyncEnums.SingletonDebugEventType.CONNECTION_STATUS_CHANGE : result;
  }
  /**
   * <pre>
   * Each of the following fields correspond to different kinds of events. as
   * a result, only one is set during any single DebugEventInfo.
   * A singleton event. See enum definition.
   * </pre>
   *
   * <code>optional .sync_pb.SyncEnums.SingletonDebugEventType singleton_event = 1;</code>
   * @param value The singletonEvent to set.
   */
  private void setSingletonEvent(org.chromium.components.sync.protocol.SyncEnums.SingletonDebugEventType value) {
    singletonEvent_ = value.getNumber();
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * Each of the following fields correspond to different kinds of events. as
   * a result, only one is set during any single DebugEventInfo.
   * A singleton event. See enum definition.
   * </pre>
   *
   * <code>optional .sync_pb.SyncEnums.SingletonDebugEventType singleton_event = 1;</code>
   */
  private void clearSingletonEvent() {
    bitField0_ = (bitField0_ & ~0x00000001);
    singletonEvent_ = 1;
  }

  public static final int SYNC_CYCLE_COMPLETED_EVENT_INFO_FIELD_NUMBER = 2;
  private org.chromium.components.sync.protocol.SyncCycleCompletedEventInfo syncCycleCompletedEventInfo_;
  /**
   * <pre>
   * A sync cycle completed.
   * </pre>
   *
   * <code>optional .sync_pb.SyncCycleCompletedEventInfo sync_cycle_completed_event_info = 2;</code>
   */
  @java.lang.Override
  public boolean hasSyncCycleCompletedEventInfo() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * A sync cycle completed.
   * </pre>
   *
   * <code>optional .sync_pb.SyncCycleCompletedEventInfo sync_cycle_completed_event_info = 2;</code>
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.SyncCycleCompletedEventInfo getSyncCycleCompletedEventInfo() {
    return syncCycleCompletedEventInfo_ == null ? org.chromium.components.sync.protocol.SyncCycleCompletedEventInfo.getDefaultInstance() : syncCycleCompletedEventInfo_;
  }
  /**
   * <pre>
   * A sync cycle completed.
   * </pre>
   *
   * <code>optional .sync_pb.SyncCycleCompletedEventInfo sync_cycle_completed_event_info = 2;</code>
   */
  private void setSyncCycleCompletedEventInfo(org.chromium.components.sync.protocol.SyncCycleCompletedEventInfo value) {
    value.getClass();
  syncCycleCompletedEventInfo_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <pre>
   * A sync cycle completed.
   * </pre>
   *
   * <code>optional .sync_pb.SyncCycleCompletedEventInfo sync_cycle_completed_event_info = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeSyncCycleCompletedEventInfo(org.chromium.components.sync.protocol.SyncCycleCompletedEventInfo value) {
    value.getClass();
  if (syncCycleCompletedEventInfo_ != null &&
        syncCycleCompletedEventInfo_ != org.chromium.components.sync.protocol.SyncCycleCompletedEventInfo.getDefaultInstance()) {
      syncCycleCompletedEventInfo_ =
        org.chromium.components.sync.protocol.SyncCycleCompletedEventInfo.newBuilder(syncCycleCompletedEventInfo_).mergeFrom(value).buildPartial();
    } else {
      syncCycleCompletedEventInfo_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * A sync cycle completed.
   * </pre>
   *
   * <code>optional .sync_pb.SyncCycleCompletedEventInfo sync_cycle_completed_event_info = 2;</code>
   */
  private void clearSyncCycleCompletedEventInfo() {  syncCycleCompletedEventInfo_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int NUDGING_DATATYPE_FIELD_NUMBER = 3;
  private int nudgingDatatype_;
  /**
   * <pre>
   * A datatype triggered a nudge.
   * </pre>
   *
   * <code>optional int32 nudging_datatype = 3;</code>
   * @return Whether the nudgingDatatype field is set.
   */
  @java.lang.Override
  public boolean hasNudgingDatatype() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * A datatype triggered a nudge.
   * </pre>
   *
   * <code>optional int32 nudging_datatype = 3;</code>
   * @return The nudgingDatatype.
   */
  @java.lang.Override
  public int getNudgingDatatype() {
    return nudgingDatatype_;
  }
  /**
   * <pre>
   * A datatype triggered a nudge.
   * </pre>
   *
   * <code>optional int32 nudging_datatype = 3;</code>
   * @param value The nudgingDatatype to set.
   */
  private void setNudgingDatatype(int value) {
    bitField0_ |= 0x00000004;
    nudgingDatatype_ = value;
  }
  /**
   * <pre>
   * A datatype triggered a nudge.
   * </pre>
   *
   * <code>optional int32 nudging_datatype = 3;</code>
   */
  private void clearNudgingDatatype() {
    bitField0_ = (bitField0_ & ~0x00000004);
    nudgingDatatype_ = 0;
  }

  public static final int DATATYPES_NOTIFIED_FROM_SERVER_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.IntList datatypesNotifiedFromServer_;
  /**
   * <pre>
   * A notification triggered a nudge.
   * </pre>
   *
   * <code>repeated int32 datatypes_notified_from_server = 4;</code>
   * @return A list containing the datatypesNotifiedFromServer.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getDatatypesNotifiedFromServerList() {
    return datatypesNotifiedFromServer_;
  }
  /**
   * <pre>
   * A notification triggered a nudge.
   * </pre>
   *
   * <code>repeated int32 datatypes_notified_from_server = 4;</code>
   * @return The count of datatypesNotifiedFromServer.
   */
  @java.lang.Override
  public int getDatatypesNotifiedFromServerCount() {
    return datatypesNotifiedFromServer_.size();
  }
  /**
   * <pre>
   * A notification triggered a nudge.
   * </pre>
   *
   * <code>repeated int32 datatypes_notified_from_server = 4;</code>
   * @param index The index of the element to return.
   * @return The datatypesNotifiedFromServer at the given index.
   */
  @java.lang.Override
  public int getDatatypesNotifiedFromServer(int index) {
    return datatypesNotifiedFromServer_.getInt(index);
  }
  private void ensureDatatypesNotifiedFromServerIsMutable() {
    com.google.protobuf.Internal.IntList tmp = datatypesNotifiedFromServer_;
    if (!tmp.isModifiable()) {
      datatypesNotifiedFromServer_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }
  /**
   * <pre>
   * A notification triggered a nudge.
   * </pre>
   *
   * <code>repeated int32 datatypes_notified_from_server = 4;</code>
   * @param index The index to set the value at.
   * @param value The datatypesNotifiedFromServer to set.
   */
  private void setDatatypesNotifiedFromServer(
      int index, int value) {
    ensureDatatypesNotifiedFromServerIsMutable();
    datatypesNotifiedFromServer_.setInt(index, value);
  }
  /**
   * <pre>
   * A notification triggered a nudge.
   * </pre>
   *
   * <code>repeated int32 datatypes_notified_from_server = 4;</code>
   * @param value The datatypesNotifiedFromServer to add.
   */
  private void addDatatypesNotifiedFromServer(int value) {
    ensureDatatypesNotifiedFromServerIsMutable();
    datatypesNotifiedFromServer_.addInt(value);
  }
  /**
   * <pre>
   * A notification triggered a nudge.
   * </pre>
   *
   * <code>repeated int32 datatypes_notified_from_server = 4;</code>
   * @param values The datatypesNotifiedFromServer to add.
   */
  private void addAllDatatypesNotifiedFromServer(
      java.lang.Iterable<? extends java.lang.Integer> values) {
    ensureDatatypesNotifiedFromServerIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, datatypesNotifiedFromServer_);
  }
  /**
   * <pre>
   * A notification triggered a nudge.
   * </pre>
   *
   * <code>repeated int32 datatypes_notified_from_server = 4;</code>
   */
  private void clearDatatypesNotifiedFromServer() {
    datatypesNotifiedFromServer_ = emptyIntList();
  }

  public static final int DATATYPE_ASSOCIATION_STATS_FIELD_NUMBER = 5;
  private org.chromium.components.sync.protocol.DatatypeAssociationStats datatypeAssociationStats_;
  /**
   * <pre>
   * A datatype finished model association.
   * </pre>
   *
   * <code>optional .sync_pb.DatatypeAssociationStats datatype_association_stats = 5;</code>
   */
  @java.lang.Override
  public boolean hasDatatypeAssociationStats() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   * A datatype finished model association.
   * </pre>
   *
   * <code>optional .sync_pb.DatatypeAssociationStats datatype_association_stats = 5;</code>
   */
  @java.lang.Override
  public org.chromium.components.sync.protocol.DatatypeAssociationStats getDatatypeAssociationStats() {
    return datatypeAssociationStats_ == null ? org.chromium.components.sync.protocol.DatatypeAssociationStats.getDefaultInstance() : datatypeAssociationStats_;
  }
  /**
   * <pre>
   * A datatype finished model association.
   * </pre>
   *
   * <code>optional .sync_pb.DatatypeAssociationStats datatype_association_stats = 5;</code>
   */
  private void setDatatypeAssociationStats(org.chromium.components.sync.protocol.DatatypeAssociationStats value) {
    value.getClass();
  datatypeAssociationStats_ = value;
    bitField0_ |= 0x00000008;
    }
  /**
   * <pre>
   * A datatype finished model association.
   * </pre>
   *
   * <code>optional .sync_pb.DatatypeAssociationStats datatype_association_stats = 5;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeDatatypeAssociationStats(org.chromium.components.sync.protocol.DatatypeAssociationStats value) {
    value.getClass();
  if (datatypeAssociationStats_ != null &&
        datatypeAssociationStats_ != org.chromium.components.sync.protocol.DatatypeAssociationStats.getDefaultInstance()) {
      datatypeAssociationStats_ =
        org.chromium.components.sync.protocol.DatatypeAssociationStats.newBuilder(datatypeAssociationStats_).mergeFrom(value).buildPartial();
    } else {
      datatypeAssociationStats_ = value;
    }
    bitField0_ |= 0x00000008;
  }
  /**
   * <pre>
   * A datatype finished model association.
   * </pre>
   *
   * <code>optional .sync_pb.DatatypeAssociationStats datatype_association_stats = 5;</code>
   */
  private void clearDatatypeAssociationStats() {  datatypeAssociationStats_ = null;
    bitField0_ = (bitField0_ & ~0x00000008);
  }

  public static org.chromium.components.sync.protocol.DebugEventInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.DebugEventInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.DebugEventInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.DebugEventInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.DebugEventInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.DebugEventInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.DebugEventInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.DebugEventInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.DebugEventInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.DebugEventInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.DebugEventInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.DebugEventInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.DebugEventInfo prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code sync_pb.DebugEventInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.DebugEventInfo, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.DebugEventInfo)
      org.chromium.components.sync.protocol.DebugEventInfoOrBuilder {
    // Construct using org.chromium.components.sync.protocol.DebugEventInfo.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Each of the following fields correspond to different kinds of events. as
     * a result, only one is set during any single DebugEventInfo.
     * A singleton event. See enum definition.
     * </pre>
     *
     * <code>optional .sync_pb.SyncEnums.SingletonDebugEventType singleton_event = 1;</code>
     * @return Whether the singletonEvent field is set.
     */
    @java.lang.Override
    public boolean hasSingletonEvent() {
      return instance.hasSingletonEvent();
    }
    /**
     * <pre>
     * Each of the following fields correspond to different kinds of events. as
     * a result, only one is set during any single DebugEventInfo.
     * A singleton event. See enum definition.
     * </pre>
     *
     * <code>optional .sync_pb.SyncEnums.SingletonDebugEventType singleton_event = 1;</code>
     * @return The singletonEvent.
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.SyncEnums.SingletonDebugEventType getSingletonEvent() {
      return instance.getSingletonEvent();
    }
    /**
     * <pre>
     * Each of the following fields correspond to different kinds of events. as
     * a result, only one is set during any single DebugEventInfo.
     * A singleton event. See enum definition.
     * </pre>
     *
     * <code>optional .sync_pb.SyncEnums.SingletonDebugEventType singleton_event = 1;</code>
     * @param value The enum numeric value on the wire for singletonEvent to set.
     * @return This builder for chaining.
     */
    public Builder setSingletonEvent(org.chromium.components.sync.protocol.SyncEnums.SingletonDebugEventType value) {
      copyOnWrite();
      instance.setSingletonEvent(value);
      return this;
    }
    /**
     * <pre>
     * Each of the following fields correspond to different kinds of events. as
     * a result, only one is set during any single DebugEventInfo.
     * A singleton event. See enum definition.
     * </pre>
     *
     * <code>optional .sync_pb.SyncEnums.SingletonDebugEventType singleton_event = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSingletonEvent() {
      copyOnWrite();
      instance.clearSingletonEvent();
      return this;
    }

    /**
     * <pre>
     * A sync cycle completed.
     * </pre>
     *
     * <code>optional .sync_pb.SyncCycleCompletedEventInfo sync_cycle_completed_event_info = 2;</code>
     */
    @java.lang.Override
    public boolean hasSyncCycleCompletedEventInfo() {
      return instance.hasSyncCycleCompletedEventInfo();
    }
    /**
     * <pre>
     * A sync cycle completed.
     * </pre>
     *
     * <code>optional .sync_pb.SyncCycleCompletedEventInfo sync_cycle_completed_event_info = 2;</code>
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.SyncCycleCompletedEventInfo getSyncCycleCompletedEventInfo() {
      return instance.getSyncCycleCompletedEventInfo();
    }
    /**
     * <pre>
     * A sync cycle completed.
     * </pre>
     *
     * <code>optional .sync_pb.SyncCycleCompletedEventInfo sync_cycle_completed_event_info = 2;</code>
     */
    public Builder setSyncCycleCompletedEventInfo(org.chromium.components.sync.protocol.SyncCycleCompletedEventInfo value) {
      copyOnWrite();
      instance.setSyncCycleCompletedEventInfo(value);
      return this;
      }
    /**
     * <pre>
     * A sync cycle completed.
     * </pre>
     *
     * <code>optional .sync_pb.SyncCycleCompletedEventInfo sync_cycle_completed_event_info = 2;</code>
     */
    public Builder setSyncCycleCompletedEventInfo(
        org.chromium.components.sync.protocol.SyncCycleCompletedEventInfo.Builder builderForValue) {
      copyOnWrite();
      instance.setSyncCycleCompletedEventInfo(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A sync cycle completed.
     * </pre>
     *
     * <code>optional .sync_pb.SyncCycleCompletedEventInfo sync_cycle_completed_event_info = 2;</code>
     */
    public Builder mergeSyncCycleCompletedEventInfo(org.chromium.components.sync.protocol.SyncCycleCompletedEventInfo value) {
      copyOnWrite();
      instance.mergeSyncCycleCompletedEventInfo(value);
      return this;
    }
    /**
     * <pre>
     * A sync cycle completed.
     * </pre>
     *
     * <code>optional .sync_pb.SyncCycleCompletedEventInfo sync_cycle_completed_event_info = 2;</code>
     */
    public Builder clearSyncCycleCompletedEventInfo() {  copyOnWrite();
      instance.clearSyncCycleCompletedEventInfo();
      return this;
    }

    /**
     * <pre>
     * A datatype triggered a nudge.
     * </pre>
     *
     * <code>optional int32 nudging_datatype = 3;</code>
     * @return Whether the nudgingDatatype field is set.
     */
    @java.lang.Override
    public boolean hasNudgingDatatype() {
      return instance.hasNudgingDatatype();
    }
    /**
     * <pre>
     * A datatype triggered a nudge.
     * </pre>
     *
     * <code>optional int32 nudging_datatype = 3;</code>
     * @return The nudgingDatatype.
     */
    @java.lang.Override
    public int getNudgingDatatype() {
      return instance.getNudgingDatatype();
    }
    /**
     * <pre>
     * A datatype triggered a nudge.
     * </pre>
     *
     * <code>optional int32 nudging_datatype = 3;</code>
     * @param value The nudgingDatatype to set.
     * @return This builder for chaining.
     */
    public Builder setNudgingDatatype(int value) {
      copyOnWrite();
      instance.setNudgingDatatype(value);
      return this;
    }
    /**
     * <pre>
     * A datatype triggered a nudge.
     * </pre>
     *
     * <code>optional int32 nudging_datatype = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNudgingDatatype() {
      copyOnWrite();
      instance.clearNudgingDatatype();
      return this;
    }

    /**
     * <pre>
     * A notification triggered a nudge.
     * </pre>
     *
     * <code>repeated int32 datatypes_notified_from_server = 4;</code>
     * @return A list containing the datatypesNotifiedFromServer.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getDatatypesNotifiedFromServerList() {
      return java.util.Collections.unmodifiableList(
          instance.getDatatypesNotifiedFromServerList());
    }
    /**
     * <pre>
     * A notification triggered a nudge.
     * </pre>
     *
     * <code>repeated int32 datatypes_notified_from_server = 4;</code>
     * @return The count of datatypesNotifiedFromServer.
     */
    @java.lang.Override
    public int getDatatypesNotifiedFromServerCount() {
      return instance.getDatatypesNotifiedFromServerCount();
    }
    /**
     * <pre>
     * A notification triggered a nudge.
     * </pre>
     *
     * <code>repeated int32 datatypes_notified_from_server = 4;</code>
     * @param index The index of the element to return.
     * @return The datatypesNotifiedFromServer at the given index.
     */
    @java.lang.Override
    public int getDatatypesNotifiedFromServer(int index) {
      return instance.getDatatypesNotifiedFromServer(index);
    }
    /**
     * <pre>
     * A notification triggered a nudge.
     * </pre>
     *
     * <code>repeated int32 datatypes_notified_from_server = 4;</code>
     * @param value The datatypesNotifiedFromServer to set.
     * @return This builder for chaining.
     */
    public Builder setDatatypesNotifiedFromServer(
        int index, int value) {
      copyOnWrite();
      instance.setDatatypesNotifiedFromServer(index, value);
      return this;
    }
    /**
     * <pre>
     * A notification triggered a nudge.
     * </pre>
     *
     * <code>repeated int32 datatypes_notified_from_server = 4;</code>
     * @param value The datatypesNotifiedFromServer to add.
     * @return This builder for chaining.
     */
    public Builder addDatatypesNotifiedFromServer(int value) {
      copyOnWrite();
      instance.addDatatypesNotifiedFromServer(value);
      return this;
    }
    /**
     * <pre>
     * A notification triggered a nudge.
     * </pre>
     *
     * <code>repeated int32 datatypes_notified_from_server = 4;</code>
     * @param values The datatypesNotifiedFromServer to add.
     * @return This builder for chaining.
     */
    public Builder addAllDatatypesNotifiedFromServer(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      copyOnWrite();
      instance.addAllDatatypesNotifiedFromServer(values);
      return this;
    }
    /**
     * <pre>
     * A notification triggered a nudge.
     * </pre>
     *
     * <code>repeated int32 datatypes_notified_from_server = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDatatypesNotifiedFromServer() {
      copyOnWrite();
      instance.clearDatatypesNotifiedFromServer();
      return this;
    }

    /**
     * <pre>
     * A datatype finished model association.
     * </pre>
     *
     * <code>optional .sync_pb.DatatypeAssociationStats datatype_association_stats = 5;</code>
     */
    @java.lang.Override
    public boolean hasDatatypeAssociationStats() {
      return instance.hasDatatypeAssociationStats();
    }
    /**
     * <pre>
     * A datatype finished model association.
     * </pre>
     *
     * <code>optional .sync_pb.DatatypeAssociationStats datatype_association_stats = 5;</code>
     */
    @java.lang.Override
    public org.chromium.components.sync.protocol.DatatypeAssociationStats getDatatypeAssociationStats() {
      return instance.getDatatypeAssociationStats();
    }
    /**
     * <pre>
     * A datatype finished model association.
     * </pre>
     *
     * <code>optional .sync_pb.DatatypeAssociationStats datatype_association_stats = 5;</code>
     */
    public Builder setDatatypeAssociationStats(org.chromium.components.sync.protocol.DatatypeAssociationStats value) {
      copyOnWrite();
      instance.setDatatypeAssociationStats(value);
      return this;
      }
    /**
     * <pre>
     * A datatype finished model association.
     * </pre>
     *
     * <code>optional .sync_pb.DatatypeAssociationStats datatype_association_stats = 5;</code>
     */
    public Builder setDatatypeAssociationStats(
        org.chromium.components.sync.protocol.DatatypeAssociationStats.Builder builderForValue) {
      copyOnWrite();
      instance.setDatatypeAssociationStats(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A datatype finished model association.
     * </pre>
     *
     * <code>optional .sync_pb.DatatypeAssociationStats datatype_association_stats = 5;</code>
     */
    public Builder mergeDatatypeAssociationStats(org.chromium.components.sync.protocol.DatatypeAssociationStats value) {
      copyOnWrite();
      instance.mergeDatatypeAssociationStats(value);
      return this;
    }
    /**
     * <pre>
     * A datatype finished model association.
     * </pre>
     *
     * <code>optional .sync_pb.DatatypeAssociationStats datatype_association_stats = 5;</code>
     */
    public Builder clearDatatypeAssociationStats() {  copyOnWrite();
      instance.clearDatatypeAssociationStats();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.DebugEventInfo)
  }
  private byte memoizedIsInitialized = 2;
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.DebugEventInfo();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "singletonEvent_",
            org.chromium.components.sync.protocol.SyncEnums.SingletonDebugEventType.internalGetVerifier(),
            "syncCycleCompletedEventInfo_",
            "nudgingDatatype_",
            "datatypesNotifiedFromServer_",
            "datatypeAssociationStats_",
          };
          java.lang.String info =
              "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\u100c\u0000\u0002" +
              "\u1409\u0001\u0003\u1004\u0002\u0004\u0016\u0005\u1009\u0003";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<org.chromium.components.sync.protocol.DebugEventInfo> parser = PARSER;
        if (parser == null) {
          synchronized (org.chromium.components.sync.protocol.DebugEventInfo.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<org.chromium.components.sync.protocol.DebugEventInfo>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return memoizedIsInitialized;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:sync_pb.DebugEventInfo)
  private static final org.chromium.components.sync.protocol.DebugEventInfo DEFAULT_INSTANCE;
  static {
    DebugEventInfo defaultInstance = new DebugEventInfo();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      DebugEventInfo.class, defaultInstance);
  }

  public static org.chromium.components.sync.protocol.DebugEventInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<DebugEventInfo> PARSER;

  public static com.google.protobuf.Parser<DebugEventInfo> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

