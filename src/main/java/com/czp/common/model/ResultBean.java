package com.czp.common.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
public class ResultBean<T> implements Serializable {
    public static final Integer SUCCESS = 200;
    public static final Integer ERROR = 400;
    private Integer code;
    private String msg;
    private T data;

    public ResultBean() {
        this.code = SUCCESS;
        msg = "请求成功";
    }

    public ResultBean(T data) {
        this.code = SUCCESS;
        msg = "请求成功";
        this.data = data;
    }

}
