package chapter4.streams.collectors;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingTreeSet {

	static Consumer<Object> print = System.out::print;
	
	public static void main(String[] args) {
		first();
		average();
		ordered();
	}

	private static void ordered() {
		TreeSet<String> collect = Stream.of("LUIZ","ANDRE","JOAO","JOSE")
			.filter(s -> s.startsWith("J"))
			.collect(Collectors.toCollection(TreeSet::new));
		print.accept("\n");
		print.accept(collect);
		// OR - O - OU
		Set<String> collectEasy = Stream.of("LUIZ","ANDRE","JOAO","JOSE")
				.filter(s -> s.startsWith("J"))
				.collect(Collectors.toSet());
		print.accept("\n");
		print.accept(collectEasy);
	}

	private static void average() {
		print.accept("\n");
		print.accept(
		Stream.of("LUIZ","ANDRE","JOAO","JOSE")
			.collect(Collectors
					.averagingInt(String::length)));
	}

	private static void first() {
		Stream<String> ohMy = Stream.of("lions","tiger","bears");
		String result = ohMy.collect(Collectors.joining(" / "));
		print.accept(result); 
		print.accept("\n");
		print.accept(Stream.of("lions","tiger","bears").collect(Collectors.joining(",")));
	}

}
