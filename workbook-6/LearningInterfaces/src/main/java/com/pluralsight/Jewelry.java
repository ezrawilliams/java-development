package com.pluralsight;

public class Jewelry extends FixedAsset {
    private double karat;

    public  Jewelry(String name, double karat){
        super(name,karat);
        this.karat=karat;
    }

    @Override
    public double getValue(){
        return karat;
    }
}
