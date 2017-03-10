package chapter9.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LerEscreverArquivo {

	public static void main(String[] args) throws IOException {
		// Read
		Path pathRead = Paths.get(System.getProperty("user.home") + "/Files/novoArquivo.txt");
		try (BufferedReader reader = Files.newBufferedReader(pathRead, Charset.forName("UTF-8"))) {// US-ASCII
			String currentLine = null;
			while ((currentLine = reader.readLine()) != null) {
				currentLine.toLowerCase();
			}
		}

		// Write
		Path pathWriter = Paths.get(System.getProperty("user.home") + "/Files/newestFile.txt");
		try (BufferedWriter writer = Files.newBufferedWriter(pathWriter, Charset.forName("UTF-16"))) {
			BufferedReader newBufferedReader = Files.newBufferedReader(pathRead, Charset.forName("UTF-8"));
			String currentLine = null;
			int i = 0;
			while ((currentLine = newBufferedReader.readLine()) != null) {
				writer.write(++i + currentLine + "\n");
			}
		}
		
		//Read all lines
		final List<String> lines = Files.readAllLines(pathRead);
		System.out.println("Reading all lines");
		for (String line : lines) {
			System.out.println(line);
		}
	}
}
