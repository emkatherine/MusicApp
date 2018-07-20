package com.example.mkreh.musicstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ListAdapter;
import com.example.mkreh.musicstructure.ArtistsAdapter;
import com.example.mkreh.musicstructure.ArtistsActivity;
import com.example.mkreh.musicstructure.R;

import java.util.ArrayList;

public class ArtistsArraylist extends AppCompatActivity{

    private ListView listView;
    private ArtistsAdapter mAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        listView = (ListView) findViewById(R.id.artists);
        ArrayList<com.example.mkreh.musicstructure.ArtistsActivity> artistsList = new ArrayList<>();
        artistsList.add(new com.example.mkreh.musicstructure.ArtistsActivity("Bastille", "1" , "indie pop, synth-pop, indie rock"));
        artistsList.add(new com.example.mkreh.musicstructure.ArtistsActivity("Beats Antique", "6" , "world music"));
        artistsList.add(new com.example.mkreh.musicstructure.ArtistsActivity("Creedence Clearwater Revival", "6" , "rock & roll, roots rock, country rock"));
        artistsList.add(new com.example.mkreh.musicstructure.ArtistsActivity("Depeche Mode", "2" , "synth-pop, new wave, alternative rock"));
        artistsList.add(new com.example.mkreh.musicstructure.ArtistsActivity("Dredg", "4" , "alternative rock, alternative metal, progressive rock"));
        artistsList.add(new com.example.mkreh.musicstructure.ArtistsActivity("Evanescence", "9" , "rock, metal, alternative"));
        artistsList.add(new com.example.mkreh.musicstructure.ArtistsActivity("Lana Del Rey", "9" , "rock, indie pop, baroque pop"));
        artistsList.add(new com.example.mkreh.musicstructure.ArtistsActivity("Linkin Park", "11" , "alternative rock, rap rock, alternative metal"));
        artistsList.add(new com.example.mkreh.musicstructure.ArtistsActivity("Pvris", "4" , "electro-pop, synth-pop, alternative rock, post-hardcore"));
        artistsList.add(new com.example.mkreh.musicstructure.ArtistsActivity("Wolfgang A. Mozart", "1" , "18th century classical"));

        mAdapter = new ArtistsAdapter(this,artistsList);
        listView.setAdapter(mAdapter);

    }
}