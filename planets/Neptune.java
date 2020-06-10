package com.sike.planets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Neptune extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neptune);
        ImageView nep = findViewById(R.id.nep);
        Picasso.get().load("https://astronomy.com/-/media/Images/Magazine%20Articles/2018/09/ASYSM0918_01.jpg?mw=600").resize(300,300).into(nep);
    }
}