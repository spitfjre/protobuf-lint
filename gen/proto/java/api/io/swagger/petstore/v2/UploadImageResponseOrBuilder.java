// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/swagger/petstore/v2/pet_service.proto

package api.io.swagger.petstore.v2;

public interface UploadImageResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.swagger.petstore.v2.UploadImageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 code = 1[json_name = "code"];</code>
   * @return The code.
   */
  int getCode();

  /**
   * <code>string type = 2[json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 2[json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string message = 3[json_name = "message"];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 3[json_name = "message"];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}