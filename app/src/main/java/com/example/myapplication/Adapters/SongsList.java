package com.example.myapplication.Adapters;

import java.util.ArrayList;

public class SongsList {
    private String mSongName;
    private String mSongArtist;

    public SongsList(String name, String artist){
        mSongName = name;
        mSongArtist = artist;
    }

    public String getName() {
        return mSongName;
    }
    public String getArtist() {
        return mSongArtist;
    }

    public static ArrayList<SongsList> createSongList(){
        ArrayList<SongsList> songs = new ArrayList<>();
        songs.add(new SongsList("Can't Help Falling In Love", "Elvis Presley"));
        songs.add(new SongsList("Malibu Nights", "LANY"));
        songs.add(new SongsList("How Deep Is Your Love", "Bee Gees"));

        return songs;
    }
}
