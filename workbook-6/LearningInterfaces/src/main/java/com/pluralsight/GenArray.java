package com.pluralsight;

/*
This means that the types to be created can only be sub types of Number
 */

public class GenArray <T extends Number>{
    T obj;
    T arr[];

    public GenArray( T o, T[] vals){
        this.obj=o;
        System.out.println("Value: "+obj);
        arr=vals;
    }

    T[] getArray(){
        return arr;
    }
}
