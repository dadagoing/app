package com.lxd.app.exception;

public enum AppExceptionEmun {

    ERROR_DATE_FORMART("日期转换异常",5000);


    private String msg;
    private Integer code;

    AppExceptionEmun(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public Integer getCode() {
        return code;
    }
}
