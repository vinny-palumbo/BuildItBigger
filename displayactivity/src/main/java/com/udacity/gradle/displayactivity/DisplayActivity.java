package com.udacity.gradle.displayactivity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;


public class DisplayActivity extends ActionBarActivity {
    private ProgressBar spinner;

    public static String JOKE_KEY = "Joke key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        spinner=(ProgressBar)findViewById(R.id.progressBar);
        spinner.setVisibility(View.VISIBLE);

        TextView jokeTextView = (TextView) findViewById(R.id.displayJokeTextView);
        if(!jokeTextView.equals(null)){
            spinner.setVisibility(View.GONE);
        }

    }

}
