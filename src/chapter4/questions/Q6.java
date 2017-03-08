package chapter4.questions;

import java.util.stream.Stream;

public class Q6 {

	// Which of the following can fill in the blank so 
	// that the code prints out false
	// Me - 6 (None of the above), because dont have limit.
	// Correct - 1  (allMatch)
	//				anyMatch runs to infinite
	//				findAny   doesnt receive parameter
	//				findFirst doesnt receive parameter
	//			    noneMatch runs to infinite
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.generate(() -> "meow");
		boolean match = stream1.noneMatch(String::isEmpty);
		System.out.println(match);
	}

}
