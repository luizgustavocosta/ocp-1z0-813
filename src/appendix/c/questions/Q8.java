package appendix.c.questions;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

public class Q8 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Rich
		int _million = 1_000_000;
		//double aThousand = 1_000_.00;
		//double 100 = 100;
		//int hundred = 100.00;
		//float ten = 10d;
		short one = 1;
		DecimalFormat df = new DecimalFormat("##,###.00");
		System.out.println(df.format(_million + one));
	}

}
