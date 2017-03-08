package chapter5.questions;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Q13 {

	// Note that March 13, 2016, is the weekend that clocks spring ahead for
	// daylight
	// saving times. What is the output of the following?
	// Me - 4 (2,1,3)
	// Correct - 2 (1,1,3) - ChronoUnit.HOURS.between Dont use the time with offset
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
		LocalTime time = LocalTime.of(1, 30);
		ZoneId zone = ZoneId.of("US/Eastern");

		ZonedDateTime dateTime1 = ZonedDateTime.of(date, time, zone);
		ZonedDateTime dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);

		System.out.println(dateTime1.getHour() + " "+dateTime2.getHour());
		long hours = ChronoUnit.MINUTES.between(dateTime1, dateTime2);
		int clock1 = dateTime1.getHour();
		int clock2 = dateTime2.getHour();

		System.out.println(hours + "," + clock1 + "," + clock2);
	}
}
