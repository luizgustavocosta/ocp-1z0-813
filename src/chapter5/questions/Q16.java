package chapter5.questions;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;

public class Q16 {

	// Given the following code, which answers can correctly fill in the blank?
	// Me 		- 1
	// Correct 	- 
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
		ZoneId zone = ZoneId.of("America/Sao_Paulo");
		
		ZonedDateTime of = ZonedDateTime.of(date,time,zone);
		long epochSeconds = 24000;
		Instant instant = Instant.now();
		Instant instant2 = Instant.ofEpochSecond(epochSeconds);
		System.out.format("%s\n%s\n%s\n",instant,instant2,of.now());
		// toInstant() sum offSet
		// Spain 11:35 - ZoneId America/Sao_Paulo - Sao Paulo 15:35
		// Spain 11:36 - ZoneId Asia/Tokyo 		  - Tokio 03:36
	}

}
