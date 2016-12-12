package com.chippy.letsandroid.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Switch extends AppCompatActivity {
    String info;
    TextView header;
    Resources res;
    ArrayAdapter<String> ad;
    Button list;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);
        Bundle extra=getIntent().getExtras();
        info=extra.getString("key");
        list=(Button) findViewById(R.id.button1);
        list.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i=new Intent(Switch.this,ListOfSong.class);
                startActivity(i);
            }
        });
        header=(TextView)findViewById(R.id.textView1);
        header.setText(String.valueOf(info));
        if(info.equalsIgnoreCase("Artists")){
            res = getResources();
            String[]artistArray = res.getStringArray(R.array.artists);
            lv=(ListView) findViewById(R.id.listView1);
            ad =new ArrayAdapter<String> (this,android.R.layout.simple_list_item_1,artistArray);
            lv.setAdapter(ad);
        }
        if(info.equalsIgnoreCase("Album")){
            res = getResources();
            String[]albumArray = res.getStringArray(R.array.album);
            lv=(ListView) findViewById(R.id.listView1);
            ad =new ArrayAdapter<String> (this,android.R.layout.simple_list_item_1,albumArray);
            lv.setAdapter(ad);
        }
        if(info.equalsIgnoreCase("Playlist")){
            res = getResources();
            String[]playArray = res.getStringArray(R.array.playlist);
            lv=(ListView) findViewById(R.id.listView1);
            ad =new ArrayAdapter<String> (this,android.R.layout.simple_list_item_1,playArray);
            lv.setAdapter(ad);
        }}
}
