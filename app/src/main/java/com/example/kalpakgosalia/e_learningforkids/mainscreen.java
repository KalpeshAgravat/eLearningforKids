package com.example.kalpakgosalia.e_learningforkids;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.Random;

public class mainscreen extends AppCompatActivity {
    ImageView img_numbres,img_alphabets,img_color,img_animal,img_fruits,img_birds;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);
        img_numbres = findViewById(R.id.ignumber);
        img_alphabets = findViewById(R.id.igalphabets);
        img_color = findViewById(R.id.igcolors);
        img_animal = findViewById(R.id.iganimals);
        img_fruits = findViewById(R.id.igfruits);
        img_birds = findViewById(R.id.igbirds);

        img_birds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mainscreen.this,BridsActivity.class);
                startActivity(i);
            }
        });

        img_fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mainscreen.this,FruitActivity.class);
                startActivity(i);
            }
        });

        img_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mainscreen.this,ColorsActivity.class);
                startActivity(i);
            }
        });


        img_animal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mainscreen.this,AnimalActivity.class);
                startActivity(i);
            }
        });
        img_alphabets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mainscreen.this,alphabeatActivity.class);
                startActivity(i);
            }
        });

        img_numbres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mainscreen.this,NumbersActivity.class);
                startActivity(i);
            }
        });
    }

}
