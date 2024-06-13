package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button healthMonitorButton = findViewById(R.id.health_monitoring_button);
        Button activityMonitoringButton = findViewById(R.id.activity_monitoring_button);


        healthMonitorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, nutritionEntry.class);
                startActivity(intent);
            }
        });

        activityMonitoringButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, petLog.class);
                startActivity(intent);
            }
        });
    }
}