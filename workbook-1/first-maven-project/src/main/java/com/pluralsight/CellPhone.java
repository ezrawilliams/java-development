package com.pluralsight;

public class CellPhone {
    private long serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone(){
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    public CellPhone(long serialNumber, String model, String carrier,
                     String phoneNumber, String owner){
        this.serialNumber=serialNumber;
        this.model=model;
        this.carrier=carrier;
        this.phoneNumber=phoneNumber;
        this.owner=owner;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getModel() {
        return model;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void dial(String phoneNumber){
        System.out.println(owner+"'s phone is calling "+phoneNumber);
    }
    //Overloaded method:
    public void dial(CellPhone phone){
        System.out.println(owner+"'s phone is calling "+phone.phoneNumber);
    }
}
