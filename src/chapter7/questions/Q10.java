package chapter7.questions;

import java.util.Arrays;

public class Q10 {

	/**
	 * What statements about the following code are true?
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
				Arrays.asList("duck","chicken","flamingo","pelican")
				.parallelStream().parallel()
//				.reduce(0, (c1,c2) -> c1.length() + c2.length(),//q2
//						(s1, s2) -> s1 + s2)
				);
		// the code on line q2 doesn't compile because the accumulator was defined as integer
		// so the binaryOperator follows the accumulator type
	}
}
