package com.softka.domain;

import java.util.ArrayList;

/**
 * represents a fruit and his elementary parameters.
 *
 * @author Juan Camilo Cantillo
 */
public class Fruit {
    /**
     * represents the fruit name variable.
     */
    public String name;
    /**
     * represents the fruit average weight variable.
     */
    private float averageWeight;
    /**
     * represents the variable  with the list of the color of the fruit.
     */
    public ArrayList<String> colors;

    /**
     * Create a Fruit with the following parameters.
     * @param name The name.
     * @param averageWeight the average weight.
     * @param colors the list colors.
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * returns the list of the fruit colors.
     * @return the list of colors
     */
    public ArrayList<String> getColors() {
        return this.colors;
    }
    /**
     * is responsible for giving a value to attribute name.
     * @param name the name of the fruit.
     */
    public void setColor(String name) {
        this.colors.add(name);
    }

    /**
     * about write the method toString.
     * @return String for each of the variables.
     */
    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", averageWeight=" + averageWeight +
                ", colors=" + colors +
                '}';
    }
}
