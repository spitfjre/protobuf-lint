// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/swagger/petstore/v2/order.proto

package api.io.swagger.petstore.v2;

/**
 * Protobuf type {@code io.swagger.petstore.v2.Order}
 */
public final class Order extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.swagger.petstore.v2.Order)
    OrderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Order.newBuilder() to construct.
  private Order(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Order() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Order();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return api.io.swagger.petstore.v2.OrderProto.internal_static_io_swagger_petstore_v2_Order_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return api.io.swagger.petstore.v2.OrderProto.internal_static_io_swagger_petstore_v2_Order_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            api.io.swagger.petstore.v2.Order.class, api.io.swagger.petstore.v2.Order.Builder.class);
  }

  /**
   * Protobuf enum {@code io.swagger.petstore.v2.Order.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>STATUS_UNSPECIFIED = 0;</code>
     */
    STATUS_UNSPECIFIED(0),
    /**
     * <code>STATUS_PLACED = 1;</code>
     */
    STATUS_PLACED(1),
    /**
     * <code>STATUS_APPROVED = 2;</code>
     */
    STATUS_APPROVED(2),
    /**
     * <code>STATUS_DELIVERED = 3;</code>
     */
    STATUS_DELIVERED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>STATUS_UNSPECIFIED = 0;</code>
     */
    public static final int STATUS_UNSPECIFIED_VALUE = 0;
    /**
     * <code>STATUS_PLACED = 1;</code>
     */
    public static final int STATUS_PLACED_VALUE = 1;
    /**
     * <code>STATUS_APPROVED = 2;</code>
     */
    public static final int STATUS_APPROVED_VALUE = 2;
    /**
     * <code>STATUS_DELIVERED = 3;</code>
     */
    public static final int STATUS_DELIVERED_VALUE = 3;


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
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return STATUS_UNSPECIFIED;
        case 1: return STATUS_PLACED;
        case 2: return STATUS_APPROVED;
        case 3: return STATUS_DELIVERED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
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
      return api.io.swagger.petstore.v2.Order.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
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

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:io.swagger.petstore.v2.Order.Status)
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1[json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int PET_ID_FIELD_NUMBER = 2;
  private long petId_;
  /**
   * <code>int64 pet_id = 2[json_name = "petId"];</code>
   * @return The petId.
   */
  @java.lang.Override
  public long getPetId() {
    return petId_;
  }

  public static final int QUANTITY_FIELD_NUMBER = 3;
  private int quantity_;
  /**
   * <code>int32 quantity = 3[json_name = "quantity"];</code>
   * @return The quantity.
   */
  @java.lang.Override
  public int getQuantity() {
    return quantity_;
  }

  public static final int SHIP_DATE_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp shipDate_;
  /**
   * <code>.google.protobuf.Timestamp ship_date = 4[json_name = "shipDate"];</code>
   * @return Whether the shipDate field is set.
   */
  @java.lang.Override
  public boolean hasShipDate() {
    return shipDate_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp ship_date = 4[json_name = "shipDate"];</code>
   * @return The shipDate.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getShipDate() {
    return shipDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : shipDate_;
  }
  /**
   * <code>.google.protobuf.Timestamp ship_date = 4[json_name = "shipDate"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getShipDateOrBuilder() {
    return getShipDate();
  }

  public static final int STATUS_FIELD_NUMBER = 5;
  private int status_;
  /**
   * <code>.io.swagger.petstore.v2.Order.Status status = 5[json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.io.swagger.petstore.v2.Order.Status status = 5[json_name = "status"];</code>
   * @return The status.
   */
  @java.lang.Override public api.io.swagger.petstore.v2.Order.Status getStatus() {
    @SuppressWarnings("deprecation")
    api.io.swagger.petstore.v2.Order.Status result = api.io.swagger.petstore.v2.Order.Status.valueOf(status_);
    return result == null ? api.io.swagger.petstore.v2.Order.Status.UNRECOGNIZED : result;
  }

  public static final int COMPLETE_FIELD_NUMBER = 6;
  private boolean complete_;
  /**
   * <code>bool complete = 6[json_name = "complete"];</code>
   * @return The complete.
   */
  @java.lang.Override
  public boolean getComplete() {
    return complete_;
  }

  public static api.io.swagger.petstore.v2.Order parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.io.swagger.petstore.v2.Order parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.Order parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.io.swagger.petstore.v2.Order parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.Order parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.io.swagger.petstore.v2.Order parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.Order parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.io.swagger.petstore.v2.Order parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.Order parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static api.io.swagger.petstore.v2.Order parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.io.swagger.petstore.v2.Order parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.io.swagger.petstore.v2.Order parseFrom(
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
  public static Builder newBuilder(api.io.swagger.petstore.v2.Order prototype) {
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
   * Protobuf type {@code io.swagger.petstore.v2.Order}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.swagger.petstore.v2.Order)
      api.io.swagger.petstore.v2.OrderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return api.io.swagger.petstore.v2.OrderProto.internal_static_io_swagger_petstore_v2_Order_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return api.io.swagger.petstore.v2.OrderProto.internal_static_io_swagger_petstore_v2_Order_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              api.io.swagger.petstore.v2.Order.class, api.io.swagger.petstore.v2.Order.Builder.class);
    }

    // Construct using api.io.swagger.petstore.v2.Order.newBuilder()
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
      id_ = 0L;

      petId_ = 0L;

      quantity_ = 0;

      if (shipDateBuilder_ == null) {
        shipDate_ = null;
      } else {
        shipDate_ = null;
        shipDateBuilder_ = null;
      }
      status_ = 0;

      complete_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return api.io.swagger.petstore.v2.OrderProto.internal_static_io_swagger_petstore_v2_Order_descriptor;
    }

    @java.lang.Override
    public api.io.swagger.petstore.v2.Order getDefaultInstanceForType() {
      return api.io.swagger.petstore.v2.Order.getDefaultInstance();
    }

    @java.lang.Override
    public api.io.swagger.petstore.v2.Order build() {
      api.io.swagger.petstore.v2.Order result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public api.io.swagger.petstore.v2.Order buildPartial() {
      api.io.swagger.petstore.v2.Order result = new api.io.swagger.petstore.v2.Order(this);
      result.id_ = id_;
      result.petId_ = petId_;
      result.quantity_ = quantity_;
      if (shipDateBuilder_ == null) {
        result.shipDate_ = shipDate_;
      } else {
        result.shipDate_ = shipDateBuilder_.build();
      }
      result.status_ = status_;
      result.complete_ = complete_;
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

    private long id_ ;
    /**
     * <code>int64 id = 1[json_name = "id"];</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1[json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1[json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private long petId_ ;
    /**
     * <code>int64 pet_id = 2[json_name = "petId"];</code>
     * @return The petId.
     */
    @java.lang.Override
    public long getPetId() {
      return petId_;
    }
    /**
     * <code>int64 pet_id = 2[json_name = "petId"];</code>
     * @param value The petId to set.
     * @return This builder for chaining.
     */
    public Builder setPetId(long value) {
      
      petId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 pet_id = 2[json_name = "petId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPetId() {
      
      petId_ = 0L;
      onChanged();
      return this;
    }

    private int quantity_ ;
    /**
     * <code>int32 quantity = 3[json_name = "quantity"];</code>
     * @return The quantity.
     */
    @java.lang.Override
    public int getQuantity() {
      return quantity_;
    }
    /**
     * <code>int32 quantity = 3[json_name = "quantity"];</code>
     * @param value The quantity to set.
     * @return This builder for chaining.
     */
    public Builder setQuantity(int value) {
      
      quantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 quantity = 3[json_name = "quantity"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQuantity() {
      
      quantity_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp shipDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> shipDateBuilder_;
    /**
     * <code>.google.protobuf.Timestamp ship_date = 4[json_name = "shipDate"];</code>
     * @return Whether the shipDate field is set.
     */
    public boolean hasShipDate() {
      return shipDateBuilder_ != null || shipDate_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp ship_date = 4[json_name = "shipDate"];</code>
     * @return The shipDate.
     */
    public com.google.protobuf.Timestamp getShipDate() {
      if (shipDateBuilder_ == null) {
        return shipDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : shipDate_;
      } else {
        return shipDateBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp ship_date = 4[json_name = "shipDate"];</code>
     */
    public Builder setShipDate(com.google.protobuf.Timestamp value) {
      if (shipDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        shipDate_ = value;
        onChanged();
      } else {
        shipDateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp ship_date = 4[json_name = "shipDate"];</code>
     */
    public Builder setShipDate(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (shipDateBuilder_ == null) {
        shipDate_ = builderForValue.build();
        onChanged();
      } else {
        shipDateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp ship_date = 4[json_name = "shipDate"];</code>
     */
    public Builder mergeShipDate(com.google.protobuf.Timestamp value) {
      if (shipDateBuilder_ == null) {
        if (shipDate_ != null) {
          shipDate_ =
            com.google.protobuf.Timestamp.newBuilder(shipDate_).mergeFrom(value).buildPartial();
        } else {
          shipDate_ = value;
        }
        onChanged();
      } else {
        shipDateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp ship_date = 4[json_name = "shipDate"];</code>
     */
    public Builder clearShipDate() {
      if (shipDateBuilder_ == null) {
        shipDate_ = null;
        onChanged();
      } else {
        shipDate_ = null;
        shipDateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp ship_date = 4[json_name = "shipDate"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getShipDateBuilder() {
      
      onChanged();
      return getShipDateFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp ship_date = 4[json_name = "shipDate"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getShipDateOrBuilder() {
      if (shipDateBuilder_ != null) {
        return shipDateBuilder_.getMessageOrBuilder();
      } else {
        return shipDate_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : shipDate_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp ship_date = 4[json_name = "shipDate"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getShipDateFieldBuilder() {
      if (shipDateBuilder_ == null) {
        shipDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getShipDate(),
                getParentForChildren(),
                isClean());
        shipDate_ = null;
      }
      return shipDateBuilder_;
    }

    private int status_ = 0;
    /**
     * <code>.io.swagger.petstore.v2.Order.Status status = 5[json_name = "status"];</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.io.swagger.petstore.v2.Order.Status status = 5[json_name = "status"];</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.io.swagger.petstore.v2.Order.Status status = 5[json_name = "status"];</code>
     * @return The status.
     */
    @java.lang.Override
    public api.io.swagger.petstore.v2.Order.Status getStatus() {
      @SuppressWarnings("deprecation")
      api.io.swagger.petstore.v2.Order.Status result = api.io.swagger.petstore.v2.Order.Status.valueOf(status_);
      return result == null ? api.io.swagger.petstore.v2.Order.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.io.swagger.petstore.v2.Order.Status status = 5[json_name = "status"];</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(api.io.swagger.petstore.v2.Order.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.io.swagger.petstore.v2.Order.Status status = 5[json_name = "status"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private boolean complete_ ;
    /**
     * <code>bool complete = 6[json_name = "complete"];</code>
     * @return The complete.
     */
    @java.lang.Override
    public boolean getComplete() {
      return complete_;
    }
    /**
     * <code>bool complete = 6[json_name = "complete"];</code>
     * @param value The complete to set.
     * @return This builder for chaining.
     */
    public Builder setComplete(boolean value) {
      
      complete_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool complete = 6[json_name = "complete"];</code>
     * @return This builder for chaining.
     */
    public Builder clearComplete() {
      
      complete_ = false;
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


    // @@protoc_insertion_point(builder_scope:io.swagger.petstore.v2.Order)
  }

  // @@protoc_insertion_point(class_scope:io.swagger.petstore.v2.Order)
  private static final api.io.swagger.petstore.v2.Order DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new api.io.swagger.petstore.v2.Order();
  }

  public static api.io.swagger.petstore.v2.Order getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Order>
      PARSER = new com.google.protobuf.AbstractParser<Order>() {
    @java.lang.Override
    public Order parsePartialFrom(
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

  public static com.google.protobuf.Parser<Order> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Order> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public api.io.swagger.petstore.v2.Order getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

