package chapter4.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test1 {
	public static void main(String[] args) {
		Consumer<Object> c1 = System.out::print;
		Stream<String> empty = Stream.empty();
		c1.accept(empty.count());
		
		Stream<Integer> singleElement = Stream.of(1);
		c1.accept(singleElement.count());
		
		Stream<Integer> fromElement = Stream.of(1,2,3);
		c1.accept(fromElement.count());
		
		// Lists
		List<String> list = Arrays.asList("a","b","c","d");
		Stream<String> fromList = list.stream();
		fromList.forEach(c1);
		Stream<String> fromParallelList = list.parallelStream();
		fromParallelList.forEach(c1);
		
		//Stream<Double> streamD = Stream.generate(Math::random);
		//Stream<Integer> oddNumbers = Stream.iterate(1, n -> n+2); //inifite loop
		//c1.accept(streamD.count());
		
		Stream<Integer> oddNumbers = 
				Stream.iterate(
						1,//seed
						n -> n + 2) // UnaryOperator
						.limit(20);
		oddNumbers.forEach(c1);
		
		String nula = null;
		System.out.println(Objects.isNull(nula));
	}
}
