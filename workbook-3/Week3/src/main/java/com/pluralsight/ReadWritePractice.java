package com.pluralsight;
/*
1. Ask the user for one of the nursery rhyme files:
goldilocks, hansel and gretel, mary had a little lamb
2. Take the user's choice
3. Read the contents of that file
4. Write the contents of the file to an output file called
outputNURSERYRHYMENAME.txt
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadWritePractice {
    public static void main(String[] args) {
        // Ask user for a Nursery Rhyme.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a  Nursery Rhyme: (goldilocks(1), hansel and gretel(2), " +
                "or mary had a little lamb(3): \n ");
        String selection = input.nextLine();

        // switch cases for 3 stories & handles error if valid option not chosen
        switch(selection){
            case "1" : selection = "goldilocks.txt";
                break;
            case "2" : selection = "hansel_and_gretel.txt";
                break;
            case "3": selection = "mary_had_a_little_lamb.txt";
                break;
            default : System.out.println("Please choose a number from 1-3!");
                break;
        }

        try {
            /*We have killed two birds with one stone here by defining the FileReader object within the constructor
            of the BufferedReader
             */
            BufferedReader reader = new BufferedReader(new FileReader(selection));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output"+selection));
            String line;
            
                while((line = reader.readLine()) != null){
                    writer.write(line + "\n");
                }
                reader.close();
                writer.close();
        }catch (Exception e){
            System.out.println("Error found " + e.getMessage());
            e.printStackTrace();
        }
    }
}
