package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;

public class WriterApp1 {
    public static void main(String[] args) {
        try{
            //open the file: FileWriter:
            FileWriter writer = new FileWriter("skills.txt");

            //write to the file: //keeps appending to the end of the file
            writer.write("Skills: \n");
            writer.write("Git, HTML, CSS, Bootstrap\n");
            writer.write("JavaScript/ES6, jQuery, REST API, Node.js" +
                    ", Express\n");
            writer.write("Angula\n");
            writer.write("Java");

            //close the file when are finished using it
            writer.close();

        }catch (IOException e){
            System.out.println("ERROR: An unexpected error occurred");
            e.printStackTrace();
        }
    }
}
