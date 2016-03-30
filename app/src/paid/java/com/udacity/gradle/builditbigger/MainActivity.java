package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.tellJokeButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new EndpointsAsyncTask().execute(getApplicationContext());
            }
        });
    }

}
