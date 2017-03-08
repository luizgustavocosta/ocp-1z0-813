package chapter5.questions;

import java.util.Locale;
import java.util.ResourceBundle;

public class Q5 {

	// Suppose that we have the following property files and code.
	// Which bundles are used on lines 8 and 9 respectively.
	public static void main(String[] args) {
		Locale fr = new Locale("fr");
		Locale.setDefault(new Locale("en","US"));
		ResourceBundle rb = ResourceBundle.getBundle("Dolphins", fr);
		//System.out.println(rb.getString("name")+" "+rb.getString("age"));
		System.out.println(rb.getString("name")+" "+rb.getString("age"));
		
	}

}
