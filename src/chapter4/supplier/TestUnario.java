package chapter4.supplier;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class TestUnario {

	public static void main(String[] args) {
		Consumer<String> c1 = System.out::println;
		UnaryOperator<String> u1 = String::toUpperCase;
		c1.accept(u1.apply("luiz.costa@gft.com"));
		
		BinaryOperator<String> bo1 = String::concat;
		c1.accept(bo1.apply("Sant Cugat, 01", " de Marzo de 2017"));
	}
}
