package com.example.dagger2;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PatriotRamModule {

    @Binds
    abstract RAM bindRam(PatriotRam patriotRam);
}
