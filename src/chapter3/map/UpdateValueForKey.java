package chapter3.map;

import java.util.HashMap;
import java.util.Map;

public class UpdateValueForKey {

	public static void main(String[] args) {
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Corinthians", "Basilio");
		favorites.put("Palmeiras", "Marcos");
		favorites.put("Sao Paulo", null);
		System.out.println(favorites);
		
		favorites.putIfAbsent("Corinthians", "Vampeta");
		favorites.putIfAbsent("Palmeiras", "Alex");
		favorites.putIfAbsent("Sao Paulo", "Rai");
		System.out.println(favorites);
	}

}
