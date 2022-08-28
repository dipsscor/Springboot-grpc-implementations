# GRPC Implementation examples using Springboot

gRPC is a high performance, open source RPC framework initially developed by Google. It helps in eliminating boilerplate code and helps in connecting polyglot services in and across data centers.

The framework is based on a client-server model of remote procedure calls. A client application can directly call methods on a server application as if it was a local object.
This Implementation will use following steps to create a typical client-server application using gRPC:

		1. Define a service in a .proto file
		2. Generate server and client code using the protocol buffer compiler
		3. Create the server application, implementing the generated service interfaces and spawning the gRPC server
		4. Create the client application, making RPC calls using generated stubs 
		
GRPC is bit difficult in implementing in java since Springboot does not provide out-of-box direct support for GRPC till now ( Aug- 2022). for this implementation we would 
be following the below approach:

# Split the project into 2-3 separate modules.

	### The interface project (non springboot) 
		Contains the raw protobuf files and generates the java model and service classes. You probably share this part. In this case we have 
		Created a "grpc-common-interface" which contains the protobuffer files. This will generate the code for server and stubs. Since the generated codebase cannot be
		be used with the 
	### The server project (Springboot) 
		Contains the actual implementation of your project and uses the interface project as dependency.
		
	### The client projects ( Java or any other technologies)
		(optional and possibly many) Any client projects that use the pre-generated stubs to access the server.
		
![alt text](https://github.com/dipsscor/Springboot-grpc-implementations/blob/master/architecture.png)

	