package com.pluralsight;

import java.util.Scanner;

public class Section4_2 {
    public static void main(String[] args) {
        int day;
        String dayInWords;
        String description ="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the day in numerical form");
        day = scanner.nextInt();

       /* switch (day){
            case 1:
                dayInWords="Sunday";
                break;
            case 2:
                dayInWords="Monday";
                break;
            case 3:
                dayInWords="Tuesday";
                break;
            case 4:
                dayInWords="Wednesday";
                break;
            case 5:
                dayInWords="Thursday";
                break;
            case 6:
                dayInWords="Friday";
                break;
            case 7:
                dayInWords="Saturday";
                break;
            default:
                dayInWords="Invalid Day";
        }
        System.out.println("Your chosen day is "+dayInWords);*/
        switch (day) {
            case 1:
            case 7:
                description = "Weekend";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                description = "Weekday";
                break;
        }
        System.out.println("Your chosen day is "+description);

    }
}
