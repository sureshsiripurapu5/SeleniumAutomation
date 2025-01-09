package javaAdvance.DateAndTimeApis;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println("Current Date::"+localDate); //Current Date::2025-01-09
        //************************************************8
        int year = 2025;
        int month = 1;
        int dayOfMonth = 9;
        LocalDate customDate1 = LocalDate.of(year, month, dayOfMonth);
        System.out.println("CustomDate::" + customDate1);


    }
}
