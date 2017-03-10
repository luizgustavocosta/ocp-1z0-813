package chapter7.concurrency.streams;

import java.util.Arrays;
import java.util.function.Consumer;

public class Combining {

	public static void main(String[] args) {
		// st - identity
		// nd - accumulator
		// rd - combiner
		Consumer<Object> action = System.out::println;
		action.accept(
				Arrays.asList('w','o','l','f')
				.stream()
				.reduce(
						"->", // acumulador
						(c, s1) ->  c +"@"+  s1,
						(c, s1) -> null)
				);
		// Requirements for reduce arguments
		// The identity must be defined such that for all elements
		// in the stream u, combiner.apply(identity, u)
		// The accumulator operator op must be associative and stateless
		// such that (a op b) op c is equal a op (b op c) tudo igual
		// The combiner operator must be associative and stateless
		// and compatible with the identity, such that for all u and t
		// combiner.apply(u, accumulator.apply(identity, t)) is equal
		// accumulator.apply(u, t);
		
		action.accept(
				Arrays.asList("w","o","l","f")
				.parallelStream()
				.reduce(
						"X",String::concat)
				);
		// three-agurment version to accept reduce()
		
	}

}
