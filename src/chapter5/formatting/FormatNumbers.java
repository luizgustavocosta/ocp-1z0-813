package chapter5.formatting;

import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormatNumbers {

	public static void main(String[] args) throws ParseException {
		int attendeesPerYear = 3_200_000;
		int attendeesPerMonth = attendeesPerYear/12;
		
		NumberFormat us = NumberFormat.getInstance(Locale.US);
		System.out.println(us.format(attendeesPerMonth));
		
		NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
		System.out.println(fr.format(attendeesPerMonth));
		
		Locale localeBR = new Locale("pt","BR");
		NumberFormat ptBR = NumberFormat.getInstance(localeBR);
		System.out.println(ptBR.format(attendeesPerMonth));
		
		NumberFormat es = NumberFormat.getInstance(localeBR);
		
		double price = 480_458.98;
		String priceForSpain = "48d0458,98";
		DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance(Locale.US);
		DecimalFormatSymbols dfsPtBR = DecimalFormatSymbols.getInstance(localeBR);
		DecimalFormatSymbols dfsEuro = DecimalFormatSymbols.getInstance(Locale.FRANCE);
		DecimalFormatSymbols dfsSpain = DecimalFormatSymbols.getInstance(new Locale("es","ES"));
		
		System.out.format("%10s%s\n%10s%s\n%10s%s\n%10s%s", 
				dfs.getCurrencySymbol(), us.format(price), 
				dfsPtBR.getCurrencySymbol(), ptBR.format(price),
				dfsEuro.getCurrencySymbol(), fr.format(price),
				dfsSpain.getCurrencySymbol(), es.format(es.parse(priceForSpain).doubleValue()));
		
		String amount = "$480,458.98";
		NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.US);
		double value = (double) cf.parse(amount);
		System.out.println("\nvalue from amount ->"+value);
	}
}
