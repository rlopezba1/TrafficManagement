package grpc.service3;

import java.io.IOException;

import grpc.service3.Service3;
import grpc.service3.Service3Grpc.Service3ImplBase;
import grpc.service3.infoString;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class Service3 {

	private Server server;

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		
		Service3 tServer = new Service3();
		tServer.start();		
	}
	private void start() throws IOException, InterruptedException {
		System.out.println("Starting grpc server service3");
				
		int port = 50053;
		server = ServerBuilder.forPort(port).addService(new SpeedControlServerImpl()).build().start();
		
		System.out.println("Server running on port: " + port);
		server.awaitTermination();		
	}
	
	//Extend abstract base class for our own implementation
	
		static class SpeedControlServerImpl extends Service3ImplBase{		
		
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
			
			
			//method for client streaming
			// server is getting stream messages from the client
			
			@Override
			public StreamObserver<infoString> sendClientStreaming(StreamObserver<infoString> responseObserver){
				return new StreamObserver<infoString>() {

					@Override
					public void onNext(infoString request) {
						// TODO Auto-generated method stub
						System.out.println("On server side message recieved from client : " + request.getFirstInfoString());

					}

					@Override
					public void onError(Throwable t) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void onCompleted() {
						// TODO Auto-generated method stub
						// now build our response
						// Step one create a builder
						infoString.Builder responseBuilder = infoString.newBuilder();
						
						responseBuilder.setFirstInfoString("On server side: server says got the completed message ");
						
						responseObserver.onNext(responseBuilder.build());
						responseObserver.onCompleted();	

						
					}};
				
			
			}
	}

}

