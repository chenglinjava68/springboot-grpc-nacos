package com.hualala.aleenjava.grpc.config;

public enum Status {
    SUCCESS(2000, "成功"),
    UNKNOWN_ERROR(9998,"未知异常"),
    SYSTEM_ERROR(9999, "系统异常");


    public int code;
    public String message;

    Status(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
