package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        // Get the city name from the intent
        Intent intent = getIntent();
        String cityName = intent.getStringExtra("CITYNAME");
        // Display the city name
        TextView cityTextView = findViewById(R.id.textViewCityName);
        cityTextView.setText(cityName);
        // Set backBtn listener to return back
        Button backButton = findViewById(R.id.backBtn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
