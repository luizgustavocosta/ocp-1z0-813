package chapter3.searchandsorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortRabbits {

static class Rabbit{int id;}	
	
	public static void main(String[] args) {
		List<Rabbit> rabbits = new ArrayList<>();
		rabbits.add(new Rabbit());
		Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
		
		Collections.sort(rabbits, c);
		
		// Trick code
		List<String> names = Arrays.asList("Fluffy", "Hoppy");
		Comparator<String> comp = Comparator.reverseOrder();//Reverse natural order
		int index = Collections
				.binarySearch(names, "Hoppy", comp); // Requires the list in ascending order
		System.out.println(index); // Undefined result, because reverse/natural
		
		//Set<Rabbit> rabbitWithoutComparable = new TreeSet<>();
//		rabbitWithoutComparable.add(new Rabbit());
		
		Set<Rabbit> rabbit = new TreeSet<>(new Comparator<Rabbit>(){

			@Override
			public int compare(Rabbit o1, Rabbit o2) {
				return o1.id - o2.id;
			}
		});
		
		rabbit.add(new Rabbit());
		
		
	}

}
