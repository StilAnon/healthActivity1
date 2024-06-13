package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class nutritionEntry extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_entry);

        Button waterButton = findViewById(R.id.water_button);
        Button dryFoodButton = findViewById(R.id.dryFood_button);
        Button treatsButton = findViewById(R.id.Treats_button);
        Button backButton = findViewById(R.id.back_button);

        waterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritionEntry.this, Water.class);
                startActivity(intent);
            }
        });

        dryFoodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritionEntry.this, dryFood.class);
                startActivity(intent);
            }
        });

        treatsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritionEntry.this, Treat.class);
                startActivity(intent);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nutritionEntry.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}