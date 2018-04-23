package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        /* Creates an ArrayList of songs */
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("WHATEVER IT TAKES", "Imagine Dragons"));
        songs.add(new Song("THUNDER", "Imagine Dragons"));
        songs.add(new Song("FEEL IT STEEL", "Portugal. the Man"));
        songs.add(new Song("BELIEVER", "Imagine Dragons"));
        songs.add(new Song("ZOMBIE", "Bad Wolves"));
        songs.add(new Song("SIT NEXT TO ME", "Foster The People"));
        songs.add(new Song("NO ROOTS", "Alice Merton"));
        songs.add(new Song("SAY AMEN (SATURDAY NIGHT)", "Panic! At The Disco"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
