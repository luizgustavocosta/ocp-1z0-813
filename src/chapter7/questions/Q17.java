package chapter7.questions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Q17 {

	private static AtomicInteger sheepCount1 = new AtomicInteger(0);
	private static int sheepCount2 = 0;
	
	/**
	 * Assuming 100ms is enough time for the tasks submitted to the thread executor to complete, what is the result
	 * of executing the following program
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			for (int i = 0; i < 100; i++) 
				service.execute(() -> {
					sheepCount1.getAndIncrement();
					sheepCount2++;
				});
				Thread.sleep(100);
				System.out.println(sheepCount1+" "+sheepCount2);
		} finally {
			service.shutdown();
		}
	}
}
