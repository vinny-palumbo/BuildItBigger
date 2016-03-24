package com.udacity.gradle.displayactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class DisplayActivityFragment extends Fragment {

    public DisplayActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_display, container, false);

        Intent intent = getActivity().getIntent();

        String joke = intent.getStringExtra(DisplayActivity.JOKE_KEY);
        TextView jokeTextView = (TextView) rootView.findViewById(R.id.displayJokeTextView);
        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }

        return rootView;
    }
}
