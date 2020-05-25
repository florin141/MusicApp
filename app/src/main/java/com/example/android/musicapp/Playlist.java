package com.example.android.musicapp;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<Song> songs = new ArrayList<>();

    public String getString() {
        String string = "";
        for (Song song : songs) {
            string += song.toString();
        }
        return string;
    }

    public void addSong(Song item) {
        songs.add(item);
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setItems(ArrayList<Song> songs) {
        this.songs = songs;
    }
}
