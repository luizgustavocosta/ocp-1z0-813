package chapter4.streams;

import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class FornecedorBoolean {

	static Consumer<Object> consumidor = System.out::println;
	
	public static void main(String[] args) {
		BooleanSupplier bs = () -> Boolean.TRUE;
		consumidor.accept(bs.getAsBoolean());
		
		BooleanSupplier bs2 = () -> Math.random() > .95;
		consumidor.accept(bs2.getAsBoolean());
		
		BooleanSupplier bs3 = () -> IntStream.range(1, 20).sum() > 30;
		consumidor.accept(bs3.getAsBoolean());
	}

}
