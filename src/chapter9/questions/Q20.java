package chapter9.questions;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q20 implements QuestionChapter9 {

	/**
	 * Assuming the current directory is /seals/harp/food
	 * what is the result of executing the following code?
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//C:\Users\{user.name}\git\ocp-1z0-813
		final Path path = Paths.get(".").normalize();
		int count = 0;
		for (int i = 0; i < path.getNameCount(); i++) {
			count++;
		}
		System.out.println(count);
	}
}
