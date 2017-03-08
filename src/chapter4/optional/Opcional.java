package chapter4.optional;

import java.util.Optional;
import java.util.function.Consumer;

public class Opcional {
	public static void main(String[] args) {
		Consumer<Object> consumidor = System.out::println;
		consumidor.accept(average(10,20,30,40).get());
		
		Optional<Double> average = average();
		consumidor.accept(Optional.ofNullable(average));
		average.ifPresent(consumidor);
		
		consumidor.accept(average.orElse(Double.NaN));
		consumidor.accept(average.orElseGet(() -> Math.random()));
		consumidor.accept(average.orElseThrow(()->new IllegalArgumentException()));
	}

	private static Optional<Double> average(int...scores) {
		if(scores.length == 0)
			return Optional.empty();
		int sum = 0;
		for (int i : scores) sum+= i;
		return Optional.of(
				(double)sum/scores.length);
	}
}

