package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.support.v4.app.Fragment;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChordSheetActivity();
            }
        });

        button2 = (Button) findViewById(R.id.button10);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGuitarTutorialActivity();
            }
        });

        button3 = (Button) findViewById(R.id.button14);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSongsActivity();
            }
        });

        button4 = (Button) findViewById(R.id.button15);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTunerActivity();
            }
        });

    }

    public void openChordSheetActivity () {
        Intent intent = new Intent (this, ChordSheetActivity.class);
        startActivity(intent);
    }

    public void openGuitarTutorialActivity () {
        Intent intent = new Intent (this, GuitarTutorialActivity.class);
        startActivity(intent);
    }

    public void openSongsActivity () {
        Intent intent = new Intent (this, SongsActivity.class);
        startActivity(intent);
    }

    public void openTunerActivity () {
        Intent intent = new Intent (this, TunerActivity.class);
        startActivity(intent);
    }

}
