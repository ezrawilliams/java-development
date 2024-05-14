package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;
/*
In our study of inheritance Person is the PARENT/SUPER/BASE class
 */

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;


    public Person(String firstName, String lastName,
                  LocalDate birthDate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public int getAge(){
        int currentYear = LocalDate.now().getYear();
        int birthYear = birthDate.getYear();
        return currentYear-birthYear;
    }

}
