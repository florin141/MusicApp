package com.example.android.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    private final Context context;
    private final ArrayList<Song> songs;

    public SongAdapter(@NonNull Context context, @NonNull ArrayList<Song> songs) {
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

        final Song currentSong = getItem(position);

        ImageView songCover = listItemView.findViewById(R.id.cover);
        songCover.setImageResource(currentSong.getCover());

        TextView songNameTextView = listItemView.findViewById(R.id.song_name);
        songNameTextView.setText(currentSong.getName());

        TextView artistNameTextView = listItemView.findViewById(R.id.artist_name);
        artistNameTextView.setText(currentSong.getArtist().toString());

        Button playPause = listItemView.findViewById(R.id.play_pause_list);
        playPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Playing '" + currentSong.getName() + "' by " + currentSong.getArtist().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        return listItemView;
    }
}
