package com.design.builder;

import com.design.car.BerlineCar;
import com.design.car.components.BerlineCarEngine;

public class BerlineBuilder extends AbstractCarBuilder {
    private BerlineCarEngine engine;

    @Override
    public BerlineCar getCar() {
        return new BerlineCar(this.carBody, this.carBreaks, this.seats, this.windows, this.carFuel, this.engine);
    }

    @Override
    public AbstractCarBuilder buildEngine(String... params) {
        engine = new BerlineCarEngine(params[0]);
        return this;
    }
}
