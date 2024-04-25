package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FlowerShop {
    static  Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //Menu:
        ArrayList<Flower> flowers = getInventoryOfFlowers();

        System.out.println("Welcome to my Flower Shop!");
        int command;
        System.out.println("1 - Display all flowers ");
        System.out.println("2 - Add flower ");
        System.out.println("3 - Remove flower ");
        System.out.println("4 - Exit");

        command = in.nextInt();
        while (command != 5) {
            switch (command) {
                case 1:
                    displayAllFlowers(flowers);
                    break;
                case 2:
                        addFlower(flowers);
                        break;
                case 3:
                        removeFlower(flowers);
                        break;
                case 4:
                    System.out.println("Welcome to my Flower Shop!");
                    System.out.println("1 - Display all flowers ");
                    System.out.println("2 - Add flower ");
                    System.out.println("3 - Remove flower ");
                    System.out.println("4 - Home page");
                    System.out.println("5 - Exit");
                   // command = in.nextInt();
                    break;
                case 5:
                    return;
            }
            System.out.println("Enter another command:");
            command = in.nextInt();
            in.nextLine();
        }
    }

    private static void removeFlower(ArrayList<Flower> flowers) {
        System.out.println("What flower do you want to remove?");
        String flower = in.nextLine();
        flowers.removeIf(f -> f.getFlowerName().equals(flower));
    }

    private static void addFlower(ArrayList<Flower> flowers) {
        System.out.println("What is the flower id? ");
        int id = in.nextInt();
        in.nextLine();
        System.out.println("What flower do you want to add?");
        String flowerName = in.nextLine();
        System.out.println("What is the color?");
        String color = in.nextLine();
        System.out.println("What is the price of the flower?");
        double price = in.nextDouble();
        Flower flower = new Flower(id, flowerName,color, price);
        flowers.add(flower);
    }

    private static void displayAllFlowers(ArrayList<Flower> flowers) {
        for(Flower flower: flowers){
            System.out.println(flower);
        }
    }

    public static ArrayList<Flower> getInventoryOfFlowers() {
        ArrayList<Flower> inventory = new ArrayList<Flower>();
        try {
            FileReader fr = new FileReader("flowers.csv");
            BufferedReader br = new BufferedReader(fr);
            String line;//to store our lines
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
                Flower flower = new Flower(Integer.parseInt(data[0]),
                        data[1], data[2],Double.parseDouble(data[3]));
                inventory.add(flower);//then we add the product to the arraylist
                //  br.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        return inventory;
    }
}
