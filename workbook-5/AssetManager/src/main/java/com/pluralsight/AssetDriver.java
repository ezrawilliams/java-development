package com.pluralsight;

import java.util.ArrayList;

public class AssetDriver {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        House myHouse = new House("Main home", "December 1st, 2000",
                300000, "123 ABC Lane",2,2000,150);
        House vacationHome = new House("Vacation home","January 20, 2023",
                250000,"25 Maple Drive",3,1500,100);
        Vehicle vehicle1 = new Vehicle("Main car","July 4th 2013",15000,
                "Toyota Corolla",2013, 170000);
        Vehicle vehicle2 = new Vehicle("Second car", "December 13th 2023",
                45000,"Chevy Equinox",2024, 3000);
        assets.add(myHouse);
        assets.add(vacationHome);
        assets.add(vehicle1);
        assets.add(vehicle2);

        for (Asset asset: assets){
            System.out.println(asset.getDescription()+"\n"+asset.getDateAcquired()+"\n"+
                    asset.getOriginalCost()+"\n"+asset.getValue());
            String message="";
            if(asset instanceof  House){
                House house = (House) asset;//Downcasting
                message = "House at "+house.getAddress();
            } else if (asset instanceof  Vehicle){
                Vehicle vehicle = (Vehicle)  asset;
                message = "Vehicle: "+vehicle.getYear() + " "+ vehicle.getMakeModel();
            }
            System.out.println(message);
        }
    }
}
