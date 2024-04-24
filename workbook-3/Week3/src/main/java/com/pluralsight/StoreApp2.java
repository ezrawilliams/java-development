package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StoreApp2 {
    // the key is the product id, the value is a product object
    static HashMap<Integer, Product> inventory =
            new HashMap<Integer, Product>();
    public static void main(String[] args) {
        loadInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item # are you interested in? ");
        int id = scanner.nextInt();
        Product matchedProduct = inventory.get(id);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.printf("We carry %s and the price is $%.2f",
                matchedProduct.getName(), matchedProduct.getPrice());

    }

    public static void loadInventory() {
// this method loads product objects into inventory
// and its details are not shown
        Product product1 = new Product(1, "Soap", 3.50f);
        Product product2 = new Product(2, "Body wash", 5.30f);
        inventory.put(product1.getId(), product1);
        inventory.put(product2.getId(), product2);
    }
}
