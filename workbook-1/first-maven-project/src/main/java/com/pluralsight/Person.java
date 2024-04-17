package com.pluralsight;
/*
This class is strictly used to create person objects
It will include attributes (variables that help hold information about the person)
It will also include behavior (methods that help us to do things to the person)
 */
public class Person {
    /*
    Attributes - variables that help us hold information about the person
    And each person has their own value so these are instance variables
    Private - they are only accessible to the Person class
     */
    private String name;
    private int age;
    private String address;
    private long social;
    private int energy;

    /*
    Scanner scanner = new Scanner(System.in); That second scanner is a Constructor
    A constructor is a special method that we use or invoke when we create an object:
    The constructor is ALWAYS the same name as the class
     */
    public Person(String name, int age, String address, long social){
        /*we will now make those parameters be equal to the variables of the class
        We will also use 'this' to say that these variables of the class are equal to the values
        given when creating the object
         */
        this.name=name;//This means the object we are dealing with at the time
        this.age=age;
        this.address=address;
        this.social=social;
        this.energy=100;
    }

    /*How will we access our private variables:
    Using getters (accessor methods) to get access to the value
    Using setters (mutator methods) to change the values of the variables
     */
    //Setters:
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if (age<1 || age> 130){
            System.out.println("Invalid age");
        }else {
            this.age=age;
        }

    }

    public void setAddress(String address){
        this.address=address;
    }
    public void setSocial(long social){
        this.social=social;
    }

    //Getters:
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public long getSocial(){
        return social;
    }

    public void work(int hours) {
        this.energy -= (hours * 10);
    }
    public void sleep(int hours) {
        this.energy += (hours * 10);
    }
    public void eat() {
        this.energy += 20;
    }
}
