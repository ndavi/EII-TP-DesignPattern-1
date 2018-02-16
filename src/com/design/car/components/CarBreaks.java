package com.design.car.components;

public class CarBreaks {
    private Integer discNumber;
    private Integer ventilatedNumber;
    private String other;

    public CarBreaks(Integer discNumber, Integer ventilatedNumber, String other) {
        this.discNumber = discNumber;
        this.ventilatedNumber = ventilatedNumber;
        this.other = other;
    }

    public Integer getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
    }

    public Integer getVentilatedNumber() {
        return ventilatedNumber;
    }

    public void setVentilatedNumber(Integer ventilatedNumber) {
        this.ventilatedNumber = ventilatedNumber;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return discNumber + "-wheel disc brakes : " +
                ventilatedNumber + " ventilated. " + other;
    }
}
