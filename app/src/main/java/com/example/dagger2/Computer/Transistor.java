package com.example.dagger2.Computer;

import android.util.Log;

public class Transistor {
    private static final String TAG = "Transistor";
    //Imagine that we don't have this class.This is an external library class.Therefore we cannot annotate @Inject

    public void run(){
        Log.wtf(TAG,"transistor is running");

    }
}
