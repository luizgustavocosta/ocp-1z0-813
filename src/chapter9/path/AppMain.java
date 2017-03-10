package chapter9.path;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AppMain {

	// Files and Path are equal with fewer differences.
	// 1. The Path interface contains support for symbolic links.
	// A symbolic links are transparent to the user, as the operating system takes care of 
	// resolving the reference to  the actual fiel.
	// Interface works with 3 different ways
	// Path /home/something - Dont start with a letter
	// Absolute Path - c:\abc\defg
	// Relative   ..\..\etc\passwd
	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\lzoa\\Desktop\\startup.bat - Shortcut");
		path.forEach(line -> System.out.println(line));
		
		Iterable<Path> rootDirectories = FileSystems.getDefault().getRootDirectories();
		rootDirectories.forEach(System.out::println);
	}

}
