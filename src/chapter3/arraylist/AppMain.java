package chapter3.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(new Integer(3));
		lista.add(new Integer(5));
		lista.forEach(System.out::println);
		lista.remove(1); // primitive indexOf
		lista.remove(new Integer(5)); // remove the object using equals
		lista.forEach(System.out::println);
	}

}
