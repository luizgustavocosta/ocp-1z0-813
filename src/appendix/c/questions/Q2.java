package appendix.c.questions;

import java.text.DecimalFormat;
import java.util.function.Consumer;

public class Q2 {

	/**
	 * What is the output of the following code?
	 * 3.141592653
	 * 0,003.14
	 * ,003.1
	 * 00.04
	 * The code does not compile
	 * None of the above
	 * @param args
	 */
	public static void main(String[] args) {
		Consumer<Object> print = System.out::println;
		DecimalFormat format = new DecimalFormat("0,000.0#");
		double pi = Math.PI;
		print.accept(format.format(pi));
	}

}
