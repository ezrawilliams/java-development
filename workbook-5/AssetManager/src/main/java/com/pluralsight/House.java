package com.pluralsight;

public class House extends Asset{
    private String address;
    /*
    1- excellent, 2-good, 3-fair
    4-poor
     */
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
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
        double valuePerSqFt=0;
        switch(condition){
            case 1:
                valuePerSqFt=180;
                break;
            case 2:
                valuePerSqFt=130;
                break;
            case 3:
                valuePerSqFt=90;
                break;
            case 4:
                valuePerSqFt=80;

        }
        double fullValue = (squareFoot * valuePerSqFt)
                + (lotSize*0.25);
        return fullValue;
    }
}
