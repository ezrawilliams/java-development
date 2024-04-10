package com.pluralsight;

public class Section3_4 {
    public static void main(String[] args) {

        //calling the methods:
        //When you call the method what it takes in is called an argument
        foo();
        moo();

        int a = 4, b = 9, c = 10, d = 3;
        addAndDisplay(a, b); // a and b are arguments to the addAndDisplay method
        addAndDisplay(b, c);
        addAndDisplay(a, d);
        int sum;
        sum = add(a, b);
        display(a, b, sum);
        sum = add(b, c);
        display(b, c, sum);
        sum = add(a, d);
        display(a, d, sum);
    }

    //Definitions of the methods; access modifier (public) , static (optional), return types, name, 0 or more parameters
    // When you create the method what it takes in is called a parameter
    public static void foo() {
        System.out.println("Foo");
    }
    public static void moo() {
        System.out.println("Moo");
    }

    public static void addAndDisplay(int num1, int num2) {
        int sum = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, sum);
    }

    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    public static void display(int num1, int num2, int sum) {
        System.out.printf("%d + %d = %d", num1, num2, sum);
    }

}
