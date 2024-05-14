package com.pluralsight;

import java.util.ArrayList;

public class HumanDriver {
    public static void main(String[] args) {
       /* Human h = new Human();
        h.eat();
        Caveman c = new Caveman();
        c.eat();
        ModernPerson m = new ModernPerson();
        m.eat();

        //Using a parent(base, super) class variable to reference a child:
        Human h2 = new Human();
        h2 = new Caveman();//ok if Caveman extends Human
        h2 = new ModernPerson();//ok if ModernPerson extends Human
        /*
        The opposite is not true:
        All Cavemen are Humans but not all Humans are Cavemen

        Caveman c2;
       // c2 =  new Human();
    //Downcasting - where we demote a super class variable to a child class variable
       Caveman c3 = (Caveman) h2;*/

        Human h = new Human();
        feed("Human",h);

        Caveman c = new Caveman();
        feed("Caveman",c);

        ModernPerson m = new ModernPerson();
        feed("Modern Person",m);

        ArrayList<Human> people = new ArrayList<Human>();

        people.add(h);
        people.add(c);
        people.add(m);

        for (Human human: people){
            human.eat();
        }

        System.out.println(people.getClass());
        System.out.println(h.getClass());
        System.out.println(h instanceof Object);
        System.out.println(people instanceof Object);
        System.out.println(c instanceof Object);
    }

    public static void feed(String label, Human human){
        System.out.print(label+"--> ");
        human.eat();
    }
}
