package chapter6.questions;

public class Q4_EchoInput {

	public static void main(String[] args) {
		System.out.println(args[0]);
		if (args.length <= 3) assert false;
		System.out.println(args[0]+args[1]+args[2]);
	}

}
