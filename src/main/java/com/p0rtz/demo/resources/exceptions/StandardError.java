package com.p0rtz.demo.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable {

    private Long timestrap;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardError(){

    }

    public StandardError(Long timestrap, Integer status, String error, String message, String path) {
        this.timestrap = timestrap;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Long getTimestrap() {
        return timestrap;
    }

    public void setTimestrap(Long timestrap) {
        this.timestrap = timestrap;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }



}
