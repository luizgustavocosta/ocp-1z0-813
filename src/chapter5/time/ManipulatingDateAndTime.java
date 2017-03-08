package chapter5.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.function.Consumer;

public class ManipulatingDateAndTime {

	public static void main(String[] args) {
		Consumer<Object> imprimir = System.out::println;
		
		LocalDate date = LocalDate.of(2016, Month.MARCH, 31);
		LocalTime time = LocalTime.of(23, 53);
		LocalDateTime gustavosBorn = LocalDateTime.of(date, time);
		imprimir.accept(gustavosBorn);
		//Duration duration  = Duration.of(365, ChronoUnit.HOURS);
		System.out.println(gustavosBorn.plus(120, ChronoUnit.DAYS));		
		
		LocalDateTime ld1 = LocalDateTime.now().minus(5, ChronoUnit.HOURS).minus(40, ChronoUnit.MINUTES);
		imprimir.accept(ld1);
		
		LocalDateTime visto = LocalDateTime.now().plus(20, ChronoUnit.DAYS);
		imprimir.accept(visto);
	}

}
