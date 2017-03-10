package chapter7.concurrency.streams;

import java.util.Arrays;

public class SeparedOperations {

	public static void main(String[] args) {
		Arrays.asList("jackal","kangaroo","lemur")
			.parallelStream()
			.map(s -> s.toUpperCase()) // Independently for each item
			.forEach(System.out::println);
		// Remember that! Although order is never guaranteed
		
		Arrays.asList("jackal","kangaroo","lemur")
			.parallelStream()
			// Independently for each item
			.map(s -> {System.out.println(s);return s.toUpperCase();}) 
			.forEach(System.out::println);
	}

}
