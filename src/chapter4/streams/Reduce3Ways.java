package chapter4.streams;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Reduce3Ways {
	
	static Consumer<Object> print = System.out::println;
	static Stream<String> streamPilots = Stream.of("Senna", "Schumacher", "Alain Prost");
	
	public static void main(String[] args) {
		if (args.length > 0)reduceOne();
		if (args.length > 0)reduceTwo();
		reduceThree();
	}

	private static void reduceThree() { // Only in parallel
		BinaryOperator<Integer> op = (a,b) -> a+b;		
		BinaryOperator<Integer> op2 = (a,b) -> a*b;
		Stream<Integer> threeElements = Stream.of(5,10,15);
		System.out.println(threeElements.reduce(1, op, op2));
		
	}

	private static void reduceTwo() {
		BinaryOperator<Integer> op = (a,b) -> a*b;
		Stream<Integer> empty = Stream.empty();
		Stream<Integer> oneElement = Stream.of(3);
		Stream<Integer> threeElements = Stream.of(5,10,15);
		
		empty.reduce(op).ifPresent(System.out::println); // Nao imprime, pois empty nao tem calculo
		oneElement.reduce(op).ifPresent(System.out::println);
		threeElements.reduce(op).ifPresent(System.out::println);
	}

	private static void reduceOne() {
		Stream<String> stream = Stream.of("W","o","l","f");
		String reduce = stream.reduce("G", String::concat);
		System.out.println(reduce);
		
		Stream<Integer> stream2 = Stream.iterate(
				1, n -> n + 1).limit(34);
		Integer reduce2 = stream2.reduce(1, (a,b) -> a+b) ;
		System.out.println(reduce2);
		
		//Stream<Long> stream3 = Stream.iterate(1l, n -> n + 1).limit(34);
		Stream<Long> stream3 = Stream.of(2l, 3l, 4l);
		Long reduce3 = stream3.reduce(3l, (a,b) -> a*b) ;
		System.out.println(reduce3);
		
	}

}
