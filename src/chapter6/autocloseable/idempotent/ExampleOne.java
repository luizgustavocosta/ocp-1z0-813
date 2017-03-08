package chapter6.autocloseable.idempotent;

public class ExampleOne implements AutoCloseable {

	// Idempotent
	// Method can be called multiple times without any side effects 
	// or undesirable behavior
	
	@Override
	public void close() throws Exception {
		throw new IllegalArgumentException("Cage doors does not close");
	}

}
