package com.netflixjess.model;

import com.netflixjess.exception.DurationException;
import com.netflixjess.exception.EpisodeException;

public class Duration {

    Integer mins;

    public Duration(Integer mins) {
        if (mins == null) {
            throw new DurationException("Duration cannot be null");
        } else if (mins <= 0 || mins > 240) {
            throw new DurationException("Duration not allowed");
        } else {
            this.mins = mins;
        }
    }

    public Integer getMins() {
        return mins;
    }

    public void setMins(Integer mins) {
        if (mins <= 0 || mins > 240) {
            throw new DurationException("Duration not allowed");
        } else {
            this.mins = mins;
        }
    }
}
