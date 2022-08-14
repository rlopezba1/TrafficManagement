package grpc.service6;

import grpc.service6.Service6Grpc.Service6BlockingStub;
import grpc.service6.Service6Grpc.Service6Stub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class NewClient {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Build a channel
		int port = 50051;
		String host = "localhost";
		
		ManagedChannel newChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		//code previous to this is generic - except that you may change port number		
		//now build our message
		
		containsString cString = containsString.newBuilder().setFirststring("122").build();

		// Create a stub, pass the channel to the stub
		// The stub is specific to our service
		
		Service6BlockingStub bstub = Service6Grpc.newBlockingStub(newChannel);
		Service6Stub asyncstub = Service6Grpc.newStub(newChannel);

		
		//Calling the server and receiving a response
		containsString response = bstub.getfirsttString(cString);
		
		System.out.println("This is the client: " + response.getFirststring());
		
}
}