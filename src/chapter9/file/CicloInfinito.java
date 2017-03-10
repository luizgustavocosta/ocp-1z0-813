package chapter9.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class CicloInfinito {

	public static void main(String[] args) {
		String uri = System.getProperty("user.home");

		Path start = Paths.get(uri + "/Files/infinite");

		long dataFilter = 1420070400000l;//2015-01-01

		try {
			Stream<Path> stream = Files.find(start, 10,
					(p, a) -> !p.toString().endsWith(".doc") && a.lastModifiedTime().toMillis() > dataFilter);
			stream.forEach(System.out::println);
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Stream<Path> walk = Files.walk(start);
			walk.forEach(System.out::println);
			walk.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
