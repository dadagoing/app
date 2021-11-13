package com.lxd.app.exception;

public class BusinessException extends AppException{

    public BusinessException() {
    }

    public BusinessException(AppExceptionEmun emun) {
        super(emun);
    }

    public BusinessException(Integer code) {
        super(code);
    }

    public BusinessException(String msg) {
        super(msg);
    }
}
