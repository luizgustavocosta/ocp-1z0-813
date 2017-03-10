package chapter7.concurrency.streams;

import java.util.ArrayList;
import java.util.List;

public class WhaleDataCalculator {

	// This is an example using stream and parallel
	// Parallel streams has many operations can be executed independently 
	public int processRecord(int input){
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return input++; 
	}
	
	public void processAllData(List<Integer> data){
		// 4.166 seconds
		//data.stream().map(a -> processRecord(a)).count();
		
		// 1.116 seconds
		data.stream().parallel().map(a -> processRecord(a)).count();
	}
	
	public static void main(String[] args) {
		WhaleDataCalculator calculator = new WhaleDataCalculator();
		List<Integer> data = new ArrayList<Integer>();
		for (int i=0; i<400;i++) data.add(i);
		// Process data
		long start = System.currentTimeMillis();
		calculator.processAllData(data);
		double time = (System.currentTimeMillis()-start)/1000.0;
		System.out.println("\nTasks completed in "+time+" seconds.");
	}
}
