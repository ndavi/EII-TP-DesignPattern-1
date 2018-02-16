package com.design.car.components;

public class CarBody {
    private Double lenght;
    private Double width;
    private Double height;
    private Double wheelbase;
    private Double frontTrack;
    private Double rearTrack;
    private Double curb;

    public CarBody(Double lenght, Double width, Double height, Double wheelbase, Double frontTrack, Double rearTrack, Double curb) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
        this.wheelbase = wheelbase;
        this.frontTrack = frontTrack;
        this.rearTrack = rearTrack;
        this.curb = curb;
    }

    public Double getLenght() {
        return lenght;
    }

    public void setLenght(Double lenght) {
        this.lenght = lenght;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(Double wheelbase) {
        this.wheelbase = wheelbase;
    }

    public Double getFrontTrack() {
        return frontTrack;
    }

    public void setFrontTrack(Double frontTrack) {
        this.frontTrack = frontTrack;
    }

    public Double getRearTrack() {
        return rearTrack;
    }

    public void setRearTrack(Double rearTrack) {
        this.rearTrack = rearTrack;
    }

    public Double getCurb() {
        return curb;
    }

    public void setCurb(Double curb) {
        this.curb = curb;
    }

    @Override
    public String toString() {
        return "External dimensions : overall length (inches): " + lenght +
                ", overall width (inches): " + width +
                ", overall height (inches): " + height +
                ", wheelbase (inches): " + wheelbase +
                ",front track (inches): " + frontTrack +
                ", rear track (inches): " + rearTrack +
                " and curb to curb turning circle (feet): " + curb;
    }

}
