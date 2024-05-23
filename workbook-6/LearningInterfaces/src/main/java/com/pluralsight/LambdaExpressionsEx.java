package com.pluralsight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressionsEx {
    public static void main(String[] args) {
        Person person1 = new Person("Ezra","Williams",42);
        Person person2 = new Person("Tina","Nguyen",18);
        Person person3 = new Person("Staphon","Williams",19);
        Person person4 = new Person("Emily  ","Trifone",20);
        Person person5 = new Person("Liam","Bihn-King",21);
        Person person6 = new Person("Onriel","Houston",22);
        Person person7 = new Person("Rashed","Jaafar",23);
        Person person8 = new Person("Charles","Putney",24);
        Person person9 = new Person("Jasmine","Williams",25);
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

        String searching = "Williams";

        List<Person> matchingPersons = persons.stream().filter(
                p -> p.getLastName().equals(searching)).
                collect(Collectors.toList());
        System.out.println("Matching last names: "+matchingPersons);

        List<String> names = new ArrayList<>();
        names.add("Ezra");
        names.add("Ian");
        names.add("Siddalee");
        names.add("Elisha");
        names.add("Pursalene");
        names.add("Zephaniah");

        names.forEach(name -> System.out.println(name));

        List<Employee> emps = new ArrayList<Employee>();
        emps.add(new Employee("Ezra", "Actor", 72750.0));
        emps.add(new Employee("Ian", "Banker", 252750.0));
        emps.add(new Employee("Siddalee", "Model", 1500000.0));
        emps.add(new Employee("Elisha", "Programmer", 103500.0));
        emps.add(new Employee("Pursalane", "Teacher", 697250.0));
        emps.add(new Employee("Zephaniah", "Engineer", 136000.0));

        emps.forEach(emp -> {
            if (emp.getSalary()<100000){
                emp.setSalary(101000.0);
            } else {
                emp.setSalary(emp.getSalary()*1.1);
            }
            System.out.println(emp.getName()+" earns $"+String.format(
                    "%.2f", emp.getSalary()));
        });

        List<String> states = Arrays.asList( "Alabama", "Alaska", "Arizona", "Arkansas",
                "California", "Colorado", "Connecticut");
                /* others not shown */
        String letter = "C";

        List<String> matchingStates = states.stream().filter(
                state -> state.startsWith(letter)).collect(Collectors.toList());

        System.out.println(matchingStates);

        List<String> titles = Arrays.asList( "Halloween", "Ghost", "Halloween 2",
                "Friday the 13th", "Twister", "Halloween 3");
        List<String> matching = titles.stream() .
                filter(title -> title.toLowerCase().
                        contains("halloween")) .toList();
        System.out.println(matching);

        int count = (int) titles.stream().filter(title -> title.toLowerCase().
                contains("halloween")).count();
        System.out.println(count);

        titles.stream() .filter(title -> title.toLowerCase().contains("halloween")) .
                forEach(t -> System.out.println(t));
        /*
        :: is the method reference operator in Java - used to call a methods
        by referring to the method directly. It is like a lambda expression
        but it uses direct reference
        so :: has replaced (t -> System.out.println(t));
         */

        /*
        Sorted method only works with types that implement comparable
         */
        titles.stream().filter(title -> title.toLowerCase().contains("halloween")).sorted()
                .forEach(t -> System.out.println(t));

        List<String>  sortedMovies = titles.stream().filter(title ->title.toLowerCase().
                contains("halloween")).sorted().toList();
        System.out.println(sortedMovies);

        /*
        map method maps each element in the stream to a new result
         */
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //get list of unique squares:
        List<Integer> squaresList = numbers.stream().map(num -> num*num).distinct()
                .toList();
        System.out.println(squaresList);

        /*
        reduce method - aggregates all elements int a single value
         */
        int sum = numbers.stream().
                reduce(0, (temp, num) -> temp += num);
        System.out.println(sum);

    }
}
