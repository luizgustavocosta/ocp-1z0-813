package chapter5.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class ZooOpen {

	public static void main(String[] args) {
		Locale us = new Locale("en","US");
		Locale es = new Locale("es");
		Locale pt = new Locale("pt","BR");
		Locale cat = new Locale("ct");
		if (args.length > 0){
			printProperties(us);
			printProperties(es);
			printProperties(pt);
		}
		printProperties(pt);
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", cat);
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("name"));
		
		System.out.println(
				MessageFormat.format(rb.getString("goal"),"Ronaldinho"));
		// Inside Zoo_ct.java
		// {"goal","The goals was scored by {0} player"}
	}

	private static void printProperties(Locale locale) {
		ResourceBundle rb = ResourceBundle.getBundle("zoo", locale);
		System.out.println(rb.getString("name"));
		
		/*rb.keySet()
			.stream().map(k-> k + "-" + rb.getString(k))
				//.collect(Collectors.toList())
				.forEach(System.out::println);
		//System.out.println(rb.getString("hello"));
		//System.out.println(rb.getString("open"));*/
		
		
		
		Properties props = new Properties();
		rb.keySet().stream().forEach(k-> props.put(k, rb.getString(k)));
		
		System.out.println("From properties{"+props.get("hello")+"}");
	}

}
