package chapter3.bounds;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> keyWords = new ArrayList<>();
		keyWords.add("java");
		printList(keyWords);
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(new Integer(42));
		
		List<?> listOfObjects = numbers;
		
		Integer[] numeros = {new Integer(42)};
		Object[] objects = numeros;
		objects[0] = "forty two";
		
	}

	private static void printList(List<?> keyWords) {
		for (Object object : keyWords) {
			System.out.println(object);
		}
	}
	
	<X> void method5(List<? super B> list){
		
	}

}
