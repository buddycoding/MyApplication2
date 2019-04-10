package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ChordsSounds extends AppCompatActivity {

    private MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chords_sounds);

        Intent myIntent = getIntent();
        TextView chordsName = findViewById(R.id.chordsNames);

        String chordsNameString = myIntent.getStringExtra("ChordsName");

        chordsName.setText(chordsNameString.toUpperCase().replaceAll(".(?!$)", "$0 "));

        ImageView imageView =  findViewById(R.id.chords_sounds_image);
        imageView.setImageResource(this.getResources().getIdentifier(chordsNameString + "2", "drawable", this.getPackageName()));

        RelativeLayout lLayout = findViewById(R.id.ll_chordsNames);

        LinearLayout newLL = new LinearLayout(this);
        newLL.setOrientation(LinearLayout.HORIZONTAL);

        List<Button> btnList = new ArrayList<>();
        for(int x=0;x<chordsNameString.length();x++)
        {
            String textChordName = chordsNameString.charAt(x) + "";
            switch (chordsNameString.charAt(x) + ""){
                case "m":   btnList.get(btnList.size()-1).setText(btnList.get(btnList.size()-1).getText() + "m");
                    break;
                case "7":   btnList.get(btnList.size()-1).setText(btnList.get(btnList.size()-1).getText() +"7");
                    break;
                case "9":   btnList.get(btnList.size()-1).setText(btnList.get(btnList.size()-1).getText() +"9");
                    break;
                default:
                    btnList.add(new Button(this));
                    btnList.get(btnList.size()-1).setText("Play " + textChordName.toUpperCase() + "");

                    final String chordSoundName = chordsNameString.charAt(x) + "";
                    final String filename = "android.resource://" + this.getPackageName() + "/raw/"+chordSoundName; //issue wrong file pointer for fixing
                    btnList.get(btnList.size()-1).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //media = MediaPlayer.create(getApplicationContext(), R.raw.g);
                            media = new MediaPlayer();
                            try { media.setDataSource(getApplicationContext(), Uri.parse(filename)); } catch (Exception e) {}
                            try { media.prepare(); } catch (Exception e) {}
                            media.start();
                        }
                    });
                    btnList.get(btnList.size()-1).setAllCaps(false);
                    newLL.addView(btnList.get(btnList.size()-1));
            }
        }
        lLayout.addView(newLL);
        //test commit 2

    }
}
