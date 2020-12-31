package com.example.dagger2.Dagger;

import com.example.dagger2.Computer.PatriotRam;
import com.example.dagger2.Computer.RAM;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class PatriotRamModule {

    private int price;

    public PatriotRamModule(int price) {
        this.price = price;
    }

    @Provides
    int providePrice(){
        return price;
    }

    @Provides
    RAM provideRam(PatriotRam patriotRam){
        return patriotRam;
    }
}
