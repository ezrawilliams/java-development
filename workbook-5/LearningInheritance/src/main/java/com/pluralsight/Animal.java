package com.pluralsight;

public class Animal {
   // private String name;
    /*
    Protected means name is accessible in the com.pluralsight package
    and outside of the package but only to subclasses of Animal.
    Difference between default and protected.
     */

    public Animal(){
        System.out.println("Trace -- in animal constructor");
    }
    protected String name;
    //default access - only accessible within com.pluralsight package
    //not accessible outside even if the outside class is a subclass
    String name1;

    public Animal(String name){
        System.out.println("Trace == in Animal(name) constructor w/name");
        this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
