package com.example.dagger2.Computer;

import android.util.Log;

import javax.inject.Inject;

public class Computer {
    private static final String TAG = "Computer";

    private Owner owner;
    private RAM ram;
    private Processor processor;

    @Inject
    public Computer(Owner owner,RAM ram, Processor processor) {
        this.owner = owner;
        this.ram = ram;
        this.processor = processor;
    }

    public void work(){
        ram.Brand();
        Log.wtf(TAG, "Computer is working!!!! "+ owner);
    }

    @Inject
    public void charge(ComputerAdapter adapter){
        adapter.charger(this);
    }
}
