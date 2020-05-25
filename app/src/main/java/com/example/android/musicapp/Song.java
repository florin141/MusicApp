package com.example.android.musicapp;

public class Song {
    private static final int NO_IMAGE_PROVIDED = -1;

    private String name;
    private Artist artist;
    private Genre genre;
    private int cover = NO_IMAGE_PROVIDED;

    public Song(String name, Artist artist, Genre genre) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return getName() + "by " + getArtist().toString();
    }
}
