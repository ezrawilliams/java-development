package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreApp {

    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        inventory.add(new Product(3, "Laundry Soap", 11.00f));
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f\n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
// this method loads product objects into inventory
// and its details are not shown
        Product product1 = new Product(1, "Soap", 3.50f);
        Product product2 = new Product(2, "Body wash", 5.30f);
        inventory.add(product1);
        inventory.add(product2);
        return inventory;
    }
}
