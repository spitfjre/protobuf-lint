// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/swagger/petstore/v2/pet_service.proto

package api.io.swagger.petstore.v2;

/**
 * Protobuf type {@code io.swagger.petstore.v2.UpdatePetWithFormDataRequest}
 */
public final class UpdatePetWithFormDataRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.swagger.petstore.v2.UpdatePetWithFormDataRequest)
    UpdatePetWithFormDataRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdatePetWithFormDataRequest.newBuilder() to construct.
  private UpdatePetWithFormDataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdatePetWithFormDataRequest() {
    name_ = "";
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdatePetWithFormDataRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return api.io.swagger.petstore.v2.PetServiceProto.internal_static_io_swagger_petstore_v2_UpdatePetWithFormDataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return api.io.swagger.petstore.v2.PetServiceProto.internal_static_io_swagger_petstore_v2_UpdatePetWithFormDataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest.class, api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest.Builder.class);
  }

  public static final int PET_ID_FIELD_NUMBER = 1;
  private long petId_;
  /**
   * <code>int64 pet_id = 1[json_name = "petId"];</code>
   * @return The petId.
   */
  @java.lang.Override
  public long getPetId() {
    return petId_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2[json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2[json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <code>.io.swagger.petstore.v2.Pet.Status status = 3[json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.io.swagger.petstore.v2.Pet.Status status = 3[json_name = "status"];</code>
   * @return The status.
   */
  @java.lang.Override public api.io.swagger.petstore.v2.Pet.Status getStatus() {
    @SuppressWarnings("deprecation")
    api.io.swagger.petstore.v2.Pet.Status result = api.io.swagger.petstore.v2.Pet.Status.valueOf(status_);
    return result == null ? api.io.swagger.petstore.v2.Pet.Status.UNRECOGNIZED : result;
  }

  public static api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest parseFrom(
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
  public static Builder newBuilder(api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest prototype) {
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
   * Protobuf type {@code io.swagger.petstore.v2.UpdatePetWithFormDataRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.swagger.petstore.v2.UpdatePetWithFormDataRequest)
      api.io.swagger.petstore.v2.UpdatePetWithFormDataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return api.io.swagger.petstore.v2.PetServiceProto.internal_static_io_swagger_petstore_v2_UpdatePetWithFormDataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return api.io.swagger.petstore.v2.PetServiceProto.internal_static_io_swagger_petstore_v2_UpdatePetWithFormDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest.class, api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest.Builder.class);
    }

    // Construct using api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest.newBuilder()
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
      petId_ = 0L;

      name_ = "";

      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return api.io.swagger.petstore.v2.PetServiceProto.internal_static_io_swagger_petstore_v2_UpdatePetWithFormDataRequest_descriptor;
    }

    @java.lang.Override
    public api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest getDefaultInstanceForType() {
      return api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest.getDefaultInstance();
    }

    @java.lang.Override
    public api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest build() {
      api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest buildPartial() {
      api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest result = new api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest(this);
      result.petId_ = petId_;
      result.name_ = name_;
      result.status_ = status_;
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

    private long petId_ ;
    /**
     * <code>int64 pet_id = 1[json_name = "petId"];</code>
     * @return The petId.
     */
    @java.lang.Override
    public long getPetId() {
      return petId_;
    }
    /**
     * <code>int64 pet_id = 1[json_name = "petId"];</code>
     * @param value The petId to set.
     * @return This builder for chaining.
     */
    public Builder setPetId(long value) {
      
      petId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 pet_id = 1[json_name = "petId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPetId() {
      
      petId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2[json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2[json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2[json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2[json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2[json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.io.swagger.petstore.v2.Pet.Status status = 3[json_name = "status"];</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.io.swagger.petstore.v2.Pet.Status status = 3[json_name = "status"];</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.io.swagger.petstore.v2.Pet.Status status = 3[json_name = "status"];</code>
     * @return The status.
     */
    @java.lang.Override
    public api.io.swagger.petstore.v2.Pet.Status getStatus() {
      @SuppressWarnings("deprecation")
      api.io.swagger.petstore.v2.Pet.Status result = api.io.swagger.petstore.v2.Pet.Status.valueOf(status_);
      return result == null ? api.io.swagger.petstore.v2.Pet.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.io.swagger.petstore.v2.Pet.Status status = 3[json_name = "status"];</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(api.io.swagger.petstore.v2.Pet.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.io.swagger.petstore.v2.Pet.Status status = 3[json_name = "status"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:io.swagger.petstore.v2.UpdatePetWithFormDataRequest)
  }

  // @@protoc_insertion_point(class_scope:io.swagger.petstore.v2.UpdatePetWithFormDataRequest)
  private static final api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest();
  }

  public static api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdatePetWithFormDataRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdatePetWithFormDataRequest>() {
    @java.lang.Override
    public UpdatePetWithFormDataRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdatePetWithFormDataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdatePetWithFormDataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
