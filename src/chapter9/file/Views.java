package chapter9.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Views {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get(System.getProperty("user.home")+"/Files/owner/changeOwner.txt");

		BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);
		
		System.out.println("Is path directory ->"+data.isDirectory());
		System.out.println("Is regular file ->"+data.isRegularFile());
		// Symbolic are advanced shortcuts
		//<link>https://www.howtogeek.com/howto/16226/complete-guide-to-symbolic-links-symlinks-on-windows-or-linux/</link>
		System.out.println("Is symbolic link ->"+data.isSymbolicLink());
		System.out.println("default ->"+data.isOther());
		System.out.println("Size (in bytes) ->"+data.size());
		System.out.println("Creation date/time->"+data.creationTime());
		System.out.println("Last modified date/time->"+data.lastModifiedTime());
		System.out.println("Last accessed date/time ->"+data.lastAccessTime());
		System.out.println("Unique file identifier (if available)->"+data.fileKey());
		
	}

}
