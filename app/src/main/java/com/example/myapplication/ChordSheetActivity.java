package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;

import com.example.myapplication.Adapters.ChordsList;
import com.example.myapplication.Adapters.ChordsListAdapter;
import java.util.ArrayList;


public class ChordSheetActivity extends AppCompatActivity {

    private Button button1;
    ArrayList<ChordsList> chords = ChordsList.createChordList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chord_sheet);

        button1 = (Button) findViewById(R.id.buttonhome);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        RecyclerView rvChords = findViewById(R.id.rvChords);
        ChordsListAdapter adapter = new ChordsListAdapter(chords);
        rvChords.setAdapter(adapter);
        rvChords.setLayoutManager(new LinearLayoutManager(this));
    }
    public void openMainActivity () {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

    public void userItemClick(int pos) {
        Toast.makeText(this, "Clicked User : " + chords.get(pos).getName(), Toast.LENGTH_SHORT).show();
        /*
        Intent intent = new Intent (this, SongsChordsActivity.class);
        intent.putExtra("ChordsName", chords.get(pos).getName());
        startActivity(intent);*/
    }
}
