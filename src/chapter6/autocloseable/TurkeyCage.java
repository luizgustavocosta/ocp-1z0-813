package chapter6.autocloseable;

import java.io.Closeable;
import java.io.IOException;

public class TurkeyCage implements Closeable {

	@Override
	public void close() throws IOException {
		System.out.println("Gate closed!");
	}

}
