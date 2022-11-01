package com.test.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("API Response")
public class ApiResult<T> {

    @ApiModelProperty(value="code")
    private String code;

    @ApiModelProperty(value="msg")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String msg;

    @ApiModelProperty(value="data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public ApiResult() {
        super();
    }

    public ApiResult(String code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public ApiResult(String code, String msg, T data) {
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }


}

