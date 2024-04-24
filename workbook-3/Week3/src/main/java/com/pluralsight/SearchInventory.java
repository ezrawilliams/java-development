package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        inventory.add(new Product(3, "Laundry Soap", 11.00f));
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            //sorting by names of products:
            for (int j = i + 1; j < inventory.size(); j++) {
                if (inventory.get(j).getName() < inventory.get(j+1).getName())
            }
            System.out.printf("id: %d %s - Price: $%.2f\n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        try {
            FileReader fr = new FileReader("inventory.csv");
            BufferedReader br = new BufferedReader(fr);
            String line;//to store our lines
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|");
               Product product = new Product(Integer.parseInt(data[0]),
                        data[1], Float.parseFloat(data[2]));
               inventory.add(product);//then we add the product to the arraylist
              //  br.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        return inventory;
    }

}
