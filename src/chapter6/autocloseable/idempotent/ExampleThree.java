package chapter6.autocloseable.idempotent;

public class ExampleThree implements AutoCloseable {

	// Not idempotent
	
	static int COUNT = 0;
	
	@Override
	public void close() throws Exception {
		COUNT++;
	}

}
