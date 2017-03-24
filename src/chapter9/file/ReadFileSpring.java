package chapter9.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileSpring {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src","spring.txt").toAbsolutePath();
		Files.readAllLines(path)
			.stream()
			.filter(l-> !l.trim().startsWith("Learn"))
			.forEach(c-> System.out.println(c.trim()));
	}

}
