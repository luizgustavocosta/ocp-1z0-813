package appendix.c.formatting;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class FormatarDatas {

	public static void main(String[] args) {
		DateFormat s = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(s.format(Calendar.getInstance().getTime()));
		System.out.println(DateFormat.getDateInstance(DateFormat.LONG).format(Calendar.getInstance().getTime()));
		System.out.println(DateFormat.getDateInstance(DateFormat.FULL).format(Calendar.getInstance().getTime()));
		
		
		ArrayBlockingQueue<String> a;
		LinkedBlockingDeque<String> b;
		ConcurrentLinkedQueue<String> x;
//		Thread.on
	}
}
