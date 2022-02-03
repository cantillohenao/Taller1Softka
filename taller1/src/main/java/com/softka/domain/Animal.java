package com.softka.domain;

public class Animal {
    public String color;
    public String type;
    public String name;
    private float weight;
    private float height;

    public Animal(String color, String type, String name, float weight, float height){
        this.color = color;
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
