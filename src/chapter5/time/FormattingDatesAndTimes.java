package chapter5.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.function.Consumer;

public class FormattingDatesAndTimes {

	static Consumer<Object> print = System.out::println;
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.now();
		
		print.accept(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		print.accept(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		print.accept(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter longDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter fullDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
				.withLocale(new Locale("pt","BR"));
		print.accept(dateTime.format(shortDateTime));
		print.accept(dateTime.format(mediumDateTime));
		print.accept(dateTime.format(longDateTime));
		print.accept(dateTime.format(fullDateTime.withLocale(new Locale("ca","ES"))));
		
		// If you dont want to use one of the predefined formats
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm")
				.withLocale(new Locale("pt","BR"));
		System.out.println(dateTime.format(f));
		
	}

}
