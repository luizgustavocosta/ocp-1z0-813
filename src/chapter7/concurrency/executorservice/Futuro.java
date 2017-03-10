package chapter7.concurrency.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Futuro {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			Future<?> submit = service.submit(() -> System.out.println("Hello zoo"));
			while (!submit.isDone()){
				System.out.println("Working yet");
				Thread.sleep(10);
				if (submit.isDone())
					System.out.println("Done!");	
			}
			
			System.out.println("Fim do programa");
		} finally {
			service.shutdown();
		}
	}
}
