package com.orosz.myapp.audiospeech;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void buttonTapped(View view) {

        //id - view.getID() - gets the id of what you touched from the interior of the app
        int id = view.getId();
        // ourID - where our id(the name we gave) is stored
        String ourID = "";

        //the method below "translates" the id from the app to our particular id(that we gave) and maches it
        ourID = view.getResources().getResourceEntryName(id);

        //gets the id for the audio file that we need
        int resourceID = getResources().getIdentifier(ourID, "raw", "com.orosz.myapp.audiospeech");

        MediaPlayer mPlayer = MediaPlayer.create(this, resourceID);
        mPlayer.start();
        //Log.i("buttonTapped", ourID);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
