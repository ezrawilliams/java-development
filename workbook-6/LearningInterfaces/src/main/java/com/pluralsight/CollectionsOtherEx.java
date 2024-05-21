package com.pluralsight;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsOtherEx {
    public static void main(String[] args) {
        ArrayList<Object> things = new ArrayList<>();
        things.add(new BankAccount("Pam","123",12500));
        things.add(new Gold("Chain",1500));
        List<String> names = new ArrayList<>();
        List<Double> numbers = new LinkedList<>();
        Valuable asset = new House("My House",2023, 2000, 3);


    }
}
