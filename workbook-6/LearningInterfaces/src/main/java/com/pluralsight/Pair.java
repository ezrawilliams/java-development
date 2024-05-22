package com.pluralsight;

public class Pair <T>{
    //A pair contains two objects:
    private T leftThing;
    private T rightThing;

    public Pair(T leftThing, T rightThing) {
        this.leftThing = leftThing;
        this.rightThing = rightThing;
    }

    public T getLeftThing() {
        return leftThing;
    }

    public T getRightThing() {
        return rightThing;
    }

    public void swap(){
        T temp = leftThing;
        leftThing=rightThing;
        rightThing=temp;
    }

    public <T> String justChecking(T value){
        return value.toString();
    }
}
