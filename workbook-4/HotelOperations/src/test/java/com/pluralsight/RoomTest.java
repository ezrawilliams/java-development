package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    /*
    The checkin method is responsible for setting occupied to true
    and dirty to true; if these are not true after the checkin method
    is executed then something is definitely wrong.
     */
    @Test
    void checkIn() {
        //setup or arrange:
        Room room = new Room(1, false, false, "king");
        boolean expectedOccupied = true;
        boolean expectedDirty = true;

        //act:
        room.checkIn();

        //assert:
        boolean actualOccupied = room.isOccupied();//should be true
        boolean actualDirty = room.isDirty();//should be true
        assertEquals(expectedOccupied, actualOccupied);
        assertEquals(expectedDirty,actualDirty);
    }

    @Test
    void checkOut() {
        //setup or arrange:
        Room room = new Room(1, false, false, "king");
        boolean expectedOccupied = false;
        boolean expectedDirty = false;

        //act:
        room.checkOut();

        //assert:
        boolean actualOccupied = room.isOccupied();//should be false
        boolean actualDirty = room.isDirty();//should be false
        assertEquals(expectedOccupied, actualOccupied);
        assertEquals(expectedDirty,actualDirty);

    }

    @Test
    void cleanRoom() {
        //setup or arrange:
        Room room = new Room(1, false, false, "king");
        boolean expectedDirty = false;

        //act:
        room.cleanRoom();

        //assert:
        boolean actualDirty = room.isDirty();//should be false
        assertEquals(expectedDirty,actualDirty);
    }
}