package com.sike.planets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Mars extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mars);
        ImageView mar = findViewById(R.id.mars);
        Picasso.get().load("https://space-facts.com/wp-content/uploads/mars.jpg").resize(300,300).into(mar);
    }
}