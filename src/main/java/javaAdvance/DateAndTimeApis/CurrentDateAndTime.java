package javaAdvance.DateAndTimeApis;

import java.time.LocalDateTime;

public class CurrentDateAndTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("current date and time::"+localDateTime);
    }
}


//div[@title='Ireland Women']/preceding::div[@title="India Women"]/preceding::span[text()='1st ODI']