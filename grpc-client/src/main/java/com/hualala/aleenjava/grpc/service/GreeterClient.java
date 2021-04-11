package com.hualala.aleenjava.grpc.service;


import com.hualala.aleenjava.grpc.greeter.GreeterReply;
import com.hualala.aleenjava.grpc.greeter.GreeterRequest;
import com.hualala.aleenjava.grpc.greeter.GreeterServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;


@Service
public class GreeterClient {


    @GrpcClient(value = "greeter-grpc-service")
    private GreeterServiceGrpc.GreeterServiceBlockingStub stub;

    public void sayHello(String name) {
        GreeterReply reply = stub.sayHello(GreeterRequest.newBuilder().setName(name).build());
        System.out.println(reply.getMessage());
    }
}
