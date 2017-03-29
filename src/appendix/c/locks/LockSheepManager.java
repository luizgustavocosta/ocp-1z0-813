package appendix.c.locks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockSheepManager {

	private int sheepCount = 0;
	private Lock lock = new ReentrantLock();
	//private Lock lock = new ReentrantLock(true); Fairness enable. Only in situations where you really need your requests ordered in a particular manner
	
	private synchronized void incrementAndReport(){ // Nao necessario usar o synchronized na assinatura
		try {
			lock.lock();
			System.out.println(String.format("%-2d-%18s", +(++sheepCount), Thread.currentThread().getName()));
		} finally {
			lock.unlock();
		}
	}
	
	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			LockSheepManager manager = new LockSheepManager();
			for (int i = 0; i < 10; i++) {
					service.submit(()->{
						manager.incrementAndReport();
					});
			}
		} finally{
			service.shutdown();
		}
	}

}
