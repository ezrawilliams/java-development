package com.pluralsight;

public class RobotVacuum implements Movable, Cleaner{
    public void move(int xUnits, int yUnits){

    }

    public void goHome(){

    }

    public void clean(){

    }
    public void print(){
        System.out.println("I am a robot vacuum!");
        Movable.super.print();//We access default methods like this
        Cleaner.super.print();
    }
}
