package com.lionel.wom.model;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable {

    private boolean success = false;

    private String errorCode;

    private String errorMessage;

    private String errorTips;

    private T model;

    public BaseResponse() {
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public T getModel() {
        return this.model;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public String getErrorTips() {
        return this.errorTips;
    }

    public void setErrorTips(String errorTips) {
        this.errorTips = errorTips;
    }

    public static <T> BaseResponse<T> createSuccessResult(T model) {
        BaseResponse<T> rt = new BaseResponse();
        return rt.success(model);
    }

    public BaseResponse<T> success(T model) {
        this.setSuccess(true);
        this.setModel(model);
        return this;
    }
}
