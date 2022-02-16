package com.netflixjess.model;

import com.netflixjess.exception.EpisodeException;
import com.netflixjess.exception.SeasonException;

public class Episode {

    Integer episode;

    public Episode(Integer episode) {
        if (episode == null) {
            throw new EpisodeException("Episode cannot be null");
        } else if (episode <= 0 || episode > 25) {
            throw new EpisodeException("Episode not allowed");
        } else {
            this.episode = episode;
        }
    }

    public Integer getEpisode() {
        return episode;
    }

    public void setEpisode(Integer episode) {
        if (episode <= 0 || episode > 25) {
            throw new EpisodeException("Episode not allowed");
        } else {
            this.episode = episode;
        }
    }
}
