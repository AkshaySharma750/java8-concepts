package com.mycompany.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class DateTimeOne {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getYear());
        
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        
        LocalDateTime futureDateTime = LocalDateTime.of(2024, Month.DECEMBER, 20, 9, 30, 20);
        System.out.println(futureDateTime);
	}

}
