package chapter4.streams;

import java.util.stream.Stream;

public class TestPeek {

	public static void main(String[] args) {
		Stream<Integer> infinite = 
				Stream.iterate(1, x -> x + 1);
		infinite.limit(5)
			.peek(System.out::print)
			.filter(x -> x%2 == 1)
			.forEach(o -> System.out.print(" ["+o+"]"));
		
		/*Stream<Integer> even = 
				Stream.iterate(1, x -> x + 1);
		even.limit(20)
			.filter(x -> x%2 == 0)
			.forEach(o -> System.out.print(o+" "));*/
		
	}

}
