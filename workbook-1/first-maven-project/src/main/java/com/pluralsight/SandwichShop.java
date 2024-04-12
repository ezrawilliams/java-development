package com.pluralsight;
import java.util.Scanner;
public class SandwichShop {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int choice, age;
        String loaded;
        System.out.println("Enter a choice: 1: Regular: base price $5.45, /n 2: Large: base price $8.95");
        choice = input.nextInt();
        input.nextLine();
        System.out.println("Do you want a loaded sandwich? yes or no" );
        loaded = input.nextLine();
        System.out.println("Please enter your age: ");
        age = input.nextInt();
        sandwichCost(choice, loaded, age);
    }

    public static void sandwichCost(int usersChoice, String loaded, int age){
        double basePrice =0;
        double discount = 0;
        double cost = 0;
        if (loaded.equals("yes")){
            if (usersChoice == 1){
                basePrice = 6.45;
            } else if (usersChoice == 2){
                basePrice = 10.70;
            } else {
                basePrice = 0;
            }
        } else {
            if (usersChoice == 1){
                basePrice = 5.45;
            } else if (usersChoice == 2){
                basePrice = 8.95;
            } else {
                basePrice = 0;
            }

        }

        if (age <= 17){
            discount = 0.1;
            cost = basePrice * discount;
        } else if (age >= 65) {
            discount = 0.2;
            cost = basePrice * discount;
        } else {
            cost = basePrice;
        }
        System.out.println("The cost of your sandwich is "+cost);
    }
}