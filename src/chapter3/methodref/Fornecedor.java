package chapter3.methodref;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		Supplier<ArrayList> methodRef4 = ArrayList::new;
		Supplier<ArrayList> lambda = () -> new ArrayList();
		System.out.println(lambda.get().add("Guga"));
		
	}

}
