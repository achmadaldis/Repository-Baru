package com.example.projectarab;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HurufHijaiyah extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf_hijaiyah);

        pindah = (ImageButton) findViewById(R.id.back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HurufHijaiyah.this,MainActivity.class);
                startActivity(intent);
            }
        });

        TampilGambar = (ImageView) findViewById(R.id.judul);
        show = (ImageButton) findViewById(R.id.alif);
        show = (ImageButton) findViewById(R.id.ba);

        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.anime_scale);

        show.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TampilGambar.setVisibility(View.VISIBLE);

            }
        });

        show.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TampilGambar.setVisibility(View.INVISIBLE);
            }
        });

        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.alif);
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.ba);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.ta);
        final MediaPlayer SuaraTsa = MediaPlayer.create(this, R.raw.sa);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.jim);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.ha);
        final MediaPlayer SuaraKha = MediaPlayer.create(this, R.raw.kho);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.dal);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.dzal);
        final MediaPlayer SuaraRa = MediaPlayer.create(this, R.raw.ro);
        final MediaPlayer SuaraZa = MediaPlayer.create(this, R.raw.dza);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.sin);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.syin);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.shad);
        final MediaPlayer SuaraDhad = MediaPlayer.create(this, R.raw.dod);
        final MediaPlayer SuaraTha = MediaPlayer.create(this, R.raw.to);
        final MediaPlayer SuaraDza = MediaPlayer.create(this, R.raw.dho);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.ain);
        final MediaPlayer SuaraGhin = MediaPlayer.create(this, R.raw.gin);
        final MediaPlayer SuaraFa = MediaPlayer.create(this, R.raw.fa);
        final MediaPlayer SuaraQaf = MediaPlayer.create(this, R.raw.kof);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.kaf);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.lam);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.min);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.nun);
        final MediaPlayer SuaraWau = MediaPlayer.create(this, R.raw.wawu);
        final MediaPlayer SuaraHaa = MediaPlayer.create(this, R.raw.haa);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.ya);

        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.alif);
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.ba);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.ta);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.tsa);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.jim);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.ha);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.kha);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.dal);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.dzal);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.ra);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.zai);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.sin);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.syin);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.shad);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.dhad);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.tha);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.zha);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.ain);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.ghin);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.fa);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.qaf);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.kaf);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.lam);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.mim);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.nun);
        ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.wau);
        ImageButton ButtonSuara27 = (ImageButton) this.findViewById(R.id.haa);
        ImageButton ButtonSuara28 = (ImageButton) this.findViewById(R.id.ya);

        ButtonSuara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.alif);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ba);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ta);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.tsa);
                TampilGambar.startAnimation(animScale);
                SuaraTsa.start();
            }
        });

        ButtonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.jim);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });

        ButtonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ha);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });

        ButtonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kha);
                TampilGambar.startAnimation(animScale);
                SuaraKha.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.dal);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.dzal);
                TampilGambar.startAnimation(animScale);
                SuaraDzal.start();
            }
        });

        ButtonSuara10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ra);
                TampilGambar.startAnimation(animScale);
                SuaraRa.start();
            }
        });

        ButtonSuara11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.zai);
                TampilGambar.startAnimation(animScale);
                SuaraZa.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.sin);
                TampilGambar.startAnimation(animScale);
                SuaraSin.start();
            }
        });

        ButtonSuara13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.syin);
                TampilGambar.startAnimation(animScale);
                SuaraSyin.start();
            }
        });

        ButtonSuara14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.shad);
                TampilGambar.startAnimation(animScale);
                SuaraShad.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.dhad);
                TampilGambar.startAnimation(animScale);
                SuaraDhad.start();
            }
        });

        ButtonSuara16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.tha);
                TampilGambar.startAnimation(animScale);
                SuaraTha.start();
            }
        });

        ButtonSuara17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.zha);
                TampilGambar.startAnimation(animScale);
                SuaraDza.start();
            }
        });

        ButtonSuara18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ain);
                TampilGambar.startAnimation(animScale);
                SuaraAin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ghin);
                TampilGambar.startAnimation(animScale);
                SuaraGhin.start();
            }
        });

        ButtonSuara20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fa);
                TampilGambar.startAnimation(animScale);
                SuaraFa.start();
            }
        });

        ButtonSuara21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.qaf);
                TampilGambar.startAnimation(animScale);
                SuaraQaf.start();
            }
        });

        ButtonSuara22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.kaf);
                TampilGambar.startAnimation(animScale);
                SuaraKaf.start();
            }
        });

        ButtonSuara23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.lam);
                TampilGambar.startAnimation(animScale);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.mim);
                TampilGambar.startAnimation(animScale);
                SuaraMim.start();
            }
        });

        ButtonSuara25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.nun);
                TampilGambar.startAnimation(animScale);
                SuaraNun.start();
            }
        });

        ButtonSuara26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.wau);
                TampilGambar.startAnimation(animScale);
                SuaraWau.start();
            }
        });

        ButtonSuara27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.haa);
                TampilGambar.startAnimation(animScale);
                SuaraHaa.start();
            }
        });

        ButtonSuara28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ya);
                TampilGambar.startAnimation(animScale);
                SuaraYa.start();
            }
        });

    }
}
