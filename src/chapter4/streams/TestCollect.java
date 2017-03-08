package chapter4.streams;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCollect {

	public static void main(String[] args) {
		collectWithCollector();
		if (args.length > 0) collect2BiConsumer();
	}

	private static void collectWithCollector() {
		Stream<String> stream = Stream.of("w","o","l","f");
		if (stream.isParallel()) {
			TreeSet<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
			System.out.println("TreeSet["+set+"]");
		} else {
			Set<String> set = stream.collect(Collectors.toSet());
			System.out.println("Set["+set+"]");
		}
		
	}

	private static void collect2BiConsumer() {
		Stream<String> streamWolf = Stream.of("W", "O", "L", "F");
		BiConsumer<StringBuilder, StringBuilder> bi1 = StringBuilder::append;
		StringBuilder word = streamWolf.collect(StringBuilder::new, StringBuilder::append, bi1);
		System.out.println(word);

		Stream<String> stream = Stream.of("LUIZ GUSTAVO", "RODRIGO", "JOAQUIM", "GUSTAVO");
		TreeSet<Object> tree = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		System.out.println(tree);
	}

}
