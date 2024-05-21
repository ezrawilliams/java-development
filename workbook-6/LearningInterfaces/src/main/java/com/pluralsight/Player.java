package com.pluralsight;
/*
Interfaces can have only constant fields and abstract methods
Abstract classes can have nonabstract methods and nonconstant fields
 */

public interface Player {

    int move();
    int score();
    String organizationName = "";
    int health();
    
}
