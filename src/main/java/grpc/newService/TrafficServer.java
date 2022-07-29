package grpc.newService;

import java.io.IOException;
import grpc.newService.speedControlServiceGrpc.speedControlServiceImplBase;
import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerServiceDefinition;
import io.grpc.stub.StreamObserver;

public class TrafficServer {
	
	private Server server;

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		
		TrafficServer tServer = new TrafficServer();
		tServer.start();		
	}
	private void start() throws IOException, InterruptedException {
		System.out.println("Starting grpc server");
				
		int port = 50051;
		server = ServerBuilder.forPort(port).addService(new SpeedControlServerImpl()).build().start();
		
		System.out.println("Server running on port: " + port);
		server.awaitTermination();		
	}
	
	//Extend abstract base class for our own implementation
	
		static class SpeedControlServerImpl extends speedControlServiceImplBase{		
		
			public void getOneVehicle(speedDouble request, StreamObserver<speedDouble> responseObserver) {
				
				// Find out what was sent by the client
				double speed = request.getSpeed();
				System.out.println("Speed is : " + speed);
				
				// now build our response
				// Step one create a builder
				speedDouble.Builder responseBuilder = speedDouble.newBuilder();
				
				responseBuilder.setSpeed(speed);
				
				responseObserver.onNext(responseBuilder.build());
				responseObserver.onCompleted();	
			}
	}

}
