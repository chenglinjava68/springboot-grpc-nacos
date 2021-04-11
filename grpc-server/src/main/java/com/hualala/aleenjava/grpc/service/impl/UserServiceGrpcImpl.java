package com.hualala.aleenjava.grpc.service.impl;


import com.hualala.aleenjava.grpc.beanmapper.UserMapper;
import com.hualala.aleenjava.grpc.config.Status;
import com.hualala.aleenjava.grpc.model.TblUser;
import com.hualala.aleenjava.grpc.service.ITblUserService;
import com.hualala.aleenjava.grpc.user.UserReply;
import com.hualala.aleenjava.grpc.user.UserRequest;
import com.hualala.aleenjava.grpc.user.UserServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@GrpcService
public class UserServiceGrpcImpl extends UserServiceGrpc.UserServiceImplBase {


    @Autowired
    private ITblUserService iTblUserService;

    @Override
    public void queryUser(UserRequest request, StreamObserver<UserReply> responseObserver) {
        log.info("request id {}", request.getId());
        UserReply.Builder userReply =  UserReply.newBuilder();
        TblUser tblUser = iTblUserService.getById(request.getId());
        userReply.setCode(Status.SUCCESS.code).setMsg(Status.SUCCESS.message).setSuccess(true);
        userReply.setData(UserReply.Data.newBuilder().setUserPb(UserMapper.INSTANCE.convertToProtobuf(tblUser)));
        responseObserver.onNext(userReply.build());
        responseObserver.onCompleted();
    }
}
