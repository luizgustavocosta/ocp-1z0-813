package chapter9.questions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q18 implements QuestionChapter9 {

	/**
	 * Assuming the directories and files referenced here all exist
	 * and are accessible within the file system, what is the result of 
	 * the following code?
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//Procura na raiz do SO Paths.get("/lizard/") c:\lizard
		Path path = Paths.get("/lizard/./").resolve(Paths.get("walking.txt"));
		Path path2 = new File("/lizard/./../actions/").toPath();
		
		System.out.println(Files.isSameFile(path, path2));
		System.out.println(" "+path.equals(path2));
		System.out.println(path.normalize().equals(path2.normalize()));
		
	}
}
