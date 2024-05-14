package com.pluralsight;

import java.time.LocalDate;

//This is our Super/Base/Parent class:
public class Account {
    private String owner;
    private String accountName;
    private int accountNumber;
    private double initialDeposit;
    private LocalDate dateOpened;
    private double balance;

    public Account(String owner, String accountName, int accountNumber,
                   double initialDeposit, LocalDate dateOpened) {
        this.owner = owner;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.initialDeposit = initialDeposit;
        this.dateOpened = dateOpened;
        balance = initialDeposit;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public LocalDate getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(LocalDate dateOpened) {
        this.dateOpened = dateOpened;
    }
}
