package com.pluralsight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        String[] quotes = {"In the abundance of water the fool is thirsty",
                "B", "C", "D", "E", "F","G","H","I","J"};
        Scanner in = new Scanner(System.in);
       // System.out.print("Enter a number between 1 and 10: ");
        int n ;
        String goAgain="yes";
        while(goAgain.equals("yes")){
            try{
                System.out.print("Enter a number between 1 and 10: ");
                n = in.nextInt();
                System.out.println("Your quote is "+quotes[n-1]);
                System.out.print("Do you want to go again? ");
                goAgain = in.next();

            } catch(InputMismatchException e){
                System.out.println("Please enter a DIGIT");
                in.nextLine();
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("The number should be between 1 and 10");
                n = in.nextInt();
                System.out.println("Your quote is "+quotes[n-1]);
                System.out.print("Do you want to go again? ");
                goAgain = in.next();
            }
        }

    }
}
