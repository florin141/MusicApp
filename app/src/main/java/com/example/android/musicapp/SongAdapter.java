package com.example.android.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    private final Context context;
    private final ArrayList<Song> songs;

    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
        this.context = context;
        this.songs = songs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.song_item, parent, false);
        }

        Song currentSong = getItem(position);

        AppCompatImageView songCover = listItemView.findViewById(R.id.cover);
        songCover.setImageResource(currentSong.getCover());

        TextView songNameTextView = listItemView.findViewById(R.id.song_name);
        songNameTextView.setText(currentSong.getName());

        TextView artistNameTextView = listItemView.findViewById(R.id.artist_name);
        artistNameTextView.setText(currentSong.getArtist().toString());

        return listItemView;
    }
}
