package chapter7.concurrency.executorservice;

import java.time.Instant;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

public class WaitToFinish {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			Future<Long> result = service.submit(()->
				Instant.now().toEpochMilli());
			BiConsumer<String, Long> print = (a,b) -> {
				System.out.format("%s%d\n",a,b);
			};
			
			print.accept("Now in this instant is -> ", result.get());
			
		} finally {
			if (service != null)
				service.shutdown();
			if (service != null)
				service.awaitTermination(10, TimeUnit.NANOSECONDS);
			if (service.isTerminated())
				System.out.println("All tasks finished");
			else
				System.out.println("At least one task is still running");
		}
	}

}
