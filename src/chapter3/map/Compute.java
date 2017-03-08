package chapter3.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Compute {

	public static void main(String[] args) {
		int key = 2;
		switch (key) {
		case 1:
			computeIfPresent();	
			break;
		case 2:
			computeIfAbsent();
			break;
		default:
			break;
		}
	}

	private static void computeIfAbsent() {
		Map<String, Integer> counts = new HashMap<>();
		counts.putIfAbsent("Jenny", 15);
		counts.putIfAbsent("Tom", null);
		counts.putIfAbsent("Jonhy", null);

		Function<String, Integer> function = (k) -> 1; // Se nao tiver valor, atribua 1
		
		counts.computeIfAbsent("Jenny", function);
		counts.computeIfAbsent("Tom", function);
		
		counts.computeIfPresent("Gustavo", (k,v) -> v + 10);
		counts.computeIfAbsent("Jonhy", (v) -> 10);
		
		System.out.println(counts);
	}

	private static void computeIfPresent() {
		Map<String, Integer> counts = new HashMap<>();
		counts.putIfAbsent("Corinthians", 1);
		counts.putIfAbsent("Palmeiras", -1);

		BiFunction<String, Integer, Integer> function = (k, v) -> v + 1;
		
		Integer timao = counts.computeIfPresent("Corinthians", function);
		Integer palmeiras = counts.computeIfPresent("Palmeiras", function);
		Integer linense = counts.computeIfPresent("Linense", function);
		System.out.println("Mundiais do Corinthians ["+timao+"]");
		System.out.println("Mundiais do Palmeiras ["+palmeiras+"]");
		System.out.println("Mundiais do Linense ["+linense+"]");
	}

}
