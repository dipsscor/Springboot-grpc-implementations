package com.dipsscor.service;

import com.dipsscor.interfaces.EmployeeRequest;
import com.dipsscor.interfaces.EmployeeResponse;
import com.dipsscor.interfaces.EmployeeServiceGrpc.EmployeeServiceImplBase;
import net.devh.boot.grpc.server.service.GrpcService;

import io.grpc.stub.StreamObserver;

@GrpcService
public class EmployeeServiceImpl extends EmployeeServiceImplBase{
	
	@Override
	public void employeeFullName(EmployeeRequest request, StreamObserver<EmployeeResponse> responseObserver) {

		String firstName = 	request.getFirstName();
		String lastName  =  request.getLastName();
		
		EmployeeResponse response = EmployeeResponse.newBuilder().
				setFullname("Your Name is :"+ firstName + " " + lastName).build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
		
	}

}
