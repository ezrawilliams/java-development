package com.pluralsight;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        //Create a hashmap that holds your names and your IDs:
        HashMap<Integer, String> students = new HashMap<Integer, String>();
        //call the put method to add elements:
        students.put(1, "Onriel Houston");
        students.put(2, "Preston Vang");
        students.put(3, "Michael Jones");
        students.put(4,"Gebrit Tesfy");
        System.out.println(students);

        HashMap<String, String> statesAndCapitals
                = new HashMap<String, String>();
        statesAndCapitals.put("CT", "Hartford");
        statesAndCapitals.put("CA", "Sacramento");
        statesAndCapitals.put("WA", "Olympia");
        statesAndCapitals.put("TX", "Austin");
        statesAndCapitals.put("FL", "Tallahassee");
        System.out.println(statesAndCapitals);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What capital do you want?");
        String state = scanner.nextLine();

        String capital = statesAndCapitals.get(state);

        if(capital != null){
            System.out.println(capital);
        }else
            System.out.println("Such capital doesn't exist");
        statesAndCapitals.remove("FL");
        System.out.println(statesAndCapitals);
        //statesAndCapitals.clear();
        //System.out.println(statesAndCapitals);
        for (String key : statesAndCapitals.keySet()) {
            System.out.println(key+ " : "  + statesAndCapitals.get(key));
        }

    }
}
