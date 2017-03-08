package chapter4.questions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q20 {
	
	// What is  the simplest way of rewriting this code?
	// Me - 5 (Compiles and execute)
	// Correct - 2()
	public static void main(String[] args) {
		List<Integer> l = 
				IntStream.range(1, 6).mapToObj(i->i)
					.collect(Collectors.toList());
		l.forEach(System.out::print);
		
		System.out.println("\n");
		IntStream.range(1, 6).forEach(System.out::print);
	}

}
