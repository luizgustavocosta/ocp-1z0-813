package appendix.c.questions;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Q5 {

	/**
	 * What is the result of applying the Files.walkFileTree() method to the
	 * current directory and an instance of the following FileVisitor class?
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Path start = Paths.get("C:\\Users\\lzoa\\Downloads");
		Files.walkFileTree(start, new FilePrinter());
	}

}
class FilePrinter implements FileVisitor<Path>{

	@Override
	public FileVisitResult postVisitDirectory(Path arg0, IOException arg1) throws IOException {
		return FileVisitResult.TERMINATE;
	}

	@Override
	public FileVisitResult preVisitDirectory(Path arg0, BasicFileAttributes arg1) throws IOException {
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.out.format("%s %s%n","Found file:", file.getFileName());
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path arg0, IOException arg1) throws IOException {
		return FileVisitResult.CONTINUE;
	}
	
}