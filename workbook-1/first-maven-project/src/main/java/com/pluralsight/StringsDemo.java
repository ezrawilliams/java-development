package com.pluralsight;

import java.util.regex.Pattern;

public class StringsDemo {
    public static void main(String[] args) {
        String input = "Dallas|Ft. Worth|Austin";
        String[] cities = input.split(Pattern.quote("|"));
// cities is an array containing 3 strings
// [0] is Dallas, [1] is Ft. Worth, [2] is Austin
        for (String city: cities){
            System.out.println(city);
        }
}
}
