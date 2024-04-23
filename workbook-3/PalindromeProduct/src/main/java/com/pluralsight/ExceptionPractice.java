package com.pluralsight;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
This class will show how to utilize exception handling for runtime exceptions
And unexpected or expected exceptions that may occur.
 */

public class ExceptionPractice {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try {
            String[] names = {
                    "Ezra", "Elisha", "Ian",
                    "Siddalee", "Pursalane", "Zephaniah"
            };
            System.out.print("Pick a kid (select #1 - #6): ");
            int index = scanner.nextInt();
            index--; // change number from range 1-6 to range 0-5
// as long as the user entered a number in the range
// of 1 to 6, this will work. Otherwise, the index
// will be out of range.
            System.out.println(names[index]);
            if (index>6){
                //this is usually purposeful or forced by the programmer
                //try works as in try this code and IF then throw an exception
                throw new ArrayIndexOutOfBoundsException("Only 1-6 Kids");
            }
        }
        //The more specific exception goes first:it will err if we put Exception first
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Your number was out of range!");
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Your number was out of range!");
            e.printStackTrace();
        }
        scanner.close();

    }

}
