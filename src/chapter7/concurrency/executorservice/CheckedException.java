package chapter7.concurrency.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CheckedException {

	// The difference between Callable and Runnable
	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			service.submit(() -> {
				Thread.sleep(1000); return null;
				// This is Callable because has a return and
				// the Callable methods expect an Exception
			});
			service.submit(() -> {
				// In this case, the lambda expression dont have
				// a return, so is evaluated as Runnable and needs
				// to catch InterruptedException
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		} finally {
			service.shutdown();
		}
	}

}
