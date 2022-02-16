package com.netflixjess.model;

import com.netflixjess.exception.SeasonException;

public class Season {

    Integer season;

    public Season(Integer season) {
        if (season == null) {
            throw new SeasonException("Season cannot be null");
        } else if (season <= 0 || season > 50) {
            throw new SeasonException("Season not allowed");
        } else {
            this.season = season;
        }
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        if (season <= 0 || season > 50) {
            throw new SeasonException("Season not allowed");
        } else {
            this.season = season;
        }
    }
}


