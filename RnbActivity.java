package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RnbActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Creates an ArrayList of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("NICE FOR WHAT", "Drake"));
        songs.add(new Song("GOD'S PLAN", "Drake"));
        songs.add(new Song("PSYCHO", "Post Malone Featuring Ty Dolla $ign"));
        songs.add(new Song("LOOK ALIVE", "BlocBoy JB Featuring Drake"));
        songs.add(new Song("I LIKE IT", "Cardi B, Bad Bunny & J Balvin"));
        songs.add(new Song("FREAKY FRIDAY", "Lil Dicky Featuring Chris Brown"));
        songs.add(new Song("FINESSE", "Bruno Mars & Cardi B"));
        songs.add(new Song("BE CAREFUL", "Cardi B"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
