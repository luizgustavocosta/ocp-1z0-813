package chapter5.questions;

import java.time.LocalDate;
import java.time.Month;

public class Q8 {

	// What is the output of the following code
	// Me 		- 5
	// Correct 	- 6 Runtime error not compilation time
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
		date.plusDays(2);
		System.out.println(date);
		
	}

}
