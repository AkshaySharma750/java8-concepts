package com.mycompany.datetime;

import java.time.LocalDate;
import java.time.Period;

public class DateTimeThree {

	public static void main(String[] args) {
		
		//Calculate experience of an employee
		LocalDate currentDate = LocalDate.now();
		LocalDate startDate = LocalDate.of(2012, 04, 15);
		
		Period period = Period.between(startDate, currentDate);//start date is included and end date is not
        System.out.printf("Total experience is %d years %d months %d days", period.getYears(), period.getMonths(),period.getDays());
	}

}
