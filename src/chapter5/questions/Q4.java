package chapter5.questions;

import java.util.Locale;
import java.util.ResourceBundle;

public class Q4 {

	// Assume that all bundes mentioned in the answers exist and define the same keys.
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en","US"));
		ResourceBundle rb = ResourceBundle.getBundle("Dolphins");
		System.out.println(rb.getString("name"));
		
	}

}
