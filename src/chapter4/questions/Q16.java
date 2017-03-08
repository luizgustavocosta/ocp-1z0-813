package chapter4.questions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q16 {
	
	// What is  the output of the following?
	// Me - 4 ()
	// Correct - 4()
	public static void main(String[] args) {
		Stream<String> s = Stream.empty();
		Stream<String> s2 = Stream.empty();
		
		Map<Boolean, List<String>>
		 	p = s.collect(Collectors.partitioningBy(
				 b-> b.startsWith("c")));
		Map<Boolean, List<String>>
			g = s2.collect(Collectors.partitioningBy(
				 b-> b.startsWith("c")));
		System.out.println(p+" "+g);
		
	}

}
