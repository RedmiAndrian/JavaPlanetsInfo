package com.sike.planets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView merc = findViewById(R.id.merc);
        CardView ear = findViewById(R.id.ear);
        CardView ven = findViewById(R.id.ven);
        CardView mar = findViewById(R.id.mar);
        CardView jup = findViewById(R.id.jup);
        CardView sat = findViewById(R.id.sat);
        CardView ura = findViewById(R.id.ura);
        CardView nep = findViewById(R.id.nep);
        ImageView mercury = findViewById(R.id.image1);
        ImageView venus = findViewById(R.id.image2);
        ImageView earth = findViewById(R.id.image3);
        ImageView mars = findViewById(R.id.image4);
        ImageView jupiter = findViewById(R.id.image5);
        ImageView saturn = findViewById(R.id.image6);
        ImageView uranus = findViewById(R.id.image7);
        ImageView neptune = findViewById(R.id.image8);
        Picasso.get().load(R.drawable.mercury).into(mercury);
        Picasso.get().load("https://specials-images.forbesimg.com/imageserve/646438312/960x0.jpg?fit=scale").into(venus);
        Picasso.get().load(R.drawable.earth).into(earth);
        Picasso.get().load("https://space-facts.com/wp-content/uploads/mars.jpg").into(mars);
        Picasso.get().load(R.drawable.jupiter).into(jupiter);
        Picasso.get().load("https://space-facts.com/wp-content/uploads/saturn.png").into(saturn);
        Picasso.get().load(R.drawable.uranus).into(uranus);
        Picasso.get().load("https://astronomy.com/-/media/Images/Magazine%20Articles/2018/09/ASYSM0918_01.jpg?mw=600").into(neptune);
        ear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, Earth.class);
                startActivity(intent1);
            }
        });
        merc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Mercury.class);
                startActivity(intent2);
            }
        });
        ven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, Venus.class);
                startActivity(intent3);
            }
        });
        mar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this, Mars.class);
                startActivity(intent4);
            }
        });
        jup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent5 = new Intent(MainActivity.this, Jupiter.class);
                startActivity(intent5);
            }
        });
        sat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(MainActivity.this, Saturn.class);
                startActivity(intent6);
            }
        });
        ura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(MainActivity.this, Uranus.class);
                startActivity(intent7);
            }
        });
        nep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(MainActivity.this, Neptune.class);
                startActivity(intent8);
            }
        });
    }
}