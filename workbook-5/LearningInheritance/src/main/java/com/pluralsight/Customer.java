package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;
//customer is also a sub/child/derived clas of person

public class Customer extends Person {
    private int customerId;
    private int creditRating;
    private ArrayList<BankAccount> bankAccounts;

    public Customer(int customerId, String firstName, String lastName, LocalDate birthDate, int creditRating) {
        super(firstName, lastName, birthDate);
        this.customerId = customerId;
        this.creditRating = creditRating;
    }

    public void calculateCreditRating(){

    }

    public void addAccount(BankAccount account){
        bankAccounts.add(account);
        Animal animal = new Animal();
        animal.name="Customer animal";
        animal.name1="Testing";
    }
}
