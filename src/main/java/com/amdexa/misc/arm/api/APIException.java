package com.amdexa.misc.arm.api;

public class APIException extends Exception{
    private int code;
    public APIException(int code, String msg) {
        super(msg);
        this.code = code;
    }
}
