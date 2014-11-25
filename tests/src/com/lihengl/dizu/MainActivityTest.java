package com.lihengl.dizu;

import android.util.Log;
import android.test.ActivityInstrumentationTestCase2;


public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private static final String TAG = "MainActivityTest";

    private MainActivity sbjActivity;

    public MainActivityTest() {
        super("com.lihengl.dizu", MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Log.d(TAG, "Setup");
        sbjActivity = getActivity();
    }

    public void testPreConditions() {
        Log.d(TAG, "Precondition");
        assertTrue(true);
    }

    @Override
    protected void tearDown() throws Exception {
        Log.d(TAG, "Teardown!");
        super.tearDown();
    }

}
