package com.example.android.musicapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

    private ArrayList<Song> songs = new ArrayList<>();

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        Artist artist1 = new Artist("Hans Zimmer");

        Album album1 = new Album("Sherlock Holmes", artist1, R.drawable.cover1);
        album1.add(new Song("Discombobulate", artist1, Genre.SOUNDTRACK));
        album1.add(new Song("Is It Poison, Nanny?", artist1, Genre.SOUNDTRACK));
        album1.add(new Song("I Never Woke Up In Handcuffs Before", artist1, Genre.SOUNDTRACK));
        album1.add(new Song("My Mind Rebels At Stagnation", artist1, Genre.SOUNDTRACK));
        album1.add(new Song("Data, Data, Data", artist1, Genre.SOUNDTRACK));
        album1.add(new Song("He's Killed The Dog Again", artist1, Genre.SOUNDTRACK));
        album1.add(new Song("Marital Sabotage", artist1, Genre.SOUNDTRACK));
        album1.add(new Song("Not In Blood, But In Bond", artist1, Genre.SOUNDTRACK));
        album1.add(new Song("Ah, Putrefaction", artist1, Genre.SOUNDTRACK));
        album1.add(new Song("Panic, Shear Bloody Panic", artist1, Genre.SOUNDTRACK));
        album1.add(new Song("Psychological Recovery", artist1, Genre.SOUNDTRACK));
        album1.add(new Song("Catatonic", artist1, Genre.SOUNDTRACK));

        Album album2 = new Album("Angels & Demons ", artist1, R.drawable.cover2);
        album2.add(new Song("160 BPM", artist1, Genre.SOUNDTRACK));
        album2.add(new Song("God Particle", artist1, Genre.SOUNDTRACK));
        album2.add(new Song("Air", artist1, Genre.SOUNDTRACK));
        album2.add(new Song("Fire", artist1, Genre.SOUNDTRACK));
        album2.add(new Song("Black Smoke", artist1, Genre.SOUNDTRACK));
        album2.add(new Song("Science and Religion", artist1, Genre.SOUNDTRACK));
        album2.add(new Song("Immolation", artist1, Genre.SOUNDTRACK));
        album2.add(new Song("Election by Adoration", artist1, Genre.SOUNDTRACK));
        album2.add(new Song("503", artist1, Genre.SOUNDTRACK));

        artist1 = new Artist("Hans Zimmer");
        Artist artist2 = new Artist("James Newton Howard");
        artist1.addCollaborator(artist2);
        Album album3 = new Album("The Dark Knight ", artist1, R.drawable.cover3);
        album3.add(new Song("Why so Serious?", artist1, Genre.SOUNDTRACK));
        album3.add(new Song("I'm Not a Hero?", artist1, Genre.SOUNDTRACK));
        album3.add(new Song("Harvey Two-Face", artist1, Genre.SOUNDTRACK));
        album3.add(new Song("Aggressive Expansion", artist1, Genre.SOUNDTRACK));
        album3.add(new Song("Always a Catch", artist1, Genre.SOUNDTRACK));
        album3.add(new Song("Blood on My Hands", artist1, Genre.SOUNDTRACK));
        album3.add(new Song("A Little Push", artist1, Genre.SOUNDTRACK));
        album3.add(new Song("Like a Dog Chasing Cars", artist1, Genre.SOUNDTRACK));
        album3.add(new Song("I Am the Batman", artist1, Genre.SOUNDTRACK));
        album3.add(new Song("And I Thought My Jokes Were Bad", artist1, Genre.SOUNDTRACK));
        album3.add(new Song("Agent of Chaos", artist1, Genre.SOUNDTRACK));
        album3.add(new Song("Introduce a Little Anarchy", artist1, Genre.SOUNDTRACK));
        album3.add(new Song("Watch the World Burn", artist1, Genre.SOUNDTRACK));
        album3.add(new Song("A Dark Knight", artist1, Genre.SOUNDTRACK));

        Artist artist3 = new Artist("Alan Silvestri");
        Album album4 = new Album("Avengers: Endgame", artist3, R.drawable.cover4);
        album4.add(new Song("Totally Fine", artist3, Genre.SOUNDTRACK));
        album4.add(new Song("Arrival", artist3, Genre.SOUNDTRACK));

        Artist artist4 = new Artist("Thomas Newman");
        Album album5 = new Album("Spectre", artist4, R.drawable.cover5);
        album5.add(new Song("Los Muertos Vivos Estan", artist4, Genre.SOUNDTRACK));
        album5.add(new Song("Vauxhall Bridge", artist4, Genre.SOUNDTRACK));

        songs.addAll(album1.getSongs());
        songs.addAll(album2.getSongs());
        songs.addAll(album3.getSongs());
        songs.addAll(album4.getSongs());

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(adapter);
    }
}