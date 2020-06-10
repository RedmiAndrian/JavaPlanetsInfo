package com.sike.planets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Uranus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uranus);
        ImageView ura = findViewById(R.id.ura);
        Picasso.get().load(R.drawable.uranus).resize(300, 300).into(ura);
    }
}