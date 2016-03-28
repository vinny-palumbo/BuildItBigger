package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.udacity.gradle.displayactivity.DisplayActivity;
import com.udacity.gradle.jokes.Joker;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        new EndpointsAsyncTask().execute(this);

    }

    public void launchDisplayActivity(View view){
        Intent myIntent = new Intent(this, DisplayActivity.class);
        Joker myJoker = new Joker();
        String joke = myJoker.getJoke();
        myIntent.putExtra(DisplayActivity.JOKE_KEY, joke);
        startActivity(myIntent);
    }
}
