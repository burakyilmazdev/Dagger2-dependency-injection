package com.example.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class ComputerAdapter {
    private static final String TAG = "ComputerAdapter";

    @Inject
    public ComputerAdapter(){

    }

    public void charger(Computer computer){
        Log.d(TAG,"charging...");
    }
}
