package chapter7.questions;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q15 implements Callable<String>{

	/**
	 * Which of following are valid Callable expressions?
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
//		service.submit(a -> {return 10;}); What is a?? Ein Ein Ein?
		service.submit(() -> {String s = "";});
		service.submit(() -> 5);
		//service.submit(() -> {return null}); missing semicolon
		service.submit(() -> "The"+"zoo");
//		service.submit((int count) -> count +1); The Callable dont receive parameter
		service.submit(() -> {
			System.out.println("Giraffe");
			return 10;
		});
	}

	@Override
	public String call() throws Exception {
		
		return null;
	}
}
