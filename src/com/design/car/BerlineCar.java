package com.design.car;

import com.design.car.components.BerlineCarEngine;
import com.design.car.components.CarBody;
import com.design.car.components.CarBreaks;
import com.design.car.components.CarFuel;

public class BerlineCar extends Car {
    private BerlineCarEngine engine;

    public BerlineCar(CarBody body, CarBreaks breaks, String seats, String windows, CarFuel fuel, BerlineCarEngine engine) {
        super(body, breaks, seats, windows, fuel);
        this.engine = engine;
    }

    public BerlineCarEngine getEngine() {
        return engine;
    }

    public void setEngine(BerlineCarEngine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Engine : " + engine
                ;
    }
}
