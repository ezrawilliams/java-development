package com.pluralsight;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        if (lastName.equals(p.lastName))
            if (firstName.equals(p.firstName))
                return 0;
            else if (firstName.compareTo(p.firstName)>0)
                return 1;
            else
                return -1;
        else if (lastName.compareTo(p.lastName)>0)
            return 1;
        else return -1;
    }
}
