package chapter3.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class ArvoreExample {

	public static void main(String[] args) {
		// Numbers implement the Comparable interface
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(12);
		numbers.add(2);
		numbers.add(5);
		numbers.add(3);
		numbers.add(6);
		numbers.add(17);
		numbers.add(8);
		numbers.add(9);
		numbers.add(11);
//		numbers.forEach(System.out::print);
		
		TreeSet<Integer> treeNumbers = (TreeSet<Integer>) numbers;
		Integer floor = treeNumbers.floor(6);
		System.out.println(floor);
		Integer lower = treeNumbers.lower(-6);
		System.out.println(lower);
		System.out.println(treeNumbers.ceiling(17));
		System.out.println(treeNumbers.higher(8));
		
	}

}
