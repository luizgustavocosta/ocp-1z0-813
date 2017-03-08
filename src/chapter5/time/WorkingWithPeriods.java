package chapter5.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.function.BiConsumer;

public class WorkingWithPeriods {

	public static void main(String[] args) {
		BiConsumer<Object, Object> print = (a, b) -> System.out.println(a + " " + b);
		LocalDate start = LocalDate.of(2016, Month.MARCH, 31);
		LocalDate end = start.plus(15, ChronoUnit.DAYS);
		System.out.println(end);

		while (start.isAfter(end)) {
			System.out.println(start + "...not ready");
			start = start.plus(1, ChronoUnit.DAYS);
		}
		System.out.println(start + "...ready");

		Period annually = Period.ofYears(1);
		Period quarterly = Period.ofMonths(12 / 3);
		Period everyThreeWeeks = Period.ofWeeks(3);
		Period everyOtherDay = Period.ofDays(2);
		Period everyYearAndAWeek = Period.of(1, 0, 7);
		print.accept("Annually ->", annually);
		print.accept("quarterly ->", quarterly);
		print.accept("everyThreeWeeks ->", everyThreeWeeks);
		print.accept("everyOtherDay->", everyOtherDay);
		print.accept("everyYearAndAWeek ->", everyYearAndAWeek);
		
		//page 246 - Period is for Date
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Period period = Period.of(0, 1, 0);
		System.out.println(date.plus(period));
		System.out.println(dateTime.plus(period));
		//System.out.println(time.plus(period)); //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Months
		
		//Duration is for Time		
		System.out.println(Duration.ofDays(1));
		System.out.println(Duration.ofHours(10));
		System.out.println(Duration.ofMinutes(3));
		System.out.println(Duration.ofSeconds(59));
		System.out.println(Duration.ofMillis(1));
		System.out.println(Duration.ofNanos(78945612));
		// Or
		System.out.println(Duration.of(1, ChronoUnit.DAYS));

	}

}
