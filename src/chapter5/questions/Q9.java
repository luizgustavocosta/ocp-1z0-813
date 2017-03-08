package chapter5.questions;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Q9 {

	// What is the output of the following code
	// Me 		- 2
	// Correct 	- 2
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		LocalDateTime d = LocalDateTime.of(2015,5,10,11,22,33);
		Period p = Period.of(1, 2, 3);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(d.format(f));
	}

}
