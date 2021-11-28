// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/swagger/petstore/v2/pet_service.proto

package api.io.swagger.petstore.v2;

/**
 * Protobuf type {@code io.swagger.petstore.v2.FindPetResponse}
 */
public final class FindPetResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.swagger.petstore.v2.FindPetResponse)
    FindPetResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FindPetResponse.newBuilder() to construct.
  private FindPetResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FindPetResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FindPetResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return api.io.swagger.petstore.v2.PetServiceProto.internal_static_io_swagger_petstore_v2_FindPetResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return api.io.swagger.petstore.v2.PetServiceProto.internal_static_io_swagger_petstore_v2_FindPetResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            api.io.swagger.petstore.v2.FindPetResponse.class, api.io.swagger.petstore.v2.FindPetResponse.Builder.class);
  }

  public static final int PET_FIELD_NUMBER = 1;
  private api.io.swagger.petstore.v2.Pet pet_;
  /**
   * <code>.io.swagger.petstore.v2.Pet pet = 1[json_name = "pet"];</code>
   * @return Whether the pet field is set.
   */
  @java.lang.Override
  public boolean hasPet() {
    return pet_ != null;
  }
  /**
   * <code>.io.swagger.petstore.v2.Pet pet = 1[json_name = "pet"];</code>
   * @return The pet.
   */
  @java.lang.Override
  public api.io.swagger.petstore.v2.Pet getPet() {
    return pet_ == null ? api.io.swagger.petstore.v2.Pet.getDefaultInstance() : pet_;
  }
  /**
   * <code>.io.swagger.petstore.v2.Pet pet = 1[json_name = "pet"];</code>
   */
  @java.lang.Override
  public api.io.swagger.petstore.v2.PetOrBuilder getPetOrBuilder() {
    return getPet();
  }

  public static api.io.swagger.petstore.v2.FindPetResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.io.swagger.petstore.v2.FindPetResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.FindPetResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.io.swagger.petstore.v2.FindPetResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.FindPetResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.io.swagger.petstore.v2.FindPetResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.FindPetResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.io.swagger.petstore.v2.FindPetResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.FindPetResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static api.io.swagger.petstore.v2.FindPetResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.FindPetResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.io.swagger.petstore.v2.FindPetResponse parseFrom(
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
  public static Builder newBuilder(api.io.swagger.petstore.v2.FindPetResponse prototype) {
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
   * Protobuf type {@code io.swagger.petstore.v2.FindPetResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.swagger.petstore.v2.FindPetResponse)
      api.io.swagger.petstore.v2.FindPetResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return api.io.swagger.petstore.v2.PetServiceProto.internal_static_io_swagger_petstore_v2_FindPetResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return api.io.swagger.petstore.v2.PetServiceProto.internal_static_io_swagger_petstore_v2_FindPetResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              api.io.swagger.petstore.v2.FindPetResponse.class, api.io.swagger.petstore.v2.FindPetResponse.Builder.class);
    }

    // Construct using api.io.swagger.petstore.v2.FindPetResponse.newBuilder()
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
      if (petBuilder_ == null) {
        pet_ = null;
      } else {
        pet_ = null;
        petBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return api.io.swagger.petstore.v2.PetServiceProto.internal_static_io_swagger_petstore_v2_FindPetResponse_descriptor;
    }

    @java.lang.Override
    public api.io.swagger.petstore.v2.FindPetResponse getDefaultInstanceForType() {
      return api.io.swagger.petstore.v2.FindPetResponse.getDefaultInstance();
    }

    @java.lang.Override
    public api.io.swagger.petstore.v2.FindPetResponse build() {
      api.io.swagger.petstore.v2.FindPetResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public api.io.swagger.petstore.v2.FindPetResponse buildPartial() {
      api.io.swagger.petstore.v2.FindPetResponse result = new api.io.swagger.petstore.v2.FindPetResponse(this);
      if (petBuilder_ == null) {
        result.pet_ = pet_;
      } else {
        result.pet_ = petBuilder_.build();
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

    private api.io.swagger.petstore.v2.Pet pet_;
    private com.google.protobuf.SingleFieldBuilderV3<
        api.io.swagger.petstore.v2.Pet, api.io.swagger.petstore.v2.Pet.Builder, api.io.swagger.petstore.v2.PetOrBuilder> petBuilder_;
    /**
     * <code>.io.swagger.petstore.v2.Pet pet = 1[json_name = "pet"];</code>
     * @return Whether the pet field is set.
     */
    public boolean hasPet() {
      return petBuilder_ != null || pet_ != null;
    }
    /**
     * <code>.io.swagger.petstore.v2.Pet pet = 1[json_name = "pet"];</code>
     * @return The pet.
     */
    public api.io.swagger.petstore.v2.Pet getPet() {
      if (petBuilder_ == null) {
        return pet_ == null ? api.io.swagger.petstore.v2.Pet.getDefaultInstance() : pet_;
      } else {
        return petBuilder_.getMessage();
      }
    }
    /**
     * <code>.io.swagger.petstore.v2.Pet pet = 1[json_name = "pet"];</code>
     */
    public Builder setPet(api.io.swagger.petstore.v2.Pet value) {
      if (petBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pet_ = value;
        onChanged();
      } else {
        petBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.io.swagger.petstore.v2.Pet pet = 1[json_name = "pet"];</code>
     */
    public Builder setPet(
        api.io.swagger.petstore.v2.Pet.Builder builderForValue) {
      if (petBuilder_ == null) {
        pet_ = builderForValue.build();
        onChanged();
      } else {
        petBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.io.swagger.petstore.v2.Pet pet = 1[json_name = "pet"];</code>
     */
    public Builder mergePet(api.io.swagger.petstore.v2.Pet value) {
      if (petBuilder_ == null) {
        if (pet_ != null) {
          pet_ =
            api.io.swagger.petstore.v2.Pet.newBuilder(pet_).mergeFrom(value).buildPartial();
        } else {
          pet_ = value;
        }
        onChanged();
      } else {
        petBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.io.swagger.petstore.v2.Pet pet = 1[json_name = "pet"];</code>
     */
    public Builder clearPet() {
      if (petBuilder_ == null) {
        pet_ = null;
        onChanged();
      } else {
        pet_ = null;
        petBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.io.swagger.petstore.v2.Pet pet = 1[json_name = "pet"];</code>
     */
    public api.io.swagger.petstore.v2.Pet.Builder getPetBuilder() {
      
      onChanged();
      return getPetFieldBuilder().getBuilder();
    }
    /**
     * <code>.io.swagger.petstore.v2.Pet pet = 1[json_name = "pet"];</code>
     */
    public api.io.swagger.petstore.v2.PetOrBuilder getPetOrBuilder() {
      if (petBuilder_ != null) {
        return petBuilder_.getMessageOrBuilder();
      } else {
        return pet_ == null ?
            api.io.swagger.petstore.v2.Pet.getDefaultInstance() : pet_;
      }
    }
    /**
     * <code>.io.swagger.petstore.v2.Pet pet = 1[json_name = "pet"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        api.io.swagger.petstore.v2.Pet, api.io.swagger.petstore.v2.Pet.Builder, api.io.swagger.petstore.v2.PetOrBuilder> 
        getPetFieldBuilder() {
      if (petBuilder_ == null) {
        petBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            api.io.swagger.petstore.v2.Pet, api.io.swagger.petstore.v2.Pet.Builder, api.io.swagger.petstore.v2.PetOrBuilder>(
                getPet(),
                getParentForChildren(),
                isClean());
        pet_ = null;
      }
      return petBuilder_;
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


    // @@protoc_insertion_point(builder_scope:io.swagger.petstore.v2.FindPetResponse)
  }

  // @@protoc_insertion_point(class_scope:io.swagger.petstore.v2.FindPetResponse)
  private static final api.io.swagger.petstore.v2.FindPetResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new api.io.swagger.petstore.v2.FindPetResponse();
  }

  public static api.io.swagger.petstore.v2.FindPetResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindPetResponse>
      PARSER = new com.google.protobuf.AbstractParser<FindPetResponse>() {
    @java.lang.Override
    public FindPetResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<FindPetResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindPetResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public api.io.swagger.petstore.v2.FindPetResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

