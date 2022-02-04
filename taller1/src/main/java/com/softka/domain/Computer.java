package com.softka.domain;

/**
 * represents a computer and his elementary parameters.
 *
 * @author Juan Camilo Cantillo
 */
public class Computer {
    /**
     *  represents the computer brand variable.
     */
    public String brand;
    /**
     *  represents the computer model variable.
     */
    public String model;
    /**
     * represents the computer price variable.
     */
    public float price;
    /**
     * represents the computer ram variable.
     */
    protected String ram;

    /**
     * Create a class computer with the following parameters.
     * @param brand the brand.
     * @param price the price.
     * @param ram the ram.
     */
    public Computer(String brand, String model, float price, String ram) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ram = ram;
    }

    /**
     * returns the computer brand.
     * @return the brand.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * is responsible for giving a value to attribute brand.
     * @param brand the brand of the computer.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * returns the computer model.
     * @return the model.
     */
    public String getModel() {
        return model;
    }

    /**
     * is responsible for giving a value to attribute model.
     * @param model the model of the computer.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * returns the computer price.
     * @return the price.
     */
    public float getPrice() {
        return price;
    }

    /**
     * is responsible for giving a value to attribute price.
     * @param price the price of the computer.
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * returns the computer ram.
     * @return the ram.
     */
    public String getRam() {
        return ram;
    }

    /**
     * is responsible for giving a value to attribute ram.
     * @param ram the ram of the computer.
     */
    public void setRam(String ram) {
        this.ram = ram;
    }

    /**
     * about write the method toString.
     * @return String for each of the variables.
     */
    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", ram='" + ram + '\'' +
                '}';
    }
}
