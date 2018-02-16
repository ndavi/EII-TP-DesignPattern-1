package com.design.car.components;

public class CarFuel {
    private String fuelType;
    private Integer MPGCity;
    private Integer MPGHighway;
    private Integer MPGCombined;
    private Integer middleRange;

    public CarFuel(String fuelType, Integer MPGCity, Integer MPGHighway, Integer MPGCombined, Integer middleRange) {
        this.fuelType = fuelType;
        this.MPGCity = MPGCity;
        this.MPGHighway = MPGHighway;
        this.MPGCombined = MPGCombined;
        this.middleRange = middleRange;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getMPGCity() {
        return MPGCity;
    }

    public void setMPGCity(Integer MPGCity) {
        this.MPGCity = MPGCity;
    }

    public Integer getMPGHighway() {
        return MPGHighway;
    }

    public void setMPGHighway(Integer MPGHighway) {
        this.MPGHighway = MPGHighway;
    }

    public Integer getMPGCombined() {
        return MPGCombined;
    }

    public void setMPGCombined(Integer MPGCombined) {
        this.MPGCombined = MPGCombined;
    }

    public Integer getMiddleRange() {
        return middleRange;
    }

    public void setMiddleRange(Integer middleRange) {
        this.middleRange = middleRange;
    }

    @Override
    public String toString() {
        return fuelType + " " +
                MPGCity + " MPG city, " +
                MPGHighway + " MPG highway, " +
                MPGCombined + " MPG Combined and " +
                middleRange + " mi. range";
    }
}
