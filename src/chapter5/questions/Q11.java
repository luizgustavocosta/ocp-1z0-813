package chapter5.questions;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Q11 {

	// What is the output of the following code
	// Me 		- 1
	// Correct 	- 2 Period.ofDays(1).ofYears(2); means Period.lastMethod (.ofYears(int));
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		LocalDateTime d = LocalDateTime.of(2015,5,10,11,22,33);
		Period p = Period.ofDays(1).ofYears(2);
		System.out.println(p);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(f.format(d));
	}

}
