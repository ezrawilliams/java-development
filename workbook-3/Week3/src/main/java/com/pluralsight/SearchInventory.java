package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchInventory {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        System.out.println("What do you want to do? \n"+
                "\t1 - List all products\n"+
                "\t2- Lookup a product by its id\n"+
                "\t3- Find all products within a price range\n"+
                "\t4- Add a new product\n"+
                "\t5- Quit the application\n");
        int command = scanner.nextInt();
        while(command != 5) {
            switch(command) {
                case 1:
                    listAllProducts(inventory);
                    break;
                case 2:
                        lookUpById(inventory);
                        break;
                case 3:
                            findWithinPriceRange(inventory);
                            break;
                case 4:
                                addNewProduct(inventory);
                                break;
                case 5:
                                    return;
            }
            System.out.println("Please enter a valid command");
            command = scanner.nextInt();
        }
        /*
        shorter way - take two of each of the values, call the getName method, and use compare to to compare
        each two values
        inventory.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
        for (Product product : inventory) {
            System.out.printf("id: %d %s - Price: $%.2f\n",
                    product.getId(), product.getName(), product.getPrice());

        } */
        /*
        Because we are comparing the strings, we need to make sure we do not go out of bounds
        inventory[i] comparing to inventory[i+1]
        outer for loop goes from inventory[0] to inventory[6]
        inner for loop goes from inventory[1] to inventory[7]
        we will compare inventory[0](first item) to the inventory[1]

        for (int i = 0; i < inventory.size()-1; i++) {
            //sorting by names of products:
            for (int j = i + 1; j < inventory.size(); j++) {

                compareTo method is used in Java to compare two strings - returns 0 if the two strings are the
                same; if string1 < string2 it returns a value less than zero;
                if string1 > string2 it returns a value greater than zero

                if (inventory.get(i).getName().compareTo(inventory.get(j).getName()) > 0) {
                    Product temp = inventory.get(i);//save the first object in a temp value
                    inventory.set(i, inventory.get(j));//save the second in place of the first
                    inventory.set(j, temp);//save the second as temp(value of first)
                }

            }
            Product p = inventory.get(i);

            System.out.printf("id: %d %s - Price: $%.2f\n",
                    p.getId(), p.getName(), p.getPrice());

        }*/

    }

    private static void addNewProduct(ArrayList<Product> inventory) {
        int id;
        String name;
        float price;
        System.out.println("Please enter the id of the product: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter the name of the product: ");
        name = scanner.nextLine();
        System.out.println("Please enter the price of the product: ");
        price = scanner.nextFloat();
        Product product = new Product(id, name, price);
        inventory.add(product);
    }

    private static void findWithinPriceRange(ArrayList<Product> inventory) {
        float minPrice;
        float maxPrice;
        System.out.println("Please enter the minimum range of the product: ");
        minPrice = scanner.nextFloat();
        System.out.println("Please enter the maximum range of the product: ");
        maxPrice = scanner.nextFloat();
        for (Product product : inventory) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                System.out.println(product);
            }
        }
    }

    private static void lookUpById(ArrayList<Product> inventory) {
        System.out.println("Please enter the id of the product: ");
        int id = scanner.nextInt();
        for (Product product : inventory) {
            if(product.getId() == id) {
                System.out.println(product);
                break;
            }
        }
    }

    private static void listAllProducts(ArrayList<Product> inventory) {
        for (Product product : inventory) {
            System.out.println(product);
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
