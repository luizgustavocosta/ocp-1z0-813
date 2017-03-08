package chapter4.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q7 {

	// We have a methods that returns a sorted list without changing the original.
	// Wich of the following can replace the method implementation to do 
	// the same with stream?
	// Me - 3 (After stream doesnt exists the method compare/compareTo, 
    //	    6 (Sorted + collect with parameters)
	// Correct - 6  (sorted has 2 ways: 1 without param and with param)
	//				and collect is required have arguments
	public static void main(String[] args) {
		List<String> list = Arrays.asList("B","D","A","C");
		List<String> original = original(list);
		System.out.println(original);
		original = one(list);
		original = two(list);
		original = three(list);
		original = four(list);
		original = five(list);
		original = six(list);
		System.out.println(original);
	}

	private static List<String> six(List<String> list) {
		return list.stream()
			.sorted((a,b)-> b.compareTo(a))
			.collect(Collectors.toList());
	}

	private static List<String> five(List<String> list) {
		//list.stream().sorted().collect();
		return null;
	}

	private static List<String> four(List<String> list) {
		//list.stream().com
		return null;
	}

	private static List<String> three(List<String> list) {
		//return list.stream().com;
		return null;
	}

	private static List<String> two(List<String> list) {
		return null;
	}

	private static List<String> one(List<String> list) {
		//return list.stream().com;
		return null;
	}

	private static List<String> original(List<String> list) {
		List<String> copy = new ArrayList<>(list);
		Collections.sort(copy, (a,b) -> b.compareTo(a));
		return copy;
	}

}
