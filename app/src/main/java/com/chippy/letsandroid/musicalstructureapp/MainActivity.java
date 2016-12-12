package com.chippy.letsandroid.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
public class MainActivity extends AppCompatActivity {
    ListView main;
    Resources res;
    ArrayAdapter<String> ad;
    Button playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);res = getResources();
        String[] mainArray = res.getStringArray(R.array.main_array);
        playing=(Button) findViewById(R.id.button1);
        playing.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i=new Intent(MainActivity.this,NowPlaying.class);
                startActivity(i);
            }
        });
        main=(ListView) findViewById(R.id.listView1);
        ad =new ArrayAdapter<String> (this,android.R.layout.simple_list_item_1,mainArray);
        main.setAdapter(ad);
        main.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?
                    > parent, View view, int position,
                                    long id) {
                // TODO Auto-generated method stub
                switch (position)
                {
                    case 0:
                        Intent i=new Intent(MainActivity.this,Switch.class);
                        i.putExtra("key","Artists");
                        startActivityForResult(i, 1);
                        break;
                    case 1:
                        Intent b=new Intent(MainActivity.this,Switch.class);
                        b.putExtra("key","Album");
                        startActivityForResult(b, 1);
                        break;
                    case 2:
                        Intent c=new Intent(MainActivity.this,Switch.class);
                        c.putExtra("key","Playlist");
                        startActivityForResult(c, 1);
                        break;
                }}}
        );
    }
}
