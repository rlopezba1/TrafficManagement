package grpc.service3;

import java.util.concurrent.TimeUnit;

import grpc.service3.Service3Grpc.Service3BlockingStub;
import grpc.service3.Service3Grpc.Service3Stub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class NewVehicle {

	public static void main(String[] args) throws InterruptedException {
		//1.Create a channel
		//2 Create a message
		//Create a stub
		
		//Build channel - a channel connect the client to the server
		int port =50053;  
		String host = "localhost";
		
		ManagedChannel newChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		// now build our message
		infoString sString = infoString.newBuilder().setFirstInfoString("B2545").build();
		
		//create a stub
		//the stub is a local representation of our remote object or service
		
		Service3BlockingStub bstub = Service3Grpc.newBlockingStub(newChannel);
		Service3Stub asyncstub = Service3Grpc.newStub(newChannel);
		
				
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
				
			}};
			
			// grpc library returns a streamObserver to us
			
			StreamObserver<infoString> requestObserver = asyncstub.sendClientStreaming(responseObserver);
			requestObserver.onNext(infoString.newBuilder().setFirstInfoString("A2545").build());
			requestObserver.onNext(infoString.newBuilder().setFirstInfoString("B2545").build());
			requestObserver.onNext(infoString.newBuilder().setFirstInfoString("C2545").build());
			requestObserver.onNext(infoString.newBuilder().setFirstInfoString("D2545").build());
			
			requestObserver.onCompleted();
			Thread.sleep(5000);	

			
		newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS );
	}
}
