package chapter5.time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalculateDays {

	public static void main(String[] args) {
		LocalDate d0 = LocalDate.of(2017, Month.JANUARY, 10);
		
		LocalDate dn = LocalDate.of(2017, Month.MARCH, 9);
	
		Period p = Period.ofDays(dn.getDayOfYear()-d0.getDayOfYear());
		System.out.println(p);
		LocalDate minus = dn.minus(p);
		System.out.println(minus);
		
	}
}
