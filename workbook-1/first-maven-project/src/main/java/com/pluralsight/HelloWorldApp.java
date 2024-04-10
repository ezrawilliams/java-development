package com.pluralsight;

/**
 * HelloWorldApp is an example of most people's first
 * Java program
 *
 * @author Dana Wyatt
 *
 */
public class  HelloWorldApp {
    public static void main(String[]
                 args) {
/**
 * The greeting to be displayed in the Console.
 */
        String message = "Howdy Java !";
        display(message);
    }

    /**
     * Dislays any message the console window
     *
     * @param message the message displayed
     */
    public static void
    display(String message) {
        System.out.println(message);
    }
}
