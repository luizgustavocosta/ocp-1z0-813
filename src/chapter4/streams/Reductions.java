package chapter4.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Reductions {

	static BiConsumer<Object, Object> biConsumer = (k, v) -> {
		System.out.print("Key{"+k+"}");
		System.out.print("value{"+v+"}\n");
	};
	
	BiPredicate<String, Integer> biPredicate = (k,v) -> {
		return k.length() > 5 && v > 10;
	};
	
	Function<String, Integer> function = s -> s.length();
	
	BiFunction<String, Integer, Boolean> biFunction = (time, fundacao) -> {
		return time.startsWith("SC") && fundacao > 1950;
	};
	
	static UnaryOperator<String> unary = String::trim;
	
	static BinaryOperator<StringBuilder> binaryOperador = (p1, p2) -> {
		return p1.append(p2).reverse();
	};
	
	static Consumer<Object> print = System.out::println;
	static Stream<String> streamPilots = Stream.of("Senna", "Schumacher", "Alain Prost");
	static Stream<String> streamMonkeys =Stream.of("monkey", "ape", "bonobo");
	static Stream<String> streamCities =Stream.of("Tokyo", "Milan", "Sao Paulo", "New York"
			, "Beijing", "Rio de Janeiro", "Miami", "Barcelona", "Paris", "London");
	
	static Stream<String> streamCountries = Stream.of("Brazil", "Argentina",
			"Paraguai","France","Espana","Portugal","England",
			"Finland","Netherlands","New Zeland","Australia");
	
	public static void main(String[] args) {
		count();
		if (args.length > 0) minAndMax();
		if (args.length > 0) findAnyAndFindFirst();
		if (args.length > 0) anyAllNoneMatch();
	}

	private static void anyAllNoneMatch() {
		//streamCountries.filter(s -> s.contains("land")).forEach(System.out::println);
		System.out.println(streamCountries.anyMatch(s -> s.startsWith("Br")));
		//System.out.println(streamCountries..anyMatch(s -> s.endsWith("land")));
		
		Stream<String> infinite = Stream.generate(()-> "Bolivia");
		System.out.println(infinite.noneMatch(s -> s.equals("Bolivia")));
	}

	private static void findAnyAndFindFirst() {
		Stream<String> infinite = Stream.generate(()-> "Lins");
		print.accept(infinite.findAny());
		
		Predicate<String> predicate = s -> s.equals("Barcelona");
		print.accept(streamCities.filter(predicate).findFirst());
	}

	private static void minAndMax() {
		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		};
		
		Optional<String> min = streamMonkeys.min(comparator);
		print.accept(min);
		
		if (!min.isPresent()) {
			Optional<String> minLambda = 
					streamMonkeys.min( (s1, s2) -> s1.length() - s2.length());
			print.accept(minLambda);
			
			Optional<String> minLambda2 = 
					streamMonkeys.min( (String s1, String s2) 
							-> {return s1.length() - s2.length();});
			print.accept(minLambda2);
		}
	}

	private static void count() {
		print.accept(streamPilots.count());
		String apply = unary.apply("Com espacos ");
		System.out.println("["+apply+"]");
		
		StringBuilder binaryOp = binaryOperador.apply(new StringBuilder("MARROCOS"), new StringBuilder("SOCORRAM"));
		System.out.println("["+binaryOp+"]");
		
		Stream<String> of = Stream.of("SAO PAULO","RIO DE JANEIRO", "SALVADOR");
		Function<String, Integer> function = s -> s.length();
		of.flatMapToInt(x -> x.chars()); // Precisa retornar IntStream
	}

}
