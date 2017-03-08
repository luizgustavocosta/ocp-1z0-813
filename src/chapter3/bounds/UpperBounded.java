package chapter3.bounds;

import java.util.Arrays;
import java.util.List;

public class UpperBounded {

	public static void main(String[] args) {
		
		List<? extends Number> list = 
				Arrays.asList(34,34,36,74,78);
		System.out.format("%10d",total(list));
		
		// You can't add this element to list
		//Number x = new Integer(1982);
		//list.add(x);
	}
	
	public static long total(List<? extends Number> list){
		long count = 0;
		for (Number number : list) {
			count+=number.longValue();
		}
		return count;
	}

}
