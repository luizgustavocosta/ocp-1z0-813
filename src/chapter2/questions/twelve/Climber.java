package chapter2.questions.twelve;

public class Climber  {

	public static void main(String[] args) {
		//check((h, l) -> h.toString(), 5); Who is h variable?
	}

	private static void check(Climb climb, int height){
		if (climb.tooHigh(height, 10))
			System.out.println("too high");
		else
			System.out.println("ok");
	}
}
