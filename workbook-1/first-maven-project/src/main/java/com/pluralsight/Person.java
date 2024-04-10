package com.pluralsight;

public class Person {
    //These are instance/ nonstatic variables
    private String name;
    private int age;
    //This is a static variable
    static String whoAmI = "I am a person";

    public Person (String name, int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        //Person objects
        Person gebrit = new Person("Gebrit Tesfay", 22);
        Person rafael = new Person("Rafael Manan" , 18);
    }
}
