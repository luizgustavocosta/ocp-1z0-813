package chapter7.concurrency.streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class UnorderedStream {

	public static void main(String[] args) {
		Consumer<Object> consumer = System.out::print;
		Stream<Integer> unordered = Arrays.asList(1,2,3,4,5,6).stream().unordered();//.forEach(consumer);
		//consumer.accept(unordered.skip(5).findAny().get()+"\n");
//		unordered.parallel().skip(3).forEach(consumer);
		consumer.accept(unordered.parallel().skip(3).findAny());
	}

}
