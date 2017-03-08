package chapter4.questions;

import java.util.OptionalLong;
import java.util.stream.LongStream;

public class Q9 {

	// Which of the following add after line 5 for the code to run
	// without error and not produce any output
	// Me - 6 ()
	// Correct - 2,4(The method getAsLong() exists)
	public static void main(String[] args) {
		LongStream ls = LongStream.of(1, 2, 3);
		OptionalLong opt = ls.map(n -> n*10).filter(n -> n < 5).findFirst();
		
		//opt.get() doesnt exists  if (opt.isPresent()) {System.out.println(opt.get());}
		if (opt.isPresent()) {
			System.out.println(opt.getAsLong());
		}
		opt.ifPresent(System.out::println);
	}

}
