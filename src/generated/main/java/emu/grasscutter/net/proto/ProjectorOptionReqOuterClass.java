// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProjectorOptionReq.proto

package emu.grasscutter.net.proto;

public final class ProjectorOptionReqOuterClass {
  private ProjectorOptionReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ProjectorOptionReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ProjectorOptionReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 op_type = 5;</code>
     * @return The opType.
     */
    int getOpType();

    /**
     * <code>uint32 entity_id = 1;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * CmdId: 836
   * Obf: HLMNMEGJJAO
   * </pre>
   *
   * Protobuf type {@code ProjectorOptionReq}
   */
  public static final class ProjectorOptionReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ProjectorOptionReq)
      ProjectorOptionReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ProjectorOptionReq.newBuilder() to construct.
    private ProjectorOptionReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ProjectorOptionReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ProjectorOptionReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ProjectorOptionReq(
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
            case 8: {

              entityId_ = input.readUInt32();
              break;
            }
            case 40: {

              opType_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.internal_static_ProjectorOptionReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.internal_static_ProjectorOptionReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq.class, emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq.Builder.class);
    }

    /**
     * Protobuf enum {@code ProjectorOptionReq.OPFNDCJBDLI}
     */
    public enum OPFNDCJBDLI
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>DOENKMNEPFO_PROJECTOR_OP_NONE = 0;</code>
       */
      DOENKMNEPFO_PROJECTOR_OP_NONE(0),
      /**
       * <code>DOENKMNEPFO_PROJECTOR_OP_CREATE = 1;</code>
       */
      DOENKMNEPFO_PROJECTOR_OP_CREATE(1),
      /**
       * <code>DOENKMNEPFO_PROJECTOR_OP_DESTROY = 2;</code>
       */
      DOENKMNEPFO_PROJECTOR_OP_DESTROY(2),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>DOENKMNEPFO_PROJECTOR_OP_NONE = 0;</code>
       */
      public static final int DOENKMNEPFO_PROJECTOR_OP_NONE_VALUE = 0;
      /**
       * <code>DOENKMNEPFO_PROJECTOR_OP_CREATE = 1;</code>
       */
      public static final int DOENKMNEPFO_PROJECTOR_OP_CREATE_VALUE = 1;
      /**
       * <code>DOENKMNEPFO_PROJECTOR_OP_DESTROY = 2;</code>
       */
      public static final int DOENKMNEPFO_PROJECTOR_OP_DESTROY_VALUE = 2;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static OPFNDCJBDLI valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static OPFNDCJBDLI forNumber(int value) {
        switch (value) {
          case 0: return DOENKMNEPFO_PROJECTOR_OP_NONE;
          case 1: return DOENKMNEPFO_PROJECTOR_OP_CREATE;
          case 2: return DOENKMNEPFO_PROJECTOR_OP_DESTROY;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<OPFNDCJBDLI>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          OPFNDCJBDLI> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<OPFNDCJBDLI>() {
              public OPFNDCJBDLI findValueByNumber(int number) {
                return OPFNDCJBDLI.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final OPFNDCJBDLI[] VALUES = values();

      public static OPFNDCJBDLI valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private OPFNDCJBDLI(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ProjectorOptionReq.OPFNDCJBDLI)
    }

    public static final int OP_TYPE_FIELD_NUMBER = 5;
    private int opType_;
    /**
     * <code>uint32 op_type = 5;</code>
     * @return The opType.
     */
    @java.lang.Override
    public int getOpType() {
      return opType_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 1;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 1;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (entityId_ != 0) {
        output.writeUInt32(1, entityId_);
      }
      if (opType_ != 0) {
        output.writeUInt32(5, opType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, entityId_);
      }
      if (opType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, opType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq other = (emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq) obj;

      if (getOpType()
          != other.getOpType()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
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
      hash = (37 * hash) + OP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getOpType();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq prototype) {
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
     * CmdId: 836
     * Obf: HLMNMEGJJAO
     * </pre>
     *
     * Protobuf type {@code ProjectorOptionReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ProjectorOptionReq)
        emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.internal_static_ProjectorOptionReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.internal_static_ProjectorOptionReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq.class, emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq.newBuilder()
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
        opType_ = 0;

        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.internal_static_ProjectorOptionReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq build() {
        emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq buildPartial() {
        emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq result = new emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq(this);
        result.opType_ = opType_;
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq) {
          return mergeFrom((emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq other) {
        if (other == emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq.getDefaultInstance()) return this;
        if (other.getOpType() != 0) {
          setOpType(other.getOpType());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
        emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int opType_ ;
      /**
       * <code>uint32 op_type = 5;</code>
       * @return The opType.
       */
      @java.lang.Override
      public int getOpType() {
        return opType_;
      }
      /**
       * <code>uint32 op_type = 5;</code>
       * @param value The opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpType(int value) {
        
        opType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 op_type = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpType() {
        
        opType_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 1;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 1;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ProjectorOptionReq)
    }

    // @@protoc_insertion_point(class_scope:ProjectorOptionReq)
    private static final emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq();
    }

    public static emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ProjectorOptionReq>
        PARSER = new com.google.protobuf.AbstractParser<ProjectorOptionReq>() {
      @java.lang.Override
      public ProjectorOptionReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProjectorOptionReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ProjectorOptionReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ProjectorOptionReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ProjectorOptionReqOuterClass.ProjectorOptionReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProjectorOptionReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProjectorOptionReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ProjectorOptionReq.proto\"\265\001\n\022Projector" +
      "OptionReq\022\017\n\007op_type\030\005 \001(\r\022\021\n\tentity_id\030" +
      "\001 \001(\r\"{\n\013OPFNDCJBDLI\022!\n\035DOENKMNEPFO_PROJ" +
      "ECTOR_OP_NONE\020\000\022#\n\037DOENKMNEPFO_PROJECTOR" +
      "_OP_CREATE\020\001\022$\n DOENKMNEPFO_PROJECTOR_OP" +
      "_DESTROY\020\002B\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ProjectorOptionReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ProjectorOptionReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProjectorOptionReq_descriptor,
        new java.lang.String[] { "OpType", "EntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
