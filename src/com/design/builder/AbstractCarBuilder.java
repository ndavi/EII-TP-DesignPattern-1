package com.design.builder;

import com.design.car.Car;
import com.design.car.components.CarBody;
import com.design.car.components.CarBreaks;
import com.design.car.components.CarFuel;
import com.design.car.components.CarPower;

public abstract class AbstractCarBuilder<TCar extends Car> {
    protected CarBody carBody;
    protected CarPower carPower;
    protected CarFuel carFuel;
    protected CarBreaks carBreaks;
    protected String seats;
    protected String windows;

    public abstract TCar getCar();

    public abstract AbstractCarBuilder buildEngine(String... params);

    public AbstractCarBuilder buildBodyStyle(Double lenght, Double width, Double height, Double wheelbase, Double frontTrack, Double rearTrack, Double curb) {
        carBody = new CarBody(lenght,width,height,wheelbase,frontTrack,rearTrack,curb);
        return this;
    }

    public AbstractCarBuilder buildPower(Integer hp, Integer rpm, Integer ft, Integer rpmFt) {
        carPower = new CarPower(hp, rpm, ft, rpmFt);
        return this;
    }

    public AbstractCarBuilder buildBreaks(Integer discNumber, Integer ventilatedNumber, String other) {
        carBreaks = new CarBreaks(discNumber, ventilatedNumber, other);
        return this;
    }

    public AbstractCarBuilder buildSeats(String seats) {
        this.seats = seats;
        return this;
    }

    public AbstractCarBuilder buildWindows(String windows) {
        this.windows = windows;
        return this;
    }

    public AbstractCarBuilder buildFuel(String fuelType, Integer MPGCity, Integer MPGHighway, Integer MPGCombined, Integer middleRange) {
        carFuel = new CarFuel(fuelType,MPGCity,MPGHighway,MPGCombined,middleRange);
        return this;
    }

}
