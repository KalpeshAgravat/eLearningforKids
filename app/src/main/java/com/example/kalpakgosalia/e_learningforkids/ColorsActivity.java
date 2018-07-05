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

public class ColorsActivity extends AppCompatActivity {
    String[] color_name={"Black","Blue","Brown","Green","Orange","Pink","Purple","Red","White","Yellow"};
    Integer[] color_image={R.drawable.color_black,R.drawable.color_blue,R.drawable.color_brown,R.drawable.color_green,R.drawable.color_orange,R.drawable.color_pink,R.drawable.color_purple,R.drawable.color_red,R.drawable.color_white,R.drawable.color_yellow};
    int[] songs={R.raw.color_black,R.raw.color_blue,R.raw.color_brown,R.raw.color_green,R.raw.color_orange,R.raw.color_pink,R.raw.color_purple,R.raw.color_red,R.raw.color_white,R.raw.color_yellow};
    GridView gridView;
    MediaPlayer mediaPlayer;
    Animation Bounce, Fadein,Fadeout,Rotae,Zoomin,Zoomout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        gridView = findViewById(R.id.gridview4);

        CustomColorActivity customColorActivity = new CustomColorActivity(this,color_name,color_image);
        gridView.setAdapter(customColorActivity);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mediaPlayer = MediaPlayer.create(ColorsActivity.this, songs[position]);
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
