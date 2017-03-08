package chapter4.questions;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q14 {
	
	// Which of the following is true?
	// Me - 4 (Cant convert IntStream to Stream<Integer>)
	// Correct - (4)
	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1);
		IntStream is = s.mapToInt(x -> x);
		DoubleStream ds = s.mapToDouble(x -> x);
		// Stream<Integer> s2 = ds.mapToInt(x -> x);
		// s2.forEach(System.out::println);
	}

}
