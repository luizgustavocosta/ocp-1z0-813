package chapter9.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("..\\resource\\birds.txt");
		Files.readAllLines(path).forEach(System.out::println);
	}

}
