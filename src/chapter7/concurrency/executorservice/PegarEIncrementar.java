package chapter7.concurrency.executorservice;

import java.util.concurrent.atomic.AtomicInteger;

public class PegarEIncrementar {

	public static void main(String[] args) {
		AtomicInteger numero = new AtomicInteger(0);
		
		for (int i = 0; i < 100; i++) {
			System.out.println(numero.getAndIncrement());
		}
//		System.out.println(numero.incrementAndGet());
		System.out.println(numero.getAndDecrement());
	}

}
