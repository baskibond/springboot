package com.springboot.demo.models;


import lombok.Data;

@Data
public class CustomHttpResponseData<T> {
    private boolean success;
    private int status;
    private String error_message;
    private T result;
    public CustomHttpResponseData(boolean success,int status, String error_message, T result){
        this.success=success;
        this.error_message=error_message;
        this.status=status;
        this.result=result;
    }
}
