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
        songs.add(new SongsList("All My Life", "EDR", "04"));
        songs.add(new SongsList("Aray", "EDR", "05"));
        songs.add(new SongsList("Teach Me How To Doggy", "EDR", "06"));
        songs.add(new SongsList("I", "Wil", "07"));
        songs.add(new SongsList("Someday", "EDR", "08"));
        songs.add(new SongsList("Boom Panes", "EDR", "09"));
        songs.add(new SongsList("Larawang Kupas", "EDR", "10"));

        return songs;
    }
}
