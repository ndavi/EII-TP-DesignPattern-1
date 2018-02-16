package com.design.car.components;

public class BerlineCarEngine {
    private String type;

    public BerlineCarEngine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BerlineCarEngine{" +
                "type='" + type + '\'' +
                '}';
    }
}
