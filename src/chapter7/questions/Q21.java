package chapter7.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class Q21 {

	/**
	 * Assuming an implementation of the <i>performCount()</i> method is provided prior to runtime
	 * which of the following are possible results of executing the following application?
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		final List<Future<?>> results = new ArrayList<>();
		IntStream.range(0, 10)
			.forEach(i -> results.add(service.submit(() -> CountZooAnimals.performCount(i)))); //o2
		results.stream().forEach(f -> CountZooAnimals.printResults(f));
		service.shutdown();
	}
}

class CountZooAnimals{
	public static Integer performCount(int exhibitNumber){
		//IMPLEMENTATION OMITTED
		return exhibitNumber;
	}
	
	public static void printResults(Future<?> f){
		try {
			System.out.println(f.get()); //o1
		} catch (Exception e) {
			System.out.println("Exception!");
		}
	}
}