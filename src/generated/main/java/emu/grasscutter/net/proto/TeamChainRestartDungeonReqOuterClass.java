// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TeamChainRestartDungeonReq.proto

package emu.grasscutter.net.proto;

public final class TeamChainRestartDungeonReqOuterClass {
  private TeamChainRestartDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TeamChainRestartDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TeamChainRestartDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
     */
    java.util.List<emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo> 
        getTeamInfoListList();
    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
     */
    emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo getTeamInfoList(int index);
    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
     */
    int getTeamInfoListCount();
    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfoOrBuilder> 
        getTeamInfoListOrBuilderList();
    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
     */
    emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfoOrBuilder getTeamInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 24341
   * Obf: DAFIHNKHLII
   * </pre>
   *
   * Protobuf type {@code TeamChainRestartDungeonReq}
   */
  public static final class TeamChainRestartDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TeamChainRestartDungeonReq)
      TeamChainRestartDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TeamChainRestartDungeonReq.newBuilder() to construct.
    private TeamChainRestartDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TeamChainRestartDungeonReq() {
      teamInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TeamChainRestartDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TeamChainRestartDungeonReq(
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
            case 74: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                teamInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              teamInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.parser(), extensionRegistry));
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
          teamInfoList_ = java.util.Collections.unmodifiableList(teamInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.internal_static_TeamChainRestartDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.internal_static_TeamChainRestartDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq.class, emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq.Builder.class);
    }

    public static final int TEAM_INFO_LIST_FIELD_NUMBER = 9;
    private java.util.List<emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo> teamInfoList_;
    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo> getTeamInfoListList() {
      return teamInfoList_;
    }
    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfoOrBuilder> 
        getTeamInfoListOrBuilderList() {
      return teamInfoList_;
    }
    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
     */
    @java.lang.Override
    public int getTeamInfoListCount() {
      return teamInfoList_.size();
    }
    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo getTeamInfoList(int index) {
      return teamInfoList_.get(index);
    }
    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfoOrBuilder getTeamInfoListOrBuilder(
        int index) {
      return teamInfoList_.get(index);
    }

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
      for (int i = 0; i < teamInfoList_.size(); i++) {
        output.writeMessage(9, teamInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < teamInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, teamInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq other = (emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq) obj;

      if (!getTeamInfoListList()
          .equals(other.getTeamInfoListList())) return false;
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
      if (getTeamInfoListCount() > 0) {
        hash = (37 * hash) + TEAM_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTeamInfoListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq prototype) {
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
     * CmdId: 24341
     * Obf: DAFIHNKHLII
     * </pre>
     *
     * Protobuf type {@code TeamChainRestartDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TeamChainRestartDungeonReq)
        emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.internal_static_TeamChainRestartDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.internal_static_TeamChainRestartDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq.class, emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq.newBuilder()
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
          getTeamInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (teamInfoListBuilder_ == null) {
          teamInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          teamInfoListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.internal_static_TeamChainRestartDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq build() {
        emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq buildPartial() {
        emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq result = new emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq(this);
        int from_bitField0_ = bitField0_;
        if (teamInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            teamInfoList_ = java.util.Collections.unmodifiableList(teamInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.teamInfoList_ = teamInfoList_;
        } else {
          result.teamInfoList_ = teamInfoListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq) {
          return mergeFrom((emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq other) {
        if (other == emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq.getDefaultInstance()) return this;
        if (teamInfoListBuilder_ == null) {
          if (!other.teamInfoList_.isEmpty()) {
            if (teamInfoList_.isEmpty()) {
              teamInfoList_ = other.teamInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTeamInfoListIsMutable();
              teamInfoList_.addAll(other.teamInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.teamInfoList_.isEmpty()) {
            if (teamInfoListBuilder_.isEmpty()) {
              teamInfoListBuilder_.dispose();
              teamInfoListBuilder_ = null;
              teamInfoList_ = other.teamInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              teamInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTeamInfoListFieldBuilder() : null;
            } else {
              teamInfoListBuilder_.addAllMessages(other.teamInfoList_);
            }
          }
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
        emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo> teamInfoList_ =
        java.util.Collections.emptyList();
      private void ensureTeamInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          teamInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo>(teamInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo, emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder, emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfoOrBuilder> teamInfoListBuilder_;

      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo> getTeamInfoListList() {
        if (teamInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(teamInfoList_);
        } else {
          return teamInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
       */
      public int getTeamInfoListCount() {
        if (teamInfoListBuilder_ == null) {
          return teamInfoList_.size();
        } else {
          return teamInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo getTeamInfoList(int index) {
        if (teamInfoListBuilder_ == null) {
          return teamInfoList_.get(index);
        } else {
          return teamInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
       */
      public Builder setTeamInfoList(
          int index, emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo value) {
        if (teamInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamInfoListIsMutable();
          teamInfoList_.set(index, value);
          onChanged();
        } else {
          teamInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
       */
      public Builder setTeamInfoList(
          int index, emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder builderForValue) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          teamInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          teamInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
       */
      public Builder addTeamInfoList(emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo value) {
        if (teamInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamInfoListIsMutable();
          teamInfoList_.add(value);
          onChanged();
        } else {
          teamInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
       */
      public Builder addTeamInfoList(
          int index, emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo value) {
        if (teamInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamInfoListIsMutable();
          teamInfoList_.add(index, value);
          onChanged();
        } else {
          teamInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
       */
      public Builder addTeamInfoList(
          emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder builderForValue) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          teamInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          teamInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
       */
      public Builder addTeamInfoList(
          int index, emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder builderForValue) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          teamInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          teamInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
       */
      public Builder addAllTeamInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo> values) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, teamInfoList_);
          onChanged();
        } else {
          teamInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
       */
      public Builder clearTeamInfoList() {
        if (teamInfoListBuilder_ == null) {
          teamInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          teamInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
       */
      public Builder removeTeamInfoList(int index) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          teamInfoList_.remove(index);
          onChanged();
        } else {
          teamInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder getTeamInfoListBuilder(
          int index) {
        return getTeamInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfoOrBuilder getTeamInfoListOrBuilder(
          int index) {
        if (teamInfoListBuilder_ == null) {
          return teamInfoList_.get(index);  } else {
          return teamInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfoOrBuilder> 
           getTeamInfoListOrBuilderList() {
        if (teamInfoListBuilder_ != null) {
          return teamInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(teamInfoList_);
        }
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder addTeamInfoListBuilder() {
        return getTeamInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
       */
      public emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder addTeamInfoListBuilder(
          int index) {
        return getTeamInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 9;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder> 
           getTeamInfoListBuilderList() {
        return getTeamInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo, emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder, emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfoOrBuilder> 
          getTeamInfoListFieldBuilder() {
        if (teamInfoListBuilder_ == null) {
          teamInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo, emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder, emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfoOrBuilder>(
                  teamInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          teamInfoList_ = null;
        }
        return teamInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TeamChainRestartDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:TeamChainRestartDungeonReq)
    private static final emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq();
    }

    public static emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TeamChainRestartDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<TeamChainRestartDungeonReq>() {
      @java.lang.Override
      public TeamChainRestartDungeonReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TeamChainRestartDungeonReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TeamChainRestartDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TeamChainRestartDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TeamChainRestartDungeonReqOuterClass.TeamChainRestartDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TeamChainRestartDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TeamChainRestartDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n TeamChainRestartDungeonReq.proto\032\035Team" +
      "ChainChooseTeamInfo.proto\"N\n\032TeamChainRe" +
      "startDungeonReq\0220\n\016team_info_list\030\t \003(\0132" +
      "\030.TeamChainChooseTeamInfoB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.getDescriptor(),
        });
    internal_static_TeamChainRestartDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TeamChainRestartDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TeamChainRestartDungeonReq_descriptor,
        new java.lang.String[] { "TeamInfoList", });
    emu.grasscutter.net.proto.TeamChainChooseTeamInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
