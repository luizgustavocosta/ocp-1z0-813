package chapter7.concurrency.joinfork;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class WeighAnimalTask extends RecursiveTask<Double> {
	
	// RecursiveTask<V>
	// Compute V. In this case, compute the sum of all weight values while
	// processing the data. For each iteration the values will change, because will work with Random class.
	// Instead of extending RecursiveAction, we could extend the generic
	// RecursiveTask to calculate and return each sum in the compute()

	private static final long serialVersionUID = 1L;

	private int start;
	private int end;
	private Double[] weights;
	
	public WeighAnimalTask(Double[] weights, int start, int end) {
		super();
		this.start = start;
		this.end = end;
		this.weights = weights;
	}

	// Return the generic type
	@Override
	protected Double compute() {
		if (end - start <= 3){
			double sum = 0;
			for (int i = start; i < end; i++) {
				weights[i] = (double) new Random().nextInt(100);
				sum += weights[i];
			}
			return sum;
		} else {
			int middle = start + ((end - start)/2);
			System.out.println("[start="+start+", middle="+middle+", end="+end+"]");
			
			RecursiveTask<Double> otherTask = new 
					WeighAnimalTask(weights, start, middle);
			otherTask.fork();
			return new WeighAnimalTask(weights, start, middle).compute() 
					+ otherTask.join();
			// fork/join complete the task in a separate thread
			// join() causes the current thread wait for the results.
		}
	}

	public static void main(String[] args) {
		Double[] weights = new Double[10];
		
		ForkJoinTask<Double> task = new 
				WeighAnimalTask(weights, 0, weights.length);
		ForkJoinPool pool = new ForkJoinPool();
		
		Double sum = pool.invoke(task);
		System.out.println("Sum->"+sum);
		
	}

}
