package chapter4.questions;

import java.util.stream.IntStream;

public class Q8 {

	// Which of the following are true given the declaration
	// IntStream is = IntStream.empty()
	// Me - 2,4,6 (2 returns a OptionalDouble and 6 the number 0)
	// Correct -  4 (OptionalInt),5 (returns the type int)
	// IntStream.empty().average() returns a OptionalDouble
	public static void main(String[] args) {
		IntStream is = IntStream.empty();
		//System.out.println(is.average());
		//System.out.println(is.findAny());
		System.out.println(is.sum());
	}

}
