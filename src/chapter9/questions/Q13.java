package chapter9.questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Q13 implements QuestionChapter9 {
	/**
	 * Assume /monkeys exists as a regular directory containing multiple files, symbolic links,
	 * and subdirectories. What is true about the following code?
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		Path path = Paths.get(userHome);
		
		Files.find(path, 0, (p,a) -> a.isSymbolicLink())
			.map(p -> p.toString())
			.collect(Collectors.toList())
			.stream()
			.peek(c -> System.out.println("peek ->"+c))
			.filter(x -> x.toString()
			.endsWith(".txt"))
			.forEach(System.out::println);
	}
}
