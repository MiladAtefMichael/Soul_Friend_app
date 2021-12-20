package com.example.soulfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView horse_info;
    TextView horse_sport;
    TextView horse_learn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horse_info=findViewById(R.id.horse_info);
        horse_sport=findViewById(R.id.horse_sport);
        horse_learn=findViewById(R.id.horse_learn);
        horse_info.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,horse_info.class);
            startActivity(intent);

        });
        horse_sport.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,riding_sport.class);
            startActivity(intent);

        });
        horse_learn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,riding_learn.class);
            startActivity(intent);

        });

    }


}