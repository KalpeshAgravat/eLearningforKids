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

public class BridsActivity extends AppCompatActivity {
    GridView gridView;
    String[] bird_name={"Parrot","Crow","Pigeon","Sparrow","Peacock","Owl","Flamingo","Rooster","Duck","Quail","Puffin","Hummingbird","Eagle","Chicken","Penguin"};
    Integer[] bird_image={R.drawable.parrot,R.drawable.crow,R.drawable.pigeon,R.drawable.sparrow,R.drawable.peacock,R.drawable.owl,R.drawable.flamingo,R.drawable.rooster,R.drawable.duck,R.drawable.quail,R.drawable.puffin,R.drawable.hummingbird,R.drawable.eagle,R.drawable.chicken,R.drawable.penguin};
    int[] songs={R.raw.parrot,R.raw.crow,R.raw.pigeon,R.raw.sparrow,R.raw.peacock,R.raw.owl,R.raw.flamingo,R.raw.rooster,R.raw.duck,R.raw.quail,R.raw.puffin,R.raw.hummingbird,R.raw.eagle,R.raw.chicken,R.raw.penguin};
    MediaPlayer mediaPlayer;
    Animation Bounce, Fadein,Fadeout,Rotae,Zoomin,Zoomout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brids);
        gridView = findViewById(R.id.gridview6);
        CustomBrid2Activity brid2Activity = new CustomBrid2Activity(this,bird_name,bird_image);
        gridView.setAdapter(brid2Activity);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mediaPlayer = MediaPlayer.create(BridsActivity.this, songs[position]);
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