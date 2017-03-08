package chapter5.questions;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Q15 {

	// Given the following code, which of the answer choices can fill in the blank
	// to print true
	// Me 		- ?
	// Correct 	- 
	public static void main(String[] args) {
		String m1 = Duration.of(1, ChronoUnit.MINUTES).toString();
		String m2 = Duration.ofMinutes(1).toString();
		String s = Duration.of(60, ChronoUnit.SECONDS).toString();
		
		String d = Duration.ofDays(1).toString();
		String p = Period.ofDays(1).toString();
		
		System.out.println(m1+" "+m2+" "+s+" "+d+" "+p);
		
		System.out.format("%-15s%s\n", "m1==m2", m1==m2);
		System.out.format("%-15s%s\n", "m1.equals(m2)", m1.equals(m2));
		System.out.format("%-15s%s\n", "m1.equals(s)", m1.equals(s));
		System.out.format("%-15s%s\n", "d == p", d == p);
		System.out.format("%-15s%s\n", "d.equals(p)", d.equals(p));
	}

}
