package com.softka.domain;

/**
 * represents a vehicle and his elementary parameters.
 *
 * @author Juan Camilo Cantillo
 */
public class Vehicle {
    /**
     * represents the vehicle model variable.
     */
    private String model;
    /**
     * represents the vehicle type variable.
     */
    private String type;
    /**
     * represents the vehicle brand variable.
     */
    private String brand;
    /**
     * represents the vehicle year variable.
     */
    private int year;
    /**
     * represents the vehicle color variable.
     */
    private String color;
    /**
     * represents the vehicle plate variable.
     */
    private String plate;

    /**
     * Create a computer with the following parameters.
     * @param model The model of the vehicle.
     * @param type The type of the vehicle.
     * @param brand The brand of the vehicle.
     * @param year The year of the vehicle.
     * @param color The color of the vehicle.
     * @param plate The plate of the vehicle.
     */
    public Vehicle(String model, String type, String brand, int year, String color, String plate) {
        this.model = model;
        this.type = type;
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.plate = plate;
    }

    /**
     * returns the vehicle model.
     * @return the model.
     */
    public String getModel() {
        return model;
    }

    /**
     * is responsible for giving a value to attribute model.
     * @param model the model of the vehicle.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * returns the vehicle type.
     * @return the type.
     */
    public String getType() {
        return type;
    }

    /**
     * is responsible for giving a value to attribute type.
     * @param type the type of the vehicle.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * returns the vehicle brand.
     * @return the brand.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * is responsible for giving a value to attribute brand.
     * @param brand the brand of the vehicle.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * returns the vehicle year.
     * @return the year.
     */
    public int getYear() {
        return year;
    }

    /**
     * is responsible for giving a value to attribute year.
     * @param year the year of the vehicle.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * returns the vehicle color.
     * @return the color.
     */
    public String getColor() {
        return color;
    }

    /**
     * is responsible for giving a value to attribute color.
     * @param color the color of the vehicle.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * returns the vehicle plate.
     * @return the plate.
     */
    public String getPlate() {
        return plate;
    }

    /**
     * is responsible for giving a value to attribute plate.
     * @param plate the plate of the vehicle.
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }

    /**
     * about write the method toString.
     * @return String for each of the variables.
     */
    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", plate='" + plate + '\'' +
                '}';
    }
}
