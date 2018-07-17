package com.ma.exception;

import com.ma.enums.Errors;

/**
 * Created by mh on 2018/7/17.
 */
public class StudentException extends RuntimeException {
    private String code;

    public StudentException(Errors errors) {
        super(errors.getMsg());
        this.code = errors.getCode();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
