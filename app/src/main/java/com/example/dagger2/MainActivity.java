package com.example.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Computer computer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ComputerComponent computerComponent = DaggerComputerComponent.create();
        computer = computerComponent.getComputer();
        computer.work();

    }
}
