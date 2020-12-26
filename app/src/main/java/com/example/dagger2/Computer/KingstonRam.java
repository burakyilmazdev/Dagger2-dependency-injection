package com.example.dagger2.Computer;

import android.util.Log;

import javax.inject.Inject;

public class KingstonRam implements RAM {
    private static final String TAG = "KingstonRam";

    @Inject
    public KingstonRam(){

    }

    @Override
    public void Brand() {
        Log.wtf(TAG, "Brand: Kingston");
    }
}
