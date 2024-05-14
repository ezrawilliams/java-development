package com.pluralsight;

public class Dog extends Animal{
    private String breed;

    public Dog(){
        super();
        this.breed=breed;
    }

    public Dog(String name, String breed){
        super(name);
        System.out.println("Trace == in Dog(name,breed) constructor w/name");
        this.breed=breed;
    }

    public void setBreed(String breed){
        this.breed=breed;
    }

    public String getBreed(){
        return breed;
    }

    public void bark(){
        System.out.println("Ruff, ruff!");
    }
}
