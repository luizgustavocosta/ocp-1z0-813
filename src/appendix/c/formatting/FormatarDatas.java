package appendix.c.formatting;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FormatarDatas {

	public static void main(String[] args) throws ParseException {
		DateFormat s = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(s.format(Calendar.getInstance().getTime()));
		System.out.println(DateFormat.getDateInstance(DateFormat.LONG).format(Calendar.getInstance().getTime()));
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL).format(Calendar.getInstance().getTime()));
		
		DateFormat fUS = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		String data = "11/29/1982 05:30";
		Date source = fUS.parse(data);
		System.out.println(fUS.parse(data));
		
		DateFormat formatFull = DateFormat.getDateInstance(DateFormat.SHORT, Locale.FRANCE);
		System.out.println(formatFull.format(source));
		
		System.out.println(LocalDateTime.of(1982, Month.NOVEMBER, 29, 17, 0, 0).format(DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de',   yyyy", Locale.FRANCE)));
		System.out.println(LocalDateTime.of(1982, Month.NOVEMBER, 29, 17, 0, 0).format(DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de',   yyyy", new Locale("pt","BR"))));
		System.out.println(LocalDateTime.of(1982, Month.NOVEMBER, 29, 17, 0, 0).format(DateTimeFormatter.ofPattern("EEEE, dd 'of' MMMM 'of',   yyyy", Locale.US)));
		
		
	}
}
