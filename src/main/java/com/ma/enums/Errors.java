package com.ma.enums;

/**
 * Created by mh on 2018/7/17.
 */
public enum Errors {
    UNKNOWN_ERROT("-1","未知错误"),
    SUCCESS("0","success"),
    Less("101","less than 18"),
    MORE("102","more than 18")
    ;

    private String code;
    private String msg;

    Errors(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    Errors() {
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
