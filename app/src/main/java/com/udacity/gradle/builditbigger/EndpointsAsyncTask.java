package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;
import com.udacity.gradle.displayactivity.DisplayActivity;
import com.udacity.gradle.jokes.Joker;

/**
 * Created by Vincent on 2016-03-24.
 */
class EndpointsAsyncTask extends AsyncTask<Context, Void, String> {
    private static MyApi myApiService = null;
    private Context context;

    @Override
    protected String doInBackground(Context... params) {
        if(myApiService == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("https://randomjokes-1265.appspot.com/_ah/api/");

            // end options for devappserver

            myApiService = builder.build();
        }

        context = params[0];

        Joker myJoker = new Joker();
        return myJoker.getJoke();
    }

    @Override
    protected void onPostExecute(String result) {
        Intent myIntent = new Intent(context, DisplayActivity.class);
        myIntent.putExtra(DisplayActivity.JOKE_KEY, result);
        context.startActivity(myIntent);
    }
}
