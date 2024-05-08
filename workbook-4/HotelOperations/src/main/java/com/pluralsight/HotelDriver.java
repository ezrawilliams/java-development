package com.pluralsight;

import java.util.Scanner;

public class HotelDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Employee employee1 = new Employee();
        employee1.setHoursWorked(40);
        System.out.println("What time did you start work?");
        double startTime = scanner.nextDouble();
        System.out.println("What time did you finish work?");
        double finishTime = scanner.nextDouble();
       employee1.punchTimeCard(startTime,finishTime);
        employee1.setEmployeeId(1);
        employee1.setDepartment("IT");
        employee1.setPayRate(20.00);
                new Employee(1,
                "Ezra Williams", "IT",
                20.00, 45);
        System.out.println(employee1.getHoursWorked());
        System.out.println(employee1.getOvertimeHours());
        System.out.println(employee1.getTotalPay());
        System.out.println(employee1.getRegularHours());

        Employee employee2 = new Employee();
        employee2.setEmployeeId(2);
        employee2.setDepartment("Finance");
        employee2.setPayRate(25);
       // employee2.punchIn();
        //employee2.punchOut();
        employee2.punchTimeCard();
        System.out.println(employee2.getHoursWorked());
        System.out.println(employee2.getOvertimeHours());
        System.out.println(employee2.getTotalPay());
        System.out.println(employee2.getRegularHours());



      Reservation res1 = new Reservation();
        res1.setRoomType("double");
        res1.setWeekend(true);
        res1.setNumberOfNights(3);
        System.out.println(res1.getPrice());
        System.out.println(res1.getReservationTotal());*/

        /*
        We have a hotel and has 10 suites and 10 normal room
        The king rooms they are suites and the double rooms are normal rooms
         */
        //Suites:
        Room room1 = new Room(1, false, false, "king");
        Room room2 = new Room(1, false, false, "king");
        Room room3 = new Room(1, false, false, "king");
        Room room4 = new Room(1, false, false, "king");
        Room room5 = new Room(1, false, false, "king");
        Room room6 = new Room(1, false, false, "king");
        Room room7 = new Room(1, false, false, "king");
        Room room8 = new Room(1, false, false, "king");
        Room room9 = new Room(1, false, false, "king");
        Room room10 = new Room(1, false, false, "king");
        //Create an array for the suites:
        Room[] suites = {room1, room2, room3, room4, room5, room6, room7, room8, room9, room10};

        //Basic:
        Room room11 = new Room(2, false, false, "double");
        Room room12 = new Room(2, false, false, "double");
        Room room13 = new Room(2, false, false, "double");
        Room room14 = new Room(2, false, false, "double");
        Room room15 = new Room(2, false, false, "double");
        Room room16 = new Room(2, false, false, "double");
        Room room17 = new Room(2, false, false, "double");
        Room room18 = new Room(2, false, false, "double");
        Room room19 = new Room(2, false, false, "double");
        Room room20 = new Room(2, false, false, "double");

        //Basic rooms array:
        Room[] basic = {room11, room12, room13, room14, room15, room16, room17, room18, room19, room20};

        //Create a hotel object:
        Hotel ezraHotel = new Hotel("Ezra's Hotel",10,10,
                0,0);
        //Someone comes in and they want to book a suite:
        Reservation res = new Reservation();
        //What kind of room do you want, how many nights, weekend or not? suite, 3, weekend
        res.setNumberOfNights(3);
        res.setRoom(room1);
        res.setWeekend(true);
        //show the user the total cost:
        System.out.println(res.getReservationTotal());
        //they agree so we book the room:
        ezraHotel.bookRoom(1, true);
        room1.setOccupied(true);
        room1.setDirty(true);

        //Check what rooms are occupied in the suites:
        for(Room room: suites){
            if(room.isOccupied()){
                System.out.println(room);
            }
        }

        System.out.println(ezraHotel.getAvailableSuites());
    }
}
