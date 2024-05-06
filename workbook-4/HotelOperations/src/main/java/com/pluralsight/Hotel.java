package com.pluralsight;

public class Hotel {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,
                "Ezra Williams", "IT",
                20.00, 45);
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
