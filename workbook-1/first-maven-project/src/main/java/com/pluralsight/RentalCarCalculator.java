package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pickUpDate;
        int numOfRentalDays;
        String electronicTollTag;
        double eTollTagAmt = 3.95;
        String gps;
        double gpsAmt = 2.95;
        String roadSideAssistance;
        double roadSideAmt = 3.95;
        int age;
        double basicCarRental = 29.99;
        double surchargeCost = 0.3;
        double totalCost = 0.0;

        System.out.println("Please enter the pickup date");
        pickUpDate = scanner.nextLine();
        System.out.println("Please enter the number of rental days");
        numOfRentalDays= scanner.nextInt();
        totalCost = totalCost + (numOfRentalDays*basicCarRental);
        System.out.println("Do you require an electronic toll tag?");
        electronicTollTag = scanner.nextLine();
        switch(electronicTollTag){
            case "yes":
                totalCost = totalCost + (eTollTagAmt*numOfRentalDays);
                break;
        }
        System.out.println("Do you require a gps?");
        gps = scanner.nextLine();
        switch(gps){
            case "yes":
                totalCost = totalCost + (gpsAmt*numOfRentalDays);
                break;
        }
        System.out.println("Do you require roadside assistance?");
        roadSideAssistance= scanner.nextLine();
        switch(roadSideAssistance){
            case "yes":
                totalCost = totalCost + (roadSideAmt*numOfRentalDays);
                break;
        }
        System.out.println("Please enter your age");
        age= scanner.nextInt();
        if (age < 25)
            totalCost = totalCost + (basicCarRental * surchargeCost);
    }
}
