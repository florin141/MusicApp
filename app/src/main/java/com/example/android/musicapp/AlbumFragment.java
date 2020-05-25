package com.example.android.musicapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class AlbumFragment extends Fragment {

    public AlbumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_album, container, false);

        Artist artist1 = new Artist("Hans Zimmer");
        ArrayList<Album> albums = new ArrayList<>();
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

        AlbumAdaptor adapter = new AlbumAdaptor(getActivity(), albums);

        GridView listView = rootView.findViewById(R.id.album_grid);

        listView.setAdapter(adapter);

        return rootView;
    }
}