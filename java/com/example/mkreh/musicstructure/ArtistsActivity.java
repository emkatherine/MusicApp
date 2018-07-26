package com.example.mkreh.musicstructure;

import android.support.v7.app.AppCompatActivity;

public class ArtistsActivity extends AppCompatActivity{

    //store name
    private String mName;
    //store # of songs
    private String mSongCount;
    //store genre
    private String mGenre;

    //Constructor with no arguments
    public ArtistsActivity (){
    }

    //Constructor to create an instance
    public ArtistsActivity (String mName, String mSongCount, String mGenre){
        this.mName = mName;
        this.mSongCount = mSongCount;
        this.mGenre = mGenre;
    }

    public String getmName(){
        return mName;
    }

    public void setmName(){
        this.mName=mName;
    }

    public String getmSongCount(){
        return mSongCount;
    }

    public void setmSongCount(){
        this.mSongCount=mSongCount;
    }

    public String getmGenre(){
        return mGenre;
    }

    public void setmGenre(){
        this.mGenre=mGenre;
    }

}