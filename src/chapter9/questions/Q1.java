package chapter9.questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q1 implements QuestionChapter9 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get(userHome+"/xpto");
		if (Files.isDirectory(path))
			System.out.println(Files.deleteIfExists(path)?"Success":"Try again");
	}

}
