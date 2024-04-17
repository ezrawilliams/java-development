package com.pluralsight;

public class StudentDriver {
    public static void main(String[] args) {
        Student student1 = new Student("Ezra","Asheba",
                "Williams",42,123456,"123 ABC Lane");
        Student student2 = new Student();
        student2.setFirstName("Gebrit");
        student2.setMiddleName("IDK");
        student2.setLastName("Tesfay");
        student2.setAge(23);
        student2.age = 1000;
        student2.setSocial(3333333);
        student2.setAddress("36 Cooke St");
        Glass glass = new Glass("water glass",2, "blue");
    }
}
