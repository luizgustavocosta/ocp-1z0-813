package chapter4.streams;

import java.util.stream.Stream;

public class PayAttention {

	public static void main(String[] args) {
		/*Stream.generate(()->"Elsa")
			.filter(n -> n.length() == 4)
			.sorted()
			.limit(2)
			.forEach(System.out::println);
			Infinite way, because limit is after sorted
			*/
		Stream.generate(()->"Elsa")
			.filter(n -> n.length() == 4)
			.limit(4)
			.distinct()
			.sorted()
			.forEach(System.out::println);
	}

}
