package chapter3.generics;

public class Syntax {

	public static void main(String[] args) {
		
		Crate.<String>ship("AnyValue");
		
		Crate.<String[]>ship(args);

	}

}
