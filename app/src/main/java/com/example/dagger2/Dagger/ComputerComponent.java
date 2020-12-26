package com.example.dagger2.Dagger;

import com.example.dagger2.MainActivity;

import dagger.Component;

@Component(modules = {ProcessorModule.class,PatriotRamModule.class})
public interface ComputerComponent {

    //Computer getComputer();

    void inject(MainActivity mainActivity);
}
