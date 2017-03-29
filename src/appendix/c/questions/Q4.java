package appendix.c.questions;

import java.util.function.Consumer;

public class Q4 {

	/**
	 * What is the result of the following code snippet?
	 * @param args
	 */
	public static void main(String[] args) {
		Consumer<Object> print = System.out::println;
		int x = 10%2 + 1;
		switch (x) {
		case 0:
			print.accept("Too high");
			break;
		case 1:
			print.accept("Just high");
			break;
		default:
			print.accept("Too Low");
		}
	}

}
