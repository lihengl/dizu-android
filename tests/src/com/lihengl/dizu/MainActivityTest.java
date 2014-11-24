package com.lihengl.dizu;

import android.util.Log;
import android.test.ActivityInstrumentationTestCase2;


public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private static final String TAG = "MainActivityTest";

    public MainActivityTest() {
        super("com.lihengl.dizu", MainActivity.class);
    }

    public void setUp() {
        Log.d(TAG, "Hello?");
    }

    public void testPreConditions() {
        assertTrue(true);
    }

}
