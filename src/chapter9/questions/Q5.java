package chapter9.questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q5 implements QuestionChapter9 {
	/**
	 * Assuming /kang exists as a symbolic link to directory
	 * /mammal/kangaroo within the file system. Which of the following
	 * statements are correct about this code snippet?
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/kang");
		if (Files.isDirectory(path) && Files.isSymbolicLink(path))
			Files.createDirectory(path.resolve("joey"));
	}
	/**
	 * Path +resolve
	 * Converts a given path string to a Path and resolves it against 
	 * this Path in exactly the manner specified by the resolve method. 
	 * For example, suppose that the name separator is "/" and a path represents 
	 * "foo/bar", then invoking this method with the path string "gus" will result 
	 * in the Path "foo/bar/gus".
	 */
}
