package com.alkhalildevelopers.channel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoS;
    MediaController myMediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoS = findViewById(R.id.myVideo);
        videoS.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.intro2);
        myMediaController = new MediaController(this);
        myMediaController.setAnchorView(videoS);
        videoS.setMediaController(myMediaController);
        videoS.start();



    }
}
