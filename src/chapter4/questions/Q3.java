package chapter4.questions;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Q3 {

	// What is the output of the following?
	// Me - 4 (The code does not compile, because lambda expression)
	// Correct -  5 (An expection is thrown Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed)
	public static void main(String[] args) {
		Predicate<? super String> predicate = s -> s.length() > 3;
		Stream<String> stream1 = Stream.iterate("-", (s) -> s + s);
		
		boolean b1 = stream1.noneMatch(predicate);
		boolean b2 = stream1.anyMatch(predicate);
		
		System.out.println(b1 + " " + b2);
	}

}
