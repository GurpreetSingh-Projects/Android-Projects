package com.example.musictest;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
Button play,pause;
Switch loop;
MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=findViewById(R.id.play);
        pause=findViewById(R.id.pause);
        loop=findViewById(R.id.loop);
        music=MediaPlayer.create(this,R.raw.chariots_of_fire);
        loop.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                music.setLooping(isChecked);
            }
        });
    }
    public void player(View v)
    {
    music.start();
    }
    public void pauser(View v) {
        if (music.isPlaying()) {
            music.pause();
        }
    }
}