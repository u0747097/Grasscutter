// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MapMarkTipsInfo.proto

package emu.grasscutter.net.proto;

public final class MapMarkTipsInfoOuterClass {
  private MapMarkTipsInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MapMarkTipsInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MapMarkTipsInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.MapMarkTipsType tips_type = 1;</code>
     * @return The enum numeric value on the wire for tipsType.
     */
    int getTipsTypeValue();
    /**
     * <code>.MapMarkTipsType tips_type = 1;</code>
     * @return The tipsType.
     */
    emu.grasscutter.net.proto.MapMarkTipsTypeOuterClass.MapMarkTipsType getTipsType();

    /**
     * <code>repeated uint32 point_id_list = 2;</code>
     * @return A list containing the pointIdList.
     */
    java.util.List<java.lang.Integer> getPointIdListList();
    /**
     * <code>repeated uint32 point_id_list = 2;</code>
     * @return The count of pointIdList.
     */
    int getPointIdListCount();
    /**
     * <code>repeated uint32 point_id_list = 2;</code>
     * @param index The index of the element to return.
     * @return The pointIdList at the given index.
     */
    int getPointIdList(int index);
  }
  /**
   * <pre>
   * Obf: GADPFBOGKOD
   * </pre>
   *
   * Protobuf type {@code MapMarkTipsInfo}
   */
  public static final class MapMarkTipsInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MapMarkTipsInfo)
      MapMarkTipsInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MapMarkTipsInfo.newBuilder() to construct.
    private MapMarkTipsInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MapMarkTipsInfo() {
      tipsType_ = 0;
      pointIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MapMarkTipsInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MapMarkTipsInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();

              tipsType_ = rawValue;
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                pointIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              pointIdList_.addInt(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                pointIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                pointIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          pointIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.internal_static_MapMarkTipsInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.internal_static_MapMarkTipsInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.class, emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder.class);
    }

    public static final int TIPS_TYPE_FIELD_NUMBER = 1;
    private int tipsType_;
    /**
     * <code>.MapMarkTipsType tips_type = 1;</code>
     * @return The enum numeric value on the wire for tipsType.
     */
    @java.lang.Override public int getTipsTypeValue() {
      return tipsType_;
    }
    /**
     * <code>.MapMarkTipsType tips_type = 1;</code>
     * @return The tipsType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.MapMarkTipsTypeOuterClass.MapMarkTipsType getTipsType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.MapMarkTipsTypeOuterClass.MapMarkTipsType result = emu.grasscutter.net.proto.MapMarkTipsTypeOuterClass.MapMarkTipsType.valueOf(tipsType_);
      return result == null ? emu.grasscutter.net.proto.MapMarkTipsTypeOuterClass.MapMarkTipsType.UNRECOGNIZED : result;
    }

    public static final int POINT_ID_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList pointIdList_;
    /**
     * <code>repeated uint32 point_id_list = 2;</code>
     * @return A list containing the pointIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getPointIdListList() {
      return pointIdList_;
    }
    /**
     * <code>repeated uint32 point_id_list = 2;</code>
     * @return The count of pointIdList.
     */
    public int getPointIdListCount() {
      return pointIdList_.size();
    }
    /**
     * <code>repeated uint32 point_id_list = 2;</code>
     * @param index The index of the element to return.
     * @return The pointIdList at the given index.
     */
    public int getPointIdList(int index) {
      return pointIdList_.getInt(index);
    }
    private int pointIdListMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (tipsType_ != emu.grasscutter.net.proto.MapMarkTipsTypeOuterClass.MapMarkTipsType.MARK_TIPS_DUNGEON_ELEMENT_TRIAL.getNumber()) {
        output.writeEnum(1, tipsType_);
      }
      if (getPointIdListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(pointIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < pointIdList_.size(); i++) {
        output.writeUInt32NoTag(pointIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (tipsType_ != emu.grasscutter.net.proto.MapMarkTipsTypeOuterClass.MapMarkTipsType.MARK_TIPS_DUNGEON_ELEMENT_TRIAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, tipsType_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < pointIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(pointIdList_.getInt(i));
        }
        size += dataSize;
        if (!getPointIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        pointIdListMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo other = (emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo) obj;

      if (tipsType_ != other.tipsType_) return false;
      if (!getPointIdListList()
          .equals(other.getPointIdListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TIPS_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + tipsType_;
      if (getPointIdListCount() > 0) {
        hash = (37 * hash) + POINT_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPointIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Obf: GADPFBOGKOD
     * </pre>
     *
     * Protobuf type {@code MapMarkTipsInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MapMarkTipsInfo)
        emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.internal_static_MapMarkTipsInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.internal_static_MapMarkTipsInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.class, emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        tipsType_ = 0;

        pointIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.internal_static_MapMarkTipsInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo build() {
        emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo buildPartial() {
        emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo result = new emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo(this);
        int from_bitField0_ = bitField0_;
        result.tipsType_ = tipsType_;
        if (((bitField0_ & 0x00000001) != 0)) {
          pointIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pointIdList_ = pointIdList_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo) {
          return mergeFrom((emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo other) {
        if (other == emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo.getDefaultInstance()) return this;
        if (other.tipsType_ != 0) {
          setTipsTypeValue(other.getTipsTypeValue());
        }
        if (!other.pointIdList_.isEmpty()) {
          if (pointIdList_.isEmpty()) {
            pointIdList_ = other.pointIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePointIdListIsMutable();
            pointIdList_.addAll(other.pointIdList_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int tipsType_ = 0;
      /**
       * <code>.MapMarkTipsType tips_type = 1;</code>
       * @return The enum numeric value on the wire for tipsType.
       */
      @java.lang.Override public int getTipsTypeValue() {
        return tipsType_;
      }
      /**
       * <code>.MapMarkTipsType tips_type = 1;</code>
       * @param value The enum numeric value on the wire for tipsType to set.
       * @return This builder for chaining.
       */
      public Builder setTipsTypeValue(int value) {
        
        tipsType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MapMarkTipsType tips_type = 1;</code>
       * @return The tipsType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.MapMarkTipsTypeOuterClass.MapMarkTipsType getTipsType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.MapMarkTipsTypeOuterClass.MapMarkTipsType result = emu.grasscutter.net.proto.MapMarkTipsTypeOuterClass.MapMarkTipsType.valueOf(tipsType_);
        return result == null ? emu.grasscutter.net.proto.MapMarkTipsTypeOuterClass.MapMarkTipsType.UNRECOGNIZED : result;
      }
      /**
       * <code>.MapMarkTipsType tips_type = 1;</code>
       * @param value The tipsType to set.
       * @return This builder for chaining.
       */
      public Builder setTipsType(emu.grasscutter.net.proto.MapMarkTipsTypeOuterClass.MapMarkTipsType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        tipsType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MapMarkTipsType tips_type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTipsType() {
        
        tipsType_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList pointIdList_ = emptyIntList();
      private void ensurePointIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          pointIdList_ = mutableCopy(pointIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 point_id_list = 2;</code>
       * @return A list containing the pointIdList.
       */
      public java.util.List<java.lang.Integer>
          getPointIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(pointIdList_) : pointIdList_;
      }
      /**
       * <code>repeated uint32 point_id_list = 2;</code>
       * @return The count of pointIdList.
       */
      public int getPointIdListCount() {
        return pointIdList_.size();
      }
      /**
       * <code>repeated uint32 point_id_list = 2;</code>
       * @param index The index of the element to return.
       * @return The pointIdList at the given index.
       */
      public int getPointIdList(int index) {
        return pointIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 point_id_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The pointIdList to set.
       * @return This builder for chaining.
       */
      public Builder setPointIdList(
          int index, int value) {
        ensurePointIdListIsMutable();
        pointIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 point_id_list = 2;</code>
       * @param value The pointIdList to add.
       * @return This builder for chaining.
       */
      public Builder addPointIdList(int value) {
        ensurePointIdListIsMutable();
        pointIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 point_id_list = 2;</code>
       * @param values The pointIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllPointIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensurePointIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pointIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 point_id_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointIdList() {
        pointIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:MapMarkTipsInfo)
    }

    // @@protoc_insertion_point(class_scope:MapMarkTipsInfo)
    private static final emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo();
    }

    public static emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MapMarkTipsInfo>
        PARSER = new com.google.protobuf.AbstractParser<MapMarkTipsInfo>() {
      @java.lang.Override
      public MapMarkTipsInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MapMarkTipsInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MapMarkTipsInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MapMarkTipsInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MapMarkTipsInfoOuterClass.MapMarkTipsInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MapMarkTipsInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MapMarkTipsInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025MapMarkTipsInfo.proto\032\025MapMarkTipsType" +
      ".proto\"M\n\017MapMarkTipsInfo\022#\n\ttips_type\030\001" +
      " \001(\0162\020.MapMarkTipsType\022\025\n\rpoint_id_list\030" +
      "\002 \003(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MapMarkTipsTypeOuterClass.getDescriptor(),
        });
    internal_static_MapMarkTipsInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MapMarkTipsInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MapMarkTipsInfo_descriptor,
        new java.lang.String[] { "TipsType", "PointIdList", });
    emu.grasscutter.net.proto.MapMarkTipsTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
