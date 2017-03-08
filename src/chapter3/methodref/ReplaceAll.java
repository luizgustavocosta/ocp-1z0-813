package chapter3.methodref;

import java.util.Arrays;
import java.util.List;

public class ReplaceAll {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(2,3,4,5);
		System.out.println(numeros);
		numeros.replaceAll(x-> x*2);
		System.out.println(numeros);
	}

}
