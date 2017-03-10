package chapter7.concurrency.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingParallelStreams {

	// Beware that parallel() is an intermediate operation
	// that operates on the original stream.
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
		@SuppressWarnings("unused")
		Stream<Integer> parallel = stream.parallel(); // Creating parallel
		
		// 1 stream
		Arrays.asList(10,20,30).forEach(s -> System.out.print("Number is "+s));
		//10 20 30
		System.out.println("\nIn parallel");
		
		// 2 streams
		Arrays.asList(10,20,30).parallelStream().forEach(s -> System.out.print("Number is "+s));
		// ? ? ?
		
		System.out.println("\nIn parallel ordered");
		// 2 streams ordered using forEachOrdered instead of forEach
		Arrays.asList(10,20,30).parallelStream().forEachOrdered(s -> System.out.print("Number is "+s));
		// 10, 20, 30
	}
}
