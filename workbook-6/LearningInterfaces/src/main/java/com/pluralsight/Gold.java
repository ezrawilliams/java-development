package com.pluralsight;

public class Gold extends FixedAsset{
    private double weight;

    public Gold(String name, double weight){
        super(name,weight);
        this.weight=weight;
    }

    @Override
    public double getValue(){
        return weight;
    }
}
