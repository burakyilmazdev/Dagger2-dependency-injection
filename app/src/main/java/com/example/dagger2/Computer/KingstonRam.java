package com.example.dagger2.Computer;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class KingstonRam implements RAM {
    private static final String TAG = "KingstonRam";
    private int price;
    private int manufacturingYear;

    @Inject
    public KingstonRam(@Named("price") int price, @Named("year") int manufacturingYear){
        this.price = price;
        this.manufacturingYear = manufacturingYear;
    }

    @Override
    public void Brand() {
        Log.wtf(TAG, "Brand: Kingston , Price:" +price+ "  manufacturing year : "+ manufacturingYear);
    }
}
