package com.pluralsight;

import javax.swing.*;
import java.awt.*;

public class CarDriver {
    public static void main(String[] args) {
        String make = "Ford";
        String model = "Mustang";
        //Adding an image as an attribute of an object:
        ImageIcon icon = new ImageIcon("antman.jpeg");
        Image avater = icon.getImage();
        Character character = new Character("Ant Man", 25,avater);

       /* Car car1 = new Car(make, model,character);
        System.out.println(car1.getSpeed());
        car1.accelerate(10);
        car1.accelerate(25);
        System.out.println(car1.getSpeed());
        car1.brake(10);
        System.out.println(car1.getSpeed());*/
    }
}
