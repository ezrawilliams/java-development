package com.pluralsight;

/*
This class is actually a class that will be used to create Java Beans - objects:
The rules for beans:
1. Implement Serialiazable
2. Public default parameterless (no args) constructor
3. Public getter setter methods


 */

import java.io.Serializable;

public class Person implements Serializable {

    private String name; //Private properties

    //Default constructor - NO PARAMETERS
    public Person(){}

    //Getters and setters
    public void setName(String name) {
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
