package grpc.service4;

import java.io.IOException;

import grpc.service4.infoString;
import grpc.service4.Service4;
import grpc.service4.Service4.SpeedControlServerImpl;
import grpc.service4.Service4Grpc.Service4ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;

//required java packages for the program. Depends on your logic.
import java.util.Iterator;
import java.util.logging.Logger;

//required grpc package for the server side
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class Service4 {
	private Server server;
	private static final Logger logger = Logger.getLogger(SpeedControlServerImpl.class.getName());


	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		
		Service4 tServer = new Service4();
		tServer.start();		
	}
	private void start() throws IOException, InterruptedException {
		System.out.println("Starting grpc server service4");
				
		int port = 50054;
		server = ServerBuilder.forPort(port).addService(new SpeedControlServerImpl()).build().start();
		
		 // Giving a logging information on the server console that server has started
	    logger.info("Server started, listening on " + port);
		
		System.out.println("Server running on port: " + port);
		server.awaitTermination();		
	}
	
	static class SpeedControlServerImpl extends Service4ImplBase{		
		public StreamObserver<infoString> reverseStream(StreamObserver<infoString> responseObserver) {
			return new StreamObserver<infoString>() {

				// For each message in the stream, get one stream at a time.
				// NOTE: YOU MAY MODIFY THE LOGIC OF onNext, onError, onCompleted BASED ON YOUR PROJECT.
				@Override
				public void onNext(infoString request) {
					// In bidirectional stream, both server and  client would be sending the stream of messages.
					// Here, for each message in stream from client, server is sending back one response.
					String str = request.getFirstInfoString();
					System.out.println("Actual Speed is : " + str);
					
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

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					
				}

			};
		}
		
	}
}
