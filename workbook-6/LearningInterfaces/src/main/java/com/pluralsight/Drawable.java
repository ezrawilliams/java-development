package com.pluralsight;

public interface Drawable {
    void draw();

    default  void print(){
        System.out.println("This object can draw things.");
    }
}
