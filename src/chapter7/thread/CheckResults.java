package chapter7.thread;

public class CheckResults {

	static int counter = 0;

	public static void main(String[] args) throws InterruptedException {
		new Thread(() -> {
			for (int i = 0; i < 500; i++) {
				CheckResults.counter++;
				System.out.println(counter);
			}
		}).start();

		while (CheckResults.counter < 100) {
			System.out.println("Not reached yet");
			// Inside the loop, suspend the thread to avoid infinite loop.
			Thread.sleep(5);
		}
		System.out.println("Reached");
	}
}
