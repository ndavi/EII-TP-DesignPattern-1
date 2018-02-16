package com.design.car;

import com.design.car.components.CarBody;
import com.design.car.components.CarBreaks;
import com.design.car.components.CarFuel;

public abstract class Car {
    private CarBody body;
    private CarBreaks breaks;
    private String seats;
    private String windows;
    private CarFuel fuel;

    public Car(CarBody body, CarBreaks breaks, String seats, String windows, CarFuel fuel) {
        this.body = body;
        this.breaks = breaks;
        this.seats = seats;
        this.windows = windows;
        this.fuel = fuel;
    }

    public CarBody getBody() {
        return body;
    }

    public void setBody(CarBody body) {
        this.body = body;
    }

    public CarBreaks getBreaks() {
        return breaks;
    }

    public void setBreaks(CarBreaks breaks) {
        this.breaks = breaks;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public CarFuel getFuel() {
        return fuel;
    }

    public void setFuel(CarFuel fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "----------------------" + this.getClass().getSimpleName() + "-----------------------\n" +
                "Body : " + body + "\n" +
                "Breaks : " + breaks + "\n" +
                "Seats : " + seats  + "\n" +
                "Windows : " + windows  + "\n" +
                "Fuel : " + fuel + "\n"
                ;
    }
}
