package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //Derived getters:
    public double getTotalPay(){
        return payRate * hoursWorked;
    }

    public double getRegularHours(){
        if (hoursWorked >= 40){
            return 40;
        } else if (hoursWorked < 40){
            return hoursWorked;
        }
        return 0;
    }

    public double getOvertimeHours(){
        //only goes in here if hours worked > 40:
        if (hoursWorked > 40){
            return hoursWorked - 40;
        }
        return 0;// methods only return once.
    }
}
