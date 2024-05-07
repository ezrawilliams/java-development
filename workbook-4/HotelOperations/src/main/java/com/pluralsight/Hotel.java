package com.pluralsight;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee1 = new Employee();
        employee1.setHoursWorked(40);
        System.out.println("What time did you start work?");
        double startTime = scanner.nextDouble();
        System.out.println("What time did you finish work?");
        double finishTime = scanner.nextDouble();
        employee1.punchTimeCard(startTime,finishTime);
        employee1.setEmployeeId(1);
        employee1.setDepartment("IT");
        employee1.setPayRate(20.00);
                /*new Employee(1,
                "Ezra Williams", "IT",
                20.00, 45);*/
        System.out.println(employee1.getHoursWorked());
        System.out.println(employee1.getOvertimeHours());
        System.out.println(employee1.getTotalPay());
        System.out.println(employee1.getRegularHours());

        Reservation res1 = new Reservation();
        res1.setRoomType("double");
        res1.setWeekend(true);
        res1.setNumberOfNights(3);
        System.out.println(res1.getPrice());
        System.out.println(res1.getReservationTotal());
    }
}
