package chapter5.l10n;

import java.text.ParseException;
import java.util.Locale;

public class L10N {

	public static void main(String[] args) throws ParseException {
		System.out.println(Locale.getDefault());
		
		Locale localeIndia = new Locale("hi","IN");
		System.out.println(localeIndia.getDisplayName());

		// Bad but no illegal
		Locale localeBrazil = 
				new Locale.Builder().setLanguage("pt").setRegion("BR").build();
		
		System.out.println(localeBrazil.getCountry());
		
		
	}

}
