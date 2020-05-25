package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button songs = findViewById(R.id.songs);

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SongActivity.class);
                startActivity(intent);
            }
        });

        Button albums = findViewById(R.id.albums);

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(intent);
            }
        });

        ToggleButton playPause = findViewById(R.id.play_pause);
        playPause.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    buttonView.setBackgroundResource(R.drawable.ic_pause_circle_filled_black_24dp);

                    Toast.makeText(buttonView.getContext(), "Paused", Toast.LENGTH_SHORT).show();
                }
                else {
                    buttonView.setBackgroundResource(R.drawable.ic_play_circle_filled_black_24dp);

                    Toast.makeText(buttonView.getContext(), "Playing", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
