package com.udacity.gradle.displayactivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


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

//        Intent intent = getActivity().getIntent();
//        if (intent != null && intent.hasExtra("joke")){
//            String jokeStr = intent.getStringExtra("joke");
//            TextView jokeTextView = (TextView) rootView.findViewById(R.id.displayJokeTextView);
//            jokeTextView.setText(jokeStr);
//        }

        return rootView;
    }
}
