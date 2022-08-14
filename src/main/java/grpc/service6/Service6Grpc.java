package grpc.service6;

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
    comments = "Source: service6.proto")
public final class Service6Grpc {

  private Service6Grpc() {}

  public static final String SERVICE_NAME = "Service6";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.service6.containsString,
      grpc.service6.containsString> getGetfirsttStringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetfirsttString",
      requestType = grpc.service6.containsString.class,
      responseType = grpc.service6.containsString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.service6.containsString,
      grpc.service6.containsString> getGetfirsttStringMethod() {
    io.grpc.MethodDescriptor<grpc.service6.containsString, grpc.service6.containsString> getGetfirsttStringMethod;
    if ((getGetfirsttStringMethod = Service6Grpc.getGetfirsttStringMethod) == null) {
      synchronized (Service6Grpc.class) {
        if ((getGetfirsttStringMethod = Service6Grpc.getGetfirsttStringMethod) == null) {
          Service6Grpc.getGetfirsttStringMethod = getGetfirsttStringMethod = 
              io.grpc.MethodDescriptor.<grpc.service6.containsString, grpc.service6.containsString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service6", "GetfirsttString"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service6.containsString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service6.containsString.getDefaultInstance()))
                  .setSchemaDescriptor(new Service6MethodDescriptorSupplier("GetfirsttString"))
                  .build();
          }
        }
     }
     return getGetfirsttStringMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service6Stub newStub(io.grpc.Channel channel) {
    return new Service6Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service6BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service6BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service6FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service6FutureStub(channel);
  }

  /**
   */
  public static abstract class Service6ImplBase implements io.grpc.BindableService {

    /**
     */
    public void getfirsttString(grpc.service6.containsString request,
        io.grpc.stub.StreamObserver<grpc.service6.containsString> responseObserver) {
      asyncUnimplementedUnaryCall(getGetfirsttStringMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetfirsttStringMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.service6.containsString,
                grpc.service6.containsString>(
                  this, METHODID_GETFIRSTT_STRING)))
          .build();
    }
  }

  /**
   */
  public static final class Service6Stub extends io.grpc.stub.AbstractStub<Service6Stub> {
    private Service6Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service6Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service6Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service6Stub(channel, callOptions);
    }

    /**
     */
    public void getfirsttString(grpc.service6.containsString request,
        io.grpc.stub.StreamObserver<grpc.service6.containsString> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetfirsttStringMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class Service6BlockingStub extends io.grpc.stub.AbstractStub<Service6BlockingStub> {
    private Service6BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service6BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service6BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service6BlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.service6.containsString getfirsttString(grpc.service6.containsString request) {
      return blockingUnaryCall(
          getChannel(), getGetfirsttStringMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Service6FutureStub extends io.grpc.stub.AbstractStub<Service6FutureStub> {
    private Service6FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service6FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service6FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service6FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.service6.containsString> getfirsttString(
        grpc.service6.containsString request) {
      return futureUnaryCall(
          getChannel().newCall(getGetfirsttStringMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GETFIRSTT_STRING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service6ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service6ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GETFIRSTT_STRING:
          serviceImpl.getfirsttString((grpc.service6.containsString) request,
              (io.grpc.stub.StreamObserver<grpc.service6.containsString>) responseObserver);
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

  private static abstract class Service6BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service6BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.service6.Service6Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service6");
    }
  }

  private static final class Service6FileDescriptorSupplier
      extends Service6BaseDescriptorSupplier {
    Service6FileDescriptorSupplier() {}
  }

  private static final class Service6MethodDescriptorSupplier
      extends Service6BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service6MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service6Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service6FileDescriptorSupplier())
              .addMethod(getGetfirsttStringMethod())
              .build();
        }
      }
    }
    return result;
  }
}
