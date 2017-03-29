package appendix.c.locks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockLeituraConcorrente {

	public static void main(String[] args) {
		ZooEmployeeNameManager zooManager = new ZooEmployeeNameManager();
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			for (int i = 0; i < 100; i++) {
				final int employeeNumber = i;
				service.submit(() -> {
					zooManager.readNames(employeeNumber);
				});
				service.submit(()->{
					zooManager.addName("Guga");
				});
				service.submit(()-> zooManager.addName("Don Pablo"));
			}
		} finally {
			if (service.isTerminated())
				service.shutdown();
			//System.exit(0);
		}
	}

}

class ZooEmployeeNameManager {
	private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	private List<String> names = new ArrayList<>();
	
	public ZooEmployeeNameManager() {
		names.addAll(Arrays.asList("Rivaldo","Ronaldo","Romario","Bebeto", "Dunga"));
	}
	
	public void addName(String name){
		//Lock lock = readWriteLock.readLock(); With readLock other threads were able to act on the data while the addName() method was sleeping.
		Lock lock = readWriteLock.writeLock();
		try {
			lock.lock();
			System.out.println("Write Lock obtained");
			Thread.sleep(1000);
			System.out.println("Inserting "+name);
			names.add(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public String readNames(int i){
		Lock lock = readWriteLock.readLock();
		try {
			lock.lock();
			System.out.println("Read Lock obtained");
			String name = names.get(i%names.size());
			System.out.println(name);
			return name;
		} finally {
			System.out.println("Read Lock released");
			lock.unlock();
		}
	}
}
