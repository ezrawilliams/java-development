package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        //09/05/2021
        LocalDateTime currentDate = LocalDateTime.now();
       // LocalTime currentTime = LocalTime.now();
        DateTimeFormatter dateTimeFormatter;
        dateTimeFormatter=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = dateTimeFormatter.format(currentDate);
        System.out.println(formattedDate);
        //2021-09-05:
        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formattedDate = dateTimeFormatter.format(currentDate);
        System.out.println(formattedDate);
        //September 5, 2021
        dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        formattedDate=dateTimeFormatter.format(currentDate);
        System.out.println(formattedDate);
        //Sunday, Sep 5, 2021 10:02, GMT
        dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy HH:mm");
        //Display as GMT time:
        formattedDate=dateTimeFormatter.format(LocalDateTime.now(ZoneId.of("GMT")));

        System.out.println(formattedDate);
        //Local time zone
        dateTimeFormatter = DateTimeFormatter.ofPattern("h:mm 'on' dd-MM-yyyy");
        formattedDate=dateTimeFormatter.format(currentDate.atZone(ZoneId.of("America/New_York")));
        //formattedDate=dateTimeFormatter.format(currentDate.atZone(ZoneId.systemDefault()));
        System.out.println(formattedDate);
    }
}
