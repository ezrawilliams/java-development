package com.pluralsight;

public class Room {
    private int numberOfBeds;
   // private double price;
    private boolean occupied;
    private boolean dirty;

    @Override
    public String toString() {
        return "Room{" +
                "numberOfBeds=" + numberOfBeds +
                ", occupied=" + occupied +
                ", dirty=" + dirty +
                ", roomType='" + roomType + '\'' +
                '}';
    }

    private String roomType;

    public Room(int numberOfBeds, boolean occupied, boolean dirty, String roomType) {
        this.numberOfBeds = numberOfBeds;
      //  this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.roomType = roomType;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Room(){
        this.numberOfBeds = 0;
        //this.price = 0;
        this.occupied = false;
        this.dirty=false;
        this.roomType = "";
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

   /* public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }*/

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    //Derived getter:
    public boolean isAvailable(){
        if(!dirty && !occupied){
            return true;
        }
        else return false;
    }

    public void checkIn(){
        occupied = true;
        dirty=true;
    }

    public void checkOut(){
        occupied = false;
       // dirty=false;
        cleanRoom();
    }

    public void cleanRoom(){
        dirty=false;
    }
}
