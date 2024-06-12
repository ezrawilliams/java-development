package com.pluralsight;

import java.time.LocalDate;

public class Film {
    private int filmId;
    private String title;
    private String description;
    private String year;
    private int length;

    public Film(int filmId, String title, String description, String year, int length) {
        this.filmId = filmId;
        this.title = title;
        this.description = description;
        this.year = year;
        this.length = length;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", year='" + year + '\'' +
                ", length=" + length +
                '}';
    }
}
