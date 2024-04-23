package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        try {
            FileInputStream fis = null;
            Scanner scanner = new Scanner(System.in);
            Scanner scanner2;
            String input;
            System.out.println("Please enter the file that you want to read: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("Goldilocks and the three bears")) {
                fis = new FileInputStream("goldilocks.txt");
            } else if (input.equalsIgnoreCase("Hansel and Gretel")) {
                fis = new FileInputStream("hansel_and_gretel.txt");
            } else if (input.equalsIgnoreCase("Mary Had a little lamb")) {
                fis = new FileInputStream("mary_had_a_little_lamb.txt");
            }
            int lineNumber=1;
            scanner2 = new Scanner(fis);
            while (scanner2.hasNextLine()) {
                input = lineNumber+"."+ scanner2.nextLine();//read each line using nextLine method
                System.out.println(input);
                lineNumber++;
            }
            // close the scanner and release the resources
            scanner.close();
            fis.close();
            scanner2.close();
        } catch (IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();

        }
    }
}
