package chapter7.concurrency.executorservice;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class AmbigousLambdaSample {

	private static void useCallable(Callable<Integer> expression){}
	// Supplier does not support checked exception
	private static void useSupplier(Supplier<Integer> expression){}
	
	private static void use(Callable<Integer> expression){}
	private static void use(Supplier<Integer> expression){}
	
	public static void main(String[] args) {
		useCallable(() -> {throw new SQLException();});
		//useSupplier(() -> {throw new IOException();});
		// Casting for avoid duplicated signature
		use((Callable<Integer>)() -> {throw new IOException();});
	}

}
