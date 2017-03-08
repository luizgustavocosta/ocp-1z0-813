package chapter6.autocloseable.idempotent;

public class ExampleTwo implements AutoCloseable {

	@Override
	public void close() throws Exception {
		throw new IllegalArgumentException("Cage doors does not close");
	}

}
