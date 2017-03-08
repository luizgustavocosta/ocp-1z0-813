package chapter3.collections.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class ComparingMaps {

	public static void main(String[] args) {
		Map<String, String> tryHashMap = new HashMap<>();
		tryHashMap.put("koala", "bamboo");
		tryHashMap.put("lion", "meat");
		tryHashMap.put("giraffe", "leaf");
		String food = tryHashMap.get("koala");
		for (String key : tryHashMap.keySet()) {
			System.out.print(tryHashMap.get(key)+", ");
		}
		System.out.println("********");
		Map<String, String> tryMap = new TreeMap<>(); // Arvore balanceada
		tryMap.put("koala", "bamboo");
		tryMap.put("lion", "meat");
		tryMap.put("giraffe", "leaf");
		
		for (String key : tryMap.keySet()) {
			System.out.print(tryMap.get(key)+", ");
		}
		System.out.println("********");
		Map<String, String> tryHashtable = new Hashtable<>(); // Unused
		tryHashtable.put("koala", "bamboo");
		tryHashtable.put("lion", "meat");
		tryHashtable.put("giraffe", "leaf");
		for (String key : tryHashtable.keySet()) {
			System.out.print(tryHashtable.get(key)+", ");
		}
	}
}
