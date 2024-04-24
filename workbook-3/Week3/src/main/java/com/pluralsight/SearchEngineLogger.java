package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SearchEngineLogger {
    public static void main(String[] args) {
        logActions("launch");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a search item or X to exit");
        String searchItem = scanner.nextLine();
        while (!searchItem.equalsIgnoreCase("X")) {
            logActions("search : "+ searchItem);
            System.out.println("Enter a search item or X to exit");
            searchItem = scanner.nextLine();
        }
        if (searchItem.equalsIgnoreCase("X")) {
            logActions("exit");
        }

    }

    public static void logActions(String action){
        try{
            FileWriter fw = new FileWriter("logs.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(getCurrentDateTime()+ " "+action+"\n");
            //fw.close();
           bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String getCurrentDateTime(){
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dtf.format(ldt);
    }
}
