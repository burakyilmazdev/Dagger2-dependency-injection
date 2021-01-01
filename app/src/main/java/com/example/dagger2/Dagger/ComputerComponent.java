package com.example.dagger2.Dagger;

import com.example.dagger2.MainActivity;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {ProcessorModule.class,KingstonRamModule.class})
public interface ComputerComponent {

    //Computer getComputer();

    void inject(MainActivity mainActivity);


    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder price(@Named("price") int price);

        @BindsInstance
        Builder year(@Named("year") int year);

        ComputerComponent build();

    }
}
