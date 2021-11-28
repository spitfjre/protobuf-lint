// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/swagger/petstore/v2/pet.proto

package api.io.swagger.petstore.v2;

public interface PetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.swagger.petstore.v2.Pet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1[json_name = "id"];</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>.io.swagger.petstore.v2.Category category = 2[json_name = "category"];</code>
   * @return Whether the category field is set.
   */
  boolean hasCategory();
  /**
   * <code>.io.swagger.petstore.v2.Category category = 2[json_name = "category"];</code>
   * @return The category.
   */
  api.io.swagger.petstore.v2.Category getCategory();
  /**
   * <code>.io.swagger.petstore.v2.Category category = 2[json_name = "category"];</code>
   */
  api.io.swagger.petstore.v2.CategoryOrBuilder getCategoryOrBuilder();

  /**
   * <code>string name = 3[json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3[json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>repeated string photo_urls = 4[json_name = "photoUrls"];</code>
   * @return A list containing the photoUrls.
   */
  java.util.List<java.lang.String>
      getPhotoUrlsList();
  /**
   * <code>repeated string photo_urls = 4[json_name = "photoUrls"];</code>
   * @return The count of photoUrls.
   */
  int getPhotoUrlsCount();
  /**
   * <code>repeated string photo_urls = 4[json_name = "photoUrls"];</code>
   * @param index The index of the element to return.
   * @return The photoUrls at the given index.
   */
  java.lang.String getPhotoUrls(int index);
  /**
   * <code>repeated string photo_urls = 4[json_name = "photoUrls"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the photoUrls at the given index.
   */
  com.google.protobuf.ByteString
      getPhotoUrlsBytes(int index);

  /**
   * <code>repeated .io.swagger.petstore.v2.Tag tags = 5[json_name = "tags"];</code>
   */
  java.util.List<api.io.swagger.petstore.v2.Tag> 
      getTagsList();
  /**
   * <code>repeated .io.swagger.petstore.v2.Tag tags = 5[json_name = "tags"];</code>
   */
  api.io.swagger.petstore.v2.Tag getTags(int index);
  /**
   * <code>repeated .io.swagger.petstore.v2.Tag tags = 5[json_name = "tags"];</code>
   */
  int getTagsCount();
  /**
   * <code>repeated .io.swagger.petstore.v2.Tag tags = 5[json_name = "tags"];</code>
   */
  java.util.List<? extends api.io.swagger.petstore.v2.TagOrBuilder> 
      getTagsOrBuilderList();
  /**
   * <code>repeated .io.swagger.petstore.v2.Tag tags = 5[json_name = "tags"];</code>
   */
  api.io.swagger.petstore.v2.TagOrBuilder getTagsOrBuilder(
      int index);

  /**
   * <code>.io.swagger.petstore.v2.Pet.Status status = 6[json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.io.swagger.petstore.v2.Pet.Status status = 6[json_name = "status"];</code>
   * @return The status.
   */
  api.io.swagger.petstore.v2.Pet.Status getStatus();
}
