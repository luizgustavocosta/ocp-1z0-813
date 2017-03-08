package chapter4.supplier;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TestConsumer {
	public static void main(String[] args) {
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		
		c1.accept("Guga");
		c2.accept("Gustavinho");
		
		//Consumer<Person> c3 = () -> new Person();
		Map<Object, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> b1 = map::put;
		BiConsumer<String, Integer> b2 = (k,v) -> map.put(k, v);
		
		b1.accept("chicken", 7);
		b2.accept("chick", 1);
		
		System.out.println(map);
		
		Consumer<Long> consumer = (Long l) -> System.out.println(l);
		consumer.accept(10l);
	}
}
