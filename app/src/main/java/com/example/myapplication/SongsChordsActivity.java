package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SongsChordsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs_chords);

        Intent myIntent = getIntent();
        TextView songName = findViewById(R.id.songName);
        TextView artistName = findViewById(R.id.artistName);

        songName.setText(myIntent.getStringExtra("SongName"));
        artistName.setText(myIntent.getStringExtra("ArtistName"));

    }
}
