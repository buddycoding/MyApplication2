package com.example.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.Adapters.SongsList;
import com.example.myapplication.Adapters.SongsListAdapter;

import java.util.ArrayList;
import java.util.List;

public class SongsActivity extends AppCompatActivity {

    private Button button1;
    ArrayList<SongsList> songs = SongsList.createSongList();

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

        //////////////////
        // Lookup the recyclerview in activity layout
        RecyclerView rvContacts = findViewById(R.id.rvContacts);

        // Create adapter passing in the sample user data
        SongsListAdapter adapter = new SongsListAdapter(songs);
        // Attach the adapter to the recyclerview to populate items
        rvContacts.setAdapter(adapter);
        // Set layout manager to position the items
        rvContacts.setLayoutManager(new LinearLayoutManager(this));
        // That's all!



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
