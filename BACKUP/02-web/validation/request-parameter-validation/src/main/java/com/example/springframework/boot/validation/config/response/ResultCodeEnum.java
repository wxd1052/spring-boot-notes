package com.example.springframework.boot.validation.config.response;

public enum ResultCodeEnum {
    //成功
    SUCCESS(0,null),
    //失败
    FAIL(-1,"系统出错"),
    //未知
    NOT_FOUND(1,"未找到"),
    //请求入参校验出错
    REQUEST_PARAM_ERROR(2,"请求入参校验出错")
    ;

    private int errorCode;

    private String errorMessage;

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    ResultCodeEnum(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public static ResultCodeEnum getErrorCodeEnum(int errorCode) {
        for (ResultCodeEnum resultCodeEnum : ResultCodeEnum.values()) {
            if (resultCodeEnum.getErrorCode() == errorCode) {
                return resultCodeEnum;
            }
        }
        return null;
    }
}
