package com.hlz.domain.viewmodels.base;


import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BaseResponse {

    @ApiModelProperty("当前页")
    private Integer pageNumber;

    @ApiModelProperty("每页显示条数")
    private Integer pageSize;

    @ApiModelProperty("总记录数")
    private Integer total;

    @ApiModelProperty(value = "总页数")
    private Integer totalPages;

    @ApiModelProperty("标识码")
    protected int code;

    @ApiModelProperty("提示信息")
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
