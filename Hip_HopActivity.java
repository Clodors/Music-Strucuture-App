package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Hip_HopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Creates an ArrayList of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("GOD'S PLAN", "Drake"));
        songs.add(new Song("RIVER", "Eminem"));
        songs.add(new Song("PRAY FOR ME", "Kendrick Lamar"));
        songs.add(new Song("Lock Alive", "BlocBoy JB"));
        songs.add(new Song("WALK IT TALK IT ", "Migos"));
        songs.add(new Song("ROCKSTAR", "Post Malone"));
        songs.add(new Song("ALL THE STARS", "Kendrick Lamar"));
        songs.add(new Song("CALL OUT MY NAME", "The Weeknd"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
