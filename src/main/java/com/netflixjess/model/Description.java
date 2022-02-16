package com.netflixjess.model;

import com.netflixjess.exception.DescriptionException;
import com.netflixjess.exception.SeasonException;

public class Description {

    String description;

    public Description(String description) {
        if (description == null) {
            throw new DescriptionException("Description cannot be null");
        } else if (description.length() > 250) {
            throw new DescriptionException("Attention! Too long description!");
        }else if (description.length() < 5) {
            throw new DescriptionException("Attention! Too short description!");
        }else {
            this.description = description;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length() > 250) {
            throw new DescriptionException("Attention! Too long description!");
        } else if (description.length() < 5) {
            throw new DescriptionException("Attention! Too short description!");
        } else
            this.description = description;
    }
}
