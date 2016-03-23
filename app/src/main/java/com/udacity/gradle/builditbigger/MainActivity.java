package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

import com.udacity.gradle.jokes.Joker;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tellJoke(View view){
        // display a joke
        String joke;
        Joker myJoker = new Joker();
        joke = myJoker.getJoke();

        Toast.makeText(this, joke, Toast.LENGTH_LONG).show();
    }


}
