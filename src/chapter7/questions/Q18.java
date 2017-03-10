package chapter7.questions;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class Q18 {

	/**
	 * What is the result of executing the following application?
	 * @param args
	 */
	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(10, 
				() -> System.out.println("Stock Room Full!"));//j2
		IntStream.iterate(1, i-> 1).limit(9)
			.parallel()
			.forEach(i -> await(cb)); // j3
	}
	public static void await(CyclicBarrier cb){ //j1
		try {
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO: handle exception
		}
	}
}