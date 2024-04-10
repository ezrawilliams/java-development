package com.pluralsight;

import java.util.Scanner;

public class Section3_3 {
    public static void main(String[] args) {
        System.out.print("Ezra ");
        System.out.println("Williams");
        System.out.println("Hey! This is my name!");
        System.out.print("Noel ");
        System.out.print("Guillen");

        //How to format using the format method of the String class:
        float subtotal = 22.87f;
        float tax = subtotal * 0.0825f;
        float totalDue = subtotal + tax;
        System.out.println("Total due is: "+totalDue);
        System.out.println("Total due is: " + String.format("%.2f", totalDue));

        //How to format using printf:
        System.out.printf("Total due is: %.2f\n", totalDue);

        System.out.printf("Total due is: %.3f\n", totalDue);

        int id = 10135;
        String name = "Brandon Plyers";
        float pay = 5239.77f;
        System.out.printf("%s (id: %d) $%.2f\n", name, id, pay);

        //How do we read from the console - Scanner
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name1 = myScanner.nextLine();
        System.out.println("Howdy " + name1);
        
        double userInput1, userInput2;
        System.out.print("Please enter the first number: ");
        //Get the result from the console using nextDouble() method:
        userInput1 = myScanner.nextDouble();
        //System.out.println();
        System.out.print("Please enter the second number: ");
        userInput2 = myScanner.nextDouble();
        double result = userInput1+userInput2;
        System.out.printf("Your numbers added together is %.2f", result);

        // get two numbers, add them together, and display the sum
        System.out.print("Enter first number: ");
        int num1 = myScanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = myScanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
}
