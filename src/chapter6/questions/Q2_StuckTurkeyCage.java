package chapter6.questions;

public class Q2_StuckTurkeyCage implements AutoCloseable {

	public static void main(String[] args) {
		try (Q2_StuckTurkeyCage t = new Q2_StuckTurkeyCage()){
			System.out.println("put turkeys in");
		} catch (Exception e){}
	}

	@Override
	public void close() throws Exception {
		throw new Exception("Cage door does not close");
	}

}
