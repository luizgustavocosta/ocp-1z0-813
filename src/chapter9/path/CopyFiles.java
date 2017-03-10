package chapter9.path;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFiles {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String fileNameOutput = "output-data.txt"; 
		System.out.println();
		Path path = Paths.get(
				Paths.get(".").toRealPath().toString(),
				"src","chapter9","path",
				"source-data.txt");
		
		Path pathBirds = Paths.get(
				Paths.get(".").toRealPath().toString(),
				"src","chapter9","path",
				"birds.txt");
		
		try(InputStream is = new FileInputStream(path.toFile());
				OutputStream out = new FileOutputStream(fileNameOutput)) {
			//Copy stream data to file
			//Files.copy(is, Paths.get("C:\\Users\\lzoa\\Files\\"+fileNameOutput));
			
			System.out.println(Files.copy(pathBirds, out));
		}
	}
}
