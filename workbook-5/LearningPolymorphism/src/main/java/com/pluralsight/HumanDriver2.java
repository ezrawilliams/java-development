package com.pluralsight;

import java.util.ArrayList;

public class HumanDriver2 {
    public static void main(String[] args) {
        ArrayList<Human> people = new ArrayList<Human>();
        people.add(new Human());
        people.add(new Caveman());
        people.add(new ModernPerson());

        for (int i=0; i<people.size(); i++){
            if (people.get(i) instanceof  ModernPerson)
                System.out.print("Modern Person--> ");
            else if (people.get(i) instanceof  Caveman)
                System.out.print("Caveman--> ");
            else if (people.get(i) instanceof Human)
                System.out.print("Human--> ");
            people.get(i).eat();
        }


    }
}
