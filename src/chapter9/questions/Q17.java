package chapter9.questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Q17 implements QuestionChapter9 {

	/**
	 * Assuming /squid/food-schedule.csv
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Path path = Paths.get(userHome+"/squid/food-schedule.csv");
		Files.lines(path) //r1
			.flatMap(p-> Stream.of(p.split(","))) //r2
			//.map(s-> s.toUpperCase())//r3
			// Ao mapear, e esperado uma Function, que por sua vez espera o tipo
			.map(s -> ((String)s).toUpperCase())
			.forEach(System.out::println);
		
	}
}
