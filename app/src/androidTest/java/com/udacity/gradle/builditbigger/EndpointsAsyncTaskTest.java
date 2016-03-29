package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class EndpointsAsyncTaskTest extends AndroidTestCase {
    public void testNonEmptyString() {
        assertNotNull(new EndpointsAsyncTask().execute(getContext()));
        assertNotSame(new EndpointsAsyncTask().execute(getContext()), "");
    }
}