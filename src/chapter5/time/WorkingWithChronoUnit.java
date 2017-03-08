package chapter5.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class WorkingWithChronoUnit {

	public static void main(String[] args) {
		LocalTime one = LocalTime.of(3, 15);
		LocalTime two = LocalTime.of(16, 30);
		LocalDate date = LocalDate.now();
		
		System.out.println(ChronoUnit.HOURS.between(one, two));
		System.out.println(ChronoUnit.MINUTES.between(one, two));
		System.out.println(ChronoUnit.HALF_DAYS.between(one, two));
	}

}
