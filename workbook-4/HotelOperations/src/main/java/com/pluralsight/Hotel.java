package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(int numberOfSuites, int numberOfRooms) {
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name,
                 int numberOfSuites,
                 int numberOfRooms, int bookedSuites,
                 int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites=bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        // Check if the requested room is a suite
        if (isSuite) {
            // Check if there are available suites and if the requested number of rooms can be accommodated
            if ((numberOfSuites > bookedSuites) &&
                    (numberOfRooms <= (numberOfSuites - bookedSuites))) {
                // Book the suite room(s) and update the booked suite count
                bookedSuites += numberOfRooms;
                return true; // Return true indicating successful booking
            } else {
                return false; // Return false indicating unable to book the room(s)
            }
        } else { // If the requested room is not a suite
            // Check if there are available basic rooms and if the requested number of rooms can be accommodated
            if (numberOfRooms <= (numberOfRooms - bookedBasicRooms)) {
                // Book the basic room(s) and update the booked basic room count
                bookedBasicRooms += numberOfRooms;
                return true; // Return true indicating successful booking
            } else {
                return false; // Return false indicating unable to book the room(s)
            }
        }

    }

    public int getAvailableSuites(){
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms(){
        return  numberOfRooms - bookedBasicRooms;
    }


}
