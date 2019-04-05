package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SongsActivity extends AppCompatActivity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        button1 = findViewById(R.id.buttonhome);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        ListView songList = findViewById(R.id.songList);

        ArrayAdapter<String> songsArrayAdapter;
        List<String> songs = new ArrayList<>();
        songs.add("Can't Help Falling In Love");
        songs.add("2");
        songs.add("3");
        songs.add("4");
        songs.add("5");
        songs.add("6");
        songs.add("7");
        songs.add("8");
        songs.add("9");
        songs.add("10");

        songsArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songs );
        songList.setAdapter(songsArrayAdapter);

        songList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the selected item text from ListView
                String selectedItem = (String) parent.getItemAtPosition(position);

                openSongsActivity();
            }
        });
    }
    public void openMainActivity () {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

    public void openSongsActivity () {
        Intent intent = new Intent (this, SongsChordsActivity.class);
        startActivity(intent);
    }
}
