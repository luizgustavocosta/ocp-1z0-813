package chapter7.thread;

public class ReadInventory extends Thread {

	@Override
	public void run() {
		System.out.println("Printing zoo inventory");
	}

}
