package chapter4.supplier;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class TesteDefaultMethods {

	public static void main(String[] args) {
		Predicate<String> egg = s-> s.contains("egg");
		Predicate<String> brown = s-> s.contains("brown");
		
		// Chain
		Predicate<String> brownEggs = egg.and(brown.negate());
		
		Consumer<Boolean> c1 = System.out::println;
		
		c1.accept(
				brownEggs.test("egg com alguma coisa"));
		
	}

}
