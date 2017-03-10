package chapter7.concurrency.executorservice;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZooInfo {

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			System.out.println("Begin...");
			// Lambda expression
			// Empty constructor, and no return.
			service.execute(() -> System.out.println("Printing zoo inventory"));
			System.out.println(service.isShutdown());
			service.execute(() -> {
				for (int i = 1; i <= 3; i++) {
					System.out.println("Printing record.."+i+" de 3");
				}
				try {
					Thread.sleep(30000); // Force 1 thread to be executed
				} catch (InterruptedException e) {
				}
			});
			service.execute(() -> System.out.println("Printing zoo inventory"));
			
			List<Runnable> shutdownNow = service.shutdownNow();
			System.out.println("Not started->"+shutdownNow.size());
			
			System.out.println("End...");
		} finally {
			System.out.println(service.isTerminated());
			if (service != null)
				service.shutdown();
			System.out.println(service.isShutdown());
			System.out.println(service.isTerminated());
		}
	}

}
