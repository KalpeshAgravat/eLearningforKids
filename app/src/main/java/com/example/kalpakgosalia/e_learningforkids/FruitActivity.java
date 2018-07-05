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

public class FruitActivity extends AppCompatActivity {
    String[] fruit_name = {"Apple", "Banana", "cherry", "Grapes", "Green Apple","Kiwi","Lemon","Mango","Orange","Peaches","Pear","Strawberry","Tomato","Watermelon",};
    Integer[] fruit_iamge = {R.drawable.f_apple, R.drawable.f_bananas, R.drawable.f_cherry, R.drawable.f_grapes,R.drawable.f_grrenapple,R.drawable.f_kiwi,R.drawable.f_lemon,R.drawable.f_mango,R.drawable.f_orange,R.drawable.f_peaches,R.drawable.f_pear,R.drawable.f_strawberry,R.drawable.f_tomato,R.drawable.f_watermelon};
    int[] songs = {R.raw.apple,R.raw.banana,R.raw.cherry,R.raw.grapes,R.raw.greenapple,R.raw.kiwi,R.raw.lemon,R.raw.mango,R.raw.orange,R.raw.peach,R.raw.pear,R.raw.strawberry,R.raw.tomato,R.raw.watermelon};
    GridView gridView;
    MediaPlayer mediaPlayer;
    Animation Bounce, Fadein,Fadeout,Rotae,Zoomin,Zoomout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
        gridView = findViewById(R.id.gridview5);

        CustomFruitActivity customFruitActivity = new CustomFruitActivity(this,fruit_name,fruit_iamge);
        gridView.setAdapter(customFruitActivity);



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mediaPlayer = MediaPlayer.create(FruitActivity.this, songs[position]);
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