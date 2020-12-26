package com.example.dagger2.Dagger;

import com.example.dagger2.Computer.KingstonRam;
import com.example.dagger2.Computer.RAM;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class KingstonRamModule {

    @Binds
    abstract RAM bindRam(KingstonRam kingstonRam);
}
