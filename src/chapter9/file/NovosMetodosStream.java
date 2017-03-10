package chapter9.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NovosMetodosStream {

	// depth-first -> from root to an arbitrary leaf
	// breadth-first -> starts at root and processes
	// all elements of each particular depth
	public static void main(String[] args) throws IOException {
		String uri = System.getProperty("user.home");

		Path start = Paths.get(uri+"/workspace/study/busca-textual");
		//C:\Users\lzoa\workspace\study\busca-textual\src\br\com\alura\threads\Principal.java
		
		//Path start = Paths.get("../../workspace/study/busca-textual");
		//..\..\workspace\study\busca-textual\src\br\com\alura\threads\Principal.java
		
		// the contents of directory have not yet been traversed
		//Stream<Path> walk = Files.walk(start,0); //0 indicates itself
		Stream<Path> walk = Files.walk(start, Integer.MAX_VALUE);
		// Integer.MAX_VALUE is the longest path in the system

		walk.filter(
				p -> 
					p.toFile().isFile() && p.toString().endsWith(".java"))
				.forEach(System.out::println);
		walk.close();
		
//		NO_FOLLOW_LINKS is used to avoid infinite cycle
	}
}
