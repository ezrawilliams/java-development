package com.pluralsight;

public class Labeler {
    static <T> void displayWithLabel(String label, T value){
        System.out.println(label+": "+value);
    }
}
