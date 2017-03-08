package chapter3.methodref;

import java.util.ArrayList;
import java.util.List;

public class RemoverCondicionalmente {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Magician");
		list.add("Assistant");
		list.forEach(System.out::println);
		list.removeIf(s -> s.startsWith("A"));
		list.forEach(System.out::println);
		
	}
}
