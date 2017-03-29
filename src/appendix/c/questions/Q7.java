package appendix.c.questions;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Q7 {

	/**
	 * Ira imprimir Got Lock at least one time
	 * Fique esperto na declaracao do .parallel()
	 * @param args
	 */
	public static void main(String[] args) {
		Consumer<Object> print = System.out::println;
		Lock lock = new ReentrantLock();
		IntStream.iterate(1,  i-> i + 1).limit(10).parallel()
			.forEach(x ->{
				lock.tryLock();
				print.accept("Got Lock "+x);
				lock.unlock();
			});;
		print.accept("Finished");
	}
}
