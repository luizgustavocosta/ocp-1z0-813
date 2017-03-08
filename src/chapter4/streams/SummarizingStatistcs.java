package chapter4.streams;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SummarizingStatistcs {

	public static void main(String[] args) {
		IntStream ints = IntStream.of(10,10,30,15,20);
		System.out.println(max(ints));
		
		int[] arrayInt = {10,10,30,15,20};
		System.out.println(getMaxNumber(arrayInt));
	}

	private static int getMaxNumber(int[] arrayInt) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arrayInt.length; i++) {
			if (max < arrayInt[i]) 
				max = arrayInt[i];
		}
		return max;
	}

	private static int max(IntStream ints) {
		OptionalInt optional = ints.max();
		return optional.orElseThrow(RuntimeException::new);
	}
}
