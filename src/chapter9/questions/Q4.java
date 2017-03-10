package chapter9.questions;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q4 implements QuestionChapter9 {

	/**
	 * If the current working directory is /user/home, then what is the
	 * output of the following code?
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/zoo/animals/bear/koala/food.txt");
		// path.subpath(1, 3)
		// 	animals/bear
		// getName(1)
		// 	bear
		// toAbsolutePath
		// 	/user/home/bear
		System.out.println(path.subpath(1, 3).getName(1).toAbsolutePath());
	}
}
