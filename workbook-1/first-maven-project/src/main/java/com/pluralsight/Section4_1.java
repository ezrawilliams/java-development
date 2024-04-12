package com.pluralsight;

import java.util.Scanner;

public class Section4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* System.out.println("Welcome to Yearup Imax");
        System.out.println("Please enter your age so we can determine your ticket price");
        int age = input.nextInt();*/

        /*
        if the user is 10 or less the price is 5.00, if the user is 10-18 the price is 10.00 if the user
        is 18-50, the price 1s 20.00 and if the user is older than 50 the price is 15.00
         */
        /*double price = 0;
        //if decision statement:
        if (age <= 10) { // if age is less than or equal to 10 then assign 5.00 to price
            price = 5.00;
        } else if (age < 18) { //if age is greater than ten but less than 18 price is 10.00
            price = 10.00;
        } else if (age <= 50) { //if age is greater than or equal to 18 but less than or equal to 50, price is 20
            price = 20.00;
        } else {//we do not need to indicate if age> 50 because that is the only other option
            price = 15.00;
        }

        System.out.println("Price of admission  : " + price);*/

        //Example 2:
        /*
        We are going to ask the user what year they were born
        Defining Generation Names and Dates.
        The Greatest Generation (GI Generation): Born 1901–1927.
        The Silent Generation: Born 1928–1945.
        Baby Boom Generation: Born 1946–1964.
        Generation X: Born 1965–1980.
        Millennial Generation or Generation Y: Born 1981–1996.
        Generation Z or iGen: Born 1997–2009.
        Generation Alpha: Born Between 2010-2024
        Variables - a variable that holds the birth year
        a variable that holds the generation
         */

        /*System.out.println("Please input your birth year : ");
        int birthYear = input.nextInt();
        String generation = "";
        if(birthYear >= 1901 && birthYear <= 1927){
            generation = "Greatest Generation";
        } else if (birthYear >= 1928 && birthYear <= 1945) {
            generation = "Silent Generation";
        } else if (birthYear >= 1946 && birthYear <= 1964) {
            generation = "Baby Boom Generation";
        } else if (birthYear >= 1965 && birthYear <= 1980) {
            generation = "Generation X";
        } else if (birthYear >= 1981 && birthYear <= 1996) {
            generation = " Millennial Generation";
        } else if (birthYear >= 1997 && birthYear <= 2009) {
            generation = "Generation Z";
                                             } else if (birthYear >= 2010 && birthYear <= 2024) {
            generation = "Generation Alpha";
        } else {
            generation = "Invalid generation";
        }
        System.out.println("Your generation is "+generation);

        System.out.println("Please enter a number and I will tell you if it is even or odd");
        int num = input.nextInt();
        if (num%2 == 0 )
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");

        String homeState = "Texas";
        String contactPhone;
        if (homeState.equals("Texas") || homeState.equals("Kansas")) {
            contactPhone = "800-555-5555";
        }
        else {
            contactPhone = "855-555-5555";
        }*/

        //Conditional operator - (condition) ? expression if true : expression if false;
        String name = "Ezra";
        int age = 25;
        double price = (age < 18) ? 22.50 : 25.00;
        System.out.println("Price of admission: " + price);
    }
}
