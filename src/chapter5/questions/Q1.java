package chapter5.questions;

import java.util.Locale;

public class Q1 {

	// Which of the following creates valid locales, assuming that the language
	// and country codes follow standard conventions
	public static void main(String[] args) {
		Locale locale = new Locale("hi");
		//Locale locale = new Locale("hi","IN);
		System.out.println(locale.getDisplayLanguage());
	}

}
