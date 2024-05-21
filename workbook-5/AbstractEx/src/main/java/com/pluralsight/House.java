package com.pluralsight;

public class House extends Asset {
    private String address;
    private int squareFoot;
    private int lotSize;

    public House(String description, String address, int squareFoot,int lotSize,  int yearAcquired,double originalCost) {
        super(description,yearAcquired, originalCost);
        this.address = address;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        return (180 * squareFoot) + (0.25 * lotSize);
    }
}
