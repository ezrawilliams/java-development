package com.pluralsight;
/*
Concepts covered - Classes, Objects, Encapsulation (hiding logic and using just what we need)
This Student class holds attributes and methods about a student and it will be used to create
Student objects.
 */

public class Student {
    //These are the instance variables that will hold information about the student:
    //Instance means object
    private String firstName;
    private String middleName;
    private String lastName;
    public int age;
    private long social;
    private String address;

    /*
    Constructor is used to create the object Scanner scanner = new Scanner(System.in);
    You can have more than one Constructor - object are usually created differently
     */

    //Default constructor - no args:
    public Student(){
        firstName="";
        middleName="";
        lastName="";
        age=0;
        social=0;
        address="";
    }

    public Student(String firstName, String middleName, String lastName, int age, long social,
                   String address){
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
        this.age=age;
        this.social=social;
        this.address=address;
    }

    public Student(String firstName, String middleName, String lastName){
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
    }

    /*
    Getters - accessor methods - they allow us to get access to the values of those private variables
    Setters - mutator methods - they allow us to change the value of those private variables
     */
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setMiddleName(String middleName){
        this.middleName=middleName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAge(int age){
        if (age<1 || age>140){
            System.out.println("Invalid age");
        }else{
            this.age=age;
        }

    }
    public void setSocial(long social){
        this.social=social;
    }
    public void setAddress(String address){
        this.address=address;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public long getSocial(){
        return social;
    }
    public String getAddress(){
        return address;
    }
}
