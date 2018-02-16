package com.design.car;

import com.design.car.components.CarBody;
import com.design.car.components.CarBreaks;
import com.design.car.components.CarFuel;
import com.design.car.components.SportCarEngine;

public class SportCar extends Car {
    private SportCarEngine engine;

    public SportCar(CarBody body, CarBreaks breaks, String seats, String windows, CarFuel fuel, SportCarEngine engine) {
        super(body, breaks, seats, windows, fuel);
        this.engine = engine;
    }

    public SportCarEngine getEngine() {
        return engine;
    }

    public void setEngine(SportCarEngine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Engine : " + engine
                ;
    }
}
