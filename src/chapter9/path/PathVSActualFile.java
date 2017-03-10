package chapter9.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathVSActualFile {
	// Path aren't file but a representation of location within the file system.
	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\lzoa\\Downloads\\Palestras\\Palestra_Ecossistema Elasticsearch.pptx");
		
		for (int i=0; i<path.getNameCount(); i++) {
			System.out.println(path.getName(i)+" "+path.getRoot()+" "+path.getFileSystem().getSeparator());
		}
	}

}
