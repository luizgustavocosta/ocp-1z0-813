package chapter4.questions;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Q12 {

	// Which functional interfaces complete the following code?
	// Me - 1,6 () 
	// Correct - 1,6,8()
	public static void main(String[] args) {
		Supplier<String> x = String::new;
		BiConsumer<String, String> y = (a,b) -> System.out.println();
		UnaryOperator<String> z = a -> a+a;
		
		System.out.println(x+""+y+""+z);
	}

}
