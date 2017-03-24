package chapter5.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FromMichaelNascimento {

	public static void main(String[] args) {
		YearMonth of = YearMonth.of(2016, 03);
		System.out.println(of.getMonthValue());
		
		/*ForkJoinPool commonPool = ForkJoinPool.commonPool();
		commonPool.execute(()-> {
			System.out.println("Fim");
		});*/
		
		LocalDate parse = LocalDate.parse("29-11-1982", 
				DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		System.out.println(parse);
		
		 ZonedDateTime atZone = Instant.now().atZone(ZoneId.of("America/Sao_Paulo"));
		 
		
	}

}
