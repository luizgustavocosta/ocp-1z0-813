package chapter7.concurrency.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class AddData {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			// Callabe supports a return type when used
			// with ExecutorService
			Future<Integer> result = service.submit(() -> 30 + 11);
			System.out.println(result.get());
			
			System.out.println(
					service.submit(() -> 30 + 11)
						.get(50, TimeUnit.HOURS));
			// If the result don't back in 50 hours, throws an exception
		} finally {
			service.shutdown();
		}
	}
}