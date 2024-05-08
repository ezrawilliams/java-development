package com.pluralsight;

public class Food {
    //Attributes:
    /*
    Java assigns a default access modifier - package-private
    when we do not specify an access modifier
     */
    String name;
    int calories;
    boolean isHot;
    boolean isSpicy;
    String color;
    boolean isSweet;
    double price;

    /*Other examples of derived attributes:
    Price - price * tax
    Hot and sweet - isHot & isSweet
    Name and color - Yellow Mango:
    Name and isSweet - Sweet Mango
    public String getSweetFood(){
    if (isSweet)
        return "Sweet "+name;
       else
       return "Sour " +name;
       }
     */

    public Food(String name, int calories, boolean isHot, boolean isSpicy, String color, boolean isSweet, double price) {
        this.name = name;
        this.calories = calories;
        this.isHot = isHot;
        this.isSpicy = isSpicy;
        this.color = color;
        this.isSweet = isSweet;
        this.price = price;
    }

    public Food(){}

    public Food(String name){
        this.name=name;
    }

    public Food(String name, int calories){
        this.name=name;
        this.calories=calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean getHot() {
        return isHot;
    }

    public void setHot(boolean isHot) {
        this.isHot = isHot;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSweet() {
        return isSweet;
    }

    public void setSweet(boolean sweet) {
        isSweet = sweet;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", hotOrCold=" + isHot +
                ", isSpicy=" + isSpicy +
                ", color='" + color + '\'' +
                ", isSweet=" + isSweet +
                ", price=" + price +
                '}';
    }

    //Derived getter: getter that we use to make or compose another attribute
    public String getAdjustedName(){
        return "This is a food: "+name;
    }

    /*
    An example of a DERIVED GETTER because we composed a new attribute (hotandspicy)
    by combining the isHot and isSpicy attributes.
     */
    public boolean isHotAndSpicy(){
        if (isHot && isSpicy){
            return true;
        }
        return false;
    }

}
