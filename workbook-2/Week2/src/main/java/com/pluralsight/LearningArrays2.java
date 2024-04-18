package com.pluralsight;

import java.util.Arrays;

public class LearningArrays2 {
    public static void main(String[] args) {
        String[] nameList = {
                "Natalie", "Brittany", "Zachary", "Ezra", "Ian",
                "Siddalee", "Elisha", "Pursalane", "Zephaniah"
        };

        //What if I want to sort this array? Arrays is a class in the Java API
        Arrays.sort(nameList);

        for (String name : nameList) {
            System.out.println(name);
        }

        String[] colors = {"red", "white", "blue"};
        String[] copy = new String[3];
        copy = colors; // they **reference** the same underlying array

        //Use a for loop:
        String[] colorCopy = new String[3];
        // copy colors to colorCopy 1 at a time
        for (int i = 0; i < 3; i++) {
            colorCopy[i] = colors[i];
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(colorCopy[i]);
        }

        //Using arrayCopy method:
        String[] colorCopy2 = new String[3];
// copy from colors at subscript 0 to
// colorCopy at 0 -- move 3 elements
        System.arraycopy(colors, 0, colorCopy2, 0, 3);
        for (int i = 0; i < 3; i++) {
            System.out.println(colorCopy2[i]);
        }

        Arrays.fill(colorCopy, "HELLO");
        System.out.println(colors.equals(copy));

        System.out.println(Arrays.binarySearch(colorCopy, "HELLO"));


    }
}
