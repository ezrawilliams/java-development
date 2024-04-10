package com.pluralsight;

public class DataTypesDemo {
    static String name = "Data Types Demo";
    public static void main(String[] args) {
        //boolean - true or false:
        boolean winOrLose;
        winOrLose=true;
        winOrLose=false;

        //char - hold a single Unicode character:
        char letterA = 'A';

        //byte, short, int, long, float, double
        byte num1 = 1;
        short num2 = 100;
        int num3 = 3000;
        long num4 = 10100010;
        float num5 = 2.5F;
        double num6 = 235.67;

        //String:
        String name = "Ezra Williams";

        // declare three integers:
        int myNumber1=3, myNumber2=4, myNumber3=5;

        String firstName="Ezra", middleName="Asheba",
                lastName="Williams";

        //Constant - final - does not change
        final double PI = 3.145;

        name = "Hadi Bashir";
        num4 = 922337203685477580L;
        letterA=65;
    }
}
