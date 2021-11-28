// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/swagger/petstore/v2/store_service.proto

package api.io.swagger.petstore.v2;

/**
 * Protobuf type {@code io.swagger.petstore.v2.CreateOrderResponse}
 */
public final class CreateOrderResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.swagger.petstore.v2.CreateOrderResponse)
    CreateOrderResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateOrderResponse.newBuilder() to construct.
  private CreateOrderResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateOrderResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateOrderResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return api.io.swagger.petstore.v2.StoreServiceProto.internal_static_io_swagger_petstore_v2_CreateOrderResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return api.io.swagger.petstore.v2.StoreServiceProto.internal_static_io_swagger_petstore_v2_CreateOrderResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            api.io.swagger.petstore.v2.CreateOrderResponse.class, api.io.swagger.petstore.v2.CreateOrderResponse.Builder.class);
  }

  public static final int ORDER_FIELD_NUMBER = 1;
  private api.io.swagger.petstore.v2.Order order_;
  /**
   * <code>.io.swagger.petstore.v2.Order order = 1[json_name = "order"];</code>
   * @return Whether the order field is set.
   */
  @java.lang.Override
  public boolean hasOrder() {
    return order_ != null;
  }
  /**
   * <code>.io.swagger.petstore.v2.Order order = 1[json_name = "order"];</code>
   * @return The order.
   */
  @java.lang.Override
  public api.io.swagger.petstore.v2.Order getOrder() {
    return order_ == null ? api.io.swagger.petstore.v2.Order.getDefaultInstance() : order_;
  }
  /**
   * <code>.io.swagger.petstore.v2.Order order = 1[json_name = "order"];</code>
   */
  @java.lang.Override
  public api.io.swagger.petstore.v2.OrderOrBuilder getOrderOrBuilder() {
    return getOrder();
  }

  public static api.io.swagger.petstore.v2.CreateOrderResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.io.swagger.petstore.v2.CreateOrderResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.CreateOrderResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.io.swagger.petstore.v2.CreateOrderResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.CreateOrderResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.io.swagger.petstore.v2.CreateOrderResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.CreateOrderResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.io.swagger.petstore.v2.CreateOrderResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.CreateOrderResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static api.io.swagger.petstore.v2.CreateOrderResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.CreateOrderResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.io.swagger.petstore.v2.CreateOrderResponse parseFrom(
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
  public static Builder newBuilder(api.io.swagger.petstore.v2.CreateOrderResponse prototype) {
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
   * Protobuf type {@code io.swagger.petstore.v2.CreateOrderResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.swagger.petstore.v2.CreateOrderResponse)
      api.io.swagger.petstore.v2.CreateOrderResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return api.io.swagger.petstore.v2.StoreServiceProto.internal_static_io_swagger_petstore_v2_CreateOrderResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return api.io.swagger.petstore.v2.StoreServiceProto.internal_static_io_swagger_petstore_v2_CreateOrderResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              api.io.swagger.petstore.v2.CreateOrderResponse.class, api.io.swagger.petstore.v2.CreateOrderResponse.Builder.class);
    }

    // Construct using api.io.swagger.petstore.v2.CreateOrderResponse.newBuilder()
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
      if (orderBuilder_ == null) {
        order_ = null;
      } else {
        order_ = null;
        orderBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return api.io.swagger.petstore.v2.StoreServiceProto.internal_static_io_swagger_petstore_v2_CreateOrderResponse_descriptor;
    }

    @java.lang.Override
    public api.io.swagger.petstore.v2.CreateOrderResponse getDefaultInstanceForType() {
      return api.io.swagger.petstore.v2.CreateOrderResponse.getDefaultInstance();
    }

    @java.lang.Override
    public api.io.swagger.petstore.v2.CreateOrderResponse build() {
      api.io.swagger.petstore.v2.CreateOrderResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public api.io.swagger.petstore.v2.CreateOrderResponse buildPartial() {
      api.io.swagger.petstore.v2.CreateOrderResponse result = new api.io.swagger.petstore.v2.CreateOrderResponse(this);
      if (orderBuilder_ == null) {
        result.order_ = order_;
      } else {
        result.order_ = orderBuilder_.build();
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

    private api.io.swagger.petstore.v2.Order order_;
    private com.google.protobuf.SingleFieldBuilderV3<
        api.io.swagger.petstore.v2.Order, api.io.swagger.petstore.v2.Order.Builder, api.io.swagger.petstore.v2.OrderOrBuilder> orderBuilder_;
    /**
     * <code>.io.swagger.petstore.v2.Order order = 1[json_name = "order"];</code>
     * @return Whether the order field is set.
     */
    public boolean hasOrder() {
      return orderBuilder_ != null || order_ != null;
    }
    /**
     * <code>.io.swagger.petstore.v2.Order order = 1[json_name = "order"];</code>
     * @return The order.
     */
    public api.io.swagger.petstore.v2.Order getOrder() {
      if (orderBuilder_ == null) {
        return order_ == null ? api.io.swagger.petstore.v2.Order.getDefaultInstance() : order_;
      } else {
        return orderBuilder_.getMessage();
      }
    }
    /**
     * <code>.io.swagger.petstore.v2.Order order = 1[json_name = "order"];</code>
     */
    public Builder setOrder(api.io.swagger.petstore.v2.Order value) {
      if (orderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        order_ = value;
        onChanged();
      } else {
        orderBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.io.swagger.petstore.v2.Order order = 1[json_name = "order"];</code>
     */
    public Builder setOrder(
        api.io.swagger.petstore.v2.Order.Builder builderForValue) {
      if (orderBuilder_ == null) {
        order_ = builderForValue.build();
        onChanged();
      } else {
        orderBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.io.swagger.petstore.v2.Order order = 1[json_name = "order"];</code>
     */
    public Builder mergeOrder(api.io.swagger.petstore.v2.Order value) {
      if (orderBuilder_ == null) {
        if (order_ != null) {
          order_ =
            api.io.swagger.petstore.v2.Order.newBuilder(order_).mergeFrom(value).buildPartial();
        } else {
          order_ = value;
        }
        onChanged();
      } else {
        orderBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.io.swagger.petstore.v2.Order order = 1[json_name = "order"];</code>
     */
    public Builder clearOrder() {
      if (orderBuilder_ == null) {
        order_ = null;
        onChanged();
      } else {
        order_ = null;
        orderBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.io.swagger.petstore.v2.Order order = 1[json_name = "order"];</code>
     */
    public api.io.swagger.petstore.v2.Order.Builder getOrderBuilder() {
      
      onChanged();
      return getOrderFieldBuilder().getBuilder();
    }
    /**
     * <code>.io.swagger.petstore.v2.Order order = 1[json_name = "order"];</code>
     */
    public api.io.swagger.petstore.v2.OrderOrBuilder getOrderOrBuilder() {
      if (orderBuilder_ != null) {
        return orderBuilder_.getMessageOrBuilder();
      } else {
        return order_ == null ?
            api.io.swagger.petstore.v2.Order.getDefaultInstance() : order_;
      }
    }
    /**
     * <code>.io.swagger.petstore.v2.Order order = 1[json_name = "order"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        api.io.swagger.petstore.v2.Order, api.io.swagger.petstore.v2.Order.Builder, api.io.swagger.petstore.v2.OrderOrBuilder> 
        getOrderFieldBuilder() {
      if (orderBuilder_ == null) {
        orderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            api.io.swagger.petstore.v2.Order, api.io.swagger.petstore.v2.Order.Builder, api.io.swagger.petstore.v2.OrderOrBuilder>(
                getOrder(),
                getParentForChildren(),
                isClean());
        order_ = null;
      }
      return orderBuilder_;
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


    // @@protoc_insertion_point(builder_scope:io.swagger.petstore.v2.CreateOrderResponse)
  }

  // @@protoc_insertion_point(class_scope:io.swagger.petstore.v2.CreateOrderResponse)
  private static final api.io.swagger.petstore.v2.CreateOrderResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new api.io.swagger.petstore.v2.CreateOrderResponse();
  }

  public static api.io.swagger.petstore.v2.CreateOrderResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateOrderResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateOrderResponse>() {
    @java.lang.Override
    public CreateOrderResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateOrderResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateOrderResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public api.io.swagger.petstore.v2.CreateOrderResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

