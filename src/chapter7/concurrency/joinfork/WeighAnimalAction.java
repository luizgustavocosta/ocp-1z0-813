package chapter7.concurrency.joinfork;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class WeighAnimalAction extends RecursiveAction {
	
	// RecursiveAction
	// Is an abstract class that requires us to implement the compute() method.
	// Which returns void, to perform the bulk of the work.

	private static final long serialVersionUID = 1L;

	private int start;
	private int end;
	private Double[] weights;
	
	public WeighAnimalAction(Double[] weights, int start, int end) {
		super();
		this.start = start;
		this.end = end;
		this.weights = weights;
	}

	@Override
	protected void compute() {
		if (end - start <= 3)
		for (int i = start; i < end; i++) {
			weights[i] = (double) new Random().nextInt(100);
			System.out.println("Animal weighed :"+i);
		} else {
			int middle = start + ((end - start)/2);
			System.out.println("[start="+start+", middle="+middle+", end="+end+"]");
			invokeAll(new WeighAnimalAction(weights, start, middle),
					new WeighAnimalAction(weights, middle, end));
		}
	}

	public static void main(String[] args) {
		Double[] weights = new Double[10];
		
		ForkJoinTask<?> task = new WeighAnimalAction(weights, 0, weights.length);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(task);
		
		System.out.print("\nWeights: ");
		Arrays.asList(weights).stream().forEach(
				d -> System.out.print(d.intValue()+" "));
	}

}
