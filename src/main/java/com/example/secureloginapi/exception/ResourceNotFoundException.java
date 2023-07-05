package com.example.secureloginapi.exception;
public class ResourceNotFoundException extends RuntimeException{
    private final String fieldValue;
    public ResourceNotFoundException(String fieldValue) {
        super(fieldValue);
        this.fieldValue = fieldValue;
    }
    public String getFieldValue() {
        return fieldValue;
    }
}
