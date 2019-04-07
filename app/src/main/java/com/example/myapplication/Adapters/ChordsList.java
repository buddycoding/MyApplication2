package com.example.myapplication.Adapters;

import java.util.ArrayList;

public class ChordsList {
    private String mChordName;
    private String mSongArtist;

    public ChordsList(String chordName){
        mChordName = chordName;
    }

    public String getName() {
        return mChordName;
    }

    public static ArrayList<ChordsList> createChordList(){
        ArrayList<ChordsList> chords = new ArrayList<>();
        /*
        chords.add(new ChordsList("G"));
        chords.add(new ChordsList("D"));
        chords.add(new ChordsList("C"));
        chords.add(new ChordsList("Em"));
        chords.add(new ChordsList("Am"));
        chords.add(new ChordsList("G"));
        chords.add(new ChordsList("A"));
        chords.add(new ChordsList("E"));
        chords.add(new ChordsList("Dm"));
        chords.add(new ChordsList("Bm"));
        chords.add(new ChordsList("F"));
        chords.add(new ChordsList("Fmaj7"));
        chords.add(new ChordsList("Fadd9"));
        chords.add(new ChordsList("D7"));
        chords.add(new ChordsList("E7"));
        chords.add(new ChordsList("A7"));*/

        chords.add(new ChordsList("gdc"));
        chords.add(new ChordsList("emamg"));
        chords.add(new ChordsList("ae"));
        chords.add(new ChordsList("dmbmf"));
        chords.add(new ChordsList("fmaj7fadd9"));
        chords.add(new ChordsList("d7e7a7"));


        return chords;
    }
}
