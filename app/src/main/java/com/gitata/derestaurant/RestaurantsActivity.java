package com.gitata.derestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RestaurantsActivity extends AppCompatActivity {

    private TextView mLocationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView = findViewById(R.id.locationTextView);
        mLocationTextView.setText("Here are all the restaurants near: " + location);
    }
}
