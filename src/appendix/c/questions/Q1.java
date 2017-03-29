package appendix.c.questions;

public class Q1 {

	/**
	 * What is the result of the following code snippet? great greatgood error
	 * p1 error p2 error p2 and p3
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		final char a = 'A', d = 'D'; // p1
		char grade = 'B';
		switch (grade) {
		case a: // p2
			break;
		case 'B':
			System.out.print("great");
		case 'C':
			System.out.print("good");
			break;
		case d: // p3
		case 'F':
			System.out.print("not good");
		}
	}
}
