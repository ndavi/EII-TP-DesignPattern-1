package com.design;

import com.design.builder.BerlineBuilder;
import com.design.builder.FerrariBuilder;
import com.design.car.BerlineCar;
import com.design.car.SportCar;

public class Main {

    public static void main(String[] args) {
        SportCar sportCar = (SportCar) new FerrariBuilder()
                .buildBodyStyle(10d,20d,30d,40d,50d,60d,70d)
                .buildBreaks(10,10,"Electronic Brake Distribution")
                .buildFuel("Gasoline", 10,20,10, 10)
                .buildPower(10,20,30,40)
                .buildSeats("Driver sport frontseat")
                .buildWindows("Laminated Side Windows")
                .buildEngine("3.6L VL", "Variable valve timing")
                .getCar();

        BerlineCar berlineCar = (BerlineCar) new BerlineBuilder()
                .buildBodyStyle(12d,15d,21d,44d,50d,60d,70d)
                .buildBreaks(10,10,"Electronic Brake Distribution")
                .buildFuel("Gasoline", 5,25,15, 4)
                .buildPower(5,1,20,12)
                .buildSeats("Front seat center armrest")
                .buildWindows("Front windows with one-touch on two windows")
                .buildEngine("3.6L VL")
                .getCar();

        System.out.println(sportCar);
        System.out.println(berlineCar);
    }
}
