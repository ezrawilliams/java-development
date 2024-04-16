package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class ConvertingStrings {
    public static void main(String[] args) {
        // string contains "id|description|quantity|price"
        String input = "111|Hot Chocolate (12-count)|21|4.99";
        String[] tokens = input.split(Pattern.quote("|"));
        int id = Integer.parseInt(tokens[0]);//convert the string to an integer
        String name = tokens[1];
        int quantity = Integer.parseInt(tokens[2]); //converts string to an int
        double price = Double.parseDouble(tokens[3]);//converts string to a double.
        System.out.println(id);
        System.out.println(name);
        System.out.println(quantity);
        System.out.println(price);
        double totalPrice = quantity*price;
        System.out.println(totalPrice);

        String userInput;
        DateTimeFormatter formatter;
        userInput = "7 Oct 2002";
        formatter = DateTimeFormatter.ofPattern("d MMM yyyy");
        LocalDate birthDay = LocalDate.parse(userInput, formatter);
    }
}
