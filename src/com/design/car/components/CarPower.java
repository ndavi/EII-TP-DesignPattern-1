package com.design.car.components;

public class CarPower {
    private Integer hp;
    private Integer rpm;
    private Integer ft;
    private Integer rpmFt;

    public CarPower(Integer hp, Integer rpm, Integer ft, Integer rpmFt) {
        this.hp = hp;
        this.rpm = rpm;
        this.ft = ft;
        this.rpmFt = rpmFt;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    public Integer getFt() {
        return ft;
    }

    public void setFt(Integer ft) {
        this.ft = ft;
    }

    public Integer getRpmFt() {
        return rpmFt;
    }

    public void setRpmFt(Integer rpmFt) {
        this.rpmFt = rpmFt;
    }

    @Override
    public String toString() {
        return hp + " hp @ " +
                rpm + "; " + ft +
                " ft lb torque @ " + rpmFt + " rpm";
    }
}
