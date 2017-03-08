package chapter4.questions;

import java.util.stream.Stream;

public class Q10 {

	// Select from the following statements and indicate the order
	// in which they would appear to output 10 lines
	// Me - 6 (Correct) 
	// Correct - ()
	public static void main(String[] args) {
		Stream.generate(() -> "1")//.filter(x -> x.length() > 1)
		.limit(10)
		.forEach(System.out::println);
	}

}
