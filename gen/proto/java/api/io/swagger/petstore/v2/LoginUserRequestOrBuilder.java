// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/swagger/petstore/v2/user_service.proto

package api.io.swagger.petstore.v2;

public interface LoginUserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.swagger.petstore.v2.LoginUserRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string username = 1[json_name = "username"];</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 1[json_name = "username"];</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>string password = 2[json_name = "password"];</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 2[json_name = "password"];</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();
}
