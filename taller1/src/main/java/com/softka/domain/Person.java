package com.softka.domain;

import java.util.Date;

/**
 * represents a person and his elementary parameters.
 *
 * @author  Juan Camilo Cantillo
 */
public class Person {
    /**
     * represents the person name variable.
     */
    public String name;
    /**
     * represents the person first lastName variable.
     */
    public String lastName1;
    /**
     * represents the person second lastName variable.
     */
    public String lastName2;
    /**
     * represents the person dataBirth variable.
     */
    public Date dateBirth;
    /**
     * represents the person height variable.
     */
    public float height;

    /**
     * Create a person with the following parameters.
     * @param name the name of the person.
     * @param lastName1 first lastname.
     * @param lastName2 second lastname.
     * @param dateBirth birthday.
     * @param height height.
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * returns the person's name.
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * is responsible for giving a value to attribute name.
     * @param name the name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * about write the method toString.
     * @return String for each of the variables.
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName1='" + lastName1 + '\'' +
                ", lastName2='" + lastName2 + '\'' +
                ", dateBirth=" + dateBirth +
                ", height=" + height +
                '}';
    }
}
