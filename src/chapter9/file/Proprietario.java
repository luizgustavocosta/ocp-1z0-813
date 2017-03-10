package chapter9.file;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;
import java.util.function.Consumer;

public class Proprietario {

	public static void main(String[] args) throws IOException {
		Consumer<Object> p = System.out::println;
		UserPrincipal owner =
				FileSystems.getDefault().getUserPrincipalLookupService()
				.lookupPrincipalByName("lzoa");
		p.accept(owner);

		try {
			Path path = Paths.get(System.getProperty("user.home")+"/Files/owner/changeOwner.txt");
			System.out.println(Files.getOwner(path).getName());
			
			//Change owner of file
//			UserPrincipal proprietario = path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName("BUILTIN\\Administrators");
//			Files.setOwner(path, proprietario);
			
			Path executable = Paths.get("C:/Program Files/PDFCreator/PDFCreator.exe");
			System.out.println(Files.getOwner(executable).getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
