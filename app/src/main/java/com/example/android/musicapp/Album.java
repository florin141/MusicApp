package com.example.android.musicapp;

import java.util.ArrayList;

public class Album {
    private static final int NO_IMAGE_PROVIDED = -1;

    private String name;
    private Artist artist;
    private ArrayList<Song> songs = new ArrayList<>();
    private int cover = NO_IMAGE_PROVIDED;

    public Album(String name, Artist artist, int cover) {
        this.name = name;
        this.artist = artist;
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void add(Song song) {
        songs.add(song);
        song.setCover(cover);
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        String string = getName() + " ";
        for (Song song : songs) {
            string += song.toString() + " ";
        }
        return string;
    }
}
