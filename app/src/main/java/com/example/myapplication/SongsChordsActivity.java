package com.example.myapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;


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

        PhotoView photoView = (PhotoView) findViewById(R.id.pv_songimage);
        photoView.setImageResource(R.drawable.canthelpfallinginlove);

    }
}
