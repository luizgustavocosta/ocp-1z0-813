package chapter4.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class IntermediateOperations {

	static Consumer<Object> print = System.out::println;
	
	public static void main(String[] args) {
		filter();
		distinct();
		limitAndSkip();
		map();
		flatMap();
		peek();
	}

	private static void peek() {
		System.out.println("**Peek**");
		Stream<String> stream = Stream.of("Chicago Bulls",
				"Orlando Magic", "Boston Celtics", "Houston Rockets",
				"Dallas Mavericks", "Washington Wizards");
		
		stream.filter(s -> s.length() > 15).peek(print)
			.count();
	}

	private static void flatMap() {
		System.out.println("**FlatMap**");
		List<String> brTeams = Arrays.asList("Corinthians");
		List<String> pyTeams = Arrays.asList();
		List<String> esTeams = Arrays.asList("Barca","R. Madrid", "Atl. Madrid");
		
		Stream<List<String>> teams = Stream.of(brTeams, pyTeams, esTeams);
		
		teams.flatMap(l -> l.stream()).forEach(print);
				
	}

	private static void map() {
		System.out.println("**Map**");
		Stream<String> stream = Stream.of("ABC","AA","AA");
		stream.map(String::length).forEach(print);
	}

	private static void limitAndSkip() {
		System.out.println("**Limit**");
		Stream<Integer> streamOfNumbers =
				Stream.iterate(1, n -> n + 1).limit(25);
		streamOfNumbers.forEach(print);
		
		System.out.println("**Skip**");
		Stream<Integer> streamOfSkip =
				Stream.iterate(1, n -> n + 1).limit(25).skip(20);
		streamOfSkip.forEach(print);
	}

	private static void distinct() {
		System.out.println("**Distinct**");
		Stream<String> stream = Stream.of("ABC","AA","AA");
		stream.distinct().forEach(print);
	}

	private static void filter() {
		System.out.println("**Filter**");
		Stream<String> stream = Stream.of("ABC","AA","AA");
		stream.filter(x -> x.startsWith("AA")).forEach(print);
	}

}
