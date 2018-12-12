package com.uofi.tyk.deathofelements;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class ElementActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element);
        int elementId= getIntent().getExtras().getInt("element_id");

        VideoView videoView = findViewById(R.id.VideoView);
        switch (elementId) {
            case R.id.H: videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.h)); break;
            case R.id.He: videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.h)); break;
            case R.id.Li: videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.li)); break;
            case R.id.Be: videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.be)); break;
            case R.id.F: videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.f)); break;
            case R.id.Mg: videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.mg)); break;
            case R.id.P: videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.s)); break;
            case R.id.S: videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.s)); break;
            case R.id.As: videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.as)); break;
            case R.id.Br: videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.br)); break;
            case R.id.Kr: videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.kr)); break;
            case R.id.Po: videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.at)); break;
            case R.id.At: videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.at)); break;
            case R.id.Fr: videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.fr));break;
            case R.id.Tc: videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tc));break;
        }
        videoView.setMediaController(new MediaController(this));
        videoView.start();

        videoView.setOnPreparedListener (new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

    }

}
