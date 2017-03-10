package chapter9.questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q7 implements QuestionChapter9 {
	/**
	 * If the current working directory is /zoo and the path /zoo/turkey
	 * does not exist, then what is the result of executing the following code?
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//
		Path path = Paths.get(userHome+"/turkey");
		if (Files.isSameFile(path, Paths.get("/zoo/turkey")))
			Files.createDirectory(path.resolve("info"));
				
	}
}
