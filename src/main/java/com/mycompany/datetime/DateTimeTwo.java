package com.mycompany.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeTwo {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		System.out.println("Date after 15days "+date.plusDays(5));
		System.out.println("Date before 5months "+date.minusMonths(5));
        
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("before 4 hrs: "+localDateTime.minusHours(4));
	}

}
