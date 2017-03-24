package appendix.c.formatting;

import java.text.DecimalFormat;
import java.util.function.Consumer;

public class FormatarNumeros {

	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::println;
		// # Means to ommit the position if no digit exist for it.
		// 0 Means to put a 0 in the position if no digit exists for it.
		double d = 1_234_567.437;
		
		DecimalFormat dfSharp = new DecimalFormat("###,###.##");
		print.accept(dfSharp.format(d));
		
		DecimalFormat dfZero = new DecimalFormat("000,000,000.0000");
		print.accept(dfZero.format(d));
		
		DecimalFormat dfTres = new DecimalFormat("R$ #,###.##");
		print.accept(dfTres.format(d));
	}

}
