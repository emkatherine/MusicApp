package com.example.mkreh.musicstructure;

public class ArtistsActivity {

    //store name
    private String mName;
    //store # of songs
    private String mSongCount;
    //store genre
    private String mGenre;

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