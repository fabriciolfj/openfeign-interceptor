package com.github.fabriciolfj;

public class PersonClientException extends RuntimeException {

    private int code;

    public PersonClientException(final String message, final int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
