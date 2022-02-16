package com.netflixjess.exception;

public class EpisodeException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public EpisodeException(String message) {
        super(message);
    }
}
