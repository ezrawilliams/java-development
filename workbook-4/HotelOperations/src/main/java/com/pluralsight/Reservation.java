package com.pluralsight;

public class Reservation {
    private int numberOfNights;
    private boolean weekend;
    Room room;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Reservation(){
        numberOfNights = 0;
        weekend = false;
        room = null;
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
        if (room.getRoomType().equals("king")){
            if (weekend)
                return 139.00*1.10;
            return 139.00;
        } else if (room.getRoomType().equals("double")){
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
