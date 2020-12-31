package com.example.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2.Computer.Computer;
import com.example.dagger2.Dagger.ComputerComponent;
import com.example.dagger2.Dagger.DaggerComputerComponent;
import com.example.dagger2.Dagger.PatriotRamModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Computer computer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ComputerComponent computerComponent = DaggerComputerComponent.builder()
                .price(150)
                .year(2010)
                .build();

        computerComponent.inject(this);
        computer.work();

    }
}
