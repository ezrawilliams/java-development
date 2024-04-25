package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SearchInventoryMap {
    public static void main(String[] args) {
        HashMap<String,Product> products = new HashMap<>();
        products = loadInventory();
        for (Product p : products.values()) {
            System.out.println(p);
        }

        Scanner scanner = new Scanner(System.in);
        String searchAgain="Yes";
        while (searchAgain.equalsIgnoreCase("Yes")) {
            System.out.print("Enter product name: ");
            String productName = scanner.nextLine();
           if (products.containsKey(productName)) {
               System.out.println(products.get(productName));
           } else {
               System.out.println("Product not found");
           }
           System.out.print("Do you want to search again? (Yes/No): ");
           searchAgain = scanner.nextLine();
        }

    }

    public static HashMap<String, Product> loadInventory() {
        HashMap<String, Product> inventory = new HashMap<>();
        try {
            FileReader fr = new FileReader("inventory.csv");
            BufferedReader br = new BufferedReader(fr);
            String line;//to store our lines
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
                Product product = new Product(Integer.parseInt(data[0]),
                        data[1], Float.parseFloat(data[2]));
                inventory.put(product.getName(), product);//then we add the product to the arraylist
                //  br.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        return inventory;
    }
}
