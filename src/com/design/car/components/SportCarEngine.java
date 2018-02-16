package com.design.car.components;

public class SportCarEngine {
    private String type;
    private String valveType;

    public SportCarEngine(String type, String valveType) {
        this.type = type;
        this.valveType = valveType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValveType() {
        return valveType;
    }

    public void setValveType(String valveType) {
        this.valveType = valveType;
    }

    @Override
    public String toString() {
        return "SportCarEngine{" +
                "type='" + type + '\'' +
                ", valveType='" + valveType + '\'' +
                '}';
    }
}
