package chapter9.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class AtributosEmArquivos {

	public static void main(String[] args) throws IOException {
		Path shortCut = Paths.get("C:\\Users\\lzoa\\Desktop\\startup.bat - Shortcut");
		
		System.out.println(
				Files.isSymbolicLink(shortCut)+ " "
				+Files.isDirectory(shortCut)+ " "
				+Files.isReadable(shortCut)+ " ");
//				+Files.isHidden(shortCut)+ " ");
		
		Path hiddenFile = Paths.get("C:\\Users\\lzoa\\Desktop\\songs.txt");
		
		System.out.println(
				"Hidden ->"
						+Files.isHidden(hiddenFile)
				+"Readable ->"
						+Files.isReadable(hiddenFile)
				+"Size ->"
					+Files.size(hiddenFile)/100d);
		
		Path executable = Paths.get("C:/Program Files/PDFCreator/PDFCreator.exe");
		System.out.println(
				Files.isExecutable(executable)
				+"-"+Files.isReadable(executable));
		
		FileTime lastModifiedTime = Files.getLastModifiedTime(hiddenFile);
		System.out.println(lastModifiedTime.toInstant());
		
		Date date = new Date(System.currentTimeMillis());
		LocalDateTime ofInstant = LocalDateTime.ofInstant(
				lastModifiedTime.toInstant()
				,ZoneId.of("CET"));
		System.out.println(date+"\n"+ofInstant);
		
		Files.setLastModifiedTime(
				Paths.get(System.getProperty("user.home")
						+"/Files/newestFile.txt"),
				FileTime.from(Instant.now().plus(Period.of(0, 0, 2))));
		
	}
}
