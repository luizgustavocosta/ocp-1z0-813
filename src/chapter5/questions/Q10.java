package chapter5.questions;

import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

public class Q10 {

	// What is the output of the following code
	// Me 		- 2
	// Correct 	- 2
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
		date.plusDays(2);
		date.plusYears(10);
		System.out.println(date.getYear() + " " + date.getMonth() + " "+ date.getDayOfMonth());
		
	}

}
