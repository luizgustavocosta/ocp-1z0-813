package chapter3.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("First");
		list.add(1, "Second");
		String elementAtIndex = list.get(1);
		int indexOf = list.indexOf("First");
		int lastIndexOf = list.lastIndexOf("First");
		
		boolean remove = list.remove("Second");
		String oldElement = list.set(0, "New Second");
		System.out.println("Old element ["+oldElement+"]");
		for (String element : list) {
			System.out.println(element);
		}
		
		Iterator it = list.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		
	}

	private static void clearMethod() {
		final List<String> listaFinal = Arrays.asList("A","B","C","D");
		for (String string : listaFinal) {
			System.out.format("%s",string);
		}
		listaFinal.clear();
		for (String string : listaFinal) {
			System.out.format("%s",string);
		}
	}

}
