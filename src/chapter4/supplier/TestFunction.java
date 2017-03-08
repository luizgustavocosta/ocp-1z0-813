package chapter4.supplier;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {
		Function<String, Integer> f1 = String::length;
		
		BiFunction<String, String, Integer>
			bf1 = (a, b) -> a.length() + b.length();
		
		Consumer<Object> c1 = System.out::println;
		
		c1.accept(f1.apply("GUSTAVO DE PAULA"));
		c1.accept(bf1.apply("Luiz Gustavo", "Oliveira Costa"));
	}

}
