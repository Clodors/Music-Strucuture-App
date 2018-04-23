package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that asks for electro music
        TextView electroActivity = (TextView) findViewById(R.id.ELECTRO);

        /* Set a click listener on this View so that when the View is clicked on, the corresponding
        activity gets opened.*/
        electroActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ElectroActivity}
                Intent electroActivityIntent = new Intent(MainActivity.this, ElectroActivity.class);

                // Start the new activity
                startActivity(electroActivityIntent);
            }
        });

        // Find the View that asks for hip hop music
        TextView hip_hopActivity = (TextView) findViewById(R.id.HIP_HOP);

        /* Set a click listener on this View so that when the View is clicked on, the corresponding
        activity gets opened.*/
        hip_hopActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HipHopActivity}
                Intent Hip_HopActivityIntent = new Intent(MainActivity.this, Hip_HopActivity.class);

                // Start the new activity
                startActivity(Hip_HopActivityIntent);
            }
        });

        // Find the View that asks for pop music
        TextView popActivity = (TextView) findViewById(R.id.POP);

        /* Set a click listener on this View so that when the View is clicked on, the corresponding
        activity gets opened.*/
        popActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PopActivity}
                Intent PopActivityIntent = new Intent(MainActivity.this, PopActivity.class);

                // Start the new activity
                startActivity(PopActivityIntent);
            }
        });


        // Find the View that asks for rock music
        TextView rockActivity = (TextView) findViewById(R.id.ROCK);

        /* Set a click listener on this View so that when the View is clicked on, the corresponding
        activity gets opened.*/
        rockActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RockActivity}
                Intent RockActivityIntent = new Intent(MainActivity.this, RockActivity.class);

                // Start the new activity
                startActivity(RockActivityIntent);
            }
        });

        // Find the View that asks for rnb music
        TextView rnbActivity = (TextView) findViewById(R.id.RNB);

        /* Set a click listener on this View so that when the View is clicked on, the corresponding
        activity gets opened.*/
        rnbActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RnbActivity}
                Intent rnbActivityIntent = new Intent(MainActivity.this, RnbActivity.class);

                // Start the new activity
                startActivity(rnbActivityIntent);
            }
        });
    }
}
