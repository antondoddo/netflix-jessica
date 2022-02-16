package com.netflixjess.model;

import com.netflixjess.exception.DurationException;
import com.netflixjess.exception.ReleaseYearException;

import java.time.LocalDate;
import java.util.Date;

public class ReleaseYear {

    LocalDate currentYear = LocalDate.now();
    Integer year;

    public ReleaseYear(Integer year) {
        if (year == null) {
            throw new ReleaseYearException("Year cannot be null");
        } else if (year <= 1895 || year > currentYear.getYear() ) {
            throw new ReleaseYearException("Year not allowed");
        } else {
            this.year = year;
        }
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        if (year <= 1895 || year > currentYear.getYear() ) {
            throw new ReleaseYearException("Year not allowed");
        } else {
            this.year = year;
        }
    }
}
