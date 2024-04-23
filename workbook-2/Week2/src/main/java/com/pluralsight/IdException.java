package com.pluralsight;

public class IdException extends Exception{
    public IdException(){
        System.out.println("Id cannot be greater than 1000.");
    }
}
