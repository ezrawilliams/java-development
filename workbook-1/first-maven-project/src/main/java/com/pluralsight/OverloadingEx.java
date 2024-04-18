package com.pluralsight;

import java.util.Scanner;

public class OverloadingEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        add(num1,num2);
        int myNum=100, yourNum=200;
        add(myNum,yourNum);
    }

    public static void add(int num1, int num2){
        int result = num1+num2;
        System.out.println(result);
    }

    public static void add(String num1, String num2){
        int result = Integer.parseInt(num1)+ Integer.parseInt(num2);
        System.out.println(result);
    }
}
