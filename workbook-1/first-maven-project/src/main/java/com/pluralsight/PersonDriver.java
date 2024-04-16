package com.pluralsight;

public class PersonDriver {
    public static void main(String[] args) {
        //Now we will create some Person objects:
        Person person1 = new Person("Charles Putney",
                18, "123 ABC Lane",123456);
        person1.setAddress("234 Candy Lane");
        person1.setAge(25);
        System.out.println("Your name is "+person1.getName()+"\nYour address is "
        +person1.getAddress()+"\nYour age is "+person1.getAge()+"\nYour social is "
        +person1.getSocial());

        Person topPerson = new Person("Noel Guillen", 100, "123 hot wings dr", 911911911);

        Person person2 = new Person("Tina Nguyen", 23, "123 Shhhh lane", 456789);

        Person person3 = new Person("Liam Bihn-King", 21, "123 I'm not telling", 777777777);

        Person person4 = new Person("Emily Trifone", 25, "123 Somewhere Street", 123456);

        Person person5 = new Person("Zamir Pollard",20, "808 Heartbreak Street", 727162394);
        Person person6= new Person ("petunia tekle",23,"123 cancane lane",000000);
    }

}
