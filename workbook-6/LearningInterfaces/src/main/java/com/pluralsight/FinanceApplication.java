package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class FinanceApplication {
    public static void main(String[] args) {
      /*  BankAccount account1 = new BankAccount
                ("Pam","123",12500);
        BankAccount account2 = new BankAccount
                ("Gary","456",1500);
        account1.deposit(100);
        account2.deposit(100);
        System.out.println(account1.getValue());
        System.out.println(account2.getValue());*/
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your portfolio name");
        String name = input.nextLine();
        System.out.println("Please enter your name");
        String ownerName = input.nextLine();
        Portfolio portfolio = new Portfolio(name, ownerName);
        String cont = "Yes";
       //input.nextLine();
        while (cont.equalsIgnoreCase("yes")){
            System.out.println("What type of asset do you want to add?");
            System.out.println("1. Jewelry, 2. Gold, 3. House, 4. BankAccount," +
                    " 5. CreditCard");
            int assetType = input.nextInt();
            input.nextLine();
            switch(assetType){
                case 1:
                    System.out.println("What is the name of the jewelry?");
                    String jewelryName = input.nextLine();
                    System.out.println("How many karat?");
                    double karats = input.nextDouble();
                    input.nextLine();
                    Jewelry jewelry = new Jewelry(jewelryName,karats);
                    portfolio.add(jewelry);
                    break;
                case 2:
                    System.out.println("Please enter the name");
                    String goldName = input.nextLine();
                    System.out.println("Please enter the weight");
                    double weight = input.nextDouble();
                    input.nextLine();
                    Gold gold = new Gold(goldName,weight);
                    portfolio.add(gold);
                    break;
                case 3:
                    System.out.println("Please enter house name");
                    String houseName = input.nextLine();
                    System.out.println("Please enter the year built");
                    int year = input.nextInt();
                    System.out.println("Please enter the square feet");
                    int squareFeet = input.nextInt();
                    System.out.println("Please enter the number of beds");
                    int beds = input.nextInt();
                    input.nextLine();
                    House house = new House(houseName, year, squareFeet, beds);
                    portfolio.add(house);
                    break;
                case 4:
                    System.out.println("Please enter the account number");
                    String actNo = input.nextLine();
                    System.out.println("Please enter the balance");
                    double balance = input.nextDouble();
                    input.nextLine();
                    BankAccount bankAccount = new BankAccount(ownerName,
                            actNo, balance);
                    portfolio.add(bankAccount);
                    break;
                case 5:
                    System.out.println("Please enter the account number");
                    String cActNo = input.nextLine();
                    System.out.println("Please enter the balance");
                    double cbalance = input.nextDouble();
                    input.nextLine();
                    CreditCard creditCard = new CreditCard(ownerName,
                            cActNo, cbalance);
                    portfolio.add(creditCard);
                    break;
            }
           // input.nextLine();
            System.out.println("Do you want to add another asset?");
            cont = input.nextLine();
        }
        System.out.println(portfolio.getValue());
        System.out.println(portfolio.getMostValuable());
        System.out.println(portfolio.getLeastValuable());
    }
}
