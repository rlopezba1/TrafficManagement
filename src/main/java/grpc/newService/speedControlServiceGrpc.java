package grpc.newService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: trafficManagement.proto")
public final class speedControlServiceGrpc {

  private speedControlServiceGrpc() {}

  public static final String SERVICE_NAME = "speedControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.newService.speedDouble,
      grpc.newService.speedDouble> getGetOneVehicleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOneVehicle",
      requestType = grpc.newService.speedDouble.class,
      responseType = grpc.newService.speedDouble.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.newService.speedDouble,
      grpc.newService.speedDouble> getGetOneVehicleMethod() {
    io.grpc.MethodDescriptor<grpc.newService.speedDouble, grpc.newService.speedDouble> getGetOneVehicleMethod;
    if ((getGetOneVehicleMethod = speedControlServiceGrpc.getGetOneVehicleMethod) == null) {
      synchronized (speedControlServiceGrpc.class) {
        if ((getGetOneVehicleMethod = speedControlServiceGrpc.getGetOneVehicleMethod) == null) {
          speedControlServiceGrpc.getGetOneVehicleMethod = getGetOneVehicleMethod = 
              io.grpc.MethodDescriptor.<grpc.newService.speedDouble, grpc.newService.speedDouble>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "speedControlService", "GetOneVehicle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newService.speedDouble.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newService.speedDouble.getDefaultInstance()))
                  .setSchemaDescriptor(new speedControlServiceMethodDescriptorSupplier("GetOneVehicle"))
                  .build();
          }
        }
     }
     return getGetOneVehicleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static speedControlServiceStub newStub(io.grpc.Channel channel) {
    return new speedControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static speedControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new speedControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static speedControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new speedControlServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class speedControlServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void getOneVehicle(grpc.newService.speedDouble request,
        io.grpc.stub.StreamObserver<grpc.newService.speedDouble> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOneVehicleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetOneVehicleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.newService.speedDouble,
                grpc.newService.speedDouble>(
                  this, METHODID_GET_ONE_VEHICLE)))
          .build();
    }
  }

  /**
   */
  public static final class speedControlServiceStub extends io.grpc.stub.AbstractStub<speedControlServiceStub> {
    private speedControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private speedControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected speedControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new speedControlServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void getOneVehicle(grpc.newService.speedDouble request,
        io.grpc.stub.StreamObserver<grpc.newService.speedDouble> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOneVehicleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class speedControlServiceBlockingStub extends io.grpc.stub.AbstractStub<speedControlServiceBlockingStub> {
    private speedControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private speedControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected speedControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new speedControlServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public grpc.newService.speedDouble getOneVehicle(grpc.newService.speedDouble request) {
      return blockingUnaryCall(
          getChannel(), getGetOneVehicleMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class speedControlServiceFutureStub extends io.grpc.stub.AbstractStub<speedControlServiceFutureStub> {
    private speedControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private speedControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected speedControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new speedControlServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.newService.speedDouble> getOneVehicle(
        grpc.newService.speedDouble request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOneVehicleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ONE_VEHICLE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final speedControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(speedControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ONE_VEHICLE:
          serviceImpl.getOneVehicle((grpc.newService.speedDouble) request,
              (io.grpc.stub.StreamObserver<grpc.newService.speedDouble>) responseObserver);
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

  private static abstract class speedControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    speedControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.newService.SpeedControlServiceImp.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("speedControlService");
    }
  }

  private static final class speedControlServiceFileDescriptorSupplier
      extends speedControlServiceBaseDescriptorSupplier {
    speedControlServiceFileDescriptorSupplier() {}
  }

  private static final class speedControlServiceMethodDescriptorSupplier
      extends speedControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    speedControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (speedControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new speedControlServiceFileDescriptorSupplier())
              .addMethod(getGetOneVehicleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
