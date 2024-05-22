package com.pluralsight;

public class GenericDriver {
    public static void main(String[] args) {
        Pair<Integer> twoNums = new Pair<Integer>(63,65);
        twoNums.swap();
        System.out.println(twoNums.getLeftThing());

        Pair<String> twoWords = new Pair<>("Me","You");
        System.out.println(twoWords.getLeftThing());
        twoWords.swap();
        System.out.println(twoWords.getLeftThing());

        Person person1 = new Person("Ezra","Williams",35);
        Person person2 = new Person("Noel","Guillen",20);
        Pair<Person> persons = new Pair<>(person1,person2);
        persons.swap();
        System.out.println(persons.getLeftThing());

        Labeler.displayWithLabel("Name", "Dana");
        Labeler.displayWithLabel("Age", 63);
        Labeler.displayWithLabel("Object", person1);
        String strings[] = {"Mind","yours"};
        Person persons2[] = {person1, person2};
        Integer numbers[] = {1,2,3};

        GenArray<Integer> ps = new GenArray<Integer>(100, numbers);
    }
}
