package com.sike.planets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Mercury extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercury);
        ImageView merc = findViewById(R.id.merc);
        Picasso.get().load("https://www.refinery29.com/images/9202365.jpg?format=webp&width=720&height=864&quality=85").resize(300, 300).into(merc);
    }
}