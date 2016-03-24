package com.udacity.gradle.displayactivity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class DisplayActivity extends ActionBarActivity {

    public static String JOKE_KEY = "Joke key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
    }

}
