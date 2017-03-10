package chapter9.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class ViewAndWrite {

	//So e  possivel alterar a data de modificacao
	public static void main(String[] args) throws IOException {
		Path path = Paths.get(System.getProperty("user.home")+"/Files/owner/changeOwner.txt");

		BasicFileAttributeView view = 
				Files.getFileAttributeView(path, BasicFileAttributeView.class);

		BasicFileAttributes data = view.readAttributes();
		
		System.out.println(data.lastModifiedTime().toMillis());
		
		FileTime lastModifiedTime = FileTime.fromMillis(
				data.lastModifiedTime().toMillis()+10_000);
		
		view.setTimes(lastModifiedTime, null, null);
		
		System.out.println(view.readAttributes().lastModifiedTime().toMillis());
		
		
		
	}

}
