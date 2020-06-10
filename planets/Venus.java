package com.sike.planets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Venus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venus);
        ImageView ven = findViewById(R.id.ven);
        Picasso.get().load("https://media.wired.com/photos/5e59ad2b79c7100008eb6ae8/master/pass/photo_space_venus_1_S91-50688.jpg").resize(300, 300).into(ven);
    }
}