package com.pluralsight;
import java.util.Scanner;
public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName;
        String nameArray[];

        System.out.print("Please enter your name: ");
        fullName = scanner.nextLine();
        fullName = fullName.trim();
        nameArray = fullName.split(" ");
        //if the user puts in just their first and last name then they array only has two items:
        if (nameArray.length==2){
            System.out.println("First name: "+nameArray[0]);
            System.out.println("Middle name: (none)");
            System.out.println("Last name: "+ nameArray[1]);
        } else {
            System.out.println("First name: "+nameArray[0]);
            System.out.println("Middle name: "+nameArray[1]);
            System.out.println("Last name: "+ nameArray[2]);
        }



    }
}
