package chapter9.questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Q10 implements QuestionChapter9 {
	/**
	 * What is correct about the following code snippet?
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		//Files.readAllLines(Paths.get(userHome + "/monkey.txt")).forEach(System.out::println);
		Path move;
		try {
			// Wrong ... because animals is a path not a file 
			move = Files.move(Paths.get(userHome + "/monkey.txt"), Paths.get(userHome +"/animals.txt"),
					StandardCopyOption.REPLACE_EXISTING, LinkOption.NOFOLLOW_LINKS);
			System.out.println(move.getFileName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
