package grpc.newService;

import java.util.concurrent.TimeUnit;

import grpc.newService.speedControlServiceGrpc.speedControlServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class NewVehicle {

	public static void main(String[] args) throws InterruptedException {
		//1.Create a channel
		//2 Create a message
		//Create a stub
		
		//Build channel - a channel connect the client to the server
		int port =50051;  
		String host = "localhost";
		
		ManagedChannel newChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		// now build our message
		speedDouble sDouble = speedDouble.newBuilder().setSpeed(23.9).build();
		
		//create a stub
		//the stub is a local representation of our remote object or service
		
		speedControlServiceBlockingStub bstub = speedControlServiceGrpc.newBlockingStub(newChannel);
		
		// 
				
		speedDouble response = bstub.oneVehicle(sDouble);
		
		//printout the response
		System.out.println(response.getSpeed());
		
		newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS );
	}
}
