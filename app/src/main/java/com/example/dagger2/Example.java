package com.example.dagger2;

import android.app.Application;

import com.example.dagger2.Dagger.ComputerComponent;
import com.example.dagger2.Dagger.DaggerComputerComponent;

public class Example extends Application {

    private ComputerComponent computerComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        computerComponent = DaggerComputerComponent.builder()
                .price(1000)
                .year(2015)
                .build();

    }

    public ComputerComponent getComputerComponent(){
        return computerComponent;
    }
}
