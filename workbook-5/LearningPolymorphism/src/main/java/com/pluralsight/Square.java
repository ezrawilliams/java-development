package com.pluralsight;

public class Square extends Rectangle{
    @Override
    public double getArea(){
        if (getLength()==getWidth()){
            return getLength()*getWidth();
        }
        return 0;
    }
}
