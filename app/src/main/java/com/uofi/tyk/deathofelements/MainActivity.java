package com.uofi.tyk.deathofelements;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent svc=new Intent(this, BackgroundSoundService.class);
        startService(svc);

        ImageView play = findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent svc=new Intent(MainActivity.this, BackgroundSoundService.class);
                startService(svc);
            }
        });

        ImageView mute = findViewById(R.id.mute);
        mute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent svc=new Intent(MainActivity.this, BackgroundSoundService.class);
                stopService(svc);
            }
        });

        ImageView share = findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("webpage", "https://stackoverflow.com/questions/19253786/how-to-copy-text-to-clip-board-in-android");
                clipboard.setPrimaryClip(clip);
                Toast.makeText(MainActivity.this, "Link copied to clipboard", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView info = findViewById(R.id.infor);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });


        // First to create the on click listeners to every element available in the video and pass the extra of an int (id)

        TextView mH = findViewById(R.id.H);
        mH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.H);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mHe = findViewById(R.id.He);
        mHe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.He);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mLi = findViewById(R.id.Li);
        mLi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Li);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mBe = findViewById(R.id.Be);
        mBe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Be);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mP = findViewById(R.id.P);
        mP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.P);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mAs = findViewById(R.id.As);
        mAs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.As);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mBr = findViewById(R.id.Br);
        mBr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Br);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mKr = findViewById(R.id.Kr);
        mKr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Kr);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mPo = findViewById(R.id.Po);
        mPo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Po);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mAt = findViewById(R.id.At);
        mAt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.At);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mFr = findViewById(R.id.Fr);
        mFr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Fr);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mF = findViewById(R.id.F);
        mF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.F);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mMg = findViewById(R.id.Mg);
        mMg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Mg);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mS = findViewById(R.id.S);
        mS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.S);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mTc = findViewById(R.id.Tc);
        mTc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Tc);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mRa = findViewById(R.id.Ra);
        mRa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Fr);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mRf = findViewById(R.id.Rf);
        mRf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Fr);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mDb = findViewById(R.id.Db);
        mDb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Fr);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mSg = findViewById(R.id.Sg);
        mSg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Fr);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mBh = findViewById(R.id.Bh);
        mBh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Fr);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mHs = findViewById(R.id.Hs);
        mHs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Fr);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mMt = findViewById(R.id.Mt);
        mMt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Fr);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mDs = findViewById(R.id.Ds);
        mDs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Fr);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mRg = findViewById(R.id.Rg);
        mRg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Fr);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mCn = findViewById(R.id.Cn);
        mCn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Fr);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mNh = findViewById(R.id.Nh);
        mNh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Fr);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mFl = findViewById(R.id.Fl);
        mFl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Fr);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mMc = findViewById(R.id.Mc);
        mMc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Fr);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mLv = findViewById(R.id.Lv);
        mLv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Fr);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mTs = findViewById(R.id.Ts);
        mTs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Fr);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });

        TextView mOg = findViewById(R.id.Og);
        mOg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ElementActivity.class);
                intent.putExtra("element_id",R.id.Fr);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });





        // Now create the on click long listener for every element and redirect to wikipedia
        mH.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Hydrogen");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mHe.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Helium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mLi.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Lithium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mBe.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Beryllium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mB = findViewById(R.id.B);
        mB.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Boron");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mC = findViewById(R.id.C);
        mC.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Carbon");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mN = findViewById(R.id.N);
        mN.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Nitrogen");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mO = findViewById(R.id.O);
        mO.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Oxygen");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mF.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Fluorine");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mNe = findViewById(R.id.Ne);
        mNe.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Neon");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mNa = findViewById(R.id.Na);
        mNa.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Sodium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mMg.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Magnesium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mAl = findViewById(R.id.Al);
        mAl.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Aluminum");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mSi = findViewById(R.id.Si);
        mSi.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Silicon");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mP.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Phosphorus");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mS.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Sulphur");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mCl = findViewById(R.id.Cl);
        mCl.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Chlorine");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mAr = findViewById(R.id.Ar);
        mAr.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Argon");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mK = findViewById(R.id.K);
        mK.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Potassium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mCa = findViewById(R.id.Ca);
        mCa.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Calcium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mSc = findViewById(R.id.Sc);
        mSc.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Scandium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mTi = findViewById(R.id.Ti);
        mTi.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Titanium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mV = findViewById(R.id.V);
        mV.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Vanadium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mCr = findViewById(R.id.Cr);
        mCr.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Chromium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mMn = findViewById(R.id.Mn);
        mMn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Manganese");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mFe = findViewById(R.id.Fe);
        mFe.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Iron");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mCo = findViewById(R.id.Co);
        mCo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Cobalt");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mNi = findViewById(R.id.Ni);
        mNi.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Nickel");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mCu = findViewById(R.id.Cu);
        mCu.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Copper");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mZn = findViewById(R.id.Zn);
        mZn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Zinc");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mGa = findViewById(R.id.Ga);
        mGa.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Gallium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mGe = findViewById(R.id.Ge);
        mGe.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Germanium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mAs.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Arsenic");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mSe = findViewById(R.id.Se);
        mSe.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Selenium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mBr.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Bromine");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mKr.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Krypton");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mRb = findViewById(R.id.Rb);
        mRb.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Rubidium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mSr = findViewById(R.id.Sr);
        mSr.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Strontium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mY = findViewById(R.id.Y);
        mY.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Yttrium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mZr = findViewById(R.id.Zr);
        mZr.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Zirconium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mNb = findViewById(R.id.Nb);
        mNb.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Niobium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mMo = findViewById(R.id.Mo);
        mMo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Molybdenum");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });
;
        mTc.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Technetium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mRu = findViewById(R.id.Ru);
        mRu.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Ruthenium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mRh = findViewById(R.id.Rh);
        mRh.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","RhodiumRhodium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mPd = findViewById(R.id.Pd);
        mPd.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Palladium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mAg = findViewById(R.id.Ag);
        mAg.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Silver");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mCd = findViewById(R.id.Cd);
        mCd.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Cadmium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mIn = findViewById(R.id.In);
        mIn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Indium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mSn = findViewById(R.id.Sn);
        mSn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Tin");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mSb = findViewById(R.id.Sb);
        mSb.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Antimony");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mTe = findViewById(R.id.Te);
        mTe.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Tellurium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mI = findViewById(R.id.I);
        mI.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Iodine");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mXe = findViewById(R.id.Xe);
        mXe.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Xenon");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mCs = findViewById(R.id.Cs);
        mCs.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Cesium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mBa = findViewById(R.id.Ba);
        mBa.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Barium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mHf = findViewById(R.id.Hf);
        mHf.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Hafnium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mTa = findViewById(R.id.Ta);
        mTa.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Tantalum");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mW = findViewById(R.id.W);
        mW.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Tungsten");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mRe = findViewById(R.id.Re);
        mRe.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Rhenium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mOs = findViewById(R.id.Os);
        mOs.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Osmium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mIr = findViewById(R.id.Ir);
        mIr.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Iridium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mPt = findViewById(R.id.Pt);
        mPt.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Platinum");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mAu = findViewById(R.id.Au);
        mAu.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Gold");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mHg = findViewById(R.id.Hg);
        mHg.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Mercury");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mTl = findViewById(R.id.Tl);
        mTl.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Thallium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mPb = findViewById(R.id.Pb);
        mPb.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Lead");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mBi = findViewById(R.id.Bi);
        mBi.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Bismuth");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mPo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Polonium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mAt.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Astatine");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mRn = findViewById(R.id.Rn);
        mRn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Radon");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mFr.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Francium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mRa.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Radium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mRf.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Rutherfordium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mDb.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Dubnium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mSg.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Seaborgium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mBh.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Bohrium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mHs.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Hassium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mMt.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Meitnerium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mDs.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Darmstadtium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mRg.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Roentgenium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mCn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Copernicium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mNh.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Nihonium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mFl.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Flerovium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mMc.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Moscovium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mLv.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Livermorium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mTs.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Tennessine");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        mOg.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Oganesson");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mCe = findViewById(R.id.Ce);
        mCe.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Cerium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mPr = findViewById(R.id.Pr);
        mPr.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Praseodymium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mNd = findViewById(R.id.Nd);
        mNd.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Neodymium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mPm = findViewById(R.id.Pm);
        mPm.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Promethium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mSm = findViewById(R.id.Sm);
        mSm.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Samarium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mEu = findViewById(R.id.Eu);
        mEu.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Europium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mGd = findViewById(R.id.Gd);
        mGd.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Gadolinium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mTb = findViewById(R.id.Tb);
        mTb.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Terbium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mDy = findViewById(R.id.Dy);
        mDy.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Dysprosium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mHo = findViewById(R.id.Ho);
        mHo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Holmium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mEr = findViewById(R.id.Er);
        mEr.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Erbium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mTm = findViewById(R.id.Tm);
        mTm.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Thulium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mYb = findViewById(R.id.Yb);
        mYb.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Ytterbium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mLu = findViewById(R.id.Lu);
        mLu.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Lutetium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mTh = findViewById(R.id.Th);
        mTh.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Thorium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mPa = findViewById(R.id.Pa);
        mPa.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Protactinium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mU = findViewById(R.id.U);
        mU.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Uranium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mNp = findViewById(R.id.Np);
        mNp.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Neptunium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mPu = findViewById(R.id.Pu);
        mPu.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Plutonium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mAm = findViewById(R.id.Am);
        mAm.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Americium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mCm = findViewById(R.id.Cm);
        mCm.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Curium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mBk = findViewById(R.id.Bk);
        mBk.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Berkelium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mCf = findViewById(R.id.Cf);
        mCf.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Californium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mEs = findViewById(R.id.Es);
        mEs.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Einsteinium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mFm = findViewById(R.id.Fm);
        mFm.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Fermium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mMd = findViewById(R.id.Md);
        mMd.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Mendelevium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mNo = findViewById(R.id.No);
        mNo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Nobelium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mLr = findViewById(R.id.Lr);
        mLr.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Lawrencium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mLa = findViewById(R.id.La);
        mLa.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Lanthanum");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });

        TextView mAc = findViewById(R.id.Ac);
        mAc.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(MainActivity.this, WikiActivity.class);
                intent.putExtra("element_id","Actinium");
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                return true;
            }
        });


    }

}
