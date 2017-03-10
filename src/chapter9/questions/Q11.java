package chapter9.questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Q11 implements QuestionChapter9 {
	/**
	 * For the copy() method shown here, assume that the source exists as regular
	 * file and that the target does not. What is the result of
	 * the following code?
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		try {
			// Wrong ... because animals is a path not a file 
			Path path1 = Paths.get("./goat.txt").normalize();
			// path 1 is: C:\Users\{user}\git\ocp-1z0-813\goat.txt
			path1 = Paths.get("src/chapter9/questions").resolve(path1);
			// after resolve..the path is
			//C:\Users\{user}\git\ocp-1z0-813\src\chapter9\questions\goat.txt
			
			System.out.println(path1.toAbsolutePath().toString());
			Path path2 = Paths.get("mule.png").normalize();
			
			Files.copy(path1, path2, StandardCopyOption.COPY_ATTRIBUTES);//k2
			System.out.println(Files.isSameFile(path1, path2));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
