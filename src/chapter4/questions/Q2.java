package chapter4.questions;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Q2 {

	// What is the output of the following?
	// Me - 6 (The code hangs, because dont have limit()
	// Correct - 6 (because allMatch is looking for a infinite Stream)
	public static void main(String[] args) {
		Predicate<? super String> predicate = s -> s.startsWith("g");
		Stream<String> stream1 = Stream.generate(()-> "growl!");
		Stream<String> stream2 = Stream.generate(()-> "growl!");
		
		boolean b1 = stream1.anyMatch(predicate);
		boolean b2 = stream2.allMatch(predicate);
		
		System.out.println(b1 + " " + b2);
	}

}
