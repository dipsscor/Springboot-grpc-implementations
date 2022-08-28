package com.dipsscor.clients;

import com.dipsscor.interfaces.EmployeeRequest;
import com.dipsscor.interfaces.EmployeeResponse;
import com.dipsscor.interfaces.EmployeeServiceGrpc;
import com.dipsscor.interfaces.EmployeeServiceGrpc.EmployeeServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcEmployeeClient {
	
	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		
		EmployeeServiceBlockingStub stub = EmployeeServiceGrpc.newBlockingStub(channel);
		
		EmployeeResponse response = stub.employeeFullName(EmployeeRequest.newBuilder().
				setFirstName("Dipankar").setLastName("Chatterjee").build());
		
		System.out.println(response.getFullname());
		
		channel.shutdown();
	}

}
