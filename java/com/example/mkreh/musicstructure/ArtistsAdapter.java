package com.example.mkreh.musicstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.mkreh.musicstructure.R;

import java.util.ArrayList;
import java.util.List;

public class ArtistsAdapter extends ArrayAdapter<com.example.mkreh.musicstructure.ArtistsActivity> {

    private Context mContext;
    private List<com.example.mkreh.musicstructure.ArtistsActivity> artistsList = new ArrayList<>();

    public ArtistsAdapter(@NonNull Context context, ArrayList<com.example.mkreh.musicstructure.ArtistsActivity>list){
        super(context, 0, list);
        mContext=context;
        artistsList=list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.activity_artists,parent,false);

        com.example.mkreh.musicstructure.ArtistsActivity currentArtist = artistsList.get(position);

        TextView name = (TextView) listItem.findViewById(R.id.name);
        name.setText(currentArtist.getmName());

        TextView songCount = (TextView) listItem.findViewById(R.id.songCount);
        songCount.setText(currentArtist.getmSongCount());

        TextView genre = (TextView) listItem.findViewById(R.id.genre);
        genre.setText(currentArtist.getmGenre());

        return listItem;
    }
}