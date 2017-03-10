package chapter9.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CriarDiretorio {

	public static void main(String[] args) throws IOException {
		Files.createDirectories(
				Paths.get(
						System.getProperty("user.home")
							+"\\Desktop\\xpto\\another"));
		
		Files.createDirectory(Paths.get(
						System.getProperty("user.home")+"\\Desktop\\xpto\\another"));
	}

}
