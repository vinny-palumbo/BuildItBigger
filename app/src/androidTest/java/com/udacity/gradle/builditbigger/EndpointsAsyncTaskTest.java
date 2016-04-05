package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.TimeUnit;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class EndpointsAsyncTaskTest extends AndroidTestCase {
    public void testNonEmptyString() {
        try {
            EndpointsAsyncTask jokeTask = new EndpointsAsyncTask();
            jokeTask.execute(getContext());
            String joke = jokeTask.get(30, TimeUnit.SECONDS);

            assertNotNull(joke);
            assertNotSame(joke, "");
        } catch (Exception e){
            fail("Timed out");
        }
    }
}