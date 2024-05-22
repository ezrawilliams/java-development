package com.pluralsight;

import java.time.LocalDate;

public class FixedListDriver {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43);//this line should fail

        System.out.println(numbers.getItems().size());
        System.out.println(numbers.getItems());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());//This line should also fail

        FixedList<Person> personFixedList = new FixedList<>(5);
        personFixedList.add(new Person("Preston","Vang",20));
    }
}
