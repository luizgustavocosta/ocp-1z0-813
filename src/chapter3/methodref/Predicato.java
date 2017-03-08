package chapter3.methodref;

import java.util.function.Predicate;

public class Predicato {

	public static void main(String[] args) {
		String find = "word";
		String str = "word";
		Predicate<String> methodRef = str::startsWith;
		Predicate<String> lamda2 = s -> str.startsWith(find);
	}
}
