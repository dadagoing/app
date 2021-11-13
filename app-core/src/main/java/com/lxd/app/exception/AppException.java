package com.lxd.app.exception;

public class AppException extends RuntimeException{

    private String msg;
    private Integer code;

    public AppException() {
        super();
    }

    public AppException(AppExceptionEmun emun){
        this.code = emun.getCode();
        this.msg = emun.getMsg();
    }

    public AppException(Integer code){
        this.code = code;
    }

    public AppException(String msg){
        this.msg = msg;
    }


}
