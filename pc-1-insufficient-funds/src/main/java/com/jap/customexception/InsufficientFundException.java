package com.jap.customexception;

public class InsufficientFundException extends Exception {

    public InsufficientFundException(String message) {
        super(message);
    }
}
