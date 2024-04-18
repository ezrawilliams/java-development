package com.pluralsight;
/*
This application demonstrates how to overload methods in Java
Concepts covered - methods, overloading, polymorphism (many forms)
 */

public class OverloadingExample {
    public static void main(String[] args) {
        //Use the three methods:
        OverloadingExample ox = new OverloadingExample();
        System.out.println(ox.sum(10,20));
        System.out.println(ox.sum(10,20,30));
        System.out.println(ox.sum(10.5,20.5));
    }

    /*
    Here I will create some OVERLOADED methods that demo how to sum two numbers
    but demos how to sum DIFFERENT kinds of numbers:
     */

    //This first method takes two int parameters
    public int sum(int x, int y){
        return x + y;
    }

    //Overloaded sum method that takes three int parameters:
    public int sum(int x, int y, int z){
        return x + y + z;
    }

    //Third overloaded method sum that takes two double parameters:
    public double sum(double x, double y){
        return x + y;
    }
}
