package javaAdvance.DateAndTimeApis;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime localTime= LocalTime.now();
        System.out.println("Current time::"+localTime);
    }
}
