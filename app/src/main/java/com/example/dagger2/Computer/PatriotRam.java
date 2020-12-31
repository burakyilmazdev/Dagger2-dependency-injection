package com.example.dagger2.Computer;

import android.util.Log;

import javax.inject.Inject;

import dagger.Provides;

public class PatriotRam implements RAM {
    private static final String TAG = "PatriotRam";
    private int price;

    @Inject
    public PatriotRam(int price) {
        this.price = price;
    }

    @Override
    public void Brand() {
        Log.wtf(TAG, "Brand: Patriot , Price :" + price);
    }
}
