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

public class AnimalActivity extends AppCompatActivity {
    String[] animal_name={"Bear","Camel","Cat","Cow","Dinosaur","Dog","Elephant","Fox","Girrafe","Goat","Gorilla","Horse","Kangaroo","Koalla","Lion","Monkey","Panda","Pig","Rabbit","Rhino","Squirrel","Tiger","Wolf","Zebra"};
    Integer[] animals_img={R.drawable.anim_bear,R.drawable.anim_camel,R.drawable.anim_cat,R.drawable.anim_cow,R.drawable.anim_dino,R.drawable.anim_dog,R.drawable.anim_elephant,R.drawable.anim_fox,R.drawable.anim_giraffe,R.drawable.anim_goat,R.drawable.anim_gorilla,R.drawable.anim_horse,R.drawable.anim_kangaroo,R.drawable.anim_koalla,R.drawable.anim_lion,R.drawable.anim_monkey,R.drawable.anim_panda,R.drawable.anim_pig,R.drawable.anim_rabbit,R.drawable.anim_rhino,R.drawable.anim_squirrel,R.drawable.anim_tiger,R.drawable.anim_wolf,R.drawable.anim_zebra};
    int[] songs={R.raw.bear,R.raw.camel,R.raw.cat,R.raw.cow,R.raw.dinosaur,R.raw.dog,R.raw.elephant,R.raw.fox,R.raw.giraffe,R.raw.goat,R.raw.gorilla,R.raw.horse,R.raw.kangaroo,R.raw.koala,R.raw.lion,R.raw.monkey,R.raw.panda,R.raw.pig,R.raw.rabbit,R.raw.rhino,R.raw.squirrel,R.raw.tiger,R.raw.wolf,R.raw.zebra};
    GridView gridView;
    MediaPlayer mediaPlayer;
    Animation Bounce, Fadein,Fadeout,Rotae,Zoomin,Zoomout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        gridView = findViewById(R.id.gridview2);

        CustomAnimalAdapater customAnimalAdapater = new CustomAnimalAdapater(this,animal_name,animals_img);
        gridView.setAdapter(customAnimalAdapater);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mediaPlayer = MediaPlayer.create(AnimalActivity.this, songs[position]);
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
