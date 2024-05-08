package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
Unit testing has three steps:
arrange - create any objects, variables we will need, initialize
assign values
act - we make the change to our variable or object
assert - check to see if the change made is true or the
change that it should have made
 */

class CarTest {
    //create a test:
    @Test
    public void accelerate_should_increaseCarSpeed(){
        //arrange:
        Car car = new Car("Ford", "F150 Raptor");
        int speedChange = 15;
        int expectedSpeed=15;

        //act:
        car.accelerate(speedChange);

        //assert that this is true:
        int actualSpeed=car.getSpeed();
        //assertEquals takes two things and asserts that they are equal
        assertEquals(expectedSpeed,actualSpeed);
    }

    @Test
    public void brake_should_decreaseCarSpeed(){
        //arrange:
        Car car = new Car("Ford", "F150 Raptor");
        int speedUpBy = 15;
        int slowDownBy = 10;
        int expectedSpeed= 5;
        car.accelerate(speedUpBy);

        //act:
        car.brake(slowDownBy);

        //assert that the speed is now 5:
        int actualSpeed=car.getSpeed();
        assertEquals(expectedSpeed,actualSpeed);

    }

    @Test public void brake_should_stopCar_whenChangeIsGreater() {
        // arrange
        Car car = new Car("Ford", "F150 Raptor");
        int speedUpBy = 15;
        int slowDownBy = 20;
        int expectedSpeed = 0;
        car.accelerate(speedUpBy);
        //act
        car.brake(slowDownBy);
        // assert
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }

    //Testing the getMake method
    @Test public void get_make_should_set_object(){
     // arrange and act:
      Car car = new Car("Tesla", "Cybertruck");
      String expectedMake = "Tesla";
     // act

     // assert
        String actualMake = car.getMake();
        assertEquals(actualMake, expectedMake);
    }




}