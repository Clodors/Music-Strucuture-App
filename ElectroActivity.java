package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ElectroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Creates an ArrayList of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("SENSELESS", "Radiology"));
        songs.add(new Song("JUNGLE JANE FEAT. SKYTEC", "Luciana , Nitrix"));
        songs.add(new Song("JUNGLE JANE FEAT. SKYTECJUNGLE JANE FEAT. SKYTEC", "Steve Aoki , Loopers"));
        songs.add(new Song("NOBODY LIKES", "Habstrakt , Josh Pen"));
        songs.add(new Song("VOULEZ VOUS", "Twisterz"));
        songs.add(new Song("PHOBIA", "Pendulum"));
        songs.add(new Song("TROUBLE", "Slamtype"));
        songs.add(new Song("PIKA PIKA", "Twoloud , Haechl"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
