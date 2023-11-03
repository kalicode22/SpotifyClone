package com.webfams.spotifyclone;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private MediaPlayer soundPlayer;
    private boolean playing = false;
    private int i = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.m1).setOnClickListener(view -> {
            if (playing) {
                stopSwitchSound();
                resetPlayIcons();

                if (i == 1) {
                    i = -1;
                    return;
                }
            }

            stopSwitchSound();
            soundPlayer = MediaPlayer.create(this, R.raw.suz); // Load a sound file
            soundPlayer.setLooping(true);
            soundPlayer.start();
            playing = true;
            i = 1;
            Toast.makeText(this, "Playing....", Toast.LENGTH_SHORT).show();
            findViewById(R.id.m1).setBackground(getDrawable(R.drawable.ic_pause));
        });

        findViewById(R.id.m2).setOnClickListener(view -> {
            if (playing) {
                stopSwitchSound();
                resetPlayIcons();

                if (i == 2) {
                    i = -1;
                    return;
                }
            }

            stopSwitchSound();
            soundPlayer = MediaPlayer.create(this, R.raw.omw); // Load a sound file
            soundPlayer.setLooping(true);
            soundPlayer.start();
            playing = true;
            i = 2;
            Toast.makeText(this, "Playing....", Toast.LENGTH_SHORT).show();
            findViewById(R.id.m2).setBackground(getDrawable(R.drawable.ic_pause));
        });

        findViewById(R.id.m3).setOnClickListener(view -> {
            if (playing) {
                stopSwitchSound();
                resetPlayIcons();

                if (i == 3) {
                    i = -1;
                    return;
                }
            }

            stopSwitchSound();
            soundPlayer = MediaPlayer.create(this, R.raw.lme); // Load a sound file
            soundPlayer.setLooping(true);
            soundPlayer.start();
            playing = true;
            i = 3;
            Toast.makeText(this, "Playing....", Toast.LENGTH_SHORT).show();
            findViewById(R.id.m3).setBackground(getDrawable(R.drawable.ic_pause));
        });

        findViewById(R.id.m4).setOnClickListener(view -> {
            if (playing) {
                stopSwitchSound();
                resetPlayIcons();
                if (i == 4) {
                    i = -1;
                    return;
                }
            }
            playing = true;
            i = 4;
            soundPlayer = MediaPlayer.create(this, R.raw.bones);
            soundPlayer.setLooping(true);
            soundPlayer.start();
            Toast.makeText(this, "Playing....", Toast.LENGTH_SHORT).show();
            findViewById(R.id.m4).setBackground(getDrawable(R.drawable.ic_pause));
        });

        findViewById(R.id.m5).setOnClickListener(view -> {
            if (playing) {
                stopSwitchSound();
                resetPlayIcons();
                if (i == 5) {
                    i = -1;
                    return;
                }
            }
            playing = true;
            i = 5;
            soundPlayer = MediaPlayer.create(this, R.raw.som);
            soundPlayer.setLooping(true);
            soundPlayer.start();
            Toast.makeText(this, "Playing....", Toast.LENGTH_SHORT).show();
            findViewById(R.id.m5).setBackground(getDrawable(R.drawable.ic_pause));
        });
    }

    private void resetPlayIcons() {
        findViewById(R.id.m1).setBackground(getDrawable(R.drawable.ic_play));
        findViewById(R.id.m2).setBackground(getDrawable(R.drawable.ic_play));
        findViewById(R.id.m3).setBackground(getDrawable(R.drawable.ic_play));
        findViewById(R.id.m4).setBackground(getDrawable(R.drawable.ic_play));
        findViewById(R.id.m5).setBackground(getDrawable(R.drawable.ic_play));
    }

    private void stopSwitchSound() {
        if (soundPlayer != null && soundPlayer.isPlaying()) {
            soundPlayer.stop();
            soundPlayer.prepareAsync();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (soundPlayer != null) {
            soundPlayer.release();
        }
    }
}