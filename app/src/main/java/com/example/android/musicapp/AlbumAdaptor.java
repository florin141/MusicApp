package com.example.android.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;

import java.util.ArrayList;

public class AlbumAdaptor extends ArrayAdapter<Album> {

    private final Context context;
    private final ArrayList<Album> albums;

    public AlbumAdaptor(@NonNull Context context, @NonNull ArrayList<Album> albums) {
        super(context, 0, albums);
        this.context = context;
        this.albums = albums;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.album_item, parent, false);
        }

        Album currentAlbum = getItem(position);

        AppCompatImageView albumCover = listItemView.findViewById(R.id.album_cover);
        albumCover.setImageResource(currentAlbum.getCover());

        TextView albumNameTextView = listItemView.findViewById(R.id.album_name);
        albumNameTextView.setText(currentAlbum.getName());

        TextView artistNameTextView = listItemView.findViewById(R.id.artist_name);
        artistNameTextView.setText(currentAlbum.getArtist().toString());

        return listItemView;
    }
}