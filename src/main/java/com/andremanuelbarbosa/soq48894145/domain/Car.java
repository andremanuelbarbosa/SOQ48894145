package com.andremanuelbarbosa.soq48894145.domain;

public class Car {

    private String make;
    private String model;

    public String getMake() {

        return make;
    }

    public void setMake(String make) {

        this.make = make;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public String getCarDescription(){

        return "Make: " + make + " Model: " + model;
    }
}
