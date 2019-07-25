package com.hlz.domain.viewmodels.base;

import com.hlz.domain.enums.ResponseStatusCode;
import io.swagger.annotations.ApiModelProperty;

public class Response<T> extends BaseResponse {

    @ApiModelProperty("数据集合")
    protected T content;

    public Response() {
        super();
    }

    public Response(int code){
        super(code);
    }

    public Response(T content){
        super();
        this.setCode(ResponseStatusCode.SUCCESS.code);
        this.content = content;
    }

    public Response(int code,T content){
        super(code);
        this.content = content;
    }

    public Response(int code,String msg){
        super(code,msg);
    }

    public Response (int code,String msg,T content){
        super(code,msg);
        this.content = content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        if ( content == null || "".equals(content)){
            return null;
        }
        return content;
    }
}
