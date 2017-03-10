package chapter9.questions;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Paths;

public class Q12 implements QuestionChapter9 {
	/**
	 * Which of the following methods cannot be used to obtain a Path instance?
	 * 
	 * @param args
	 * @throws URISyntaxException
	 * @throws IOException
	 */
	public static void main(String[] args) throws URISyntaxException {

		// new Path("jaguar.txt"); Path is a interface
		FileSystems.getDefault().getPath("puma.txt");
		Paths.get(new URI("cheetah.txt"));
		Paths.get("cats.txt", "lynx.txt");
		new java.io.File("tiger.txt").toPath();

		// FileSystems constructor is private
		// new FileSystems().getPath("leopard");
		// Paths.getPath("ocelot.txt");
		// getPath doesn't exist

	}
}
