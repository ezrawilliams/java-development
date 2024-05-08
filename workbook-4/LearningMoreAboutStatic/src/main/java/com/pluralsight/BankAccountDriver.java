package com.pluralsight;

public class BankAccountDriver {
    public static void main(String[] args) {
        double PI = Math.PI;
        //The interest rate on savings is 0.05
        //set the interest rate:
        BankAccount.setInterestRate(0.05);
        BankAccount bankAccount = new BankAccount("S01", "Savings", 100);
        BankAccount bankAccount1 = new BankAccount("S02", "Savings", 200);
        bankAccount.deposit(200);
        bankAccount1.deposit(200);
        bankAccount.withdraw(100);
        bankAccount1.withdraw(100);
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount1.getBalance());
        BankAccount.bankName("Ezra's Bank");
    }
}
