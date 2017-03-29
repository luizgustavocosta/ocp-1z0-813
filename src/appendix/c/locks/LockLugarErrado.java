package appendix.c.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockLugarErrado {

	public static void main(String[] args) {
		//With lock
		Lock lock = new ReentrantLock();
		try {
			lock.lock();
		} finally {
			lock.unlock();
		}
		
		
		Lock lockFora = new ReentrantLock();
		lockFora.lock();
		try {
		} finally {
			try {
				lockFora.unlock();	
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		Lock unlockSemLock = new ReentrantLock();
		unlockSemLock.unlock(); //java.lang.IllegalMonitorStateException
		
		
	}
}
