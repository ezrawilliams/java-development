package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cp1 = new CellPhone();
        System.out.print("What is the serial number? ");
        long sn = scanner.nextLong();
        cp1.setSerialNumber(sn);
        scanner.nextLine();
        System.out.print("What model is the phone ? ");
        String model = scanner.nextLine();
        cp1.setModel(model);
        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        cp1.setCarrier(carrier);
        System.out.print("What is the phone number? ");
        String pn = scanner.nextLine();
        cp1.setPhoneNumber(pn);
        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        cp1.setOwner(owner);
        CellPhone cp2 = new CellPhone();
        cp2.setOwner("Ezra Williams");
        cp2.setCarrier("T-Mobile");
        cp2.setPhoneNumber("404-551-6666");
        cp2.setModel("iphone 13 pro");
        cp2.setSerialNumber(12345);
        display(cp1);
        display(cp2);
        cp1.dial(cp2);
    }

public static void display(CellPhone phone){
       String details = phone.getOwner() + " owns this phone "+
       phone.getPhoneNumber()+" and their carrier is "+phone.getCarrier()+
       ". The serial number is "+phone.getSerialNumber()+" and the model is "+
               phone.getModel();
    System.out.println(details);
}
}
