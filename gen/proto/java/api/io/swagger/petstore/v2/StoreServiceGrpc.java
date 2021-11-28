package api.io.swagger.petstore.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Access to petstore orders
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: io/swagger/petstore/v2/store_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StoreServiceGrpc {

  private StoreServiceGrpc() {}

  public static final String SERVICE_NAME = "io.swagger.petstore.v2.StoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      api.io.swagger.petstore.v2.GetInventoryResponse> getGetInventoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInventory",
      requestType = com.google.protobuf.Empty.class,
      responseType = api.io.swagger.petstore.v2.GetInventoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      api.io.swagger.petstore.v2.GetInventoryResponse> getGetInventoryMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, api.io.swagger.petstore.v2.GetInventoryResponse> getGetInventoryMethod;
    if ((getGetInventoryMethod = StoreServiceGrpc.getGetInventoryMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getGetInventoryMethod = StoreServiceGrpc.getGetInventoryMethod) == null) {
          StoreServiceGrpc.getGetInventoryMethod = getGetInventoryMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, api.io.swagger.petstore.v2.GetInventoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInventory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.io.swagger.petstore.v2.GetInventoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("GetInventory"))
              .build();
        }
      }
    }
    return getGetInventoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.CreateOrderRequest,
      api.io.swagger.petstore.v2.CreateOrderResponse> getCreateOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrder",
      requestType = api.io.swagger.petstore.v2.CreateOrderRequest.class,
      responseType = api.io.swagger.petstore.v2.CreateOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.CreateOrderRequest,
      api.io.swagger.petstore.v2.CreateOrderResponse> getCreateOrderMethod() {
    io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.CreateOrderRequest, api.io.swagger.petstore.v2.CreateOrderResponse> getCreateOrderMethod;
    if ((getCreateOrderMethod = StoreServiceGrpc.getCreateOrderMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getCreateOrderMethod = StoreServiceGrpc.getCreateOrderMethod) == null) {
          StoreServiceGrpc.getCreateOrderMethod = getCreateOrderMethod =
              io.grpc.MethodDescriptor.<api.io.swagger.petstore.v2.CreateOrderRequest, api.io.swagger.petstore.v2.CreateOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.io.swagger.petstore.v2.CreateOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.io.swagger.petstore.v2.CreateOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("CreateOrder"))
              .build();
        }
      }
    }
    return getCreateOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.GetOrderRequest,
      api.io.swagger.petstore.v2.GetOrderResponse> getGetOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrder",
      requestType = api.io.swagger.petstore.v2.GetOrderRequest.class,
      responseType = api.io.swagger.petstore.v2.GetOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.GetOrderRequest,
      api.io.swagger.petstore.v2.GetOrderResponse> getGetOrderMethod() {
    io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.GetOrderRequest, api.io.swagger.petstore.v2.GetOrderResponse> getGetOrderMethod;
    if ((getGetOrderMethod = StoreServiceGrpc.getGetOrderMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getGetOrderMethod = StoreServiceGrpc.getGetOrderMethod) == null) {
          StoreServiceGrpc.getGetOrderMethod = getGetOrderMethod =
              io.grpc.MethodDescriptor.<api.io.swagger.petstore.v2.GetOrderRequest, api.io.swagger.petstore.v2.GetOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.io.swagger.petstore.v2.GetOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.io.swagger.petstore.v2.GetOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("GetOrder"))
              .build();
        }
      }
    }
    return getGetOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.DeleteOrderRequest,
      com.google.protobuf.Empty> getDeleteOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOrder",
      requestType = api.io.swagger.petstore.v2.DeleteOrderRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.DeleteOrderRequest,
      com.google.protobuf.Empty> getDeleteOrderMethod() {
    io.grpc.MethodDescriptor<api.io.swagger.petstore.v2.DeleteOrderRequest, com.google.protobuf.Empty> getDeleteOrderMethod;
    if ((getDeleteOrderMethod = StoreServiceGrpc.getDeleteOrderMethod) == null) {
      synchronized (StoreServiceGrpc.class) {
        if ((getDeleteOrderMethod = StoreServiceGrpc.getDeleteOrderMethod) == null) {
          StoreServiceGrpc.getDeleteOrderMethod = getDeleteOrderMethod =
              io.grpc.MethodDescriptor.<api.io.swagger.petstore.v2.DeleteOrderRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  api.io.swagger.petstore.v2.DeleteOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new StoreServiceMethodDescriptorSupplier("DeleteOrder"))
              .build();
        }
      }
    }
    return getDeleteOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StoreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreServiceStub>() {
        @java.lang.Override
        public StoreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreServiceStub(channel, callOptions);
        }
      };
    return StoreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreServiceBlockingStub>() {
        @java.lang.Override
        public StoreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreServiceBlockingStub(channel, callOptions);
        }
      };
    return StoreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreServiceFutureStub>() {
        @java.lang.Override
        public StoreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreServiceFutureStub(channel, callOptions);
        }
      };
    return StoreServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Access to petstore orders
   * </pre>
   */
  public static abstract class StoreServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns pet inventories by status
     * </pre>
     */
    public void getInventory(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.GetInventoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInventoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Place an order for a pet
     * </pre>
     */
    public void createOrder(api.io.swagger.petstore.v2.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.CreateOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Find purchase order by id
     * </pre>
     */
    public void getOrder(api.io.swagger.petstore.v2.GetOrderRequest request,
        io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.GetOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete purchase order by id
     * </pre>
     */
    public void deleteOrder(api.io.swagger.petstore.v2.DeleteOrderRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetInventoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                api.io.swagger.petstore.v2.GetInventoryResponse>(
                  this, METHODID_GET_INVENTORY)))
          .addMethod(
            getCreateOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.io.swagger.petstore.v2.CreateOrderRequest,
                api.io.swagger.petstore.v2.CreateOrderResponse>(
                  this, METHODID_CREATE_ORDER)))
          .addMethod(
            getGetOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.io.swagger.petstore.v2.GetOrderRequest,
                api.io.swagger.petstore.v2.GetOrderResponse>(
                  this, METHODID_GET_ORDER)))
          .addMethod(
            getDeleteOrderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                api.io.swagger.petstore.v2.DeleteOrderRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ORDER)))
          .build();
    }
  }

  /**
   * <pre>
   * Access to petstore orders
   * </pre>
   */
  public static final class StoreServiceStub extends io.grpc.stub.AbstractAsyncStub<StoreServiceStub> {
    private StoreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns pet inventories by status
     * </pre>
     */
    public void getInventory(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.GetInventoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInventoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Place an order for a pet
     * </pre>
     */
    public void createOrder(api.io.swagger.petstore.v2.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.CreateOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Find purchase order by id
     * </pre>
     */
    public void getOrder(api.io.swagger.petstore.v2.GetOrderRequest request,
        io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.GetOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete purchase order by id
     * </pre>
     */
    public void deleteOrder(api.io.swagger.petstore.v2.DeleteOrderRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Access to petstore orders
   * </pre>
   */
  public static final class StoreServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StoreServiceBlockingStub> {
    private StoreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns pet inventories by status
     * </pre>
     */
    public api.io.swagger.petstore.v2.GetInventoryResponse getInventory(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInventoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Place an order for a pet
     * </pre>
     */
    public api.io.swagger.petstore.v2.CreateOrderResponse createOrder(api.io.swagger.petstore.v2.CreateOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Find purchase order by id
     * </pre>
     */
    public api.io.swagger.petstore.v2.GetOrderResponse getOrder(api.io.swagger.petstore.v2.GetOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete purchase order by id
     * </pre>
     */
    public com.google.protobuf.Empty deleteOrder(api.io.swagger.petstore.v2.DeleteOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Access to petstore orders
   * </pre>
   */
  public static final class StoreServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StoreServiceFutureStub> {
    private StoreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns pet inventories by status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.io.swagger.petstore.v2.GetInventoryResponse> getInventory(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInventoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Place an order for a pet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.io.swagger.petstore.v2.CreateOrderResponse> createOrder(
        api.io.swagger.petstore.v2.CreateOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Find purchase order by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<api.io.swagger.petstore.v2.GetOrderResponse> getOrder(
        api.io.swagger.petstore.v2.GetOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete purchase order by id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteOrder(
        api.io.swagger.petstore.v2.DeleteOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_INVENTORY = 0;
  private static final int METHODID_CREATE_ORDER = 1;
  private static final int METHODID_GET_ORDER = 2;
  private static final int METHODID_DELETE_ORDER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StoreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StoreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_INVENTORY:
          serviceImpl.getInventory((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.GetInventoryResponse>) responseObserver);
          break;
        case METHODID_CREATE_ORDER:
          serviceImpl.createOrder((api.io.swagger.petstore.v2.CreateOrderRequest) request,
              (io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.CreateOrderResponse>) responseObserver);
          break;
        case METHODID_GET_ORDER:
          serviceImpl.getOrder((api.io.swagger.petstore.v2.GetOrderRequest) request,
              (io.grpc.stub.StreamObserver<api.io.swagger.petstore.v2.GetOrderResponse>) responseObserver);
          break;
        case METHODID_DELETE_ORDER:
          serviceImpl.deleteOrder((api.io.swagger.petstore.v2.DeleteOrderRequest) request,
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

  private static abstract class StoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return api.io.swagger.petstore.v2.StoreServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StoreService");
    }
  }

  private static final class StoreServiceFileDescriptorSupplier
      extends StoreServiceBaseDescriptorSupplier {
    StoreServiceFileDescriptorSupplier() {}
  }

  private static final class StoreServiceMethodDescriptorSupplier
      extends StoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StoreServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StoreServiceFileDescriptorSupplier())
              .addMethod(getGetInventoryMethod())
              .addMethod(getCreateOrderMethod())
              .addMethod(getGetOrderMethod())
              .addMethod(getDeleteOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
