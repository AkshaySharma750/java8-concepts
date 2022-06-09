package com.mycompany.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeFour {

	public static void main(String[] args) {

		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);
		
		ZoneId zoneIdAmerica = ZoneId.of("America/Los_Angeles");
		System.out.println(LocalDateTime.now(zoneIdAmerica));
		
		ZoneId zoneIdGmt = ZoneId.of("GMT+05:30");
		System.out.println(ZonedDateTime.now(zoneIdGmt));
		
		ZoneId zoneIdGmt00 = ZoneId.of("GMT+00:00");
		System.out.println(ZonedDateTime.now(zoneIdGmt00));
		
		System.out.println(Instant.now());
	}

}
