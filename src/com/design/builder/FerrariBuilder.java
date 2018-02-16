package com.design.builder;

import com.design.car.SportCar;
import com.design.car.components.SportCarEngine;

public class FerrariBuilder extends AbstractCarBuilder {
    private SportCarEngine engine;

    @Override
    public SportCar getCar() {
        return new SportCar(this.carBody, this.carBreaks, this.seats, this.windows, this.carFuel, this.engine);
    }

    @Override
    public AbstractCarBuilder buildEngine(String... params) {
        engine = new SportCarEngine(params[0], params[1]);
        return this;
    }
}
