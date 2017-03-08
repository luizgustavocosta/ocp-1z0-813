package chapter5.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DayLightSavingUSA {

	// In USA the clocks forward an hour and jump
	// from 02:00 a.m to 03:00 a.m.
	// When you move the clock 1 hour ahead, u lost the 02:30 am. funny is it?
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, Month.MARCH.getValue(), 13);
		LocalTime time = LocalTime.of(01, 30);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime dateTime  = ZonedDateTime.of(date, time, zone);
		System.out.format("%-25s%s","Sem horario de verao",dateTime);
		
		dateTime = dateTime.plusHours(1);
		System.out.format("\n%-25s%s","Com horario de verao",dateTime);
		
	}
}
