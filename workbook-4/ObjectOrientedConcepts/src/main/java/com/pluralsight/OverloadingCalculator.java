package com.pluralsight;

public class OverloadingCalculator {
    /*
    For overloading to work the METHOD SIGNATURES have to be different:
    METHOD SIGNATURE - method name and the parameters
     */

    public void sum (int a, int b) {
        System.out.println(a + b);
    }

    public void sum (double a, double b) {
        System.out.println(a + b);
    }

    public void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    public int sum(int a, int b, String value){
        return a + b;
    }
}
