package com.example.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Computer {
    private static final String TAG = "Computer";
    private RAM ram;
    private Processor processor;

    @Inject
    public Computer(RAM ram, Processor processor) {
        this.ram = ram;
        this.processor = processor;
    }

    public void work(){
        Log.d(TAG, "Computer is working! ");
    }
}
