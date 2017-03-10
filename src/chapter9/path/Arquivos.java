package chapter9.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		System.out.println("--init--");
		Path source = Paths.get("C:/Users/lzoa/Downloads/W-0286LX_ES.pdf");
		Path target = Paths.get("C:/Users/lzoa/Desktop/apto.pdf");
		Path files = Files.copy(source, target);
		files.forEach(System.out::println);
		System.out.println("--end--");
	}

}
