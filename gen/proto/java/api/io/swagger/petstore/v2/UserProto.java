// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/swagger/petstore/v2/user.proto

package api.io.swagger.petstore.v2;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_swagger_petstore_v2_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_swagger_petstore_v2_User_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!io/swagger/petstore/v2/user.proto\022\026io." +
      "swagger.petstore.v2\"\327\001\n\004User\022\016\n\002id\030\001 \001(\003" +
      "R\002id\022\032\n\010username\030\002 \001(\tR\010username\022\035\n\nfirs" +
      "t_name\030\003 \001(\tR\tfirstName\022\033\n\tlast_name\030\004 \001" +
      "(\tR\010lastName\022\024\n\005email\030\005 \001(\tR\005email\022\032\n\010pa" +
      "ssword\030\006 \001(\tR\010password\022\024\n\005phone\030\007 \001(\tR\005p" +
      "hone\022\037\n\013user_status\030\010 \001(\005R\nuserStatusB\244\001" +
      "\n\032api.io.swagger.petstore.v2B\tUserProtoH" +
      "\002P\001\242\002\003ISP\252\002\026Io.Swagger.Petstore.V2\312\002\026Io\\" +
      "Swagger\\Petstore\\V2\342\002\"Io\\Swagger\\Petstor" +
      "e\\V2\\GPBMetadata\352\002\031Io::Swagger::Petstore" +
      "::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_io_swagger_petstore_v2_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_swagger_petstore_v2_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_swagger_petstore_v2_User_descriptor,
        new java.lang.String[] { "Id", "Username", "FirstName", "LastName", "Email", "Password", "Phone", "UserStatus", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
