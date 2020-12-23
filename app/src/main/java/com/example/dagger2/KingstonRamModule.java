package com.example.dagger2;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class KingstonRamModule {

    @Binds
    abstract RAM bindRam(KingstonRam kingstonRam);
}
