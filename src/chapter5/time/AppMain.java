package chapter5.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.function.Consumer;

public class AppMain {

	public static void main(String[] args) {
		Consumer<Object> println = System.out::println;
		
		println.accept(LocalDate.now());//2017-03-06
		println.accept(LocalTime.now());//14:56:05.540
		println.accept(LocalDateTime.now());//2017-03-06T14:56:05.540
		println.accept(ZonedDateTime.now());//17-03-06T14:56:05.540+01:00[Europe/Berlin]

		println.accept(
			ZonedDateTime.now(ZoneId.of(
					ZoneOffset
					.getAvailableZoneIds()
					.stream()
					.filter(z -> z.equals("America/Sao_Paulo")).findAny().get())));
		
		println.accept(
				ZonedDateTime.now(ZoneId.of("US/Pacific")));
		
		println.accept(
				ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
		
		LocalDate ld1 = LocalDate.of(2016, Month.MARCH, 31);
		println.accept(ld1.getDayOfWeek().name());
		
		LocalDate ld2 = LocalDate.of(1982, Month.NOVEMBER, 29);
		println.accept(ld2.getDayOfWeek().name());
		
		LocalTime lt1 = LocalTime.of(23, 53, 001);
		println.accept(lt1);
		
		LocalTime lt2 = LocalTime.of(23, 53, 001, 3000);
		println.accept(lt2);

		LocalDateTime ldt1 = LocalDateTime.of(1980, Month.NOVEMBER, 18, 15, 30, 8);
		println.accept(ldt1);
		
		ZonedDateTime zdt1 = ZonedDateTime
				.of(2015, Month.AUGUST.getValue(), 15, 20, 30, 10, 500, ZoneId.of("America/Sao_Paulo"));
		println.accept(zdt1);
		
		ZoneId.getAvailableZoneIds().stream().filter(x -> x.startsWith("America")).forEach(println); 
		
	}

}
