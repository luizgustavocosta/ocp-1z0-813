package chapter5.time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.function.Consumer;

public class WorkingWithInstant {

	public static void main(String[] args) throws InterruptedException {
		Consumer<Object> consumer = System.out::println;
		if (args.length > 0) differenceBetweenNowAndAfter(consumer);
		
		LocalDate date = LocalDate.of(2015, Month.MAY.getValue(), 25);
		LocalTime time = LocalTime.of(11, 55);
		ZoneId zone = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime zdt = ZonedDateTime.of(date, time, zone);
		Instant instant = zdt.toInstant();
		System.out.format("%-10s%s","Instant->",instant); // TimeZone Local
		System.out.format("\n%-10s%s\n","ZoneId->",zdt); // TimeZone declared
		
		Instant instante = Instant.now();
		Instant nextDay = instante.plus(1, ChronoUnit.DAYS);
		consumer.accept(nextDay);
		Instant nextHour = instante.plus(1, ChronoUnit.HOURS);
		consumer.accept(nextHour);
		// Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Weeks
		// Instant nextWeek = instante.plus(1, ChronoUnit.WEEKS);
		// consumer.accept(nextWeek); 
	}

	@SuppressWarnings("static-access")
	private static void differenceBetweenNowAndAfter(Consumer<Object> consumer) throws InterruptedException {
		Instant now = Instant.now();
		Thread.currentThread().sleep(125);
		Instant later = Instant.now();
		
		Duration duration = Duration.between(now, later);
		consumer.accept(duration.toMillis());
	}

}
