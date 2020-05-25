package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    private ArrayList<Album> albums = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        Artist artist1 = new Artist("Hans Zimmer");
        albums.add(new Album("Sherlock Holmes", artist1, R.drawable.cover1));
        albums.add(new Album("Angels & Demons ", artist1, R.drawable.cover2));

        artist1 = new Artist("Hans Zimmer");
        Artist artist2 = new Artist("James Newton Howard");
        artist1.addCollaborator(artist2);
        albums.add(new Album("The Dark Knight", artist1, R.drawable.cover3));

        Artist artist3 = new Artist("Alan Silvestri");
        albums.add(new Album("Avengers: Endgame", artist3, R.drawable.cover4));

        Artist artist4 = new Artist("Thomas Newman");
        albums.add(new Album("Spectre", artist4, R.drawable.cover5));

        AlbumAdaptor adapter = new AlbumAdaptor(this, albums);

        GridView gridView = findViewById(R.id.album_grid);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Album album = albums.get(position);

                Log.i(SongActivity.class.getSimpleName(), album.getName() + " by " + album.getArtist().toString());
            }
        });
    }
}