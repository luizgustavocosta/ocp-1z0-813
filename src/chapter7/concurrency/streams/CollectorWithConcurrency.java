package chapter7.concurrency.streams;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorWithConcurrency {

	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
		ConcurrentMap<Integer, String> map = ohMy
				.collect(
						Collectors.toConcurrentMap(
								String::length, 
								k -> k, 
								(s1,s2) -> s1 + ","+ s2));
		System.out.println(map);
		// ou
		Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears").parallel();
		ConcurrentMap<Integer, List<String>> map2 = ohMy2.collect(
				Collectors.groupingByConcurrent(String::length));
		
		System.out.println(map2);
	}

}
