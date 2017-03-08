package chapter5.questions;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;

public class Q14 {

	// Note that March 13, 2016, is the weekend that we spring forward, and 
	// November 6, 2016, is when we fall back for daylight saving time. Which of the
	// following can fill in the blank without the code throwing an exception?
	// Me - 3
	// Correct - 1. 3. 4
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		ZoneId zone = ZoneId.of("US/Eastern");
		LocalDate date = LocalDate.of(2017, 2, 29);
		LocalTime time1 = LocalTime.of(2, 15);
		ZonedDateTime a = ZonedDateTime.of(date, time1, zone);
		System.out.println(a);
		
	}
}
