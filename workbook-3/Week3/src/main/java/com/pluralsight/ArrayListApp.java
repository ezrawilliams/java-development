package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<String> classYearUp = new ArrayList<String>();
        classYearUp.add("Onriel Houston");
        classYearUp.add("Charles Putney");
        classYearUp.add("Emily Trifone");
        classYearUp.add("Tina Nguyen");//System.out.println(classYearUp);
        classYearUp.add("Noel Guillen");
        classYearUp.add("Rafael Manan");
        classYearUp.add("Rashed Jaafar");
        for (int i=0; i<classYearUp.size(); i++) {
            System.out.println((i+1)+ " : " +classYearUp.get(i));
        }

        classYearUp.set(2, "May Trifone");
        classYearUp.remove(1);
        System.out.println(classYearUp);
        Collections.sort(classYearUp);
        System.out.println(classYearUp);
        classYearUp.clear();
        System.out.println(classYearUp);
    }
}
