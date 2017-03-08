package chapter4.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Q13 {
	// Which of the following is true?
	// Me - 2 (The code compiles adn print 2..7)
	// Correct - (6) The code does not compile
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		List<Integer> l2 = Arrays.asList(4, 5, 6);
		List<Integer> l3 = Arrays.asList();

		Stream<List<Integer>> of = Stream.of(l1, l2, l3);// .map(x -> x + 1);
		Stream<String> map = of.map(x -> x + "1");

		map.forEach(System.out::println);
	}

}
