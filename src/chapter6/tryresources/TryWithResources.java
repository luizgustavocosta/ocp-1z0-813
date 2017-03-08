package chapter6.tryresources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryWithResources {

	public static void main(String[] args) throws IOException {
		Path pathFrom = Paths.get("C:/Users/lzoa/workspace/study/1z0-813/src/chapter6/tryresources/", "arquivo1.txt");
		Path pathTo = Paths.get("C:/Users/lzoa/workspace/study/1z0-813/src/chapter6/tryresources/", "arquivo2.txt");
		
		//Path newPath = Paths.get("C:/Users/lzoa/temp", "novoArquivo.txt");
		newApproach(pathFrom, pathTo);
	}

	private static void newApproach(Path pathFrom, Path pathTo) {
		try (BufferedReader in = Files.newBufferedReader(pathFrom);
				BufferedWriter out = Files.newBufferedWriter(pathTo)) {
			out.write(in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
