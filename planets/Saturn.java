package com.sike.planets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Saturn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturn);
        ImageView sat = findViewById(R.id.sat);
        Picasso.get().load("https://space-facts.com/wp-content/uploads/saturn.png").resize(300, 300).into(sat);
    }
}