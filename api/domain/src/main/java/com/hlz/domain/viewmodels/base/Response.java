package com.hlz.domain.viewmodels.base;

import com.hlz.domain.enums.ResponseStatusCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class Response<T> extends BaseResponse {

    //当前页
    private Integer pageNumber;

    //每页显示条数
    private Integer pageSize;

    //总记录数
    private Integer total;

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
