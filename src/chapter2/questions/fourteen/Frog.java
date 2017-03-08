package chapter2.questions.fourteen;

public class Frog implements CanHop {

	public static void main(String[] args) {
		//Frog(1), TurtleFrog(2), Object(5)
		Frog f = new TurtleFrog();
		TurtleFrog tf = new TurtleFrog();
		Object o = new TurtleFrog();
		// Is a Interface
		CanHop ch = new TurtleFrog();
	}

}
