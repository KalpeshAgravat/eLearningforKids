package com.example.kalpakgosalia.e_learningforkids;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.Random;

public class alphabeatActivity extends AppCompatActivity {



    String[] alphabeat_names = {"Apple","Baseball","Clock","Donky","Elephant","Father","Grandmother","Hungry","internet","Justice","King","London","Monkey","Norway","Overtime","Pillow","Question","Rebit","Superman","Telephone","Underwear","Vexenet","WWW","xylophone","Yoghurt","Zebra"};
    Integer[] alphabeat_img = {R.drawable.letter_a,R.drawable.letter_b,R.drawable.letter_c,R.drawable.letter_d,R.drawable.letter_e,R.drawable.letter_f,
            R.drawable.letter_g,R.drawable.letter_h,R.drawable.letter_i,R.drawable.letter_j,R.drawable.letter_k,R.drawable.letter_l,R.drawable.letter_m,
            R.drawable.letter_n,R.drawable.letter_o,R.drawable.letter_p,R.drawable.letter_q,R.drawable.letter_r,R.drawable.letter_s,R.drawable.letter_t,
            R.drawable.letter_u,R.drawable.letter_v,R.drawable.letter_w,R.drawable.letter_x,R.drawable.letter_y,R.drawable.letter_z};
     int[] songs = {R.raw.a,R.raw.b,R.raw.c,R.raw.d,R.raw.e,R.raw.f,R.raw.g,R.raw.h,R.raw.i,R.raw.j,R.raw.k,R.raw.l,R.raw.m,R.raw.n,R.raw.o,
             R.raw.p,R.raw.q,R.raw.r,R.raw.s,R.raw.t,R.raw.u,R.raw.v,R.raw.w,R.raw.x,R.raw.y,R.raw.z};
     GridView gridView;
             MediaPlayer mediaPlayer;
    Animation Bounce, Fadein,Fadeout,Rotae,Zoomin,Zoomout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabeat);
        gridView = findViewById(R.id.gridview1);

        CustomAlphabet customAlphabet = new CustomAlphabet(this,alphabeat_names,alphabeat_img);
        gridView.setAdapter(customAlphabet);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mediaPlayer = MediaPlayer.create(alphabeatActivity.this, songs[position]);
                mediaPlayer.start();
                int max = 10;
                int min = 4;
                Random r = new Random();

                int i1=r.nextInt(max - min);

                if(i1==1){
                    Fadein = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein);
                    view.startAnimation(Fadein);
                }else if(i1==2){
                    Bounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
                    view.startAnimation(Bounce);
                }
                else if(i1==3){
                    Fadeout = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadeout);
                    view.startAnimation(Fadeout);
                }
                else if(i1==4){
                    Rotae = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                    view.startAnimation(Rotae);
                }
                else if(i1==5){
                    Zoomin = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomin);
                    view.startAnimation(Zoomin);
                }
                else if(i1==6){
                    Zoomout = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoomout);
                    view.startAnimation(Zoomout);
                }else {
                    Rotae = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                    view.startAnimation(Rotae);
                }
            }
        });

    }
}

