package com.softka.domain;

import java.util.ArrayList;

public class Fruit {
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }
    public ArrayList<String> getColors() {
        return this.colors;
    }
    public void setColor(String name) {
        this.colors.add(name);
    }
}
