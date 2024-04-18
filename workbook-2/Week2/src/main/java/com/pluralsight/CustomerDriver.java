package com.pluralsight;
/*
This class is used to create Customer objects , create an array of customer objects
and print our customer details.
 */
public class CustomerDriver {
    public static void main(String[] args) {
        //Create some customer objects and add them to an array:
        Customer customer1 = new Customer(1,
                "Ezra Williams",105.23);
        Customer customer2 = new Customer(2, "Onriel Houston",
                10000.50);
        Customer customer3 = new Customer(3, "Acton Barrett",
                500.57);
        Customer[] customers = {customer1, customer2, customer3};
        //call my printCustomers method:
        printCustomers(customers);
    }

    private static void printCustomers(Customer[] customers) {
        for (Customer customer : customers) {
            System.out.println(customer);//it will print whatever the toString method shows
        }
    }
}
