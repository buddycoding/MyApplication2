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
        songs.add(new SongsList("Can't Help Falling In Love2", "Elvis Presley1"));
        songs.add(new SongsList("Can't Help Falling In Love3", "Elvis Presley2"));
        songs.add(new SongsList("Can't Help Falling In Love4", "Elvis Presley3"));
        songs.add(new SongsList("Can't Help Falling In Love5", "Elvis Presley4"));
        songs.add(new SongsList("Can't Help Falling In Love6", "Elvis Presley5"));
        songs.add(new SongsList("Can't Help Falling In Love7", "Elvis Presley6"));
        songs.add(new SongsList("Can't Help Falling In Love8", "Elvis Presley7"));
        songs.add(new SongsList("Can't Help Falling In Love9", "Elvis Presley8"));
        songs.add(new SongsList("Can't Help Falling In Love10", "Elvis Presley9"));
        songs.add(new SongsList("Can't Help Falling In Love11", "Elvis Presley10"));
        songs.add(new SongsList("Can't Help Falling In Love12", "Elvis Presley11"));

        return songs;
    }
}
