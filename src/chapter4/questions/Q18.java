package chapter4.questions;

import java.util.stream.DoubleStream;

public class Q18 {
	
	// What is  the output of the following?
	// Me - 4 ()
	// Correct - 4()
	public static void main(String[] args) {
		DoubleStream s = DoubleStream.of(1.2,2.4);
		s.peek(System.out::println).filter(x->x > 2).count();
	}

}
