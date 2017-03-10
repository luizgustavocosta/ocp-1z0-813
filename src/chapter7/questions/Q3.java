package chapter7.questions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Q3 {

	/**
	 * Which lines need to be changed to make the code compile?
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
//		service.scheduleWithFixedDelay // this method no exist
		
		Future<?> result = service.submit(()->{
			System.out.println("Wake staff");
		});
//		System.out.println(result.get()); get() throws an exception, pay attention yo
	}
}
