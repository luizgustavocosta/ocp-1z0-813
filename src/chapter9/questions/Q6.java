package chapter9.questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q6 implements QuestionChapter9 {
	/**
	 * Given that /animals is a directory that exists and it is empty,
	 * what is the result of the following code?
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Path path = Paths.get(userHome+"/Files/questions/animals");
		boolean myBoolean = Files.walk(path)
				// will not compile
				// filter expect a Predicate and not a BiPredicate
				// and isDirectory belongs to Files not to Path
				//.filter((p,a) -> a.isDirectory() && !path.equals(p))//w1
				.findFirst().isPresent();//w2
		System.out.println(myBoolean ? "No Sub-directory" : "Has Sub-directory");
				
	}
}
