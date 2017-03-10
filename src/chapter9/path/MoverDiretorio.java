package chapter9.path;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MoverDiretorio {

	public static void main(String[] args) throws FileNotFoundException, IOException, URISyntaxException {
		
		Files.copy(
				Paths.get(System.getProperty("user.home")+"\\Files"), 
				Paths.get(System.getProperty("user.home")+"\\Files\\Mais"));
		
		Files.move(
				Paths.get(System.getProperty("user.home")+"\\Files"), 
				Paths.get(System.getProperty("user.home")+"\\New Files"));
	}

}
