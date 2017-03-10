package chapter7.questions;

import java.util.Collection;
import java.util.stream.Stream;

public class Q1 {
	
	/**
	 * Given an instance of stream, s, and a Collection, c, which are valid ways 
	 * of creating a parallel stream?
	 * @param args
	 */
	public static void main(String[] args) {
		// new ParallelStream(s)
		// c.parallel()
		// s.parallelStream()
		// c.parallelStream()
		// new ParallelStream()
		// s.parallel
		Stream<?> s = null;
		Collection<?> c = null;
		c.parallelStream();
		s.parallel();
	}
}
