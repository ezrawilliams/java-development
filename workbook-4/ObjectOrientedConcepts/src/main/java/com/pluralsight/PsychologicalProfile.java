package com.pluralsight;

public class PsychologicalProfile {
    private String name;
    private int age;
    private int address;
    private String[] physicalAilments;
    private String[] psychologicalDisorders;
    private String[] familyHistory;
    private long telephoneNumber;

    public PsychologicalProfile() {}
    public PsychologicalProfile(String name, int age, int address){
        this.name = name;
        this.age = age;
        this.address = address;
    }


}
