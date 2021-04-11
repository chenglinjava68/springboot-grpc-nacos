package com.hualala.aleenjava.grpc.dto;

import lombok.Data;

import java.util.Date;


@Data
public class UserDTO {
    private long id;
    private String nick;
    private String email;
    private String phone;
    private double balance;
    private Date bornAt;
    private long flag;
    private Integer vip;
}
