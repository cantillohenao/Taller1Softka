package com.softka.domain;

public class Vehicle {
    private String model;
    private String type;
    private String brand;
    private int year;
    private String color;
    private String plate;

    public Vehicle(String model, String type, String brand, int year, String color, String plate) {
        this.model = model;
        this.type = type;
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
