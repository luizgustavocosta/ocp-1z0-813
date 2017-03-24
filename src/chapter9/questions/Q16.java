package chapter9.questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Q16 implements QuestionChapter9 {

	/**
	 * Assuming the current directory is /animals/cute,
	 * which are possible results of executing the following code?
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//Files.walk(Paths.get("..").toRealPath()) //u1
		Files.walk(Paths.get("..").toRealPath().getParent()) //u1
			.map(p-> p.toAbsolutePath().toString())//u2
			.filter(s -> s.endsWith(".java"))//u3
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
	}
}
