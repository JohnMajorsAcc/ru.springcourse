package ru.springcourse.firstspringapp.app;

import java.util.Date;

public class Song {
    private String name;
    private String author;
    private int duration;
    private Date creationDate;
    private MusicGenre genre;


    @Override
    public String toString() {
        return name + " by " + author + " (genre: " + genre+")";
    }

    public Song(String name, String author, int duration, Date creationDate, MusicGenre genre) {
        this.name = name;
        this.author = author;
        this.duration = duration;
        this.creationDate = creationDate;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public MusicGenre getGenre() {
        return genre;
    }

    public void setGenre(MusicGenre genre) {
        this.genre = genre;
    }
}
