package appendix.c.decimalformat;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Application {

	public static void main(String[] args) {
		double d = 45895.0;
		NumberFormat df = DecimalFormat.getInstance(new Locale("pt","BR"));
		System.out.println(df.format(d));
		
		
		//
		DecimalFormat dfSharp = new DecimalFormat("###,###.00");
		System.out.println(dfSharp.format(d));
		
		DecimalFormat dfZero = new DecimalFormat("000,000,000.0000");
		System.out.println(dfZero.format(d));
		
		DateFormat dateF = SimpleDateFormat.getDateTimeInstance(1, 1, new Locale("pt","BR")) ;
		System.out.println(dateF.format(new Date()));
		
		System.out.println(LocalDateTime.of(1982, Month.NOVEMBER, 29, 17, 0, 0).format(DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de',   yyyy", Locale.FRANCE)));
		
	}
	
}
