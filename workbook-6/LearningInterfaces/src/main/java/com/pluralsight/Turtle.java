package com.pluralsight;

import java.awt.*;

public class Turtle implements IMovable,InterfaceExample{
    private String name;
    private Point currentLocation;
    private int power;

    public Turtle(String name){
        this.name=name;
        this.currentLocation = new Point(25,25);
        this.power=100;
    }

    @Override
    public Point move(int xUnits, int yUnits) {
        //currentLocation.setX(currentLocation.getX()+xUnits);
       // currentLocation.setY(currentLocation.getY()+yUnits);
        return currentLocation;
    }

    @Override
    public void goHome() {
        this.currentLocation= new Point(25,25);
    }

    @Override
    public void abstractMethod1() {

    }

    @Override
    public String abstractMethod2(String question) {
        return "";
    }
}
