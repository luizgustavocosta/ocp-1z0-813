package chapter9.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathFilePathTest {

	public static void main(String[] args) {
		printPathInformation(Paths.get("C:\\Users\\lzoa\\Desktop\\alquiler.txt"));
		printPathInformation(Paths.get("\\Users\\lzoa\\Desktop\\alquiler.txt"));
	}

	private static void printPathInformation(Path path) {
		System.out.format("%-20s%s","Is absolute path?", path.isAbsolute());
		System.out.format("\n%-20s%s","File name is", path.getFileName());
		System.out.format("\n%-20s%s\n","Root is", path.getRoot());
		
		Path currentParent = path;
		while((currentParent=currentParent.getParent()) != null){
			System.out.println("Current parent is "+currentParent);
		}
		
		System.out.println(path.subpath(1, 1));
		System.out.println();
	}
}
