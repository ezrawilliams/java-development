package com.pluralsight;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try{
            // create a FileReader object connected to the File
            FileReader fileReader = new FileReader("poem.txt");
            // create a BufferedReader to manage input stream
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;
            // read until there is no more data
            while((input = bufReader.readLine()) != null) {
                System.out.println(input);
            }
            // close the stream and release the resources
            bufReader.close();

        } catch (IOException e){

        }
    }
}
