package chapter9.path;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Relativize {

	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("fish.txt");
		Path path2 = Paths.get("bird.txt");
		
		Path path3 = path1.relativize(path2);
		
		System.out.println(Paths.get(".").toRealPath());
		
		System.out.println(path1.isAbsolute());
		System.out.println(path2.getFileName());
		System.out.println(path3.getFileName());
	}

}
