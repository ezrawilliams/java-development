package com.pluralsight;

public class AnimalDriver {
    public static void main(String[] args) {
        Animal animal = new Animal();/*
        I created an object using the default constructor the compiler created
        */
        animal.setName("Bob");

        Dog dog = new Dog();
        dog.setName("Rubby");//inherited methods getName and setName
        dog.setBreed("Corgi");
        dog.bark();
        System.out.println(dog.getName());

        Animal animal_1 = new Animal();
        System.out.println("animal_1's name is "+animal_1.getName()+"\n");

        Animal animal_2 = new Animal("Elmo");
        System.out.println("animal_2's name is "+animal_2.getName()+"\n");

        Dog dog_1 = new Dog();
        System.out.println("dog_1's name is "+dog.getName()+"\n");

        Dog dog_2 = new Dog("Fido", "Mutt");
        System.out.println("dog_2's name is "+dog_2.getName()+" and their " +
                "breed is "+dog_2.getBreed());

    }
}
