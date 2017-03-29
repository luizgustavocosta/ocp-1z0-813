package appendix.c.locks;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks {

	private static int birdCount;

	/**
	 * Lock Framework
	 * 
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// With sync.
		Object obj = new Object();
		synchronized (obj) {
			System.out.println(" "+(++birdCount));
		}
		
		//With lock
		Lock lock = new ReentrantLock();
		try {
			lock.lock();
			System.out.println(" "+(++birdCount));
			System.out.println(LocalTime.now());
		} finally {
			lock.unlock();
		}		
				
		// Try obtain a lock
		Lock tryLock = new ReentrantLock();
		if (tryLock.tryLock()) {
			try {
				System.out.println(Thread.currentThread().getName());
				Condition newCondition = tryLock.newCondition();
				newCondition.await(5, TimeUnit.SECONDS);
				System.out.println(Thread.currentThread().getName());
				System.out.println("Doing something");
				System.out.println(LocalTime.now());
			} finally {
				tryLock.unlock();
			}
		} else {
			System.out.println("Unable acquire lock");
		}
	}

}
