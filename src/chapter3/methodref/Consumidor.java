package chapter3.methodref;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		Consumer<List<String>> consumer = Collections::sort;
		consumer.accept(Arrays.asList("Vanessa","Luiz","Gustavo"));
		Consumer<List<String>> lamda1 = l -> Collections.sort(l);
	}

}
