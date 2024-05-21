package com.pluralsight;

import java.util.*;

public class AssetDriver {
    public static void main(String[] args) {
        /*The difference between an abstract class and a CONCRETE class:
        THE ABSTRACT class cannot be INSTANTIATED:
         */
       // Asset myAsset = new Asset("Thingy", 2020, 125.00);
        House myHouse = new House("Ranch House", "402 Stevens",
                2000, 43560, 2020, 220000);
        /*
        While we cannot create an instance of the parent class, we can use
        a parent class variable to instantiate an object of the child class
         */
        Asset houseAsset = new House("Ranch House", "402 Stevens",
                2000, 43560, 2020, 220000);
        List<Asset> assets = new ArrayList<>();


    }
}
