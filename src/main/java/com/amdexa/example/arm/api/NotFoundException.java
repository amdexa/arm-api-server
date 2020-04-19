package com.amdexa.example.arm.api;

public class NotFoundException extends APIException {
    private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
