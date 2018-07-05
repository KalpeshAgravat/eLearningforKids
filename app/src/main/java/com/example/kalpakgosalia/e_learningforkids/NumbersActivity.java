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

public class NumbersActivity extends AppCompatActivity {
    GridView gridView;
    String[] numbers_name = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    Integer[] numbers_image = {R.drawable.coloured_numbers_0,R.drawable.coloured_numbers_1,R.drawable.coloured_numbers_2,R.drawable.coloured_numbers_3,R.drawable.coloured_numbers_4,
            R.drawable.coloured_numbers_5,R.drawable.coloured_numbers_6,R.drawable.coloured_numbers_7,R.drawable.coloured_numbers_8,R.drawable.coloured_numbers_9};
    int[] songs = {R.raw.zero, R.raw.one,R.raw.two, R.raw.three, R.raw.four, R.raw.five,R.raw.six, R.raw.seven, R.raw.eight, R.raw.nine};
    MediaPlayer mediaPlayer;
    Animation Bounce, Fadein,Fadeout,Rotae,Zoomin,Zoomout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        gridView = findViewById(R.id.gridview);

        CustomNumberAdapter customListView = new CustomNumberAdapter(this,numbers_name,numbers_image);
        gridView.setAdapter(customListView);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mediaPlayer = MediaPlayer.create(NumbersActivity.this, songs[position]);
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
