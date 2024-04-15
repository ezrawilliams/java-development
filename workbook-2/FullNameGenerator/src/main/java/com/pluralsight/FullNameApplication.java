package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName, middleName, lastName, suffix, fullName = "";
        System.out.println("Please enter name") ;
        System.out.print("First name: ");
        firstName=scanner.nextLine();
        firstName = firstName.trim();
        System.out.print("Middle name: ");
        middleName=scanner.nextLine();
        middleName=middleName.trim();
        System.out.print("Last name: ");
        lastName=scanner.nextLine();
        lastName=lastName.trim();
        System.out.print("Suffix: ");
        suffix=scanner.nextLine();

        if (middleName.isEmpty()){
            fullName=firstName+" "+lastName;
        } else {
            fullName=firstName+" "+middleName+" "+lastName;
        }
        if (!(suffix.isEmpty())){
            fullName = fullName + ", "+suffix;
        }

        System.out.println("Full name: "+ fullName);
    }
}
