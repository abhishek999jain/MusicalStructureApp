package com.chippy.letsandroid.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
public class ListOfSong extends AppCompatActivity {
    Button playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_song);
        // getExternalStorageDirectory(); we fetch .mp3 song from sd card we can display ....than use mediaplayer to play them

        playing=(Button) findViewById(R.id.button1);
        playing.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i=new Intent(ListOfSong.this,NowPlaying.class);
                startActivity(i);
            }
        });

    }
}
