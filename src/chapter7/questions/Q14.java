package chapter7.questions;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class Q14 {

	/**
	 * What is the result of calling the following method?
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Q14 q = new Q14();
		q.addAndPrintItems(new LinkedBlockingDeque<>());
	}
	
	public void addAndPrintItems(BlockingDeque<Integer> deque) throws InterruptedException{
		deque.offer(103);
		deque.offerFirst(20, 1, TimeUnit.SECONDS);
		deque.offerLast(85, 7, TimeUnit.HOURS);
		System.out.println(deque.pollFirst(200, TimeUnit.SECONDS));
		System.out.println(" "+deque.pollLast(1, TimeUnit.MINUTES));
	}
}
