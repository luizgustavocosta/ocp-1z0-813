package appendix.c.directories;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class RealScenario {

	public static void main(String[] args) throws IOException {
		Stream<Path> walk = Files.walk(Paths.get("C:\\Users\\lzoa\\Downloads"), Integer.MAX_VALUE, 
				FileVisitOption.FOLLOW_LINKS);
		
		walk
			//.limit(100)
			.filter(f -> f.toFile().getName().endsWith("txt"))
			.forEach(p-> System.out.println("Found file:"+p.toAbsolutePath()));
		walk.close();
		
		// Study more about flatMap, groupingBy, Collectors
	}

}
