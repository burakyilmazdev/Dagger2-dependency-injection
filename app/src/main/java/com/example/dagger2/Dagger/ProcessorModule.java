package com.example.dagger2.Dagger;


import com.example.dagger2.Computer.Capacitor;
import com.example.dagger2.Computer.Processor;
import com.example.dagger2.Computer.Transistor;

import dagger.Module;
import dagger.Provides;

@Module
public class ProcessorModule {

    @Provides
    static Capacitor provideCapacitor(){
        return new Capacitor();
    }

    @Provides
    static Transistor provideTransistor(){
        Transistor transistor = new Transistor();
        transistor.run();
        return transistor;
    }

    @Provides
    static Processor provideProcessor(Transistor transistor, Capacitor capacitor){
        return new Processor(capacitor,transistor);
    }
}
