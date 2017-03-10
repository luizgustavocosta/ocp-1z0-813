package chapter7.questions;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Q11 {

	/**
	 * What statements about the following code snippet are true????
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Object o1 = new Object();
		Object o2 = new Object();
		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<?> f1 = service.submit(() -> {
			synchronized (o1) {
				synchronized (o2) {
					System.out.println("Tortuga...");
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		Future<?> f2 = service.submit(() -> {
			synchronized (o2) {
				synchronized (o1) {
					System.out.println("Conejo....");
				}
			}
		});
		f1.get(); // get() call the return of service it means..syso Tortuga o Conejo
		f2.get();
		System.exit(0);
	}
}
