package com.pluralsight;
/*
This class is used to create a Customer object and it holds the customer attributes
and methods. We learned toString and how to autogenerate methods in IntelliJ
 */

public class Customer {
    private int id;
    private String name;
    private double outstandingBalance;

    public Customer() {
    }

    public Customer(int id, String name, double outstandingBalance) {
        this.id = id;
        this.name = name;
        this.outstandingBalance = outstandingBalance;
    }

    @Override /*That means that this method comes from the parent class (Object)
     Object has a toString method but here we are making it personal to Customer */
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", outstandingBalance=" + outstandingBalance +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 1000){
            throw new IllegalArgumentException("Id must be less than 1000");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOutstandingBalance() {
        return outstandingBalance;
    }

    public void setOutstandingBalance(double outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }
}
