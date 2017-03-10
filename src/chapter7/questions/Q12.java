package chapter7.questions;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class Q12 {

	/**
	 * What is the result of executing the following application?
	 * @param args
	 */
	public static void main(String[] args) {
		ForkJoinTask<?> task = new CountNumbers(0, 4);
		ForkJoinPool pool = new ForkJoinPool();
		Object result = pool.invoke(task);
		System.out.println(result);
	}
}

class CountNumbers extends RecursiveAction {

	private static final long serialVersionUID = 1L;

	private int start, end;
	
	
	public CountNumbers(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	@Override
	protected void compute() {
		if (start<0) return;
		else {
			int middle = start + ((end - start)/2);
			invokeAll(new CountNumbers(start, middle), new CountNumbers(middle, end));
		}
	}
	
}