package com.pluralsight.springdemo.models;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String hireDate;

    public Employee() {
    }

    public Employee(int employeeId, String firstName, String hireDate, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.hireDate = hireDate;
        this.lastName = lastName;
    }

    public Employee(String firstName, String hireDate, String lastName) {
        this.firstName = firstName;
        this.hireDate = hireDate;
        this.lastName = lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
