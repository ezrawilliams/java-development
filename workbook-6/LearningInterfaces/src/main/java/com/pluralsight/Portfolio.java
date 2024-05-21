package com.pluralsight;

import java.util.LinkedList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner){
        this.name=name;
        this.owner=owner;
        assets = new LinkedList<>();
    }

    public void add(Valuable asset){
        assets.add(asset);
    }

    public double getValue(){
        double total=0;
        for (Valuable valuable: assets){
            if (valuable instanceof CreditCard){
                total -= valuable.getValue();
            } else {
                total += valuable.getValue();
            }
        }
        return total;
    }

    public Valuable getMostValuable(){
        Valuable mostValuable = assets.get(0);
        for (Valuable valuable: assets){
            if ((valuable.getValue()>mostValuable.getValue()) &&
            !((valuable instanceof  CreditCard))){
                mostValuable=valuable;
            }
        }
        return mostValuable;
    }

    public Valuable getLeastValuable(){
        Valuable leastValuable = assets.get(0);
        for (Valuable valuable: assets){
            if ((valuable.getValue()>leastValuable.getValue()) &&
                    ((valuable instanceof  CreditCard))){
                leastValuable=valuable;
            } else if (valuable.getValue()<leastValuable.getValue()){
                leastValuable=valuable;
            }
        }
        return leastValuable;
    }

}
