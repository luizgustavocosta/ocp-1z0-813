package appendix.c.questions;

import java.util.function.Consumer;

public class Q6 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Consumer<Object> print = System.out::println;
		final int movieRating = 4;
		int badMovie = 9;
		// case expression must be final
		switch (badMovie) {
		case 0:
		//case badMovie: System.out.println("Awful"); break;
		case movieRating: print.accept("Great"); break;
		case (int) 'a':
			break;
		default:
			break;
		}
	}

}
