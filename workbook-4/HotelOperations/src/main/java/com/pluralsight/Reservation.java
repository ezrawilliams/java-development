package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(){
        roomType = null;
        numberOfNights = 0;
        weekend = false;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    //Derived getter
    public double getPrice(){
        if (roomType.equals("king")){
            if (weekend)
                return 139.00*1.10;
            return 139.00;
        } else if (roomType.equals("double")){
            if (weekend)
                return 124.00*1.10;
            return 124.00;
        }
        return 0;
    }

    public double getReservationTotal(){
        return getPrice()*numberOfNights;
    }
}
