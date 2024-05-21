package com.pluralsight;

import java.time.LocalDate;

public class Vehicle  extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        double value=0;
        double percentRed=0;
        int currentYear =
                LocalDate.now().
                        getYear();
        int yearsOld = currentYear -
                year;
        if (yearsOld>10){
            value = 1000;

        } else {
           // System.out.println("Under 10 years old");
            if (yearsOld>=0 && yearsOld<=3){
                percentRed=0.03;
            } else if (yearsOld>=4 && yearsOld<=6){
                percentRed=0.06;
            } else if (yearsOld>=7 && yearsOld<=10){
                percentRed=0.08;
            }
            value = getOriginalCost() - (getOriginalCost()*percentRed);
           // System.out.println(value);
        }

        if (odometer>100000 &&
                !(makeModel.contains("Toyota")||
                makeModel.contains("Honda"))){
            value = getOriginalCost() - (getOriginalCost()*0.25);
            //System.out.println(value);
        }

        return value;

    }
}
