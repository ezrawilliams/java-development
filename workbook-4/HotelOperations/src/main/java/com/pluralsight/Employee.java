package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchInTime;
    private double punchOutTime;

    /*
    Added a default constructor so that I can calculate hoursWorked and
    add to the employees hours worked and use setters instead of the
    all argument constructor.
    Java actually adds default values when you create the class variables
     */
    public Employee() {}

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

   /* public void punchIn(double time){
        punchInTime=time;
    }

    public void punchOut(double timeOut){
        punchOutTime=timeOut;
        hoursWorked += (punchOutTime - punchInTime);
    }*/

    public void punchTimeCard(double timeIn, double timeOut){
        punchInTime = timeIn;
        punchOutTime = timeOut;
        hoursWorked += (punchOutTime-punchInTime);
    }

    public double getPunchInTime() {
        return punchInTime;
    }

    public double getPunchOutTime(){
        return punchOutTime;
    }
}
