# GRPC Implementation examples using Springboot

gRPC is a high performance, open source RPC framework initially developed by Google. It helps in eliminating boilerplate code and helps in connecting polyglot services in and across data centers.

The framework is based on a client-server model of remote procedure calls. A client application can directly call methods on a server application as if it was a local object.
This Implementation will use following steps to create a typical client-server application using gRPC:

		Define a service in a .proto file
		Generate server and client code using the protocol buffer compiler
		Create the server application, implementing the generated service interfaces and spawning the gRPC server
		Create the client application, making RPC calls using generated stubs 