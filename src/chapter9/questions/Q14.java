package chapter9.questions;

import java.io.File;
import java.io.IOException;

public class Q14 implements QuestionChapter9 {

	public static void main(String[] args) throws IOException {
		new File("").listFiles();
		
//		Files.walk(); returns a Stream<Path>
//		Files.find(); returns a Stream<Path>
//		Files.files files doesn't exists
//		Files.list(); returns a Stream<Path>
//		Files.lines(); returns a Stream<String>
	}
}
