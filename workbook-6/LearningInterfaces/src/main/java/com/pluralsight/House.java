package com.pluralsight;

public class House extends FixedAsset{
    private int yearBuilt;
    private int squareFeet;
    private  int bedrooms;

    public House(String name, int year, int squareFeet, int bedrooms){
        super(name,squareFeet);
        this.yearBuilt=year;
        this.squareFeet=squareFeet;
        this.bedrooms=bedrooms;
    }

    @Override
    public double getValue(){
        return squareFeet;
    }
}
