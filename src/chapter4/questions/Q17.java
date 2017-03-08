package chapter4.questions;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Q17 {

	// What is the equivalent to this code?
	// Me - 2 ()
	// Correct - 5 ()
	public static void main(String[] args) {
		UnaryOperator<Integer> u = x -> x * x;
		
		//BiFunction<Integer> f = x-> x*x; 
		//BiFunction<Integer, Integer> f = x-> x*x;
//		BinaryOperator<Integer, Integer> f = x-> x*x;
//		Function<Integer> f = x-> x*x;
		Function<Integer,Integer> f = x-> x*x;
		
		System.out.println(u.apply(5));
		System.out.println(f.apply(5));
	}

}
