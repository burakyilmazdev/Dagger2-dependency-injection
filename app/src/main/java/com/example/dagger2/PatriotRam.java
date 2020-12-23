package com.example.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class PatriotRam implements RAM {
    private static final String TAG = "PatriotRam";

    @Inject
    public PatriotRam() {
    }

    @Override
    public void Brand() {
        Log.wtf(TAG, "Brand: Patriot");
    }
}
