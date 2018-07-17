package com.ma.result;

import java.io.Serializable;

/**
 * Created by mh on 2018/7/17.
 */
public class ResultMsg<T> implements Serializable{
    private String code;
    private String msg;
    private T data;

    public ResultMsg(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultMsg() {
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
