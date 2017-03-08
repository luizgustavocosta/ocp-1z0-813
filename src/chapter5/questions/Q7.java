package chapter5.questions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q7 {

	// What is the output of the following code
	// Me 		- ?
	// Correct 	- the code does not compile. The method plusHours doesn't exists
	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
		date.plusDays(2);
		System.out.println(date);
		
	}

}
