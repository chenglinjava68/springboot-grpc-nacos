package com.hualala.aleenjava.grpc.config;

import lombok.Data;

@Data
public class Result  {

    private Integer code;
    private String message;
    private Object data;

    /**
     * 无参构造器
     */
    public Result() {
        super();
    }

    public Result(Status status) {
        super();
        this.code = status.code;
        this.message = status.message;
    }

    public Result result(Object result) {
        this.data = result;
        return this;
    }

    public Result message(String message) {
        this.message = message;
        return this;
    }

    /**
     * 只返回状态，状态码，消息
     *
     * @param code
     * @param message
     */
    public Result(Integer code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    /**
     * 只返回状态，状态码，数据对象
     *
     * @param code
     * @param data
     */
    public Result(Integer code, Object data) {
        super();
        this.code = code;
        this.data = data;
    }

    /**
     * 返回全部信息即状态，状态码，消息，数据对象
     *
     * @param code
     * @param message
     * @param data
     */
    public Result(Integer code, String message, Object data) {
        super();
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
