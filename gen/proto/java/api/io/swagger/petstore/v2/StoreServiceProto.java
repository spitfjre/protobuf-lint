// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/swagger/petstore/v2/store_service.proto

package api.io.swagger.petstore.v2;

public final class StoreServiceProto {
  private StoreServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_swagger_petstore_v2_GetInventoryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_swagger_petstore_v2_GetInventoryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_swagger_petstore_v2_GetInventoryResponse_InventoryByStatusEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_swagger_petstore_v2_GetInventoryResponse_InventoryByStatusEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_swagger_petstore_v2_CreateOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_swagger_petstore_v2_CreateOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_swagger_petstore_v2_CreateOrderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_swagger_petstore_v2_CreateOrderResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_swagger_petstore_v2_GetOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_swagger_petstore_v2_GetOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_swagger_petstore_v2_GetOrderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_swagger_petstore_v2_GetOrderResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_swagger_petstore_v2_DeleteOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_swagger_petstore_v2_DeleteOrderRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*io/swagger/petstore/v2/store_service.p" +
      "roto\022\026io.swagger.petstore.v2\032\033google/pro" +
      "tobuf/empty.proto\032\"io/swagger/petstore/v" +
      "2/order.proto\"\321\001\n\024GetInventoryResponse\022s" +
      "\n\023inventory_by_status\030\001 \003(\0132C.io.swagger" +
      ".petstore.v2.GetInventoryResponse.Invent" +
      "oryByStatusEntryR\021inventoryByStatus\032D\n\026I" +
      "nventoryByStatusEntry\022\020\n\003key\030\001 \001(\tR\003key\022" +
      "\024\n\005value\030\002 \001(\005R\005value:\0028\001\"I\n\022CreateOrder" +
      "Request\0223\n\005order\030\001 \001(\0132\035.io.swagger.pets" +
      "tore.v2.OrderR\005order\"J\n\023CreateOrderRespo" +
      "nse\0223\n\005order\030\001 \001(\0132\035.io.swagger.petstore" +
      ".v2.OrderR\005order\",\n\017GetOrderRequest\022\031\n\010o" +
      "rder_id\030\001 \001(\003R\007orderId\"G\n\020GetOrderRespon" +
      "se\0223\n\005order\030\001 \001(\0132\035.io.swagger.petstore." +
      "v2.OrderR\005order\"/\n\022DeleteOrderRequest\022\031\n" +
      "\010order_id\030\001 \001(\003R\007orderId2\376\002\n\014StoreServic" +
      "e\022T\n\014GetInventory\022\026.google.protobuf.Empt" +
      "y\032,.io.swagger.petstore.v2.GetInventoryR" +
      "esponse\022f\n\013CreateOrder\022*.io.swagger.pets" +
      "tore.v2.CreateOrderRequest\032+.io.swagger." +
      "petstore.v2.CreateOrderResponse\022]\n\010GetOr" +
      "der\022\'.io.swagger.petstore.v2.GetOrderReq" +
      "uest\032(.io.swagger.petstore.v2.GetOrderRe" +
      "sponse\022Q\n\013DeleteOrder\022*.io.swagger.petst" +
      "ore.v2.DeleteOrderRequest\032\026.google.proto" +
      "buf.EmptyB\254\001\n\032api.io.swagger.petstore.v2" +
      "B\021StoreServiceProtoH\002P\001\242\002\003ISP\252\002\026Io.Swagg" +
      "er.Petstore.V2\312\002\026Io\\Swagger\\Petstore\\V2\342" +
      "\002\"Io\\Swagger\\Petstore\\V2\\GPBMetadata\352\002\031I" +
      "o::Swagger::Petstore::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          api.io.swagger.petstore.v2.OrderProto.getDescriptor(),
        });
    internal_static_io_swagger_petstore_v2_GetInventoryResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_swagger_petstore_v2_GetInventoryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_swagger_petstore_v2_GetInventoryResponse_descriptor,
        new java.lang.String[] { "InventoryByStatus", });
    internal_static_io_swagger_petstore_v2_GetInventoryResponse_InventoryByStatusEntry_descriptor =
      internal_static_io_swagger_petstore_v2_GetInventoryResponse_descriptor.getNestedTypes().get(0);
    internal_static_io_swagger_petstore_v2_GetInventoryResponse_InventoryByStatusEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_swagger_petstore_v2_GetInventoryResponse_InventoryByStatusEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_io_swagger_petstore_v2_CreateOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_io_swagger_petstore_v2_CreateOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_swagger_petstore_v2_CreateOrderRequest_descriptor,
        new java.lang.String[] { "Order", });
    internal_static_io_swagger_petstore_v2_CreateOrderResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_io_swagger_petstore_v2_CreateOrderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_swagger_petstore_v2_CreateOrderResponse_descriptor,
        new java.lang.String[] { "Order", });
    internal_static_io_swagger_petstore_v2_GetOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_io_swagger_petstore_v2_GetOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_swagger_petstore_v2_GetOrderRequest_descriptor,
        new java.lang.String[] { "OrderId", });
    internal_static_io_swagger_petstore_v2_GetOrderResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_io_swagger_petstore_v2_GetOrderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_swagger_petstore_v2_GetOrderResponse_descriptor,
        new java.lang.String[] { "Order", });
    internal_static_io_swagger_petstore_v2_DeleteOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_io_swagger_petstore_v2_DeleteOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_swagger_petstore_v2_DeleteOrderRequest_descriptor,
        new java.lang.String[] { "OrderId", });
    com.google.protobuf.EmptyProto.getDescriptor();
    api.io.swagger.petstore.v2.OrderProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
