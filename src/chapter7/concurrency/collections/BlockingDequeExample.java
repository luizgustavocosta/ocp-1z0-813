package chapter7.concurrency.collections;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class BlockingDequeExample {

	public static void main(String[] args) {
		try{
			BlockingDeque<Integer> blockingQueue = new LinkedBlockingDeque<>();
			blockingQueue.offer(91);
			// 1 - Element to add
			// 2 - Time for timeout 
			// 3 - Timeout unit
			blockingQueue.offerFirst(5, 2, TimeUnit.MINUTES);
			blockingQueue.offerLast(47, 100, TimeUnit.MICROSECONDS);
			blockingQueue.offer(3, 4, TimeUnit.SECONDS);
			System.out.println(blockingQueue.poll());

			System.out.println(blockingQueue.poll(950, TimeUnit.MICROSECONDS));
			System.out.println(blockingQueue.pollFirst(200, TimeUnit.NANOSECONDS));
			System.out.println(blockingQueue.pollLast(1, TimeUnit.SECONDS));
		} catch (InterruptedException e){ 
			e.printStackTrace();
		}
	}
}
