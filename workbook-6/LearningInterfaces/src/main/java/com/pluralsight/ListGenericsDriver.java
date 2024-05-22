package com.pluralsight;

import java.util.ArrayList;

public class ListGenericsDriver {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Ball");
        words.add("Bat");
        words.add("Ball");
        words.add("Bat");

        ArrayList<String> words2 = new ArrayList<>();
        words2.add("Tall");
        words2.add("Cat");

        System.out.println(ListGenerics.removeDuplicates(words));
        System.out.println(ListGenerics.mergeLists(words, words2));
        System.out.println(ListGenerics.reverseList(words));


    }

}
