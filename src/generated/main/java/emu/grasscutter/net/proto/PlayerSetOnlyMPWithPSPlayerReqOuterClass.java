// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerSetOnlyMPWithPSPlayerReq.proto

package emu.grasscutter.net.proto;

public final class PlayerSetOnlyMPWithPSPlayerReqOuterClass {
  private PlayerSetOnlyMPWithPSPlayerReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerSetOnlyMPWithPSPlayerReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerSetOnlyMPWithPSPlayerReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_only = 10;</code>
     * @return The isOnly.
     */
    boolean getIsOnly();
  }
  /**
   * <pre>
   * CmdId: 1803
   * Obf: KCJCIPDIJBO
   * </pre>
   *
   * Protobuf type {@code PlayerSetOnlyMPWithPSPlayerReq}
   */
  public static final class PlayerSetOnlyMPWithPSPlayerReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerSetOnlyMPWithPSPlayerReq)
      PlayerSetOnlyMPWithPSPlayerReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerSetOnlyMPWithPSPlayerReq.newBuilder() to construct.
    private PlayerSetOnlyMPWithPSPlayerReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerSetOnlyMPWithPSPlayerReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerSetOnlyMPWithPSPlayerReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerSetOnlyMPWithPSPlayerReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 80: {

              isOnly_ = input.readBool();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.internal_static_PlayerSetOnlyMPWithPSPlayerReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.internal_static_PlayerSetOnlyMPWithPSPlayerReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq.class, emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq.Builder.class);
    }

    public static final int IS_ONLY_FIELD_NUMBER = 10;
    private boolean isOnly_;
    /**
     * <code>bool is_only = 10;</code>
     * @return The isOnly.
     */
    @java.lang.Override
    public boolean getIsOnly() {
      return isOnly_;
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
      if (isOnly_ != false) {
        output.writeBool(10, isOnly_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isOnly_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isOnly_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq other = (emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq) obj;

      if (getIsOnly()
          != other.getIsOnly()) return false;
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
      hash = (37 * hash) + IS_ONLY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOnly());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq prototype) {
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
     * CmdId: 1803
     * Obf: KCJCIPDIJBO
     * </pre>
     *
     * Protobuf type {@code PlayerSetOnlyMPWithPSPlayerReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerSetOnlyMPWithPSPlayerReq)
        emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.internal_static_PlayerSetOnlyMPWithPSPlayerReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.internal_static_PlayerSetOnlyMPWithPSPlayerReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq.class, emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq.newBuilder()
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
        isOnly_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.internal_static_PlayerSetOnlyMPWithPSPlayerReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq build() {
        emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq buildPartial() {
        emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq result = new emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq(this);
        result.isOnly_ = isOnly_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq other) {
        if (other == emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq.getDefaultInstance()) return this;
        if (other.getIsOnly() != false) {
          setIsOnly(other.getIsOnly());
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
        emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isOnly_ ;
      /**
       * <code>bool is_only = 10;</code>
       * @return The isOnly.
       */
      @java.lang.Override
      public boolean getIsOnly() {
        return isOnly_;
      }
      /**
       * <code>bool is_only = 10;</code>
       * @param value The isOnly to set.
       * @return This builder for chaining.
       */
      public Builder setIsOnly(boolean value) {
        
        isOnly_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_only = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOnly() {
        
        isOnly_ = false;
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


      // @@protoc_insertion_point(builder_scope:PlayerSetOnlyMPWithPSPlayerReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerSetOnlyMPWithPSPlayerReq)
    private static final emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq();
    }

    public static emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerSetOnlyMPWithPSPlayerReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerSetOnlyMPWithPSPlayerReq>() {
      @java.lang.Override
      public PlayerSetOnlyMPWithPSPlayerReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerSetOnlyMPWithPSPlayerReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerSetOnlyMPWithPSPlayerReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerSetOnlyMPWithPSPlayerReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerSetOnlyMPWithPSPlayerReqOuterClass.PlayerSetOnlyMPWithPSPlayerReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerSetOnlyMPWithPSPlayerReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerSetOnlyMPWithPSPlayerReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$PlayerSetOnlyMPWithPSPlayerReq.proto\"1" +
      "\n\036PlayerSetOnlyMPWithPSPlayerReq\022\017\n\007is_o" +
      "nly\030\n \001(\010B\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerSetOnlyMPWithPSPlayerReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerSetOnlyMPWithPSPlayerReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerSetOnlyMPWithPSPlayerReq_descriptor,
        new java.lang.String[] { "IsOnly", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
