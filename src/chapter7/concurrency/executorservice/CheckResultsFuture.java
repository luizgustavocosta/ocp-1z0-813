package chapter7.concurrency.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CheckResultsFuture {

	private static int counter = 0;
	
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			Future<?> result = service.submit(() -> {
				for (int i = 0; i <1500; i++) {
					CheckResultsFuture.counter++;
				}
			});
			result.get(21, TimeUnit.MICROSECONDS);
			System.out.println("Done!");	
			System.out.println("Fim do programa");
		} catch(TimeoutException t) {
			System.out.println("Not reached in time");
		} finally {
			service.shutdown();
		}
	}

}
