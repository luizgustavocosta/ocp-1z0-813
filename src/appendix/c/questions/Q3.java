package appendix.c.questions;

import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class Q3 {

	/**
	 * Assuming that we have access to a <i>WatchService</i> object, wich has been
	 * properly initialized and registred with at least one Path, what two
	 * problems make the code unusable?
	 * 
	 * It does not check if the WatchKey is null
	 * It does not use the factory pattern
	 * The event type is not checked for OVERFLOW #
	 * It does not cast WatchEvent<?> to WatchEvent<Path>
	 * It does not reset the WatchKey after use   #
	 * It uses an infinite loop that never ends.
	 * @param args
	 */
	@SuppressWarnings("null")
	public static void main(String[] args) {
		WatchService watchService = null;
		
		for(;;){
			WatchKey key = watchService.poll();
			for (WatchEvent<?> event : key.pollEvents()) {
				System.out.println(event.kind()+" "+event.context());
			}
		}
	}

}
