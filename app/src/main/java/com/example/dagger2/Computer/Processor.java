package com.example.dagger2.Computer;

public class Processor {

    //Imagine that we don't have this class.This is an external library class.Therefore we cannot annotate @Inject

    Capacitor capacitor;
    Transistor transistor;

    public Processor(Capacitor capacitor, Transistor transistor) {
        this.capacitor = capacitor;
        this.transistor = transistor;
    }
}
