package com.pluralsight;
/*
How do we know the class is an abstract class? the 'abstract' keyword
 */

public abstract  class Asset {
    protected String description;
    protected int yearAcquired;
    protected double originalCost;

    public Asset(String description, int yearAcquired, double originalCost){
        this.description=description;
        this.yearAcquired=yearAcquired;
        this.originalCost=originalCost;
    }

    public String getDescription(){
        return description;
    }

    public int getYearAcquired(){
        return yearAcquired;
    }

   /* public double getValue(){
        return originalCost;
    }*/

    /*
    We can add an abstract method to our abstract class; an abstract class can
    have zero or more abstract methods:
     */
    public abstract  double getValue();
}
