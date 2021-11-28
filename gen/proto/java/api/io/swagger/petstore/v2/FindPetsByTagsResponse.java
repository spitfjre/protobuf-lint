// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/swagger/petstore/v2/pet_service.proto

package api.io.swagger.petstore.v2;

/**
 * Protobuf type {@code io.swagger.petstore.v2.FindPetsByTagsResponse}
 */
public final class FindPetsByTagsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.swagger.petstore.v2.FindPetsByTagsResponse)
    FindPetsByTagsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FindPetsByTagsResponse.newBuilder() to construct.
  private FindPetsByTagsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FindPetsByTagsResponse() {
    pets_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FindPetsByTagsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return api.io.swagger.petstore.v2.PetServiceProto.internal_static_io_swagger_petstore_v2_FindPetsByTagsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return api.io.swagger.petstore.v2.PetServiceProto.internal_static_io_swagger_petstore_v2_FindPetsByTagsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            api.io.swagger.petstore.v2.FindPetsByTagsResponse.class, api.io.swagger.petstore.v2.FindPetsByTagsResponse.Builder.class);
  }

  public static final int PETS_FIELD_NUMBER = 1;
  private java.util.List<api.io.swagger.petstore.v2.Pet> pets_;
  /**
   * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
   */
  @java.lang.Override
  public java.util.List<api.io.swagger.petstore.v2.Pet> getPetsList() {
    return pets_;
  }
  /**
   * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends api.io.swagger.petstore.v2.PetOrBuilder> 
      getPetsOrBuilderList() {
    return pets_;
  }
  /**
   * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
   */
  @java.lang.Override
  public int getPetsCount() {
    return pets_.size();
  }
  /**
   * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
   */
  @java.lang.Override
  public api.io.swagger.petstore.v2.Pet getPets(int index) {
    return pets_.get(index);
  }
  /**
   * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
   */
  @java.lang.Override
  public api.io.swagger.petstore.v2.PetOrBuilder getPetsOrBuilder(
      int index) {
    return pets_.get(index);
  }

  public static api.io.swagger.petstore.v2.FindPetsByTagsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.io.swagger.petstore.v2.FindPetsByTagsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.FindPetsByTagsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.io.swagger.petstore.v2.FindPetsByTagsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.FindPetsByTagsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.io.swagger.petstore.v2.FindPetsByTagsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.FindPetsByTagsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.io.swagger.petstore.v2.FindPetsByTagsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.FindPetsByTagsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static api.io.swagger.petstore.v2.FindPetsByTagsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.FindPetsByTagsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.io.swagger.petstore.v2.FindPetsByTagsResponse parseFrom(
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
  public static Builder newBuilder(api.io.swagger.petstore.v2.FindPetsByTagsResponse prototype) {
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
   * Protobuf type {@code io.swagger.petstore.v2.FindPetsByTagsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.swagger.petstore.v2.FindPetsByTagsResponse)
      api.io.swagger.petstore.v2.FindPetsByTagsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return api.io.swagger.petstore.v2.PetServiceProto.internal_static_io_swagger_petstore_v2_FindPetsByTagsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return api.io.swagger.petstore.v2.PetServiceProto.internal_static_io_swagger_petstore_v2_FindPetsByTagsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              api.io.swagger.petstore.v2.FindPetsByTagsResponse.class, api.io.swagger.petstore.v2.FindPetsByTagsResponse.Builder.class);
    }

    // Construct using api.io.swagger.petstore.v2.FindPetsByTagsResponse.newBuilder()
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
        getPetsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (petsBuilder_ == null) {
        pets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        petsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return api.io.swagger.petstore.v2.PetServiceProto.internal_static_io_swagger_petstore_v2_FindPetsByTagsResponse_descriptor;
    }

    @java.lang.Override
    public api.io.swagger.petstore.v2.FindPetsByTagsResponse getDefaultInstanceForType() {
      return api.io.swagger.petstore.v2.FindPetsByTagsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public api.io.swagger.petstore.v2.FindPetsByTagsResponse build() {
      api.io.swagger.petstore.v2.FindPetsByTagsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public api.io.swagger.petstore.v2.FindPetsByTagsResponse buildPartial() {
      api.io.swagger.petstore.v2.FindPetsByTagsResponse result = new api.io.swagger.petstore.v2.FindPetsByTagsResponse(this);
      int from_bitField0_ = bitField0_;
      if (petsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          pets_ = java.util.Collections.unmodifiableList(pets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pets_ = pets_;
      } else {
        result.pets_ = petsBuilder_.build();
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
    private int bitField0_;

    private java.util.List<api.io.swagger.petstore.v2.Pet> pets_ =
      java.util.Collections.emptyList();
    private void ensurePetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pets_ = new java.util.ArrayList<api.io.swagger.petstore.v2.Pet>(pets_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        api.io.swagger.petstore.v2.Pet, api.io.swagger.petstore.v2.Pet.Builder, api.io.swagger.petstore.v2.PetOrBuilder> petsBuilder_;

    /**
     * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
     */
    public java.util.List<api.io.swagger.petstore.v2.Pet> getPetsList() {
      if (petsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pets_);
      } else {
        return petsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
     */
    public int getPetsCount() {
      if (petsBuilder_ == null) {
        return pets_.size();
      } else {
        return petsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
     */
    public api.io.swagger.petstore.v2.Pet getPets(int index) {
      if (petsBuilder_ == null) {
        return pets_.get(index);
      } else {
        return petsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
     */
    public Builder setPets(
        int index, api.io.swagger.petstore.v2.Pet value) {
      if (petsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePetsIsMutable();
        pets_.set(index, value);
        onChanged();
      } else {
        petsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
     */
    public Builder setPets(
        int index, api.io.swagger.petstore.v2.Pet.Builder builderForValue) {
      if (petsBuilder_ == null) {
        ensurePetsIsMutable();
        pets_.set(index, builderForValue.build());
        onChanged();
      } else {
        petsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
     */
    public Builder addPets(api.io.swagger.petstore.v2.Pet value) {
      if (petsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePetsIsMutable();
        pets_.add(value);
        onChanged();
      } else {
        petsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
     */
    public Builder addPets(
        int index, api.io.swagger.petstore.v2.Pet value) {
      if (petsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePetsIsMutable();
        pets_.add(index, value);
        onChanged();
      } else {
        petsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
     */
    public Builder addPets(
        api.io.swagger.petstore.v2.Pet.Builder builderForValue) {
      if (petsBuilder_ == null) {
        ensurePetsIsMutable();
        pets_.add(builderForValue.build());
        onChanged();
      } else {
        petsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
     */
    public Builder addPets(
        int index, api.io.swagger.petstore.v2.Pet.Builder builderForValue) {
      if (petsBuilder_ == null) {
        ensurePetsIsMutable();
        pets_.add(index, builderForValue.build());
        onChanged();
      } else {
        petsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
     */
    public Builder addAllPets(
        java.lang.Iterable<? extends api.io.swagger.petstore.v2.Pet> values) {
      if (petsBuilder_ == null) {
        ensurePetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pets_);
        onChanged();
      } else {
        petsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
     */
    public Builder clearPets() {
      if (petsBuilder_ == null) {
        pets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        petsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
     */
    public Builder removePets(int index) {
      if (petsBuilder_ == null) {
        ensurePetsIsMutable();
        pets_.remove(index);
        onChanged();
      } else {
        petsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
     */
    public api.io.swagger.petstore.v2.Pet.Builder getPetsBuilder(
        int index) {
      return getPetsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
     */
    public api.io.swagger.petstore.v2.PetOrBuilder getPetsOrBuilder(
        int index) {
      if (petsBuilder_ == null) {
        return pets_.get(index);  } else {
        return petsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
     */
    public java.util.List<? extends api.io.swagger.petstore.v2.PetOrBuilder> 
         getPetsOrBuilderList() {
      if (petsBuilder_ != null) {
        return petsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pets_);
      }
    }
    /**
     * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
     */
    public api.io.swagger.petstore.v2.Pet.Builder addPetsBuilder() {
      return getPetsFieldBuilder().addBuilder(
          api.io.swagger.petstore.v2.Pet.getDefaultInstance());
    }
    /**
     * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
     */
    public api.io.swagger.petstore.v2.Pet.Builder addPetsBuilder(
        int index) {
      return getPetsFieldBuilder().addBuilder(
          index, api.io.swagger.petstore.v2.Pet.getDefaultInstance());
    }
    /**
     * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
     */
    public java.util.List<api.io.swagger.petstore.v2.Pet.Builder> 
         getPetsBuilderList() {
      return getPetsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        api.io.swagger.petstore.v2.Pet, api.io.swagger.petstore.v2.Pet.Builder, api.io.swagger.petstore.v2.PetOrBuilder> 
        getPetsFieldBuilder() {
      if (petsBuilder_ == null) {
        petsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            api.io.swagger.petstore.v2.Pet, api.io.swagger.petstore.v2.Pet.Builder, api.io.swagger.petstore.v2.PetOrBuilder>(
                pets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        pets_ = null;
      }
      return petsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:io.swagger.petstore.v2.FindPetsByTagsResponse)
  }

  // @@protoc_insertion_point(class_scope:io.swagger.petstore.v2.FindPetsByTagsResponse)
  private static final api.io.swagger.petstore.v2.FindPetsByTagsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new api.io.swagger.petstore.v2.FindPetsByTagsResponse();
  }

  public static api.io.swagger.petstore.v2.FindPetsByTagsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindPetsByTagsResponse>
      PARSER = new com.google.protobuf.AbstractParser<FindPetsByTagsResponse>() {
    @java.lang.Override
    public FindPetsByTagsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(
                builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<FindPetsByTagsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindPetsByTagsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public api.io.swagger.petstore.v2.FindPetsByTagsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

