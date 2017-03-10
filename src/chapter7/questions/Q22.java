package chapter7.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class Q22 {

	static int counter = 0;
	
	/**
	 * What is the result of executing the following program?
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newSingleThreadExecutor();
		List<Future<?>> results = new ArrayList<>();
		IntStream.iterate(0, i -> i+1).limit(5).forEach( 
				i ->System.out.println(i));
				//i -> results.add(service.execute(() -> counter++))); n1
				// The problem is: results is expecting a future object
		for(Future<?> result:results){
			System.out.println(result.get()+" "); //n2
		}
		service.shutdown();
	}
}
