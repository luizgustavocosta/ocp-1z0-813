package appendix.c.directories;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class LerDiretorios {

	public static void main(String[] args) throws IOException {
		Path dir = Paths.get("C:\\Users\\lzoa");
		// Used to visit the contents of a single directory...
		DirectoryStream<Path> directoryStream  = Files.newDirectoryStream(dir);
		//stream.forEach(System.out::println);
		directoryStream.close();
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
			/*for (Path element : stream) {
				System.out.println(element.getFileName() +"\t"+Files.isDirectory(element));
			}*/
		}
		
		// Is used to visit an entire directory tree.
		Path start = Paths.get("C:\\Users\\lzoa");

		Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
	         @Override
	         public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
	         {
	             //Files.delete(file);
	        	 try {
		        	 System.out.println(file.getFileName());
		             return FileVisitResult.CONTINUE;					
				} catch (Exception e) {
					System.out.format("Excecao %s no diretorio %s", e.getMessage(), file);
					return FileVisitResult.CONTINUE;
				}

	         }
	         @Override
	         public FileVisitResult postVisitDirectory(Path dir, IOException e)
	         {
	        	 try {
	        		 if (e == null) {
		                 ///Files.delete(dir);
		            	 System.out.println(dir);
		                 return FileVisitResult.CONTINUE;
		             } else {
		                 // directory iteration failed
		                 //throw e;
		            	 return FileVisitResult.CONTINUE;
		             }	
				} catch (Exception e2) {
					System.out.format("Excecao %s no diretorio %s", e.getMessage(), dir);
					return FileVisitResult.CONTINUE;
				}
	             
	         }
	     });
	}

}
