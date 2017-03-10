package chapter9.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class LerLinhas {

	public static void main(String[] args) {
		String uri = System.getProperty("user.home");
		Path path = Paths.get(uri + "/Files/infinite/file.txt");

		try {
//			Files.lines(path).forEach(System.out::println);
			List<String> collect = Files.lines(path)
					.filter(s -> s.startsWith("1"))
					.map(s -> s.substring(6))
					.collect(Collectors.toList());
			
			collect.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
