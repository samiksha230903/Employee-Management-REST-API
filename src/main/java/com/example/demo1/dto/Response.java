package com.example.demo1.dto;

import java.time.LocalDateTime;

import com.example.demo1.enums.ErrorCode;

public class Response {
  private Object data;
  private String message;
  private boolean success;
  private LocalDateTime timeStamp;
  private ErrorCode errorCode;
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
    this.data = data;
  }
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  public boolean isSuccess() {
    return success;
  }
  public void setSuccess(boolean success) {
    this.success = success;
  }
  public LocalDateTime getTimeStamp() {
    return timeStamp;
  }
  public void setTimeStamp(LocalDateTime timeStamp) {
    this.timeStamp = timeStamp;
  }
  public ErrorCode getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(ErrorCode errorCode) {
    this.errorCode = errorCode;
  }
  public Response () {
    this.timeStamp = LocalDateTime.now();
  }
}