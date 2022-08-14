package grpc.service6;

import java.io.IOException;

import grpc.service6.Service6;
import grpc.service6.containsString;
//import grpc.service6.service6.Service6Impl;
import grpc.service6.Service6Grpc.Service6ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class Service6 {

	private Server server;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		final Service6 ourServer = new Service6();
		ourServer.start();

	}

	private void start() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Starting gRPC Server");
		
		int port = 50051;
		server = ServerBuilder.forPort(port).addService(new Service6Impl()).build().start();
		
		System.out.println("Server running on port: " + port);
		
		server.awaitTermination();
		
		
		
	}
	
	//Extend abstract base class for our implementation
	static class Service6Impl extends Service6ImplBase {
		
		public void getFirstString(containsString request, StreamObserver<containsString> responseObserver) {
			
			//Find out what was sent by client
			String firstString = request.getFirststring();
			System.out.println("firstString is: " + firstString);
			
			//Now build our response
			
			containsString.Builder response = containsString.newBuilder();
			
			 String str = firstString;
		        try{
		            Integer number = Integer.valueOf(str);
		            System.out.println(number); 
		            if (number < 121) {
		            	System.out.println("Speed correct");
		            	firstString = "Speed correct";
		            }else {
		            	System.out.println("Speed incorrect, too fast!");
		            	firstString = "Speed incorrect, too fast!";
		            }
		        }
		        catch (NumberFormatException ex){
		            ex.printStackTrace();
		        }
			
			response.setFirststring("Our first response string: " + firstString);
			
			//Send out message
			responseObserver.onNext(response.build());
			
			responseObserver.onCompleted();			
		}
	
	}
	
}
