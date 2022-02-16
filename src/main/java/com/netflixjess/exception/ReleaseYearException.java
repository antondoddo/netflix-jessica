package com.netflixjess.exception;

public class ReleaseYearException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ReleaseYearException(String message) {
        super(message);
    }
}
