package chapter7.concurrency.collections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueues {

	public static void main(String[] args) {
		try{
			BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
			blockingQueue.offer(39);
			// 1 - Element to add
			// 2 - Time for timeout 
			// 3 - Timeout unit
			blockingQueue.offer(3, 1, TimeUnit.MICROSECONDS);
			System.out.println(blockingQueue.poll());
			
			System.out.println(blockingQueue.poll(12330, TimeUnit.MICROSECONDS));
		} catch (InterruptedException e){ 
			e.printStackTrace();
		}
	}
}
