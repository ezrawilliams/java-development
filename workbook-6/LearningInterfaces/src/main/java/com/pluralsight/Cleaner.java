package com.pluralsight;

public interface Cleaner {
    void clean();
    default void print(){
        System.out.println("I can clean!");
    }
}
