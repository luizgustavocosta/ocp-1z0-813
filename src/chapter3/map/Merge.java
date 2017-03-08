package chapter3.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Merge {

	public static void main(String[] args) {
		// This is rule
		BiFunction<String, String, String> mapper = 
				(v1, v2) -> v1.length() > v2.length() ? v1 : v2;
				
		Map<String, String> favorities = new HashMap<>();
		favorities.put("Jenny", "Bus Tour");
		favorities.put("Tom", "Tram");
		
		String jenny = favorities.merge("Jenny", "Skyride", mapper);
		String tom = favorities.merge("Tom", "Skyride", mapper);
		System.out.format("%-15s%-15s",jenny, tom);
	}

}
