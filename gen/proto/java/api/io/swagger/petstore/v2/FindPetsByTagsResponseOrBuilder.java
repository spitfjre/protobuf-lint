// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/swagger/petstore/v2/pet_service.proto

package api.io.swagger.petstore.v2;

public interface FindPetsByTagsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.swagger.petstore.v2.FindPetsByTagsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
   */
  java.util.List<api.io.swagger.petstore.v2.Pet> 
      getPetsList();
  /**
   * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
   */
  api.io.swagger.petstore.v2.Pet getPets(int index);
  /**
   * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
   */
  int getPetsCount();
  /**
   * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
   */
  java.util.List<? extends api.io.swagger.petstore.v2.PetOrBuilder> 
      getPetsOrBuilderList();
  /**
   * <code>repeated .io.swagger.petstore.v2.Pet pets = 1[json_name = "pets"];</code>
   */
  api.io.swagger.petstore.v2.PetOrBuilder getPetsOrBuilder(
      int index);
}