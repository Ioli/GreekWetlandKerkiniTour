package com.example.admin.greekwetlandkerkinitour;
/*
 * Copyright (C) 2017 The Android Open Source Project
 * This app "Greek Wetland Kerkini Tour"
 * has real informations and images. It is a guide to travel at lake Kerkini
 * Is created with android studio 2.3.1
 * as exercise for Android Basics by Google Nanodegree Program
 * "Tour Guide app " by Dimitra Christina Nikolaidou
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the actions category
        TextView actions = (TextView) findViewById(R.id.actions);

        // Set a click listener on that View
        actions.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the actions category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ActionsActivity}
                Intent actionsIntent = new Intent(MainActivity.this, ActionsActivity.class);

                // Start the new activity
                startActivity(actionsIntent);
            }
        });

        // Find the View that shows the hotels category
        TextView hotel = (TextView) findViewById(R.id.hotel);

        // Set a click listener on that View
        hotel.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the hotel category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HotelsActivity}
                Intent hotelIntent = new Intent(MainActivity.this, HotelsActivity.class);

                // Start the new activity
                startActivity(hotelIntent);
            }
        });

        // Find the View that shows the colors category
        TextView foods = (TextView) findViewById(R.id.food);

        // Set a click listener on that View
        foods.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the foods category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FoodActivity}
                Intent foodsIntent = new Intent(MainActivity.this,FoodActivity.class);

                // Start the new activity
                startActivity(foodsIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView photos = (TextView) findViewById(R.id.photos);

        // Set a click listener on that View
        photos.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the photos category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhotosActivity}
                Intent photosIntent = new Intent(MainActivity.this, PhotosActivity.class);

                // Start the new activity
                startActivity(photosIntent);
            }
        });
    }
}