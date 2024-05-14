package com.pluralsight;

public class Box extends Rectangle{
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(){
        /*surface area formula -
        2lw + 2lh + 2hw
         */
        double length = getLength();
        double width = getWidth();
        return (2*length*width)+(2*length*height)
                +(2*height*width);
    }


}
