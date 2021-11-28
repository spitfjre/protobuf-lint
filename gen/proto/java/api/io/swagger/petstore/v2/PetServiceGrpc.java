package api.io.swagger.petstore.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Everything about your pets
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: io/swagger/petstore/v2/pet_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PetServiceGrpc {

  private PetServiceGrpc() {}

  public static final String SERVICE_NAME = "io.swagger.petstore.v2.PetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.UploadImageRequest,
      api.io.swagger.petstore.v2.UploadImageResponse> getUploadImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadImage",
      requestType = api.io.swagger.petstore.v2.UploadImageRequest.class,
      responseType = api.io.swagger.petstore.v2.UploadImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.UploadImageRequest,
      api.io.swagger.petstore.v2.UploadImageResponse> getUploadImageMethod() {
    io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.UploadImageRequest, api.io.swagger.petstore.v2.UploadImageResponse> getUploadImageMethod;
    if ((getUploadImageMethod = PetServiceGrpc.getUploadImageMethod) == null) {
      synchronized (PetServiceGrpc.class) {
        if ((getUploadImageMethod = PetServiceGrpc.getUploadImageMethod) == null) {
          PetServiceGrpc.getUploadImageMethod = getUploadImageMethod =
              io.grpc.MethodDescriptor.<api.io.swagger.petstore.v2.UploadImageRequest, api.io.swagger.petstore.v2.UploadImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.io.swagger.petstore.v2.UploadImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.io.swagger.petstore.v2.UploadImageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PetServiceMethodDescriptorSupplier("UploadImage"))
              .build();
        }
      }
    }
    return getUploadImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.AddPetRequest,
      com.google.protobuf.Empty> getAddPetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPet",
      requestType = api.io.swagger.petstore.v2.AddPetRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.AddPetRequest,
      com.google.protobuf.Empty> getAddPetMethod() {
    io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.AddPetRequest, com.google.protobuf.Empty> getAddPetMethod;
    if ((getAddPetMethod = PetServiceGrpc.getAddPetMethod) == null) {
      synchronized (PetServiceGrpc.class) {
        if ((getAddPetMethod = PetServiceGrpc.getAddPetMethod) == null) {
          PetServiceGrpc.getAddPetMethod = getAddPetMethod =
              io.grpc.MethodDescriptor.<api.io.swagger.petstore.v2.AddPetRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.io.swagger.petstore.v2.AddPetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new PetServiceMethodDescriptorSupplier("AddPet"))
              .build();
        }
      }
    }
    return getAddPetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.UpdatePetRequest,
      com.google.protobuf.Empty> getUpdatePetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePet",
      requestType = api.io.swagger.petstore.v2.UpdatePetRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.UpdatePetRequest,
      com.google.protobuf.Empty> getUpdatePetMethod() {
    io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.UpdatePetRequest, com.google.protobuf.Empty> getUpdatePetMethod;
    if ((getUpdatePetMethod = PetServiceGrpc.getUpdatePetMethod) == null) {
      synchronized (PetServiceGrpc.class) {
        if ((getUpdatePetMethod = PetServiceGrpc.getUpdatePetMethod) == null) {
          PetServiceGrpc.getUpdatePetMethod = getUpdatePetMethod =
              io.grpc.MethodDescriptor.<api.io.swagger.petstore.v2.UpdatePetRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.io.swagger.petstore.v2.UpdatePetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new PetServiceMethodDescriptorSupplier("UpdatePet"))
              .build();
        }
      }
    }
    return getUpdatePetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.FindPetsByStatusRequest,
      api.io.swagger.petstore.v2.FindPetsByStatusResponse> getFindPetsByStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindPetsByStatus",
      requestType = api.io.swagger.petstore.v2.FindPetsByStatusRequest.class,
      responseType = api.io.swagger.petstore.v2.FindPetsByStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.FindPetsByStatusRequest,
      api.io.swagger.petstore.v2.FindPetsByStatusResponse> getFindPetsByStatusMethod() {
    io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.FindPetsByStatusRequest, api.io.swagger.petstore.v2.FindPetsByStatusResponse> getFindPetsByStatusMethod;
    if ((getFindPetsByStatusMethod = PetServiceGrpc.getFindPetsByStatusMethod) == null) {
      synchronized (PetServiceGrpc.class) {
        if ((getFindPetsByStatusMethod = PetServiceGrpc.getFindPetsByStatusMethod) == null) {
          PetServiceGrpc.getFindPetsByStatusMethod = getFindPetsByStatusMethod =
              io.grpc.MethodDescriptor.<api.io.swagger.petstore.v2.FindPetsByStatusRequest, api.io.swagger.petstore.v2.FindPetsByStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindPetsByStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.io.swagger.petstore.v2.FindPetsByStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.io.swagger.petstore.v2.FindPetsByStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PetServiceMethodDescriptorSupplier("FindPetsByStatus"))
              .build();
        }
      }
    }
    return getFindPetsByStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.FindPetsByTagsRequest,
      api.io.swagger.petstore.v2.FindPetsByTagsResponse> getFindPetsByTagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindPetsByTags",
      requestType = api.io.swagger.petstore.v2.FindPetsByTagsRequest.class,
      responseType = api.io.swagger.petstore.v2.FindPetsByTagsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.FindPetsByTagsRequest,
      api.io.swagger.petstore.v2.FindPetsByTagsResponse> getFindPetsByTagsMethod() {
    io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.FindPetsByTagsRequest, api.io.swagger.petstore.v2.FindPetsByTagsResponse> getFindPetsByTagsMethod;
    if ((getFindPetsByTagsMethod = PetServiceGrpc.getFindPetsByTagsMethod) == null) {
      synchronized (PetServiceGrpc.class) {
        if ((getFindPetsByTagsMethod = PetServiceGrpc.getFindPetsByTagsMethod) == null) {
          PetServiceGrpc.getFindPetsByTagsMethod = getFindPetsByTagsMethod =
              io.grpc.MethodDescriptor.<api.io.swagger.petstore.v2.FindPetsByTagsRequest, api.io.swagger.petstore.v2.FindPetsByTagsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindPetsByTags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.io.swagger.petstore.v2.FindPetsByTagsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.io.swagger.petstore.v2.FindPetsByTagsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PetServiceMethodDescriptorSupplier("FindPetsByTags"))
              .build();
        }
      }
    }
    return getFindPetsByTagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.FindPetRequest,
      api.io.swagger.petstore.v2.FindPetResponse> getFindPetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindPet",
      requestType = api.io.swagger.petstore.v2.FindPetRequest.class,
      responseType = api.io.swagger.petstore.v2.FindPetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.FindPetRequest,
      api.io.swagger.petstore.v2.FindPetResponse> getFindPetMethod() {
    io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.FindPetRequest, api.io.swagger.petstore.v2.FindPetResponse> getFindPetMethod;
    if ((getFindPetMethod = PetServiceGrpc.getFindPetMethod) == null) {
      synchronized (PetServiceGrpc.class) {
        if ((getFindPetMethod = PetServiceGrpc.getFindPetMethod) == null) {
          PetServiceGrpc.getFindPetMethod = getFindPetMethod =
              io.grpc.MethodDescriptor.<api.io.swagger.petstore.v2.FindPetRequest, api.io.swagger.petstore.v2.FindPetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindPet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.io.swagger.petstore.v2.FindPetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.io.swagger.petstore.v2.FindPetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PetServiceMethodDescriptorSupplier("FindPet"))
              .build();
        }
      }
    }
    return getFindPetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest,
      com.google.protobuf.Empty> getUpdatePetWithFormDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePetWithFormData",
      requestType = api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest,
      com.google.protobuf.Empty> getUpdatePetWithFormDataMethod() {
    io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest, com.google.protobuf.Empty> getUpdatePetWithFormDataMethod;
    if ((getUpdatePetWithFormDataMethod = PetServiceGrpc.getUpdatePetWithFormDataMethod) == null) {
      synchronized (PetServiceGrpc.class) {
        if ((getUpdatePetWithFormDataMethod = PetServiceGrpc.getUpdatePetWithFormDataMethod) == null) {
          PetServiceGrpc.getUpdatePetWithFormDataMethod = getUpdatePetWithFormDataMethod =
              io.grpc.MethodDescriptor.<api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePetWithFormData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new PetServiceMethodDescriptorSupplier("UpdatePetWithFormData"))
              .build();
        }
      }
    }
    return getUpdatePetWithFormDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.DeletePetRequest,
      com.google.protobuf.Empty> getDeletePetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePet",
      requestType = api.io.swagger.petstore.v2.DeletePetRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.DeletePetRequest,
      com.google.protobuf.Empty> getDeletePetMethod() {
    io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.DeletePetRequest, com.google.protobuf.Empty> getDeletePetMethod;
    if ((getDeletePetMethod = PetServiceGrpc.getDeletePetMethod) == null) {
      synchronized (PetServiceGrpc.class) {
        if ((getDeletePetMethod = PetServiceGrpc.getDeletePetMethod) == null) {
          PetServiceGrpc.getDeletePetMethod = getDeletePetMethod =
              io.grpc.MethodDescriptor.<api.io.swagger.petstore.v2.DeletePetRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.io.swagger.petstore.v2.DeletePetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new PetServiceMethodDescriptorSupplier("DeletePet"))
              .build();
        }
      }
    }
    return getDeletePetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PetServiceStub>() {
        @java.lang.Override
        public PetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PetServiceStub(channel, callOptions);
        }
      };
    return PetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PetServiceBlockingStub>() {
        @java.lang.Override
        public PetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PetServiceBlockingStub(channel, callOptions);
        }
      };
    return PetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PetServiceFutureStub>() {
        @java.lang.Override
        public PetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PetServiceFutureStub(channel, callOptions);
        }
      };
    return PetServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Everything about your pets
   * </pre>
   */
  public static abstract class PetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Uploads an image
     * </pre>
     */
    public void uploadImage(api.io.swagger.petstore.v2.UploadImageRequest request,
        io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.UploadImageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a new pet to the store
     * </pre>
     */
    public void addPet(api.io.swagger.petstore.v2.AddPetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an existing pet
     * </pre>
     */
    public void updatePet(api.io.swagger.petstore.v2.UpdatePetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Finds pets by status
     * </pre>
     */
    public void findPetsByStatus(api.io.swagger.petstore.v2.FindPetsByStatusRequest request,
        io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.FindPetsByStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindPetsByStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Finds pets by tags
     * </pre>
     */
    @java.lang.Deprecated
    public void findPetsByTags(api.io.swagger.petstore.v2.FindPetsByTagsRequest request,
        io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.FindPetsByTagsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindPetsByTagsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Find pet by id
     * </pre>
     */
    public void findPet(api.io.swagger.petstore.v2.FindPetRequest request,
        io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.FindPetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindPetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a pet in the store with form data
     * </pre>
     */
    public void updatePetWithFormData(api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePetWithFormDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a pet
     * </pre>
     */
    public void deletePet(api.io.swagger.petstore.v2.DeletePetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadImageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.io.swagger.petstore.v2.UploadImageRequest,
                api.io.swagger.petstore.v2.UploadImageResponse>(
                  this, METHODID_UPLOAD_IMAGE)))
          .addMethod(
            getAddPetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.io.swagger.petstore.v2.AddPetRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_ADD_PET)))
          .addMethod(
            getUpdatePetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.io.swagger.petstore.v2.UpdatePetRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_PET)))
          .addMethod(
            getFindPetsByStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.io.swagger.petstore.v2.FindPetsByStatusRequest,
                api.io.swagger.petstore.v2.FindPetsByStatusResponse>(
                  this, METHODID_FIND_PETS_BY_STATUS)))
          .addMethod(
            getFindPetsByTagsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.io.swagger.petstore.v2.FindPetsByTagsRequest,
                api.io.swagger.petstore.v2.FindPetsByTagsResponse>(
                  this, METHODID_FIND_PETS_BY_TAGS)))
          .addMethod(
            getFindPetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.io.swagger.petstore.v2.FindPetRequest,
                api.io.swagger.petstore.v2.FindPetResponse>(
                  this, METHODID_FIND_PET)))
          .addMethod(
            getUpdatePetWithFormDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_PET_WITH_FORM_DATA)))
          .addMethod(
            getDeletePetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.io.swagger.petstore.v2.DeletePetRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_PET)))
          .build();
    }
  }

  /**
   * <pre>
   * Everything about your pets
   * </pre>
   */
  public static final class PetServiceStub extends io.grpc.stub.AbstractAsyncStub<PetServiceStub> {
    private PetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Uploads an image
     * </pre>
     */
    public void uploadImage(api.io.swagger.petstore.v2.UploadImageRequest request,
        io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.UploadImageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a new pet to the store
     * </pre>
     */
    public void addPet(api.io.swagger.petstore.v2.AddPetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an existing pet
     * </pre>
     */
    public void updatePet(api.io.swagger.petstore.v2.UpdatePetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Finds pets by status
     * </pre>
     */
    public void findPetsByStatus(api.io.swagger.petstore.v2.FindPetsByStatusRequest request,
        io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.FindPetsByStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindPetsByStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Finds pets by tags
     * </pre>
     */
    @java.lang.Deprecated
    public void findPetsByTags(api.io.swagger.petstore.v2.FindPetsByTagsRequest request,
        io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.FindPetsByTagsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindPetsByTagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Find pet by id
     * </pre>
     */
    public void findPet(api.io.swagger.petstore.v2.FindPetRequest request,
        io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.FindPetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindPetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a pet in the store with form data
     * </pre>
     */
    public void updatePetWithFormData(api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePetWithFormDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a pet
     * </pre>
     */
    public void deletePet(api.io.swagger.petstore.v2.DeletePetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Everything about your pets
   * </pre>
   */
  public static final class PetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PetServiceBlockingStub> {
    private PetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Uploads an image
     * </pre>
     */
    public api.io.swagger.petstore.v2.UploadImageResponse uploadImage(api.io.swagger.petstore.v2.UploadImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a new pet to the store
     * </pre>
     */
    public com.google.protobuf.Empty addPet(api.io.swagger.petstore.v2.AddPetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an existing pet
     * </pre>
     */
    public com.google.protobuf.Empty updatePet(api.io.swagger.petstore.v2.UpdatePetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Finds pets by status
     * </pre>
     */
    public api.io.swagger.petstore.v2.FindPetsByStatusResponse findPetsByStatus(api.io.swagger.petstore.v2.FindPetsByStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindPetsByStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Finds pets by tags
     * </pre>
     */
    @java.lang.Deprecated
    public api.io.swagger.petstore.v2.FindPetsByTagsResponse findPetsByTags(api.io.swagger.petstore.v2.FindPetsByTagsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindPetsByTagsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Find pet by id
     * </pre>
     */
    public api.io.swagger.petstore.v2.FindPetResponse findPet(api.io.swagger.petstore.v2.FindPetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindPetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a pet in the store with form data
     * </pre>
     */
    public com.google.protobuf.Empty updatePetWithFormData(api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePetWithFormDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a pet
     * </pre>
     */
    public com.google.protobuf.Empty deletePet(api.io.swagger.petstore.v2.DeletePetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePetMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Everything about your pets
   * </pre>
   */
  public static final class PetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PetServiceFutureStub> {
    private PetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Uploads an image
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.io.swagger.petstore.v2.UploadImageResponse> uploadImage(
        api.io.swagger.petstore.v2.UploadImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a new pet to the store
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addPet(
        api.io.swagger.petstore.v2.AddPetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an existing pet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updatePet(
        api.io.swagger.petstore.v2.UpdatePetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Finds pets by status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.io.swagger.petstore.v2.FindPetsByStatusResponse> findPetsByStatus(
        api.io.swagger.petstore.v2.FindPetsByStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindPetsByStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Finds pets by tags
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<api.io.swagger.petstore.v2.FindPetsByTagsResponse> findPetsByTags(
        api.io.swagger.petstore.v2.FindPetsByTagsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindPetsByTagsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Find pet by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.io.swagger.petstore.v2.FindPetResponse> findPet(
        api.io.swagger.petstore.v2.FindPetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindPetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a pet in the store with form data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updatePetWithFormData(
        api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePetWithFormDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a pet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deletePet(
        api.io.swagger.petstore.v2.DeletePetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_IMAGE = 0;
  private static final int METHODID_ADD_PET = 1;
  private static final int METHODID_UPDATE_PET = 2;
  private static final int METHODID_FIND_PETS_BY_STATUS = 3;
  private static final int METHODID_FIND_PETS_BY_TAGS = 4;
  private static final int METHODID_FIND_PET = 5;
  private static final int METHODID_UPDATE_PET_WITH_FORM_DATA = 6;
  private static final int METHODID_DELETE_PET = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_IMAGE:
          serviceImpl.uploadImage((api.io.swagger.petstore.v2.UploadImageRequest) request,
              (io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.UploadImageResponse>) responseObserver);
          break;
        case METHODID_ADD_PET:
          serviceImpl.addPet((api.io.swagger.petstore.v2.AddPetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_PET:
          serviceImpl.updatePet((api.io.swagger.petstore.v2.UpdatePetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_FIND_PETS_BY_STATUS:
          serviceImpl.findPetsByStatus((api.io.swagger.petstore.v2.FindPetsByStatusRequest) request,
              (io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.FindPetsByStatusResponse>) responseObserver);
          break;
        case METHODID_FIND_PETS_BY_TAGS:
          serviceImpl.findPetsByTags((api.io.swagger.petstore.v2.FindPetsByTagsRequest) request,
              (io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.FindPetsByTagsResponse>) responseObserver);
          break;
        case METHODID_FIND_PET:
          serviceImpl.findPet((api.io.swagger.petstore.v2.FindPetRequest) request,
              (io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.FindPetResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PET_WITH_FORM_DATA:
          serviceImpl.updatePetWithFormData((api.io.swagger.petstore.v2.UpdatePetWithFormDataRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_PET:
          serviceImpl.deletePet((api.io.swagger.petstore.v2.DeletePetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return api.io.swagger.petstore.v2.PetServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PetService");
    }
  }

  private static final class PetServiceFileDescriptorSupplier
      extends PetServiceBaseDescriptorSupplier {
    PetServiceFileDescriptorSupplier() {}
  }

  private static final class PetServiceMethodDescriptorSupplier
      extends PetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PetServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PetServiceFileDescriptorSupplier())
              .addMethod(getUploadImageMethod())
              .addMethod(getAddPetMethod())
              .addMethod(getUpdatePetMethod())
              .addMethod(getFindPetsByStatusMethod())
              .addMethod(getFindPetsByTagsMethod())
              .addMethod(getFindPetMethod())
              .addMethod(getUpdatePetWithFormDataMethod())
              .addMethod(getDeletePetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
