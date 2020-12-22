package com.example.dagger2;

import dagger.Component;

@Component
public interface ComputerComponent {

    //Computer getComputer();

    void inject(MainActivity mainActivity);
}
