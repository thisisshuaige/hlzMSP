package com.hlz.domain.viewmodels.base;

public class BaseResponse {

    protected int code;

    protected String msg = "";

    public BaseResponse(){}

    public BaseResponse(int code){this.code = code;}

    public BaseResponse(int code,String msg){this.code = code;this.msg = msg;}


    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
