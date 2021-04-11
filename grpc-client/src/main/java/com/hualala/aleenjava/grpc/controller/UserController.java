package com.hualala.aleenjava.grpc.controller;
import com.hualala.aleenjava.grpc.user.UserReply;
import com.hualala.aleenjava.grpc.user.UserRequest;
import com.hualala.aleenjava.grpc.user.UserServiceGrpc;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author aleenjava
 * @since 2021-04-10
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @GrpcClient("greeter-grpc-service")
    UserServiceGrpc.UserServiceFutureStub futureStub;

    @RequestMapping(value="/queryUser/{id}")
    public UserReply queryUser(@PathVariable Integer id)  {
        UserReply userReply = null;
        try {
            userReply = futureStub.queryUser(UserRequest.newBuilder().setId(id).build()).get();
            return userReply;
        } catch (InterruptedException e) {

        } catch (ExecutionException e) {

        }
        return userReply;
    }

}
