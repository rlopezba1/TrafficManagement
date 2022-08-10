package grpc.service2;

import java.io.IOException;

import grpc.service2.Service2;
import grpc.service2.Service2Grpc.Service2ImplBase;
import grpc.service2.infoString;
//import grpc.service2.Service2.Service2Impl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class Service2 {

	private Server server;

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		
		Service2 tServer = new Service2();
		tServer.start();		
	}
	private void start() throws IOException, InterruptedException {
		System.out.println("Starting grpc server service2");
				
		int port = 50052;
		server = ServerBuilder.forPort(port).addService(new SpeedControlServerImpl()).build().start();
		
		System.out.println("Server running on port: " + port);
		server.awaitTermination();		
	}
	
	//Extend abstract base class for our own implementation
	
		static class SpeedControlServerImpl extends Service2ImplBase{		
		
			public void getOneVehicleServerStreaming(infoString request, StreamObserver<infoString> responseObserver) {
				
				// Find out what was sent by the client
				String str = request.getFirstInfoString();
				System.out.println("Actual Speed is : " + str);
				
				// now build our response
				// Step one create a builder
				infoString.Builder responseBuilder = infoString.newBuilder();
				
				responseBuilder.setFirstInfoString("Server streaming: our first response is: " + str);
				
				responseObserver.onNext(responseBuilder.build());
				
				responseBuilder.setFirstInfoString("Server streaming: our second response is: " + str);
				responseObserver.onNext(responseBuilder.build());
				
				responseBuilder.setFirstInfoString("Server streaming: our third response is: " + str);
				responseObserver.onNext(responseBuilder.build());
				
				responseBuilder.setFirstInfoString("Server streaming: our fourth response is: " + str);
				responseObserver.onNext(responseBuilder.build());

				responseObserver.onCompleted();	
			}
	}

}

