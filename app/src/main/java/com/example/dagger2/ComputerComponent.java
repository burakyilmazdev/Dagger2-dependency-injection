package com.example.dagger2;

import dagger.Component;

@Component(modules = ProcessorModule.class)
public interface ComputerComponent {

    //Computer getComputer();

    void inject(MainActivity mainActivity);
}
