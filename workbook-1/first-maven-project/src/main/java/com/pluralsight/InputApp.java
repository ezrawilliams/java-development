package com.pluralsight;

import java.util.Scanner;

public class InputApp {
    //Default access - means it is accessible to this class and other classes in the com.pluralsight package
   private static Scanner scanner = new Scanner(System.in);//global variable or object
    public static void main(String[] args) {

        System.out.print(
                "What do you want to do (1-add, 2= subtract) ? ");
        int command = scanner.nextInt();
        if (command == 1) {
            doAdd();
        }
        else if (command == 2) {
            doSubtract();
        }
        else {
            System.out.printf(
                    "%d -- Invalid command!", command);
        }
    }
    public static void doAdd() {
      //  Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        System.out.printf("%f + %f = %f", num1, num2, sum);
    }
    public static void doSubtract() {
       // Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter 2nd number: ");
        double num2 = scanner.nextDouble();
        double difference = num1 - num2;
        System.out.printf(
                "%f - %f = %f", num1, num2, difference);
    }
}
