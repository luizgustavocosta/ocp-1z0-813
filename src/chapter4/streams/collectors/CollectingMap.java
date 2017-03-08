package chapter4.streams.collectors;

import java.nio.MappedByteBuffer;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingMap {
	
	static Consumer<Object> print = System.out::print;
	static Consumer<Object> println = System.out::println;
	
	public static void main(String[] args) {
		if (args.length > 0) creatingMap();
		if (args.length > 0) grouping();
		if (args.length > 0) partitioning();
		debugging();
	}

	private static void debugging() {
		Map<Integer, Optional<Character>> collect = Stream.of("lions", "tigers", "bears")
			.collect(
					Collectors.groupingBy(String::length,
							Collectors.mapping(s -> s.charAt(0),//replaced count with mapping
									Collectors.minBy(Comparator.naturalOrder()))));
		println.accept(collect);
	}

	private static void partitioning() {
		Map<Boolean, List<String>> collect = Stream.of("lions", "tigers", "bears")
			.collect(
				Collectors.partitioningBy(s-> s.length() > 5));
		println.accept(collect);
		
		Map<Boolean, Long> collect2 = Stream.of("lions", "tigers", "bears")
			.collect(
					Collectors.groupingBy(s-> s.length() > 5, Collectors.counting()));
		System.out.println(collect2);
	}

	private static void grouping() {
		Map<Integer, List<String>> collect = Stream.of("lions", "tigers", "bears")
			.collect(Collectors
				.groupingBy(String::length));
		println.accept(collect);
		
		Map<Integer, Set<String>> collect2 = Stream.of("lions", "tigers", "bears")
			.collect(Collectors
					.groupingBy(String::length, Collectors.toSet()));
		println.accept(collect2);
		
		TreeMap<Integer, Set<String>> collect3 = Stream.of("lions", "tigers", "bears")
				.collect(Collectors
						.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
		// to change the type of value, just change Collectors.toSet() to Collectors.toList()
		println.accept(collect3);
	}

	private static void creatingMap() {
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		Map<String, Integer> map = ohMy
				.collect(
						Collectors
							.toMap(s -> s, String::length));
		println.accept(map);
		
		// Duplicate key exception
		/*Stream<String> mapInt = Stream.of("lions", "tigers", "bears");
		Map<Integer, String> collect = mapInt
			.collect(
				Collectors
					.toMap(String::length, s-> s ));*/
		// Comma-separated values
		Map<Integer, String> collect = Stream.of("lions", "tigers", "bears")
			.collect(Collectors
					.toMap(String::length, k->k, (s1,s2) -> s1 + "," + s2));
		// This way above avoid duplicate key exception. If the key are the same
		// uses the existing key and created comma-seperated String.
		println.accept(collect);
		
		TreeMap<Integer, String> collect2 = Stream.of("lions", "tigers", "bears")
				.collect(Collectors
						.toMap(String::length, k->k, (s1,s2) -> s1 + "," + s2, TreeMap::new));
		
		println.accept(collect2);
	}
}
