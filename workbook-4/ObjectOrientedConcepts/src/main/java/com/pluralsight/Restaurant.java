package com.pluralsight;

public class Restaurant {
    public static void main(String[] args) {
        //Create the Food objects:
        //These objects are actually variables of type Food
        //To instantiate our objects we used our all args constructor
        Food mango = new Food("Mango",100,false,false,"Yellow",true,2.99);
        Food chips = new Food("Chips",150,false, false,"Tan",false,3.99);
        Food strawberry = new Food("Strawberry", 70,
                false,false,"Red", true, 4.99);
        Food wings = new Food("Hot Wings", 1090, true, true, "Light Red", false, 10.99);
        Food[] foods = {mango, chips, strawberry, wings};


    }
}
