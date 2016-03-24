package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.udacity.gradle.displayactivity.DisplayActivity;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchDisplayActivity(View view){

        Intent myIntent = new Intent(this, DisplayActivity.class);
        startActivity(myIntent);
    }
}
