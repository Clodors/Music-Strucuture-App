package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Creates an ArrayList of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("THEMIDDLE", "Zedd, Maren Morris & Grey"));
        songs.add(new Song("MEANT TO BE", "Camilla Cabello"));
        songs.add(new Song("PRAY FOR ME", "Bebe Rexha & Florida Georgia Line"));
        songs.add(new Song("FINESSE", "The Weeknd & Kendrick Lamar"));
        songs.add(new Song("GOD'S PLAN", "Bruno Mars & Cardi B"));
        songs.add(new Song("HIM & I", "Drake"));
        songs.add(new Song("LET YOU DOWN", "G-Eazy & Halsey"));
        songs.add(new Song("NEW RULES", "NF"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
