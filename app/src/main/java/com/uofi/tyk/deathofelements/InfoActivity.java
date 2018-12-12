package com.uofi.tyk.deathofelements;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView info = findViewById(R.id.info);
        info.setText("\t\t\t\tThis is a fun App aimed to teach something interesting about the chemical elements. " +
                        "Elements table is difficult to be remembered. Will it cultivate your interests of learning, if " +
                        "we show you crazy ideas about some of the elements? \nUse instruction:\n\t\t\t\t a.	Long press to open " +
                        "the webpage of this element on Wikipedia website, or on Wikipedia app.\n\t\t\t\t b.	Short press to discove" +
                        "r crazy yet fun ideas about some elements. Feel free to find them : )\n\t\t\t\t c.	Press the play button an" +
                        "d the silence button to play and stop background music.\n\t\t\t\t d.	Press the share button to share this app " +
                        "and the fun.\n\t\t\t\t Developed by Yikai Teng, Qianmeng Chen, Sixian Li in Dec 2018\n\t Credit: source video comes" +
                " from(https://www.bilibili.com/video/av6657829?from=search&seid=9920218554213434705)");
    }
}
