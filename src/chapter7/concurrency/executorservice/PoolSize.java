package chapter7.concurrency.executorservice;

public class PoolSize {

	public static void main(String[] args) {
		System.out.println("It can be quite difficult....");
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		System.out.format("%s%d%s","with...", availableProcessors, " processors :D");
	}
}
