package com.softka.domain;

/**
 * represents an animal and his elementary parameters.
 *
 * @author Juan Camilo Cantillo
 */
public class Animal {
    /**
     * represents the animal color variable.
     */
    public String color;
    /**
     * represents the animal type variable.
     */
    public String type;
    /**
     * represents the animal name variable.
     */
    public String name;
    /**
     * represents the animal weight variable.
     */
    private float weight;
    /**
     * represents the animal height variable.
     */
    private float height;

    /**
     * Create an animal with the following parameters.
     * @param color the color of the animal.
     * @param type the type of the animal.
     * @param name the name of the animal.
     * @param weight the weight of the animal.
     * @param height the height of the animal.
     */
    public Animal(String color, String type, String name, float weight, float height){
        this.color = color;
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    /**
     * returns the animal color.
     * @return the color of the animal.
     */
    public String getColor() {
        return color;
    }

    /**
     * is responsible for giving a value to attribute type.
     * @param color the color of the animal.
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * returns the animal type.
     * @return type.
     */
    public String getType() {
        return type;
    }

    /**
     * is responsible for giving a value to attribute type.
     * @param type the type of the animal.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * returns the animal name.
     * @return the name of the animal.
     */
    public String getName() {
        return name;
    }

    /**
     * is responsible for giving a value to attribute name.
     * @param name the name of the animal.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * returns the animal weight.
     * @return the weight of the animal.
     */
    public float getWeight() {
        return weight;
    }

    /**
     * is responsible for giving a value to attribute weight.
     * @param weight the weight of the animal.
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * returns the animal height.
     * @return the height of the animal.
     */
    public float getHeight() {
        return height;
    }

    /**
     * is responsible for giving a value to attribute height.
     * @param height the height of the animal.
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * about write the method toString.
     * @return String for each of the variables.
     */
    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
