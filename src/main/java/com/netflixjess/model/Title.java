package com.netflixjess.model;

import com.netflixjess.exception.DescriptionException;
import com.netflixjess.exception.TitleException;

public class Title {

    String title;

    public Title (String title) {
        if (title == null) {
            throw new TitleException("Title cannot be null");
        } else if (title.length() > 50){
            throw new TitleException("Attention! Too long title!");
        } else if(title.length() <= 0) {
            throw new TitleException("Attention! Too short title!");
        } else{
            this.title = title;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.length() > 50) {
            throw new TitleException("Attention! Too long Title!");
        } else if(title.length() <= 0 ) {
            throw new TitleException("Attention! Too short title!");
        } else{
            this.title = title;
        }
    }
}
