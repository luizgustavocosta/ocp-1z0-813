package chapter4.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WorkingWithPrimitives {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,3,5);
		System.out.println(stream.reduce(0, (a, b) -> a + b));
		
		Stream<Double> stremD = Stream.of(1.0,3.0,5.0);
		// Identity + BinaryOperator
		System.out.println(stremD.reduce(0d,(n1, n2) -> n1+n2));
		

	    System.out.println(IntStream.of(2,6,8).reduce(0, Integer::sum));
		
		Stream<Integer> integerMap = Stream.of(34,36,30);
		// ToIntFunction
		System.out.format("%.2f\n",integerMap.mapToInt(x->x).average().getAsDouble());
		
		IntStream intStream = IntStream.of(10,10,15,20);
		System.out.println(intStream.sum());
		
		DoubleStream doubleStream = DoubleStream.of(Math.PI, Math.E);
//		System.out.println(doubleStream.sum()+" ");
		Stream<Double> boxed = doubleStream.boxed();//.forEach(System.out::print);
		boxed.sorted().forEach(System.out::println);
		
		DoubleStream random = DoubleStream.generate(Math::random);
		random
			.limit(3)
			.forEach(System.out::println);
		
		DoubleStream fractions = DoubleStream.iterate(0.5, d -> d/2 );
			fractions.limit(4)
			.forEach(System.out::println);
		
		IntStream is = IntStream.range(1, 6); //1-5
		is.forEach(System.out::print);
		
		IntStream isClosed = IntStream.rangeClosed(1, 6); // 1-6
		isClosed.forEach(System.out::print);
		
		Stream<String> teams = Stream.of("Real Madrid", "Barça", "Bayer Munich");
		IntStream mapToInt = teams.mapToInt(s -> 	s.length());
		System.out.println("\nSum of String["+mapToInt.sum()+"]");
		
		
			
	}
}
