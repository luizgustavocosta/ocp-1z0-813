package chapter7.concurrency.process;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPenManager {

	public void performTasks(CyclicBarrier c1, CyclicBarrier c2) {
		try {
			removeAnimals();
			c1.await();
			cleanPean();
			c1.wait();
			addAnimals();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

	private void addAnimals() {
		System.out.println("Adding animals");
	}

	private void cleanPean() {
		System.out.println("Cleaning the pen");
	}

	private void removeAnimals() {
		System.out.println("Removing animals");
	}

	public static void main(String[] args){
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(2);
			LionPenManager manager = new LionPenManager();
			CyclicBarrier c1 = new CyclicBarrier(2, () -> {
				System.out.println("**Pen cleaned c1**");
			});
			CyclicBarrier c2 = new CyclicBarrier(2, () -> {
				System.out.println("**Pen cleaned c2**");
			});
			for (int i = 0; i < 400; i++)
				service.submit(() -> manager.performTasks(c1, c2));

		} finally {
			if (service != null)
				service.shutdown();
		}
	}

}
