package com.kkw.file.model;

public class ResponseMessage<T> {

    private boolean status;
    private String message;
    private T data;

    public static ResponseMessage ok(String message) {
        return new ResponseMessage(true, message+"成功");
    }

    public static ResponseMessage error(String message) {
        return new ResponseMessage(false, message+"失败");
    }



    public ResponseMessage(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseMessage(boolean status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
