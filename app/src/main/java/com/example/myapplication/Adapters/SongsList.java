package com.example.myapplication.Adapters;

import java.util.ArrayList;

public class SongsList {
    private String mSongName;
    private String mSongArtist;
    private String mSongNo;

    public SongsList(String name, String artist, String number){
        mSongNo = number;
        mSongName = name;
        mSongArtist = artist;
    }

    public String getNumber() {
        return mSongNo;
    }
    public String getName() {
        return mSongName;
    }
    public String getArtist() {
        return mSongArtist;
    }

    public static ArrayList<SongsList> createSongList(){
        ArrayList<SongsList> songs = new ArrayList<>();
        songs.add(new SongsList("Can't Help Falling In Love", "Elvis Presley", "01"));
        songs.add(new SongsList("Malibu Nights", "LANY", "02"));
        songs.add(new SongsList("How Deep Is Your Love", "Bee Gees", "03"));

        return songs;
    }
}
