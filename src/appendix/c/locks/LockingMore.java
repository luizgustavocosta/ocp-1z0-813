package appendix.c.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockingMore {

	private static int birdCount;

	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		try {
			lock.lock();
			lock.lock();
			++birdCount;
		} finally {
			lock.unlock();
		}
		
		new Thread(()->{
			if (lock.tryLock()){
				try {
					System.out.println("Acquired");
				} finally {
					lock.unlock();
				}
			} else {
				lock.lock();
				System.out.println("Unavailable");
				// Why?
				// Because the lock's was used twice and released once.
			}
		}).start();
		System.out.println(birdCount);
	}

}
