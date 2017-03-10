package chapter7.concurrency.joinfork;

import java.util.Random;

public class Factorial {

	public static void main(String[] args) {
		int n = new Random().nextInt();
		if (n < 0) n=n*-1;
		// Randon is too long
		System.out.println(factorial(1));
	}

	private static int factorial(int n) {
		if (n <= 1) return 1;
		else return n * factorial(n-1);
	}

}
