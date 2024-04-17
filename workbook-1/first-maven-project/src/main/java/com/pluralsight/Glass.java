package com.pluralsight;

public class Glass {
    String description;
    int size;
    String color;

    Glass(String description, int size, String color){
        this.description=description;
        this.size=size;
        this.color=color;
    }

    String getDescription(){
        return description;
    }
    String getColor(){
        return color;
    }
    int getSize(){
        return size;
    }
}

