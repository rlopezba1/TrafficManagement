package grpc.service4;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import grpc.service4.Service4Grpc;
import grpc.service4.infoString;
import grpc.service4.Service4Grpc.Service4BlockingStub;
import grpc.service4.Service4Grpc.Service4Stub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class NewClientService4 {
	private static  Logger logger = Logger.getLogger(NewClientService4.class.getName());
	// Creating stubs for establishing the connection with server.
	// Blocking stub
	private static Service4BlockingStub blockingStub;
// Asynch stub
	private static Service4Stub asyncStub;

		public static void main(String[] args) throws InterruptedException {
			//1.Create a channel
			//2 Create a message
			//Create a stub
			
			//Build channel - a channel connect the client to the server
			int port =50054;  
			String host = "localhost";
			
			ManagedChannel newChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
			
			// now build our message
			infoString sString = infoString.newBuilder().setFirstInfoString("B2545").build();
			
			//create a stub
			//the stub is a local representation of our remote object or service
			
			blockingStub = Service4Grpc.newBlockingStub(newChannel);
			asyncStub = Service4Grpc.newStub(newChannel);
			
			//bidirectional streaming		
			
			
			StreamObserver<infoString> responseObserver = new StreamObserver<infoString> () {

				@Override
				public void onNext(infoString value) {
					// TODO Auto-generated method stub
					System.out.println("The response from the server " + value.getFirstInfoString());
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("server completed");

				}};
				
				// grpc library returns a streamObserver to us
				
				StreamObserver<infoString> requestObserver = asyncStub.sendClientServerStreaming(responseObserver);
				
				try {
				requestObserver.onNext(infoString.newBuilder().setFirstInfoString("A2545").build());
				requestObserver.onNext(infoString.newBuilder().setFirstInfoString("B2545").build());
				requestObserver.onNext(infoString.newBuilder().setFirstInfoString("C2545").build());
				requestObserver.onNext(infoString.newBuilder().setFirstInfoString("D2545").build());
				
				System.out.println("SENDING MESSAGES");

				
				requestObserver.onCompleted();
				Thread.sleep(5000);	
				
				} catch (RuntimeException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {			
					e.printStackTrace();
				}
			
				
			newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS );
		}
	
		
}
