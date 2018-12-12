package com.uofi.tyk.deathofelements;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class WikiActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wiki);


        Intent svc=new Intent(this, BackgroundSoundService.class);
        stopService(svc);

        String elementId= getIntent().getExtras().getString("element_id");

//        TextView wiki = findViewById(R.id.wiki);
//        wiki.setText(elementId);
//
//        Intent viewIntent =
//                new Intent("android.intent.action.VIEW",
//                        Uri.parse("http://en.wikipedia.org/wiki/"+elementId));
//        startActivity(viewIntent);

        WebView wiki = findViewById(R.id.wiki);
        wiki.loadUrl("https://en.wikipedia.org/wiki/"+elementId);
//        wiki.loadUrl("https://www.webassign.net/wa-auth/login");
    }
}
