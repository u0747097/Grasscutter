// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GalleryFallScoreNotify.proto

package emu.grasscutter.net.proto;

public final class GalleryFallScoreNotifyOuterClass {
  private GalleryFallScoreNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GalleryFallScoreNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GalleryFallScoreNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .FallPlayerBrief&gt; uid_brief_map = 13;</code>
     */
    int getUidBriefMapCount();
    /**
     * <code>map&lt;uint32, .FallPlayerBrief&gt; uid_brief_map = 13;</code>
     */
    boolean containsUidBriefMap(
        int key);
    /**
     * Use {@link #getUidBriefMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief>
    getUidBriefMap();
    /**
     * <code>map&lt;uint32, .FallPlayerBrief&gt; uid_brief_map = 13;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief>
    getUidBriefMapMap();
    /**
     * <code>map&lt;uint32, .FallPlayerBrief&gt; uid_brief_map = 13;</code>
     */

    emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief getUidBriefMapOrDefault(
        int key,
        emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief defaultValue);
    /**
     * <code>map&lt;uint32, .FallPlayerBrief&gt; uid_brief_map = 13;</code>
     */

    emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief getUidBriefMapOrThrow(
        int key);

    /**
     * <code>uint32 gallery_id = 3;</code>
     * @return The galleryId.
     */
    int getGalleryId();
  }
  /**
   * <pre>
   * CmdId: 5548
   * Obf: AEFOEBDICOD
   * </pre>
   *
   * Protobuf type {@code GalleryFallScoreNotify}
   */
  public static final class GalleryFallScoreNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GalleryFallScoreNotify)
      GalleryFallScoreNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GalleryFallScoreNotify.newBuilder() to construct.
    private GalleryFallScoreNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GalleryFallScoreNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GalleryFallScoreNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GalleryFallScoreNotify(
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
            case 24: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 106: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                uidBriefMap_ = com.google.protobuf.MapField.newMapField(
                    UidBriefMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief>
              uidBriefMap__ = input.readMessage(
                  UidBriefMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              uidBriefMap_.getMutableMap().put(
                  uidBriefMap__.getKey(), uidBriefMap__.getValue());
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
      return emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.internal_static_GalleryFallScoreNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 13:
          return internalGetUidBriefMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.internal_static_GalleryFallScoreNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify.class, emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify.Builder.class);
    }

    public static final int UID_BRIEF_MAP_FIELD_NUMBER = 13;
    private static final class UidBriefMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief>newDefaultInstance(
                  emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.internal_static_GalleryFallScoreNotify_UidBriefMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief> uidBriefMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief>
    internalGetUidBriefMap() {
      if (uidBriefMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            UidBriefMapDefaultEntryHolder.defaultEntry);
      }
      return uidBriefMap_;
    }

    public int getUidBriefMapCount() {
      return internalGetUidBriefMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .FallPlayerBrief&gt; uid_brief_map = 13;</code>
     */

    @java.lang.Override
    public boolean containsUidBriefMap(
        int key) {
      
      return internalGetUidBriefMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getUidBriefMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief> getUidBriefMap() {
      return getUidBriefMapMap();
    }
    /**
     * <code>map&lt;uint32, .FallPlayerBrief&gt; uid_brief_map = 13;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief> getUidBriefMapMap() {
      return internalGetUidBriefMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .FallPlayerBrief&gt; uid_brief_map = 13;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief getUidBriefMapOrDefault(
        int key,
        emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief> map =
          internalGetUidBriefMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .FallPlayerBrief&gt; uid_brief_map = 13;</code>
     */
    @java.lang.Override

    public emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief getUidBriefMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief> map =
          internalGetUidBriefMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 3;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 3;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
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
      if (galleryId_ != 0) {
        output.writeUInt32(3, galleryId_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetUidBriefMap(),
          UidBriefMapDefaultEntryHolder.defaultEntry,
          13);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, galleryId_);
      }
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief> entry
           : internalGetUidBriefMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief>
        uidBriefMap__ = UidBriefMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(13, uidBriefMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify other = (emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify) obj;

      if (!internalGetUidBriefMap().equals(
          other.internalGetUidBriefMap())) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
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
      if (!internalGetUidBriefMap().getMap().isEmpty()) {
        hash = (37 * hash) + UID_BRIEF_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetUidBriefMap().hashCode();
      }
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify prototype) {
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
     * CmdId: 5548
     * Obf: AEFOEBDICOD
     * </pre>
     *
     * Protobuf type {@code GalleryFallScoreNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GalleryFallScoreNotify)
        emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.internal_static_GalleryFallScoreNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 13:
            return internalGetUidBriefMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 13:
            return internalGetMutableUidBriefMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.internal_static_GalleryFallScoreNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify.class, emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify.newBuilder()
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
        internalGetMutableUidBriefMap().clear();
        galleryId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.internal_static_GalleryFallScoreNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify build() {
        emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify buildPartial() {
        emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify result = new emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify(this);
        int from_bitField0_ = bitField0_;
        result.uidBriefMap_ = internalGetUidBriefMap();
        result.uidBriefMap_.makeImmutable();
        result.galleryId_ = galleryId_;
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
        if (other instanceof emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify other) {
        if (other == emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify.getDefaultInstance()) return this;
        internalGetMutableUidBriefMap().mergeFrom(
            other.internalGetUidBriefMap());
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
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
        emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief> uidBriefMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief>
      internalGetUidBriefMap() {
        if (uidBriefMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              UidBriefMapDefaultEntryHolder.defaultEntry);
        }
        return uidBriefMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief>
      internalGetMutableUidBriefMap() {
        onChanged();;
        if (uidBriefMap_ == null) {
          uidBriefMap_ = com.google.protobuf.MapField.newMapField(
              UidBriefMapDefaultEntryHolder.defaultEntry);
        }
        if (!uidBriefMap_.isMutable()) {
          uidBriefMap_ = uidBriefMap_.copy();
        }
        return uidBriefMap_;
      }

      public int getUidBriefMapCount() {
        return internalGetUidBriefMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .FallPlayerBrief&gt; uid_brief_map = 13;</code>
       */

      @java.lang.Override
      public boolean containsUidBriefMap(
          int key) {
        
        return internalGetUidBriefMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getUidBriefMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief> getUidBriefMap() {
        return getUidBriefMapMap();
      }
      /**
       * <code>map&lt;uint32, .FallPlayerBrief&gt; uid_brief_map = 13;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief> getUidBriefMapMap() {
        return internalGetUidBriefMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .FallPlayerBrief&gt; uid_brief_map = 13;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief getUidBriefMapOrDefault(
          int key,
          emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief> map =
            internalGetUidBriefMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .FallPlayerBrief&gt; uid_brief_map = 13;</code>
       */
      @java.lang.Override

      public emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief getUidBriefMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief> map =
            internalGetUidBriefMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearUidBriefMap() {
        internalGetMutableUidBriefMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .FallPlayerBrief&gt; uid_brief_map = 13;</code>
       */

      public Builder removeUidBriefMap(
          int key) {
        
        internalGetMutableUidBriefMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief>
      getMutableUidBriefMap() {
        return internalGetMutableUidBriefMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .FallPlayerBrief&gt; uid_brief_map = 13;</code>
       */
      public Builder putUidBriefMap(
          int key,
          emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableUidBriefMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .FallPlayerBrief&gt; uid_brief_map = 13;</code>
       */

      public Builder putAllUidBriefMap(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.FallPlayerBriefOuterClass.FallPlayerBrief> values) {
        internalGetMutableUidBriefMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 3;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 3;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GalleryFallScoreNotify)
    }

    // @@protoc_insertion_point(class_scope:GalleryFallScoreNotify)
    private static final emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify();
    }

    public static emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GalleryFallScoreNotify>
        PARSER = new com.google.protobuf.AbstractParser<GalleryFallScoreNotify>() {
      @java.lang.Override
      public GalleryFallScoreNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GalleryFallScoreNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GalleryFallScoreNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GalleryFallScoreNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GalleryFallScoreNotifyOuterClass.GalleryFallScoreNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GalleryFallScoreNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GalleryFallScoreNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GalleryFallScoreNotify_UidBriefMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GalleryFallScoreNotify_UidBriefMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GalleryFallScoreNotify.proto\032\025FallPlay" +
      "erBrief.proto\"\263\001\n\026GalleryFallScoreNotify" +
      "\022?\n\ruid_brief_map\030\r \003(\0132(.GalleryFallSco" +
      "reNotify.UidBriefMapEntry\022\022\n\ngallery_id\030" +
      "\003 \001(\r\032D\n\020UidBriefMapEntry\022\013\n\003key\030\001 \001(\r\022\037" +
      "\n\005value\030\002 \001(\0132\020.FallPlayerBrief:\0028\001B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FallPlayerBriefOuterClass.getDescriptor(),
        });
    internal_static_GalleryFallScoreNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GalleryFallScoreNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GalleryFallScoreNotify_descriptor,
        new java.lang.String[] { "UidBriefMap", "GalleryId", });
    internal_static_GalleryFallScoreNotify_UidBriefMapEntry_descriptor =
      internal_static_GalleryFallScoreNotify_descriptor.getNestedTypes().get(0);
    internal_static_GalleryFallScoreNotify_UidBriefMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GalleryFallScoreNotify_UidBriefMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.FallPlayerBriefOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
