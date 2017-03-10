package chapter7.concurrency.collections;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AddingWhileIterateCollection {

	public static void main(String[] args) {
		// The CopyOnWrite classes can use a lot of memory
		// Used in multi-threading environment situations where reads are far more 
		// common than writes.
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4,3,52));
		for (Integer item : list) {
			list.add(9);
		}
		list.forEach(System.out::print);
	}

}
