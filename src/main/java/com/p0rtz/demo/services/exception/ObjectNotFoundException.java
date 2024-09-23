package com.p0rtz.demo.services.exception;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(String msg){
        super(msg);
    }

}
