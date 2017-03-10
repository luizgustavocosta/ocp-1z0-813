package chapter7.concurrency.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class CheckSupplyFoodZooInterval {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ScheduledExecutorService service = null;
		try {
			service = Executors.newSingleThreadScheduledExecutor();

			Consumer<String> consumer = System.out::println;
			// void as return
			Runnable command = () -> consumer.accept("Hello Zoo");

			// Executa a tarefa a cada 1 segundo depois de esperar 2 segundos
			// E.g. Checking the health of the animals
			service.scheduleAtFixedRate(command, 1, 2, TimeUnit.SECONDS);

			// Object as return
			Callable<String> callable = () -> "Monkey";

			service.schedule(command, 5, TimeUnit.SECONDS);
			Future<String> resultCommand = service.schedule(callable, 13, TimeUnit.SECONDS);

			consumer.accept(resultCommand.get());
			
			// Creates a new task after the previous task has finished
			// E.g. Happen repeatedly
			service.scheduleWithFixedDelay(command, 0, 1, TimeUnit.MILLISECONDS);

			// I put this snippet below to run the scheduleWithFixedDelay
			service.awaitTermination(3, TimeUnit.SECONDS);
		} finally {
			service.shutdown();
		}
	}

}
