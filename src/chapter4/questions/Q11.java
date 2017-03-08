package chapter4.questions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q11 {

	// What changes need to be made for this code
	// to print the string 12345
	// Me - 1 () 
	// Correct - 2 (Because joining is waiting for char sequence / String)
	public static void main(String[] args) {
		Stream.iterate(1,  x -> x++).limit(5)
			.map(x -> "" + x)
			.collect(Collectors.joining());
			
	}

}
