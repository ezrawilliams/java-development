package com.pluralsight;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Person person1 = new Person("Ezra","Williams",42);
        Person person2 = new Person("Tina","Nguyen",18);
        Person person3 = new Person("Staphon","Williams",19);
        Person person4 = new Person("Emily  ","Trifone",20);
        Person person5 = new Person("Liam","Bihn-King",21);
        Person person6 = new Person("Onriel","Houston",22);
        Person person7 = new Person("Rashed","Jaafar",23);
        Person person8 = new Person("Williams","Putney",24);
        Person person9 = new Person("Jasmine","Quick",25);
        Person person10 = new Person("Gebrit","Tesfay",26);
        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        persons.add(person10);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name to search for: ");
        String nameToSearch = scanner.nextLine();

        List<Person> matchedNames = new ArrayList<>();

        for(Person person: persons){
            if(person.getFirstName().equals(nameToSearch) ||
            person.getLastName().equals(nameToSearch)){
                matchedNames.add(person);
            }
        }

        for (Person person: matchedNames){
            System.out.println(person.getFirstName()+" "+person.getLastName());
        }

        double averageAge;
        double totalAge=0;

        for(Person person: persons){
            totalAge +=  person.getAge();
        }
        averageAge = totalAge/persons.size();
        System.out.println("Average age of persons: "+averageAge);

        int oldestAge = persons.get(0).getAge();
        for (int i=1; i< persons.size();i++){
           if (persons.get(i).getAge()> oldestAge){
               oldestAge=persons.get(i).getAge();
           }
        }
        System.out.println("The oldest age is "+oldestAge);

        int youngestAge = persons.get(0).getAge();
        for (int i=1; i< persons.size();i++){
            if (persons.get(i).getAge()< youngestAge){
                youngestAge=persons.get(i).getAge();
            }
        }
        System.out.println("The youngest age is "+youngestAge);
    }
}
